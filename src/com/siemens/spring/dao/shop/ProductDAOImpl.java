package com.siemens.spring.dao.shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ListIterator;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.siemens.spring.bean.Product;

// setDataSource coming from JdbcDaoSupport
public class ProductDAOImpl extends JdbcDaoSupport implements ProductDAO {

	@Override
	public int insertProduct(Product prod) throws SQLException {

		String sql = "INSERT INTO `siemensdb`.`product`\r\n" + "(`Name`,`Price`,`Desc`)\r\n" + "VALUES (?,?,?);";

		KeyHolder keyHolder = new GeneratedKeyHolder();

		this.getJdbcTemplate().update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement stmAdd;
				stmAdd = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

				stmAdd.setString(1, prod.getName());
				stmAdd.setDouble(2, prod.getPrice());
				stmAdd.setString(3, prod.getDescription());
				return stmAdd;
			}
		}, keyHolder);

		int rowId = -1;

		rowId = keyHolder.getKey().intValue();

		if (rowId < 0) {
			return -1;
		}

		prod.setId(rowId);

		return rowId;
	}

	@Override
	public boolean deleteProduct(int prodId) throws SQLException {
		if (prodId <= 0) {
			return false;
		}

		String sql = "DELETE FROM `siemensdb`.`product`\r\n" + "WHERE\r\n" + "ProductID = ?;";

		int result = this.getJdbcTemplate().update(sql, new Object[] { prodId }, new int[] { java.sql.Types.INTEGER });

		if (result > 0)
			return true;
		return false;
	}

	@Override
	public boolean updateProduct(Product prod) throws SQLException {

		String sql = "UPDATE `siemensdb`.`product`\r\n" + "SET\r\n" + "`Name` = ?,\r\n" + "`Price` = ?,\r\n"
				+ "`Desc` = ?\r\n" + "WHERE\r\n" + "ProductID = ?;";

		int result = this.getJdbcTemplate().update(sql,
				new Object[] { prod.getName(), prod.getPrice(), prod.getDescription(), prod.getId() },
				new int[] { java.sql.Types.VARCHAR, java.sql.Types.DOUBLE, java.sql.Types.VARCHAR,
						java.sql.Types.INTEGER });

		if (result < 0)
			return false;

		return true;
	}

	@Override
	public Product fetchProductById(int prodId) throws SQLException {
		if (prodId <= 0) {
			return null;
		}

		String sql = "SELECT * FROM `siemensdb`.`product` WHERE `ProductID` = ?;";

		return this.getJdbcTemplate().query(sql, new Object[] { prodId }, new ResultSetExtractor<Product>() {

			@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					return generateProduct(rs);
				} else {
					return null;
				}
			}

		});
	}

	@Override
	public ListIterator<Product> fetchAllProducts() throws SQLException {
		String sql = "SELECT * FROM `siemensdb`.`product`;";
		return this.getJdbcTemplate().query(sql, new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				return generateProduct(rs);
			}

		}).listIterator();
	}

	private Product generateProduct(ResultSet prodSet) throws SQLException {
		Product p = new Product();
		p.setId(prodSet.getInt("ProductID"));
		p.setName(prodSet.getString("Name"));
		p.setPrice(prodSet.getDouble("Price"));
		p.setDescription(prodSet.getString("Desc"));
		return p;
	}

}

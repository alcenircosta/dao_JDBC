package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao {

	private Connection conn = null;

	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		PreparedStatement pst = null;
		try {
			pst = conn.prepareStatement("INSERT INTO department (Name) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, obj.getName());
			int rowsAffected = pst.executeUpdate();
			if (rowsAffected == 0) {
				throw new DbException("Error, register not inserted");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(pst);
		}
	}

	@Override
	public void update(Department obj) {
		PreparedStatement pst = null;
		try {
			pst = conn.prepareStatement("UPDATE department SET Id=?,Name=? WHERE Id=?");
			pst.setInt(1, obj.getId());
			pst.setString(2, obj.getName());
			pst.setInt(3, obj.getId());
			int rowsAffected = pst.executeUpdate();
			if (rowsAffected == 0) {
				throw new DbException("Error, register not updated");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(pst);
		}
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement pst = null;
		try {
			pst = conn.prepareStatement("DELETE FROM department WHERE Id = ?");
			pst.setInt(1, id);
			int rowsAffected = pst.executeUpdate();
			if (rowsAffected == 0) {
				throw new DbException("No registers found with id " + id);
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

	@Override
	public Department findByID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

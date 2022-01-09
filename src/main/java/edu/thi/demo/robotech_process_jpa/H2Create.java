package edu.thi.demo.robotech_process_jpa;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class H2Create {
	private static final String createTableSQL = "create table customer (id number NOT NULL, name varchar(50), vorname varchar(50), plz number, stadt varchar(50), land varchar(50), email varchar(50), anfrage varchar(50), eingangsdatum date);";

	public static void main(String[] args) {
		H2Create create = new H2Create();
		try {
			create.createTableCustomer();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void createTableCustomer() throws SQLException {

		System.out.println(createTableSQL);
		try (Connection connection = H2JDBCUtils.getConnection(); Statement statement = connection.createStatement();) {
			statement.execute(createTableSQL);

		} catch (SQLException e) {
			H2JDBCUtils.printSQLException(e);
		}
	}
}

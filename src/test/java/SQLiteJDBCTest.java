/**
 * SQLite JDBC
 */

import java.sql.*;

public class SQLiteJDBCTest {
    public static void main(String args[]) throws SQLException {
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.sqlite");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");

        // create our java jdbc statement
        Statement st = c.createStatement();
        st.execute("CREATE TABLE IF NOT EXISTS 'goods' " +
                "('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' TEXT, 'price' TEXT, 'count' INTEGER);");

        // Добавляем данные
        int rows = st.executeUpdate("INSERT INTO 'goods'(name, price, count) VALUES ('Food', '10.51', 10);");
        System.out.println("Добавлено строк = " + rows);

        // Выбираем данные
        ResultSet rs = st.executeQuery("SELECT * FROM goods");
        int i = 0;
        while (rs.next()) {
            i++;
            String name = rs.getString("name");
            String price = rs.getString("price");
            int count = rs.getInt("count");

            System.out.printf("%d. name = %s  prive = %s  count = %d%n", i, name, price, count);
        }

    }
}

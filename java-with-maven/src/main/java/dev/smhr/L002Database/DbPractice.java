package dev.smhr.L002Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbPractice {
    public static void main(String[] args) throws Exception {
        String connectionURL = "jdbc:postgresql://localhost:5432/learn_java_db";
        String dbUsername = "root";
        String dbPassword = "password";
        //Setup driver
        Class.forName("org.postgresql.Driver");
        //create connection
        Connection conn = DriverManager.getConnection(connectionURL, dbUsername, dbPassword);
        //create statement
        Statement statement = conn.createStatement();
        //Data Definition Language
        statement.execute("DROP TABLE IF EXISTS test_person");
        statement.execute("""
                CREATE TABLE IF NOT EXISTS test_person (
                    id SERIAL PRIMARY KEY,
                    first_name VARCHAR(100) NOT NULL,
                    last_name VARCHAR(100) NOT NULL,
                    interest VARCHAR(500)
                )""");
        statement.executeUpdate("""
                INSERT INTO test_person (first_name, last_name, interest)
                VALUES('Salida', 'M', 'Travel')""");
        statement.executeUpdate("""
                UPDATE test_person
                SET first_name = 'Aman', last_name= 'T', interest = 'Coding'
                WHERE id = 1
                """);
        ResultSet result = statement.executeQuery("SELECT * FROM test_person");
        while (result.next()) {
            int id = result.getInt("id");
            String firstName = result.getString("first_name");
            String lastName = result.getString("last_name");
            String interest = result.getString("interest");
            System.out.print(" | " + id);
            System.out.print(" | " + firstName);
            System.out.print(" | " + lastName);
            System.out.println();
        }
        //close connection
        conn.close();
    }
}

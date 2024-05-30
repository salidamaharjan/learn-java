package dev.smhr.L002Database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class DbMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
        String connectionDbURL = "jdbc:postgresql://localhost:5432/learn_java_db";
        String dbUsername = "root";
        String dbPassword = "password";

        // Step1: Register a driver
        Class.forName("org.postgresql.Driver");
        // Step2: acquire a connection
        Connection conn = DriverManager.getConnection(connectionDbURL, dbUsername, dbPassword);
        // Step3: create statement
        Statement statement = conn.createStatement();
        // Data Definition Language (DDL)
        statement.execute("DROP TABLE IF EXISTS test_students");
        statement.execute("""
                CREATE TABLE IF NOT EXISTS test_students (
                    id SERIAL PRIMARY KEY,
                    full_name VARCHAR(100) NOT NULL,
                    age INT NOT NULL,
                    address VARCHAR(100)
                )
                """);
        // Data Modification Language (DML)
        statement.executeUpdate("""
                INSERT INTO test_students (full_name, age, address)
                VALUES ('Salida', 31, 'PriorLake'),
                ('John', 33, 'Bloomington'),
                ('Jane', 33, 'Lakeville')
                """);
        statement.executeUpdate("""
                UPDATE test_students
                SET full_name = 'ABC', age = 40, address='XYZ'
                WHERE id = 3
                """);
        statement.executeUpdate("""
                DELETE FROM test_students WHERE id = 2
                """);
        
       ResultSet resultSet = statement.executeQuery("""
            SELECT * FROM test_students;
        """);

        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String fullName = resultSet.getString("full_name");
            int age = resultSet.getInt("age");
            String address = resultSet.getString("address");
            System.out.print(" | " + id);
            System.out.print(" | " + age);
            System.out.print(" | " + fullName);
            System.out.print(" | " + address);
            System.out.println();
        }
        // last Step: close connection
        conn.close();
    }
}

/*
PROJETO FINAL
 */
package br.com.fatecpg.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DbConnector {
    private static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    private static final String USER = "school";
    private static final String URL = "jdbc:derby://localhost:1527/school";
    private static final String PASS = "school";
    
}

package br.com.ecommercemotos.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	//Usuario MySql
	private static final String USERNAME = "root";
	
	//Senha MySql
	private static final String PASSWORD = "@1234";
	
	//Caminho BD + Nome BD
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3307/ecommercemotos";
	
	
	//Conexão:
	
	public static Connection createConnection() throws Exception {
		//Faz com que a classe do driver de conexão seja iniciada.
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String [] args) throws Exception {
		//Recuperar Connection
		
		Connection con = createConnection();
		
		if(con != null) {
			System.out.println("Conexão Obtida com sucesso!");
			con.close();
		}
	}
	
			
}

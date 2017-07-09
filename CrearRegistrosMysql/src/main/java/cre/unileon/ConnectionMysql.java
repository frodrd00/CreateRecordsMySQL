package cre.unileon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class ConnectionMysql {
	
	final static Logger logger = Logger.getLogger(ConnectionMysql.class);
	private String dir="";
	
	public Connection Connect() {
		
		Connection connection = null;
		
		dir = "localhost:3306/credb"; 
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://" + dir + "?autoReconnect=true&useSSL=false", "root", "root");
			logger.info("Conectado a la base de datos MySQL " + dir);
		} catch (ClassNotFoundException e) {
			logger.error("Fallo inicializar driver jdbc!", e);
		} catch (SQLException e) {
			logger.error("Fallo al conectarse a la base de datos MySQL " + dir, e);
		}
		
		return connection;
	}
	
	public void Disconnection(Connection connection){
		try {
			connection.close();
			logger.info("Desconectado de la base de datos MySQL " + dir);
		} catch (SQLException e) {
			logger.error("Fallo al desconectarse de la base de datos MySQL " + dir, e);
		}
	}
	
	
}

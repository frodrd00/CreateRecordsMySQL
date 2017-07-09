package cre.unileon;

import com.mysql.jdbc.Connection;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        
    	ConnectionMysql conMysql = new ConnectionMysql();
    	Connection conn = (Connection) conMysql.Connect();
    	
    	InsertData insert = new InsertData(conn);
    	insert.insertarUsuarios();
    	insert.insertarProfesionales();	
    	conMysql.Disconnection(conn);
    	
    }
}

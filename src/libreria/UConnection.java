package libreria;
import java.sql.*;

public class UConnection {
    private static Connection con = null;
	public static Connection getConnection(){
	try{
	if (con == null){
		
		Runtime.getRuntime().addShutdownHook(new MiShDwnHook());
		
		String usr = "";
		String pwd = "";
		String url = "jdbc:sqlite:C:/Users/Public/Documents/SQL administrador/ProyectoLibro.s3db";
		String driver = "org.sqlite.JDBC";
		
		Class.forName(driver);
		con = DriverManager.getConnection(url, usr, pwd);
	}
		
		return con;
		
	}catch(Exception ex){
		ex.printStackTrace();
		throw new RuntimeException("Error al crear la conexion.", ex);
	}
	}
	
	static class MiShDwnHook extends Thread{
		@Override
		public void run() {
			try{
				
				Connection con = UConnection.getConnection();
				con.close();
				
			}catch(Exception ex){
				ex.printStackTrace();
				throw new RuntimeException(ex);
			}
		}
	}
}

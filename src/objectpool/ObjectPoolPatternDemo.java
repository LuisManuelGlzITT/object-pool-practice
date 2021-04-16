package objectpool;

import java.sql.Connection;
import com.mysql.jdbc.Driver;

public class ObjectPoolPatternDemo {

	public static void main(String[] args) {
		// Creamos la ConnectionPool
		JDBCConnectionPool pool = new JDBCConnectionPool(
		  "com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/MyApp",
		  "root", "toor");
		 
		// Obtenemos la conexión
		Connection connection = pool.getObject();
		 
		// Mostramos el valor de connection
		System.out.println(connection);
		 
		// Regresa la conexión
		pool.releaseObject(connection);
	}

}

package io.developbymb.isthesiteup;

// import java.sql.Connection;
// import java.sql.DriverManager;
import java.sql.SQLException;

// import com.mysql.cj.xdevapi.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IsTheSiteUpApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(IsTheSiteUpApplication.class, args);

		// String url="jdbc:mysql://localhost:3306/dotin";
		// String user="root";
		// String password="";
		// try {
		// 	Class.forName("com.mysql.jdbc.Driver");
		// 	Connection connection=DriverManager.getConnection(url,user,password);
		// 	System.out.println("Connection is Sucessful the database"+url);
		// 	String query="INSERT INTO Persons VALUES (2,'m2','v2','A2','t2');";
		// 	Statement statement = (Statement) connection.createStatement();
		// 	statement.execute();
		// } catch (Exception e) {
		// 	e.printStackTrace();
		// }
	}

}

package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class resource {

    Connection connection;
    Statement statement;

    public resource(){
        try {
            connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root","Shivshakti");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

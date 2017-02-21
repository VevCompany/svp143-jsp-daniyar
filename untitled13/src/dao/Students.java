package dao;

import model.Student;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by НургалиевД on 20.02.2017.
 */
public class Students {


    //JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/test";

    //  Database credentials
    static final String USER = "postgres";
    static final String PASS = "postgres";


    public static ArrayList<Student> getbyname (String name) {

        ArrayList<Student> list = new ArrayList<Student>();
        Connection conn = null;

        try {

            Class.forName(JDBC_DRIVER);
            //Создаём соединение
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            //Выполним запрос
            String sql = "SELECT id, name, age FROM student";
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                //Retrieve by column name
                Long id = result.getLong("id");
                String name_ = result.getString("name");
                int age = result.getInt("age");

                list.add(new Student(id, name_, age));
            }
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(conn != null) { conn.close(); }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}

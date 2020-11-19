import java.sql.*;
import java.util.ArrayList;

public class Main
{


    public static void main(String[] args) throws SQLException
    {

        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;

        String JdbcUrl = "jdbc:mysql://localhost/world?" +"autoReconnnect=true&useSSL=false";
        String username = "root";
        String password = "Untbap503rc";

        /*try
        {

            connection = DriverManager.getConnection(JdbcUrl, username, password);
            String sql = "select count(*) from city";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            if(resultSet.next())
            {
                int sqling = resultSet.getInt("count(*)");
                System.out.println(sqling);
            }


        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        } */

        try
        {
            connection = DriverManager.getConnection(JdbcUrl, username, password);
            String sql = "SELECT * FROM city WHERE population >= 5000000;";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            ArrayList<City> myCities = new ArrayList<>();
            while(resultSet.next())
            {
                int sqlID = resultSet.getInt("ID");
                String sqlName = resultSet.getString("Name");
                int sqlPopulation = resultSet.getInt("Population");

                City firstCity = new City(sqlID,sqlName,sqlPopulation);
                myCities.add(firstCity);
                //System.out.println(sqlID + "\t" + sqlName + "\t" + sqlPopulation);
                //System.out.println(firstCity.toString());


            }
            System.out.println(myCities);

        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }




    }

}

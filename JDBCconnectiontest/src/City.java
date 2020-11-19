import java.util.ArrayList;

public class City
{

    private int sqlID;
    private String name;
    private int population;

    public City(int sqlID, String name, int population)
    {
        this.sqlID = sqlID;
        this.name = name;
        this.population = population;
    }

    public int getSqlID()
    {
        return sqlID;
    }

    public void setSqlID(int sqlID)
    {
        this.sqlID = sqlID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPopulation()
    {
        return population;
    }

    public void setPopulation(int population)
    {
        this.population = population;
    }



    @Override
    public String toString()
    {
        return "City{" +
                "sqlID=" + sqlID +
                ", name='" + name + '\'' +
                ", population=" + population +
                '}' + "\n";
    }
}

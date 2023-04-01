package learning.com.serial;

import java.io.Serializable;

public class City implements Serializable {
    private String name;
    transient String  coordinate;
    private long population;

    public String getName() {
        return name;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public long getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", coordinate='" + coordinate + '\'' +
                ", population=" + population +
                '}';
    }
}

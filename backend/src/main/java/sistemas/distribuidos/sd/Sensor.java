package sistemas.distribuidos.sd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Sensor {
    public static List<Sensor> sensorList;
    public int id;
    public float temperatura;

    static {
        sensorRepository();
    }

    public Sensor(int id, float temperatura) {
        this.id = id;
        this.temperatura = temperatura;
    }

    public Sensor() {
    }

    private static void sensorRepository() {
        sensorList = new ArrayList<>(Arrays.asList(
            new Sensor(1, 0),
            new Sensor(2, 0),
            new Sensor(3, 0)
        ));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sensor sensor = (Sensor) o;
        return id == sensor.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

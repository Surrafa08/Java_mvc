package modelo;

import java.util.ArrayList;
import java.util.Random;

public class modelo {
    private final Random random = new Random();
    private final ArrayList<String> datoTiempo;
    private final boolean booleanMiko;
    private String tiempo;

    public modelo() {
        this.booleanMiko = random.nextBoolean();
        this.datoTiempo = new ArrayList<>();
        determinarTiempo();
    }

    private void determinarTiempo() {
        tiempo = booleanMiko ? "noche" : "dia";
        datoTiempo.add(tiempo);
    }

    public int validarSensor() {
        int avisos = 0;
        for (int i = 0; i < 3; i++) {
            if (random.nextInt(2) + 1 == 1 && datoTiempo.get(0).equals("noche")) {
                avisos++;
            }
        }
        return avisos;
    }

    public String getTiempo() {
        return tiempo;
    }
}
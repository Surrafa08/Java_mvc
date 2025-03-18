package vista;
public class vista {
    public void mostrarTiempo(String tiempo) {
        System.out.println("Es de " + tiempo);
    }
    public void mostrarDeteccion(boolean detectado, String tipoSensor) {
        if (detectado) {
            System.out.println("hay " + tipoSensor);
        } else {
            System.out.println("No hay " + tipoSensor);
        }
    }
    public void mostrarAlarma(boolean alarmaEncendida) {
        if (alarmaEncendida) {
            System.out.println("pipipipipipipipipipipipipipipipipi");
        } else {
            System.out.println("Alarma");
        }
    }
}
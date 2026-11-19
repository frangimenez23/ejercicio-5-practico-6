public class Mascota {

    // ATRIBUTOS
    private String nombre;
    private String especie;
    private int edad;
    private double[] pesos;

    // CONSTRUCTOR
    public Mascota(String nombre, String especie, int edad, double[] pesos) {

        this.nombre = nombre;
        this.especie = especie;

        if (edad >= 0) {
            this.edad = edad;
        } else {
            this.edad = 0;
        }

        this.pesos = pesos;

    }

    // MODIFICAR NOMBRE
    public void setNombre(String n) {
        nombre = n;
    }

    // MODIFICAR EDAD
    public void setEdad(int e) {

        if (e >= 0) {
            edad = e;
            System.out.println("Edad modificada correctamente");
        } else {
            System.out.println("Error: edad negativa");
        }

    }

    // OBTENER NOMBRE
    public String getNombre() {
        return nombre;
    }

    // OBTENER EDAD
    public int getEdad() {
        return edad;
    }

    // MODIFICAR PESO
    public void modificarPeso(int posicion, double peso) {

        if (posicion >= 0 && posicion < 3) {

            if (peso > 0) {
                pesos[posicion] = peso;
                System.out.println("Peso modificado correctamente");
            } else {
                System.out.println("Error: el peso debe ser positivo");
            }

        } else {
            System.out.println("Error: posicion incorrecta");
        }

    }

    // CALCULAR PROMEDIO
    public double promedioPesos() {

        double suma = 0;

        for (int i = 0; i < 3; i++) {
            suma = suma + pesos[i];
        }

        return suma / 3;

    }

    // VERIFICAR SI ES ADULTA
    public boolean esAdulto() {

        if (edad >= 2) {
            return true;
        } else {
            return false;
        }

    }

    // MOSTRAR DATOS
    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");

        System.out.println("Pesos registrados:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Consulta " + (i + 1) + ": " + pesos[i] + " kg");
        }

    }

}
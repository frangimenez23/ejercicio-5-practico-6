import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // AL PRINCIPIO NO HAY NINGUNA MASCOTA
        Mascota mascota = null;

        int opcion;

        do {

            // MOSTRAR MENU
            System.out.println("\n========== VETERINARIA ==========");
            System.out.println("1. Registrar mascota");
            System.out.println("2. Mostrar datos de la mascota");
            System.out.println("3. Modificar nombre");
            System.out.println("4. Modificar edad");
            System.out.println("5. Modificar un peso");
            System.out.println("6. Calcular promedio de pesos");
            System.out.println("7. Verificar si es adulta");
            System.out.println("0. Salir");
            System.out.println("=================================");

            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(entrada.nextLine());

            // VERIFICAR SI EXISTE UNA MASCOTA
            if (opcion >= 2 && opcion <= 7 && mascota == null) {

                System.out.println("Primero debe registrar una mascota");

            } else {

                switch (opcion) {

                    // REGISTRAR MASCOTA
                    case 1:

                        System.out.println("\n--- REGISTRAR MASCOTA ---");

                        System.out.print("Ingrese nombre: ");
                        String nombre = entrada.nextLine();

                        System.out.print("Ingrese especie: ");
                        String especie = entrada.nextLine();

                        System.out.print("Ingrese edad: ");
                        int edad = Integer.parseInt(entrada.nextLine());

                        // CREAR ARREGLO DE PESOS
                        double[] pesos = new double[3];

                        for (int i = 0; i < 3; i++) {

                            System.out.print("Ingrese peso de consulta " + (i + 1) + ": ");
                            pesos[i] = Double.parseDouble(entrada.nextLine());

                        }

                        // CREAR OBJETO UTILIZANDO EL CONSTRUCTOR
                        mascota = new Mascota(nombre, especie, edad, pesos);

                        System.out.println("Mascota registrada correctamente");

                        break;

                    // MOSTRAR DATOS
                    case 2:

                        System.out.println("\n--- DATOS DE LA MASCOTA ---");

                        mascota.mostrarDatos();

                        break;

                    // MODIFICAR NOMBRE
                    case 3:

                        System.out.print("Ingrese el nuevo nombre: ");
                        String nuevoNombre = entrada.nextLine();

                        mascota.setNombre(nuevoNombre);

                        System.out.println("Nombre modificado correctamente");

                        break;

                    // MODIFICAR EDAD
                    case 4:

                        System.out.print("Ingrese la nueva edad: ");
                        int nuevaEdad = Integer.parseInt(entrada.nextLine());

                        mascota.setEdad(nuevaEdad);

                        break;

                    // MODIFICAR PESO
                    case 5:

                        System.out.print("Que consulta desea modificar (1, 2 o 3): ");
                        int posicion = Integer.parseInt(entrada.nextLine());

                        System.out.print("Ingrese el nuevo peso: ");
                        double nuevoPeso = Double.parseDouble(entrada.nextLine());

                        mascota.modificarPeso(posicion - 1, nuevoPeso);

                        break;

                    // CALCULAR PROMEDIO
                    case 6:

                        double promedio = mascota.promedioPesos();

                        System.out.println("El promedio de los pesos es: " + promedio + " kg");

                        break;

                    // VERIFICAR SI ES ADULTA
                    case 7:

                        if (mascota.esAdulto()) {
                            System.out.println("La mascota es adulta");
                        } else {
                            System.out.println("La mascota no es adulta");
                        }

                        break;

                    // SALIR
                    case 0:

                        System.out.println("Saliendo del programa...");

                        break;

                    // OPCION INCORRECTA
                    default:

                        System.out.println("Opcion incorrecta");

                        break;

                }

            }

        } while (opcion != 0);

        entrada.close();

    }

}
package conversorunidades;

import java.util.Scanner;

public class ConversorUnidades {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONVERSOR DE UNIDADES");
        System.out.println("Seleccione el tipo de unidad:");
        System.out.println("1 Temperatura");
        System.out.println("2 Peso");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Unidad de origen: ");
        String origen = scanner.nextLine().toLowerCase();

        System.out.print("Unidad de destino: ");
        String destino = scanner.nextLine().toLowerCase();

        double resultado = 0;
        boolean valido = true;

        try {
            switch (opcion) {
                case 1:
                    Temperatura temp = new Temperatura(valor, origen);
                    switch (destino) {
                        case "celsius":
                            temp.convertirACelsius();
                            break;
                        case "fahrenheit":
                            temp.convertirAFahrenheit();
                            break;
                        case "kelvin":
                            temp.convertirAKelvin();
                            break;
                        default:
                            System.out.println("Unidad de temperatura destino no válida.");
                            valido = false;
                    }
                    resultado = temp.getValor();
                    break;
                case 2:
                    Peso peso = new Peso(valor, origen);
                    switch (destino) {
                        case "gramos":
                            peso.convertirAGramos();
                            break;
                        case "kilogramos":
                            peso.convertirAKilogramos();
                            break;
                        case "libras":
                            peso.convertirALibras();
                            break;
                        default:
                            System.out.println("Unidad de peso destino no válida.");
                            valido = false;
                    }
                    resultado = peso.getValorPeso();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    valido = false;
            }

            if (valido) {
                System.out.println("Resultado: " + resultado + " " + destino);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
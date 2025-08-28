import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Personajes p1 = new Personajes("Cifru", "Volar", 50, "Mamifera", "Aereo", "Asesinato");
        p1.infoPersonaje();
        p1.ataque(); 
        */

        Scanner scanner = new Scanner(System.in);
        Integer opcion;
        do{
            System.out.println("---------- Elija Un Personaje ----------");
            System.out.println(" 1. Centauro");
            System.out.println(" 2. Dragon");
            System.out.println(" 3. Hechicero");
            System.out.println(" 4. Vampiro");
            System.out.println(" 5. ... Salir .....");
            System.out.println("----------------------------------------");
            opcion = scanner.nextInt();
            scanner.nextLine();

            Personajes personajes;

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del vampiro");
                    String nombre = scanner.nextLine();
                    personajes = new Vampiro(nombre, "Morder", 74, "No-muerto", "Bosque", "Secreto oscuro");
                    personajes.infoPersonaje();
                    personajes.ataque(opcion);
                    ((Vampiro) personajes).secreto(); // Llamar un método que no existe en la clase padre
                    break;
            
                default:
                    System.out.println(".... Saliendo ....");
            }
        }while (opcion != 5);
        scanner.close();
    }
}

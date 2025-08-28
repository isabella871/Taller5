import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer opcion;
        do{
            System.out.println("---------- Elija Un Personaje ----------");
            System.out.println(" 2. Crear personaje");
            System.out.println(" 2. Vampiro");
            System.out.println(" 3. Dragon");
            System.out.println(" 4. Hechicero");
            System.out.println(" 5. Vampiro");
            System.out.println(" 6. ... Salir .....");
            System.out.println("----------------------------------------");
            opcion = scanner.nextInt();
            scanner.nextLine();

            Personajes personajes;

            switch (opcion) {
                case 1:
                    System.out.println("------------- C R E A R   P E R S O N A J E -------------");
                    System.out.print("Nombre del personaje: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Habilidad: ");
                    String habilidad = scanner.nextLine();
                    System.out.print("Fuerza: ");
                    Integer fuerza = scanner.nextInt();
                    System.out.print("Especie: ");
                    String especie = scanner.nextLine();
                    System.out.print("Ecosistema: ");
                    String ecosistema = scanner.nextLine();

                    personajes = new Personajes(nombre, habilidad, fuerza, especie, ecosistema, null);
                    personajes.infoPersonaje();
                    personajes.ataque(fuerza);
                    break;

                case 2:
                    System.out.println("------------- D A T O S -------------");
                    System.out.print("Nombre del vampiro: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Habilidad: ");
                    String habilidad = scanner.nextLine();
                    System.out.print("Fuerza: ");
                    Integer fuerza = scanner.nextInt();
                    System.out.print("Especie: ");
                    String especie = scanner.nextLine();
                    System.out.print("Ecosistema: ");
                    String ecosistema = scanner.nextLine();

                    personajes = new Vampiro(nombre, habilidad, fuerza , especie, ecosistema, null);

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

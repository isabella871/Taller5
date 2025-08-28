import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personajes p1 = new Personajes("Cifru", "Volar", 50, "Mamifera", "Aereo", "Asesinato");
        p1.infoPersonaje();
        p1.ataque();

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("---------- Elija Un Personaje ----------");
            System.out.println(" 1. Centauro");
            System.out.println(" 2. Hechicero");
            System.out.println(" 3. Vampiro");
            System.out.println(" 4. Dragon");
            System.out.println(" 5. ... Salir .....");
            System.out.println("----------------------------------------");
            opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        }while (opcion != 5);
        scanner.close();
    }
}

import java.util.Scanner;

public class Vampiro extends Personajes {
    public Vampiro (String nombre, String habilidad, Integer fuerza, String especie, String ecosistema, String secreto){
        super (nombre, habilidad, fuerza, especie, ecosistema, secreto);
    }

    @Override
    public void infoPersonaje(){
        System.out.println("----------------- V a m p i r o ------------------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Habilidad: " + getHabilidad());
        System.out.println("Fuerza: " + getFuerza());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Ecosistema: " + getEcosistema());
        System.out.println("El secreto de " + getNombre() + " es ..............");
        System.out.println("-------------------------------------------------");
        System.out.println();
    }

    @Override
    public void ataque(Integer vidaVictima){
        Scanner scanner = new Scanner(System.in);

        System.out.println("... Ataque ...");

        System.out.print("Ingrese el nombre de la victima: ");
        String nombreVic = scanner.nextLine();

        System.out.print("Ingrese cantidad del ataque: ");
        Integer ataque = scanner.nextInt();

        vidaVictima = 100;

        if (ataque < vidaVictima){
            vidaVictima -= ataque ;
            System.out.println("vida de la víctima: " + vidaVictima + " ataque fallido");
            System.out.print("¿Seguir el ataque? 1.  Sí / 2. no ");
            Integer decicidir = scanner.nextInt();
            scanner.nextLine();

            if (decicidir == 1){
                System.out.print("Ingrese la fuerza del ataque: ");
                Integer fuerza = scanner.nextInt();
                vidaVictima -= fuerza;
                System.out.println(nombreVic +" ha muerto");
            }else{
                System.out.println(nombreVic +" ha escapado ... del intento de homicidio de " + getNombre());
            }
        }else {
            System.out.println("La victima ha muerto a manos de " + getNombre());
        }
    }

    public void secreto(){
        System.out.println("El secreto de " + getNombre() + " es ");
    }
}

public class Hechicero extends Personajes{
    
    public Hechicero (String nombre, String habilidad, Integer fuerza, String especie, String ecosistema, String secreto){
        super (nombre, habilidad, fuerza, especie, ecosistema, secreto);
    }

    @Override
    public void infoPersonaje(){
        System.out.println("---------------- Centauro -----------------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Habilidad: " + getHabilidad());
        System.out.println("Fuerza: " + getFuerza());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Ecosistema" + getEcosistema());
        System.out.println("El secreto de " + getNombre() + " es ..............");
        System.out.println("--------------------------------------------");
        System.out.println();
    }

    public void ataque(){
        if (getFuerza() <= 10){
            System.out.println("Ataque");
        }else{
            System.out.println("Ataque recibido, precaución");
        }
    }
}

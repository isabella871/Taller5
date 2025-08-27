public class Centauro extends Personajes {
    private String debilidad;

    public Centauro(String nombre, String habilidad, Integer fuerza, String especie, String ecosistema, String secreto, String debilidad){
        super (nombre, habilidad, fuerza, especie, ecosistema, secreto);
        this.debilidad = debilidad;
    }

    public void debilidad(String debilidad){
        this.debilidad = debilidad;
    }

    public String getDebilidad(){
        return debilidad;
    }

    @Override
    public void infoPersonaje(){
        System.out.println("---------------- Centauro -----------------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Habilidad: " + getHabilidad());
        System.out.println("Fuerza: " + getFuerza());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Ecosistema" + getEcosistema());
        System.out.println("Debilidad: " + debilidad);
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

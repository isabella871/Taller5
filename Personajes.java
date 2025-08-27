class Personajes {
    String nombre;
    private String habilidad;
    private Integer fuerza;
    private String especie;
    private String ecosistema;
    private String secreto;

    public Personajes(String nombre, String habilidad, Integer fuerza, String especie, String ecosistema, String secreto){
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.fuerza = fuerza;
        this.ecosistema = ecosistema;
        this.secreto = secreto;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setHabilidad(String habilidad){
        this.habilidad = habilidad;
    }

    public String getHabilidad(){
        return habilidad;
    }

    public void setVilla(Integer fuerza){
        this.fuerza = fuerza;
    }

    public Integer getFuerza(){
        return fuerza;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String getEspecie(){
        return especie;
    }

    public void setEcosistema(String ecosistema){
        this.ecosistema = ecosistema;
    }

    public String getEcosistema(){
        return ecosistema;
    }

    public void setSecreto(String secreto){
        this.secreto = secreto;
    }

    public String getSecreto(){
        return secreto;
    }

    public void infoPersonaje(){
        System.out.println("---------------- Personaje -----------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Habilidad: " + habilidad);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Especie: " + especie);
        System.out.println("Ecosistema: " + ecosistema);
        System.out.println("El secreto de " + nombre + " es .............." + getSecreto());
        System.out.println("--------------------------------------------");
        System.out.println();
    }

    public void ataque(){
        if (this.fuerza <= 10){
            System.out.println("El ataque no causó daños");
        }
    }
}
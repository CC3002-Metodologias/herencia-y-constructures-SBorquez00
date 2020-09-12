public class Academico extends Persona{
    private String paper;

    public Academico (String nombre, int edad, String paper){
        super(nombre, "Academico", edad);
        this.paper = paper;
    }
    public void comer(){
        System.out.println("Come su comida casera");
    }
    public void dormir(){
        System.out.println("ZzzZzzZ");
    }
    public String hacerLoSuyo(){
        return "Aprenden a ocupar zoom y "+super.hacerLoSuyo();
    }

    public String publicarPaper(){
        return paper;
    }
}

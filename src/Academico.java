public class Academico extends Persona{
    private String paper;

    public Academico (String nombre, int edad, String paper){
        super(nombre, "Academico", edad);
        this.paper = paper;
    }

    private void publicarPaper(){
        System.out.println(paper);
    }
}

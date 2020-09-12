public class Estudiante extends Persona{
    public Estudiante (String nombre, int edad){

        super(nombre, "Estudiante", edad);
    }

    public void comer (){
        System.out.println("Se come un completo de Gorbea :)");
    }
    public void dormir (){
        System.out.println("ZzzZzz");
    }
    public String hacerLoSuyo(){
        return "Ver anime y Netflix y "+super.hacerLoSuyo();

    }
}

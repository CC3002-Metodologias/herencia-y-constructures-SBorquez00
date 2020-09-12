public class Main {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Jaime", 20);
        Academico l1 = new Academico("Patricio", 50, "Ciencia de lo absurdo");
        System.out.println(e1.hacerLoSuyo());
        System.out.println("El academico que tiene el paper "+l1.publicarPaper()+", en la pandemia "+l1.hacerLoSuyo());
    }
}

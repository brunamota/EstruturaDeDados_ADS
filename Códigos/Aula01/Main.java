

public class Main {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Gustavo", 123, 10.0);
        Estudante e2 = new Estudante("Juan", 456, 8.0);

        System.out.println(e2.getNota());
        e2.matriculado();

        e2.setNota(7.5);
        System.out.println(e2.getNota());

    }
}
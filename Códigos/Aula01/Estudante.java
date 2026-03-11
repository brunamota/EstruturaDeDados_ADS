//generalização = classe
class Estudante {
    //atributos = caracteristicas
    private String nome;
    private int matricula;
    private double nota;

    //Contrutor - Metodo
    Estudante(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNota(double nota) {
        if(nota >= 0 && nota <= 10) {
            this.nota = nota;
        }else{
            System.out.println("Erro nota" + nota + "invalida");
        }
    }

    public void matriculado(){
        System.out.println("Estudante " + nome + " matriculado. Matricula " + matricula);
    }

}
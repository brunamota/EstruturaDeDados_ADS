import java.util.List;

class Turma {
    private List<Estudante> lista;

    public Turma(List<Estudante> alunosExternos) {
        this.lista = alunosExternos;
    }

    public void exibirRelatorio() {
        for (Estudante e : lista) {
            System.out.println("Aluno: " + e.getNome() + " | Nota: " + e.getNota());
        }
    }
}

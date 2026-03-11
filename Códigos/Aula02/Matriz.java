//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Matriz {
    public static void main(String[] args) {

        // Declaração de uma matriz: 2 alunos (linhas) e 2 bimestres (colunas) [cite: 2103]
        double[][] boletim = new double[2][2];
        //    0   1
        // 0 [ ] [ ]
        // 1 [ ] [ ]

        // Aluno 0, Bimestre 0
        boletim[0][0] = 8.0;
        // Aluno 1, Bimestre 1
        boletim[1][1] = 7.5;

        System.out.println("Nota do Aluno 1 no 2º Bimestre: " + boletim[1][1]); // Saída: 7.5;

        for (int i = 0; i < boletim.length; i++) {
            for (int j = 0; j < boletim[i].length; j++) {
                System.out.print("[" + boletim[i][j] + "] ");
            }
            System.out.println();
        }

    }
}
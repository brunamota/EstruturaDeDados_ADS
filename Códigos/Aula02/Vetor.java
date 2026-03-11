public class Vetor {
    public static void main(String[] args) {
        // Declaração e alocação de um vetor para 5 notas
        double[] notas = new double[5];

        //  0  1  2  3  4
        // [ ][ ][ ][ ][ ]

        // Atribuição de valores via índice
        notas[0] = 8.5;
        notas[1] = 7.0;
        notas[2] = 9.0;
        notas[3] = 6.5;
        notas[4] = 10.0;

        System.out.println("A primeira nota é: " + notas[0]); // Saída: 8.5

        // Imprima todos os valores do vetor
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
    }
}

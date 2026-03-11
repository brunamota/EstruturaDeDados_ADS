import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        // Declaração da Pilha
        Stack<String> historico = new Stack<>();

        // 1. push: Adiciona elementos ao topo
        historico.push("Página Inicial");
        historico.push("Lista de Alunos");
        historico.push("Perfil do Aluno");

        System.out.println(historico); //imprimir a pilha construída

        // 2. peek: Mostra o topo sem remover
        System.out.println("No topo agora: " + historico.peek()); // Saída: Perfil do Aluno

        // 3. pop: Remove o elemento do topo
        String removido = historico.pop();
        System.out.println("Removido: " + removido); // Saída: Perfil do Aluno

        // 4. empty: Verifica se está vazia
        System.out.println("A pilha está vazia? " + historico.empty()); // Saída: false
    }
}

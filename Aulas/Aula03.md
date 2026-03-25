# Aula 03 - Estruturas de Dados Dinâmicas: Filas e Listas

## 1. Introdução à Alocação Dinâmica
* **O Problema dos Arrays**: Arrays precisam de um tamanho definido no início. Se o número de alunos crescer além do esperado, o sistema trava ou desperdiça memória.
* **A Solução Dinâmica**: Filas e Listas Encadeadas utilizam a memória de forma flexível. Elas "pedem" espaço apenas quando um novo dado chega.

## 2. Filas em Java (Queue)
A fila segue a regra **FIFO** (*First In, First Out* - Primeiro a entrar, Primeiro a sair).
* **Analogia**: Uma fila de banco.
* **Funcionamento**: A inserção é sempre no **fim** e a remoção é sempre no **início**.

### Operações Principais (Interface Queue):
* `add(E e)` / `offer(E e)`: Insere um elemento no fim da fila.
* `remove()` / `poll()`: Remove o elemento do início.
* `peek()`: Retorna o primeiro da fila sem remover.

### Exemplo

```java
import java.util.LinkedList;
import java.util.Queue;

public class Filas {
    public static void main(String[] args) {
        // Em Java, usamos LinkedList para implementar a interface Queue
        Queue<String> filaAtendimento = new LinkedList<>();

        // Adicionando alunos na fila
        filaAtendimento.add("Bruna");
        filaAtendimento.add("Ricardo");
        filaAtendimento.add("Mateus");

        int i=0;
        for (String aluno: filaAtendimento){
            i++;
            System.out.println(i+ "º " + aluno);
        }

        System.out.println("Primeiro da fila: " + filaAtendimento.peek());

        // Atendendo (removendo o primeiro)
        while (!filaAtendimento.isEmpty()) {
            System.out.println("Atendendo aluno: " + filaAtendimento.poll());
        }
    }
}
```

## 3. Listas Encadeadas (Linked Lists)
Diferente do Array, onde os dados estão vizinhos na memória, na Lista Encadeada os dados podem estar espalhados. Cada elemento (chamado de **Nó**) conhece o seu valor e o endereço do **próximo** elemento.

* **Vantagem**: Inserção e remoção rápidas em qualquer posição, sem precisar "empurrar" todos os outros elementos.
* **Tipos**:
    * **Simplesmente Encadeada**: Cada nó aponta para o próximo.
    * **Duplamente Encadeada**: Cada nó aponta para o próximo e para o anterior.

### Exemplo

```java
import java.util.LinkedList;

public class Listas {
    public static void main(String[] args) {
        // Lista dinâmica de contatos
        LinkedList<String> listaContatos = new LinkedList<>();

        listaContatos.add("Ana"); 
        listaContatos.add("Carlos"); 

        System.out.println("\nLista de Contatos:");
        for (String contato : listaContatos) {
            System.out.println("- " + contato);
        }

        // Inserção facilitada no meio da lista
        listaContatos.add(1, "Beatriz"); // Beatriz entra entre Ana e Carlos

        System.out.println("\nLista de Contatos Atualizada:");
        for (String contato : listaContatos) {
            System.out.println("- " + contato);
        }
    }
}
```

## Exercícios de Fixação

1.  **Fila de Processos**: Implemente uma fila que armazene 5 nomes de documentos para impressão. Remova os 2 primeiros e mostre quem é o próximo da fila.
2.  **Lista Encadeada**: Crie uma `LinkedList` de números inteiros. Adicione 3 números, remova o segundo elemento pelo índice e exiba o tamanho final da lista usando `.size()`.
3.  **Reflexão**: Em um sistema de **Pronto Socorro**, por que uma Fila (Queue) é mais adequada do que uma Pilha (Stack)?.

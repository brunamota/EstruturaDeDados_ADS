# Aula 02 - Estruturas de Dados Lineares: Arrays e Pilhas

## 1. Introdução às Estruturas de Dados

À medida que os desafios computacionais aumentam, variáveis simples (como `int` ou `double`) deixam de ser suficientes. As **estruturas de dados** surgem da necessidade de organizar conjuntos de informações na memória do computador para facilitar o manuseio e melhorar o desempenho das aplicações.

## 2. Arrays (Vetores e Matrizes)

Os arrays são as estruturas de dados mais simples e fundamentais para um desenvolvedor. Eles são conjuntos de dados **homogêneos** (armazenam apenas um tipo de dado básico) e **indexados**.

### Vetores (Unidimensionais)

* Representam um conjunto em forma de lista de valores.
* São estruturas lineares sequencialmente numeradas.

### Matrizes (Multidimensionais)

* A forma mais comum é a **bidimensional** (tabela), composta por linhas e colunas.
* Podem possuir *n* dimensões (cubos, etc.), exigindo um índice para cada dimensão para acessar o conteúdo.

### Regras Práticas em Java

* **Zero-based**: A numeração das posições (índices) começa sempre em **0**.
* **Acesso Aleatório**: É possível acessar qualquer elemento individualmente sem uma ordem preestabelecida.
* **Declaração**: É necessário informar o nome, o tamanho e o tipo de dado .

## 3. Estrutura de Dados Pilha (Stack)

A pilha é uma estrutura que aplica a disciplina de acesso **UEPS** (Último que Entra, Primeiro que Sai) ou **LIFO** (*Last In, First Out*).

* **Lógica**: Qualquer elemento inserido só sairá quando todos os que entraram depois dele forem removidos.
* **Inserção/Remoção**: Todas as operações são realizadas no **final** (topo) da estrutura.
* **Utilidade**: Tornar disponíveis primeiro os elementos mais recentes, como o botão "Desfazer" de editores ou o histórico de navegação.



## 4. Métodos da Classe Stack em Java

Em Java, utilizamos a classe `Stack` do pacote `java.util`. Os principais métodos são:

| Método | Retorno | Função |
| --- | --- | --- |
| `push(E item)` | E | Insere um elemento no topo da pilha. |
| `pop()` | E | Remove o elemento do topo e o retorna. |
| `peek()` | E | Mostra o elemento do topo sem removê-lo. |
| `empty()` | Booleano | Verifica se a pilha está vazia. |
| `size()` | int | Retorna a quantidade de elementos na pilha. |

## 5. Implementação Prática (Contexto Alunos)

```java
import java.util.Stack;

public class Aula02 {
    public static void main(String[] args) {
        // --- Exemplo com Vetor (Array Unidimensional) ---
        // Criando um vetor para armazenar 3 alunos da PUC Goiás
        String[] alunos = new String[3]; 
        alunos[0] = "Bruna";
        alunos[1] = "Ricardo";
        alunos[2] = "Mateus";

        System.out.println("Lista de Alunos (Vetor):");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Índice " + i + ": " + alunos[i]);
        }

        // --- Exemplo com Pilha (Stack) ---
        // Simulando a ordem de saída dos alunos da sala virtual
        Stack<String> pilhaSaida = new Stack<>();

        // Empilhando (Push)
        pilhaSaida.push(alunos[0]); // Bruna entrou primeiro
        pilhaSaida.push(alunos[1]);
        pilhaSaida.push(alunos[2]); // Mateus entrou por último

        System.out.println("\nTopo da Pilha (peek): " + pilhaSaida.peek());

        // Desempilhando (Pop) - Mateus deve ser o primeiro a sair (LIFO)
        while (!pilhaSaida.empty()) {
            System.out.println("Desempilhando: " + pilhaSaida.pop());
        }
    }
}

```

## Exercícios de Fixação

1. 
**Manipulação de Vetores**: Crie um programa que leia 5 notas de alunos em um vetor e exiba apenas as notas que estão na posição (índice) par.


2. **Lógica de Pilha**: Implemente uma pilha de nomes. Insira 4 nomes e use o método `pop()` duas vezes. Ao final, use o `peek()` para dizer qual nome restou no topo.
3. 
**Reflexão sobre Manutenção**: Por que devemos usar nomes de variáveis claros (Clean Code) e modularização em estruturas de dados?.


**Sugestão Docente:** Bruna, ao explicar o código, enfatize que o `alunos.length` (vetor) e o `pilha.size()` (pilha) são fundamentais para percorrer as estruturas sem causar erros de limite de memória (*IndexOutOfBounds*).

Deseja que eu prepare o **PDF de leitura complementar** focado nos exemplos de matrizes bidimensionais para os alunos aprofundarem o estudo de arrays?

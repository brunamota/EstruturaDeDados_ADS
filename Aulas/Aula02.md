# Aula 02 - Estruturas de Dados Lineares: Arrays e Pilhas

## 1. Introdução às Estruturas de Dados

À medida que os desafios computacionais aumentam, variáveis simples (como `int` ou `double`) deixam de ser suficientes. As **estruturas de dados** surgem da necessidade de organizar conjuntos de informações na memória do computador para facilitar o manuseio e melhorar o desempenho das aplicações.

## 2. Arrays (Vetores e Matrizes)

Os arrays são as estruturas de dados mais simples e fundamentais para um desenvolvedor. Eles são conjuntos de dados **homogêneos** (armazenam apenas um tipo de dado básico) e **indexados**.

### Vetores (Unidimensionais)

* Representam um conjunto em forma de lista de valores.
* São estruturas lineares sequencialmente numeradas.

```java 
// Declaração e alocação de um vetor para 5 notas
double[] notas = new double[5]; 

// Atribuição de valores via índice
notas[0] = 8.5;
notas[1] = 7.0;
notas[2] = 9.0;
notas[3] = 6.5;
notas[4] = 10.0;

// Acessando um valor específico
System.out.println("A primeira nota é: " + notas[0]); // Saída: 8.5
```

### Matrizes (Multidimensionais)

* A forma mais comum é a **bidimensional** (tabela), composta por linhas e colunas.
* Podem possuir *n* dimensões (cubos, etc.), exigindo um índice para cada dimensão para acessar o conteúdo.

```java 
// Declaração de uma matriz: 2 alunos (linhas) e 2 bimestres (colunas) [cite: 2103]
double[][] boletim = new double[2][2];

// Aluno 0, Bimestre 0
boletim[0][0] = 8.0;
// Aluno 1, Bimestre 1
boletim[1][1] = 7.5;

System.out.println("Nota do Aluno 1 no 2º Bimestre: " + boletim[1][1]); // Saída: 7.5 [cite: 2107]
```

### Regras Práticas em Java

* **Zero-based**: A numeração das posições (índices) começa sempre em **0**.
* **Acesso Aleatório**: É possível acessar qualquer elemento individualmente sem uma ordem preestabelecida.
* **Declaração**: É necessário informar o nome, o tamanho e o tipo de dado .

## 3. Estrutura de Dados Pilha (Stack)

A pilha é uma estrutura que aplica a disciplina de acesso **UEPS** (Último que Entra, Primeiro que Sai) ou **LIFO** (*Last In, First Out*).

* **Lógica**: Qualquer elemento inserido só sairá quando todos os que entraram depois dele forem removidos.
* **Inserção/Remoção**: Todas as operações são realizadas no **final** (topo) da estrutura.
* **Utilidade**: Tornar disponíveis primeiro os elementos mais recentes, como o botão "Desfazer" de editores ou o histórico de navegação.

### Métodos da Classe Stack em Java

Em Java, utilizamos a classe `Stack` do pacote `java.util`. Os principais métodos são:

| Método | Retorno | Função |
| --- | --- | --- |
| `push(E item)` | E | Insere um elemento no topo da pilha. |
| `pop()` | E | Remove o elemento do topo e o retorna. |
| `peek()` | E | Mostra o elemento do topo sem removê-lo. |
| `empty()` | Booleano | Verifica se a pilha está vazia. |
| `size()` | int | Retorna a quantidade de elementos na pilha. |

>> O E significa Element (Elemento). Ele indica que o método retornará um objeto do mesmo tipo que você definiu para a pilha.
>> Como as estruturas de dados no Java são homogêneas (aceitam apenas um tipo de dado por vez), o compilador usa o E para garantir que você receba exatamente o que guardou.

 ```java 
import java.util.Stack; // Necessário importar [cite: 1785]

public class ExemploPilha {
    public static void main(String[] args) {
        // Declaração da Pilha [cite: 1672]
        Stack<String> historico = new Stack<>();

        // 1. push: Adiciona elementos ao topo 
        historico.push("Página Inicial");
        historico.push("Lista de Alunos");
        historico.push("Perfil do Aluno");

        // 2. peek: Mostra o topo sem remover 
        System.out.println("No topo agora: " + historico.peek()); // Saída: Perfil do Aluno

        // 3. pop: Remove o elemento do topo 
        String removido = historico.pop();
        System.out.println("Removido: " + removido); // Saída: Perfil do Aluno

        // 4. empty: Verifica se está vazia 
        System.out.println("A pilha está vazia? " + historico.empty()); // Saída: false
    }
}
```

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

1. **Manipulação de Vetores**: Crie um programa que leia 5 notas de alunos em um vetor e exiba apenas as notas que estão na posição (índice) par.

```java
import java.util.Scanner;

public class RespostaVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[5]; // Declaração de vetor com 5 posições[cite: 2017].

        // Leitura das notas
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = ler.nextDouble();
        }

        System.out.println("\nNotas em índices pares (0, 2, 4):");
        // Exibição apenas dos índices pares
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { // Verifica se o índice é par[cite: 2032].
                System.out.println("Índice [" + i + "]: " + notas[i]);
            }
        }
    }
}
```

2. **Lógica de Pilha**: Implemente uma pilha de nomes. Insira 4 nomes e use o método `pop()` duas vezes. Ao final, use o `peek()` para dizer qual nome restou no topo.

```java
import java.util.Stack;

public class RespostaPilha {
    public static void main(String[] args) {
        Stack<String> nomes = new Stack<>(); // Criando a pilha[cite: 1672].

        // Inserindo 4 nomes (push) [cite: 1706]
        nomes.push("Bruna");
        nomes.push("Ricardo");
        nomes.push("Mateus");
        nomes.push("Ana"); // Topo atual

        // Removendo dois nomes (pop) [cite: 1744]
        nomes.pop(); // Remove "Ana"
        nomes.pop(); // Remove "Mateus"

        // Verificando o topo (peek) [cite: 1790]
        System.out.println("Nome que restou no topo: " + nomes.peek()); // Saída: Ricardo
    }
}
```

3. **Matriz:** Declare uma matriz $3 \times 3$ e inicialize-a com o valor zero em todas as posições.

```java
public class RespostaMatriz {
    public static void main(String[] args) {
        // Declaração de matriz 3x3 [cite: 2103]
        int[][] matriz = new int[3][3];

        // Inicializando com zero (opcional em Java, pois int inicia em 0 por padrão)
        for (int i = 0; i < 3; i++) { // Percorre linhas [cite: 2116]
            for (int j = 0; j < 3; j++) { // Percorre colunas [cite: 2118]
                matriz[i][j] = 0;
            }
        }
        
        System.out.println("Matriz 3x3 inicializada com sucesso.");
    }
}
```

4. **Reflexão sobre Manutenção**: Por que devemos usar nomes de variáveis claros (Clean Code) e modularização em estruturas de dados?.

A manutenção é uma parte crítica do ciclo de vida do software pelas seguintes razões:

* Legibilidade: O código deve ser escrito para que outras pessoas consigam ler e entender; nomes claros evitam confusão sobre o que cada variável armazena.
* Tempo de Vida: Em média, 80% do tempo de vida de um software é destinado a manutenções e correções, e não à criação inicial.
* Modularização: Organizar o código em blocos (métodos/classes) permite que partes do sistema sejam testadas e reaproveitadas isoladamente, garantindo a qualidade do software.
* Eficiência: Estruturas bem nomeadas e modularizadas facilitam a identificação de gargalos de desempenho e simplificam a modificação da lógica de dados sem impactar todo o sistema.

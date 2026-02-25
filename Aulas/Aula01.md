# Aula 01 - Modularização e Objetos em Java

A organização do código-fonte em blocos que possam ser reaproveitados e melhor testados é essencial para a garantia da qualidade de um software. Em Java, as classes e métodos correspondem à maneira mais básica de dividir um programa em componentes ou subprogramas.

## 1. Classes, Objetos e Referência de Memória

* **Classe**: Funciona como um modelo, planta ou projeto para a criação de objetos.
* **Objeto**: É a instância real e física que existe na memória em tempo de execução.
* **Operador `new**` **: Comando usado para criar um novo objeto, alocando espaço na memória e retornando uma referência para essa instância.
* **Métodos**: São blocos de código definidos em uma classe que podem ser invocados para executar as operações neles descritas.

### Entendendo a Referência (A Metáfora do Controle Remoto)

Uma variável de referência é capaz de armazenar a localização (endereço na memória) de um objeto.

* **O Controle Remoto**: Imagine que a variável é o controle remoto e o objeto é o aparelho de TV.


* **Invocação de Métodos**: Usamos o "controle" (variável de referência) para acionar um "botão" (método) do objeto através do operador ponto (`.`).

* **Exemplo Prático**:
```java
// Criamos o objeto na memória e o controle 'e1' aponta para ele
Estudante e1 = new Estudante(); 
e1.estudar(); // Acionamos o comportamento do objeto

// e2 recebe a CÓPIA da referência. Agora temos dois controles para o MESMO objeto
Estudante e2 = e1; 
e2.setNota(9.5); // Alteramos o objeto através do controle e2

// Como o objeto é o mesmo, e1 também verá a mudança
System.out.println(e1.getNota()); // Saída: 9.5

```

## 2. Método Construtor

O construtor é um tipo especial de método utilizado para criar e inicializar objetos.

* **Objetivo**: Garantir que o objeto seja criado com um estado inicial consistente e válido.


* **Regras**: Deve ter o mesmo nome da classe e não possui tipo de retorno, nem mesmo `void`.


* **Invocação**: É chamado automaticamente quando o objeto é criado através do comando `new`.

```java
public class Estudante {
    private String nome;

    // Construtor: Inicializa o atributo nome no momento do 'new'
    public Estudante(String nomeInicial) {
        this.nome = nomeInicial; [cite_start]// 'this' diferencia o atributo do parâmetro [cite: 908]
    }
}

```

---

## 3. Anatomia de Métodos e Encapsulamento

O encapsulamento protege os dados internos da classe, garantindo a integridade da informação.

* **Modificadores de Acesso**:
* **`public`**: O membro é visível para qualquer classe.
* **`private`**: O acesso é restrito exclusivamente ao interior da própria classe.
* **`protected`**: Visível para classes no mesmo pacote e subclasses, mesmo em pacotes diferentes.

### Getters e Setters:

São métodos públicos usados para ler (get) e alterar (set) atributos privados, permitindo validações.

```java
public class Estudante {
    private double nota; // Atributo protegido pelo encapsulamento

    // Setter: Portão de entrada com validação (Regra de Negócio)
    public void setNota(double novaNota) {
        if (novaNota >= 0 && novaNota <= 10) {
            this.nota = novaNota;
        } else {
            System.out.println("Nota inválida!");
        }
    }

    // Getter: Saída segura do dado
    public double getNota() {
        return this.nota;
    }
}

```

---

## 4. Coesão e Acoplamento

* **Coesão**: Refere-se à organização interna. Uma classe coesa tem uma responsabilidade única e clara. Se a classe `Estudante` também imprimir boletos financeiros, ela perde coesão.
* **Acoplamento**: Nível de dependência entre classes. Buscamos o **baixo acoplamento** para que as classes sejam independentes.

### Exemplo de Baixo Acoplamento (Injeção de Dependência):

```java
public class Turma {
    private List<Estudante> alunos;

    // A Turma não cria os alunos (new), ela os RECEBE prontos.
    // Isso diminui a dependência direta entre Turma e a criação de Estudante.
    public Turma(List<Estudante> alunosExternos) {
        this.alunos = alunosExternos;
    }
}

```

---

## 5. Organização por Pacotes

Pacotes servem para agrupar classes relacionadas, organizar o espaço de nomes (*namespace*) e controlar a visibilidade.
* **Convenção**: Nomes em letras minúsculas.
* **Estrutura**: Reflete a hierarquia de diretórios no sistema de arquivos.

```java
// Localizado em: src/br/com/pucgoias/model/Estudante.java
package br.com.pucgoias.model; 

public class Estudante {
    // Membros da classe...
}

```

## Exercícios de Fixação

1. **O Construtor**: Crie uma classe `Estudante` que exija `nome` e `matricula` no construtor. Tente instanciar um objeto sem passar esses dados e explique o erro de compilação.
2. **O Controle Remoto**: No `main`, crie `Estudante e1` e atribua a nota 8.0. Crie `Estudante e2 = e1`. Altere a nota para 10.0 usando `e2`. Imprima a nota de `e1`. Justifique o resultado com base no conceito de referência.
3. **Encapsulamento e Protected**: Altere o atributo `nota` para `protected`. Crie uma classe em um pacote diferente e tente acessar `aluno.nota` diretamente. O que acontece? Como o encapsulamento resolveria isso?

---

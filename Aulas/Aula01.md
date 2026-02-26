# Aula 01 - Modularização e Objetos em Java

A organização do código-fonte em blocos que possam ser reaproveitados e melhor testados é essencial para a garantia da qualidade de um software. Em Java, as classes e métodos correspondem à maneira mais básica de dividir um programa em componentes ou subprogramas.

## 1. Classes, Objetos e Referência de Memória

* **Classe**: Funciona como um modelo, planta ou projeto para a criação de objetos.
* **Objeto**: É a instância real e física que existe na memória em tempo de execução.
* **Operador `new`**: Comando usado para criar um novo objeto, alocando espaço na memória e retornando uma referência para essa instância.
* **Métodos**: São blocos de código definidos em uma classe que podem ser invocados para executar as operações neles descritas.
* Uma variável de referência é capaz de armazenar a localização (endereço na memória) de um objeto.
    * **O Controle Remoto**: Imagine que a variável é o controle remoto e o objeto é o aparelho de TV.
    * **Invocação de Métodos**: Usamos o "controle" (variável de referência) para acionar um "botão" (método) do objeto através do operador ponto (`.`).
 
## 2. Método Construtor

O construtor é um tipo especial de método utilizado para criar e inicializar objetos.

* **Objetivo**: Garantir que o objeto seja criado com um estado inicial consistente e válido.
* **Regras**: Deve ter o mesmo nome da classe e não possui tipo de retorno, nem mesmo `void`.
* **Invocação**: É chamado automaticamente quando o objeto é criado através do comando `new`.
 
## 3. Anatomia de Métodos e Encapsulamento

O encapsulamento protege os dados internos da classe, garantindo a integridade da informação.

* **Modificadores de Acesso**:
* **`public`**: O membro é visível para qualquer classe.
* **`private`**: O acesso é restrito exclusivamente ao interior da própria classe.
* **`protected`**: Visível para classes no mesmo pacote e subclasses, mesmo em pacotes diferentes.

## 4. Getters e Setters:

São métodos públicos usados para ler (get) e alterar (set) atributos privados, permitindo validações.

## 5. Coesão e Acoplamento

* **Coesão**: Refere-se à organização interna. Uma classe coesa tem uma responsabilidade única e clara. Se a classe `Estudante` também imprimir boletos financeiros, ela perde coesão.
* **Acoplamento**: Nível de dependência entre classes. Buscamos o **baixo acoplamento** para que as classes sejam independentes.

* **Exemplo Prático**:

```java

//Classe é a generalização
class Estudante {
    //Atributos
    private String nome; 
    private int matricula;
    protected double nota; // Modificador protected: visível no mesmo pacote ou por herança

    // Construtor
    public Estudante(String nome, int matricula) {
        this.nome = nome; // 'this' diferencia o atributo do parâmetro.
        this.matricula = matricula;
    }

    // Setter com validação: Protege o atributo 'nota' (Regra de Negócio)
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Erro: Nota " + nota + " inválida para o aluno " + this.nome);
        }
    }

    // Getter: Forma segura de acessar o atributo privado
    public double getNota() {
        return this.nota;
    }

    public String getNome() {
        return this.nome;
    }

    // Comportamento do objeto
    public void estudar() {
        System.out.println(this.nome + " está estudando Estrutura de Dados...");
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        // 'new' aloca espaço e retorna o endereço
        Estudante e1 = new Estudante("Bruna", 202601);
        
        e1.setNota(9.5);
        e1.estudar();

        Estudante e2 = e1; 
        e2.setNota(10.0); // Alteramos o objeto através do segundo controle

        System.out.println("Nota visualizada pelo controle e1: " + e1.getNota()); // Saída: 10.0

        List<Estudante> ads = new ArrayList<>();
        ads.add(e1);
        
        Turma aulaHoje = new Turma(ads);
        aulaHoje.exibirRelatorio();
    }
}
```



```java

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

```

## Exercícios de Fixação


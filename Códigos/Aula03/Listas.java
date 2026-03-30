import java.util.LinkedList;

public class Listas {
    public static void main(String[] args) {
        LinkedList<String> listaMercado = new LinkedList<>();

        listaMercado.add("Arroz");      //0 
        listaMercado.add("Feijão");     //1
        listaMercado.add("Amaciante");  //2

        System.out.println("Lista de Compras:");
        for (String s : listaMercado) {
            System.out.println("-" + s);
        }

        listaMercado.add(1, "Macarrão"); //macarrao [1]

        System.out.println(listaMercado);

        System.out.println(listaMercado.removeLast());

    }
}

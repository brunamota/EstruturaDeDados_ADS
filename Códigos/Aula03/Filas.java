import java.util.LinkedList;
import java.util.Queue;

//FIFO (First In, First Out - Primeiro a entrar, Primeiro a sair).

public class Filas {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Bruna");
        fila.add("Ricardo");
        fila.add("Mateus");

        int i = 0;
        for(String ordem: fila) {
            i++;
            System.out.println(i + "º " + ordem );
        }

        System.out.println("Primeiro da fila:" + fila.peek());

        while(!fila.isEmpty()) {
            System.out.println("Proximo da fila:" + fila.poll());
        }

        System.out.println(fila);

    }
}


public class App {

    public static void main(String[] args) {

        LinkedListOfInteger lista = new LinkedListOfInteger();

        lista.add(1);
        //lista.add(2);
        lista.add(3);
        //lista.add(4);
        lista.add(3);
        //lista.add(6);
        lista.add(5);
        //lista.add(8);
        lista.add(9);

        System.out.println("Lista antes: " + lista);
        boolean removed = lista.removeEvenNumbers();
        System.out.println("Lista depois: " + lista);

        if (removed) {
            System.out.println("Números pares removidos.");
        } else {
            System.out.println("Nenhum número par encontrado ou a lista está vazia.");
        }
    }
}

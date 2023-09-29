
public class App {

    public static void main(String[] args) {

        LinkedListOfInteger lista = new LinkedListOfInteger();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(30);
        lista.add(60);
        lista.add(30);
        lista.add(80);
        lista.add(90);
        System.out.println(lista);


        System.out.println(lista.countOccurences(30));


    }
}

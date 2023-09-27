
public class App {

    public static void main(String[] args) {

        LinkedListOfInteger lista = new LinkedListOfInteger();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.add(70);
        lista.add(80);
        lista.add(90);
        System.out.println(lista);

        Integer sub[] = lista.sublist(2,2);
        for(int i = 0; i < sub.length; i++) {
            System.out.print(sub[i] + " | ");
        }

        lista.reverse();
        System.out.println(lista);

        System.out.println(lista.countOccurences(30));


        //chama automaticamente o método ToString subescrito
        /*
        System.out.println(lista);

        lista.add(3, 55);
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);

        lista.removeByIndex(6);
        System.out.println(lista);
         */

    }
}

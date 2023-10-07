public class App {
    public static void main(String[] args) {
        System.out.println("***********************************************************************************");
        System.out.println("*******                TESTE DO 'DoubleLinkedListOfInteger'                 *******");
        System.out.println("***********************************************************************************");

        DoubleLinkedListOfInteger DL = new DoubleLinkedListOfInteger();
        DL.add(2);
        DL.add(3);
        DL.add(4);
        DL.add(5);
        DL.add(6);
        DL.add(7);
        DL.add(5);


        System.out.println("Tamanho da lista: " + DL.size());
        System.out.println();

        System.out.println("Contando ocorrências do número 5: " + DL.countOccurrences(5));
        System.out.println();

        System.out.println("Removendo números pares: " + DL.removeEvenNumbers());
        System.out.println();

        System.out.println("Tamanho da lista atualizada: " + DL.size());
        System.out.println();

        System.out.println("***********************************************************************************");
        System.out.println("*******                      TESTE DO 'StackOfInteger'                      *******");
        System.out.println("***********************************************************************************");

        System.out.println();


        StackOfInterger stack = new StackOfInterger();

        stack.push(4);
        stack.push(5);
        stack.push(1);

        System.out.println("Tamanho da fila: " + stack.size());
        System.out.println();

        System.out.println("Elemento que estava no início da fila e foi removido --> " + stack.pop());
        System.out.println();

        System.out.println("Elemento que agora está no início--> " + stack.top());
        System.out.println();

        System.out.println("Elemento adicionado na fila --> " + stack.push(8));
        System.out.println();

        System.out.println("Tamanho da fila atualizada: " + stack.size());
        System.out.println();

        System.out.println("Elemento que estava no início da fila e foi removido --> " + stack.pop());
        System.out.println();

        System.out.println("Tamanho da fila atualizada: " + stack.size());
        System.out.println();

        System.out.println("A fila está vazia? " + stack.isEmpty());
        System.out.println();

        System.out.println("-----> Limpando a fila <-----");
        System.out.println();

        stack.clear();

        System.out.println("A fila está vazia agora? " + stack.isEmpty());
        System.out.println();

        System.out.println("----- Invertendo um array -----");
        Integer[] arr = {4,5,1};
        Integer[] reversedArr = stack.reverseArrayUsingStack(arr);

        System.out.print("Pilha inicial: ");
        for (Integer element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Pilha invertida: ");
        for (Integer element : reversedArr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("***********************************************************************************");
        System.out.println("*******                      TESTE DO 'QueueOfInteger'                      *******");
        System.out.println("***********************************************************************************");

        System.out.println();


        QueueOfInterger queue = new QueueOfInterger();

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(1);

        System.out.println("Tamanho da fila: " + stack.size());
        System.out.println();

        System.out.println("Elemento no início da fila: " + queue.head());
        System.out.println();

        System.out.println("Elemento adicionado na fila --> " + queue.enqueue(8));
        System.out.println();

        System.out.println("Tamanho da fila atualizada: " + queue.size());
        System.out.println();

        System.out.println("Elemento no início da fila --> " + queue.head());
        System.out.println();

        System.out.println("Elemento removido da fila --> " + queue.dequeue());
        System.out.println();

        System.out.println("Elemento no início da fila --> " + queue.head());
        System.out.println();

        System.out.println("Tamanho da fila atualizada: " + queue.size());
        System.out.println();

        System.out.println("A fila está vazia? " + queue.isEmpty());
        System.out.println();

        System.out.println("----- Adicionando elemento por prioridade na fila --> 6 -----");
        queue.enqueuePriority(6);
        System.out.println();

        System.out.println("Elemento no início da fila após o 'enqueuePriority': " + queue.head());
        System.out.println();

        System.out.println("Tamanho da fila atualizada: " + queue.size());
        System.out.println();

        System.out.println("-----> Limpando a fila <-----");
        System.out.println();

        queue.clear();

        System.out.println("A fila está vazia agora? " + queue.isEmpty());

    }
}
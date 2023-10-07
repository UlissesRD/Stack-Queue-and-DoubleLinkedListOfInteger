public class App {
    public static void main(String[] args) {
        QueueOfInterger stack = new QueueOfInterger();

        stack.enqueue(4);
        stack.enqueue(5);
        stack.enqueue(1);

        System.out.println("Tamanho da fila: " + stack.size());
        System.out.println();

        System.out.println("Elemento no início da fila: " + stack.head());
        System.out.println();

        System.out.println("Elemento adicionado na fila --> " + stack.enqueue(8));
        System.out.println();

        System.out.println("Tamanho da fila atualizada: " + stack.size());
        System.out.println();

        System.out.println("Elemento no início da fila --> " + stack.head());
        System.out.println();

        System.out.println("Elemento removido da fila --> " + stack.dequeue());
        System.out.println();

        System.out.println("Elemento no início da fila --> " + stack.head());
        System.out.println();

        System.out.println("Tamanho da fila atualizada: " + stack.size());
        System.out.println();

        System.out.println("A fila está vazia? " + stack.isEmpty());
        System.out.println();

        System.out.println("----- Adicionando elemento por prioridade na fila --> 6 -----");
        stack.enqueuePriority(6);
        System.out.println();

        System.out.println("Elemento no início da fila após o 'enqueuePriority': " + stack.head());
        System.out.println();

        System.out.println("Tamanho da fila atualizada: " + stack.size());
        System.out.println();

        System.out.println("-----> Limpando a fila <-----");
        System.out.println();

        stack.clear();

        System.out.println("A fila está vazia agora? " + stack.isEmpty());
    }
}

public class App {

    public static void main(String[] args) {

        StackOfInterger stack = new StackOfInterger();

        // Adicionando elementos à pilha
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);

        // Imprimindo o tamanho da pilha
        System.out.println("Tamanho da pilha: " + stack.size());

        // Verificando se a pilha está vazia
        System.out.println("A pilha está vazia? " + stack.isEmpty());

        // Imprimindo o elemento no topo da pilha
        System.out.println("Elemento no topo da pilha: " + stack.top());

        // Removendo elementos da pilha
        System.out.println("Removendo elementos da pilha:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Verificando se a pilha está vazia após a remoção
        System.out.println("A pilha está vazia? " + stack.isEmpty());
    }
}

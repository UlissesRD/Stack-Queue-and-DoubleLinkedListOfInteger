public class App {
    public static void main(String[] args) {
        // Criar uma instância da pilha
        StackOfInterger stack = new StackOfInterger();

        // Inserir elementos na pilha
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Imprimir o tamanho da pilha
        System.out.println("Tamanho da pilha: " + stack.size());

        // Imprimir o topo da pilha
        System.out.println("Topo da pilha: " + stack.top());

        // Verificar se a pilha está vazia
        System.out.println("A pilha está vazia? " + stack.isEmpty());

        // Inverter um array usando a pilha
        Integer[] arr = {4, 5, 6, 7};
        Integer[] reversedArr = StackOfInterger.reverseArrayUsingStack(arr);

        // Imprimir o array invertido
        System.out.print("Array invertido: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
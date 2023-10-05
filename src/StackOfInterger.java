public class StackOfInterger {
    private DoubleLinkedListOfInteger list;

    public StackOfInterger(){
        list =new DoubleLinkedListOfInteger();
    }

    public Integer pop(){
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        Integer topElement=list.get(list.size() - 1);
        list.removeByIndex(list.size() - 1);
        return topElement;
    }

    public Integer push(Integer element) {
        list.add(element);
        return element;
    }
    public Integer top(){
        if(list.isEmpty()){
            throw new IllegalStateException("A pilha esta vazia");
        }
        return list.get(list.size() - 1);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear(){
        list.clear();
    }

    /**
     * Método reverseArrayUsingStack()
     * Método estático que recebe um arranjo de inteiros e utiliza uma pilha implementada para inverter seu conteúdo
     * @param arr arranjo inteiros
     * @return o arranjo de inteiros com os dados invertidos
     */
    public static Integer[] reverseArrayUsingStack(Integer[] arr) {
        StackOfInterger stack = new StackOfInterger();

        for (int element : arr) {
            stack.push(element);
        }

        Integer[] reversedArr = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = stack.pop();
        }

        return reversedArr;
    }
}

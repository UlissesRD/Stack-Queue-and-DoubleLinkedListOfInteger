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
}

public class QueueOfInterger {
    private DoubleLinkedListOfInteger list;

    public QueueOfInterger() {
        list = new DoubleLinkedListOfInteger();
    }

    public Integer enqueue(Integer element) {
        list.add(element);
        return element;
    }

    public Integer dequeue() {
        if (list.isEmpty()) {
            throw new IllegalStateException("A lista está vazia");
        } else {
            int ElementoBuscado = list.get(0);
            list.removeByIndex(0);
            return ElementoBuscado;
        }
    }

    public Integer head() {
        if (list.isEmpty()) {
            throw new IllegalStateException("A lista está vazia");
        } else {
            return list.get(0);
        }
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
    }

    /**
     * Método enqueuePriority()
     * Recebe como parâmetro um elemento que deve ser inserido na fila de acordo com a sua prioridade
     *
     * @param element elemento a ser inserido
     */
    public void enqueuePriority(Integer element) {
        if (list.isEmpty() || element >= list.get(0)) {
            list.add(0, element);
        } else {
            int index = 0;
            while (index < list.size() && element < list.get(index)) {
                index++;
            }
            list.add(index, element);
        }
    }
}

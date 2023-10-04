/**
 * CLASSE LinkedListOfInteger
 * Trabalhando com estruturas lineares em formato de listas encadeadas
 * */

public class LinkedListOfInteger {

    // Referência para o primeiro elemento da lista encadeada.
    private Node head;
    // Referência para o último elemento da lista encadeada.
    private Node tail;
    // Contador para a quantidade de elementos que a lista contem.
    private int count;

    // Construtor padrão da classe
    public LinkedListOfInteger() {
        head = null;
        tail = null;
        count = 0;

    }

    /**********************************************************************************
    /*** CREATE |   Operações de inserção de dados na lista encadeada
    /**********************************************************************************

    /**
     * Método add()
     * Adiciona um elemento ao final da lista.
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element)  {
        Node n = new Node(element);
        if (head == null) {
            head = n;
        } else {
            tail.next = n;
        }
        tail = n;
        count++;
    }

    /**
     * Método add() para determinada posição
     * Insere um elemento em uma determinada posicao da lista.
     * @param index a posicao da lista onde o elemento sera inserido
     * @param element elemento a ser inserido
     * @throws IndexOutOfBoundsException se (index < 0 || index > size())
     */
    public void add(int index, Integer element) {
        // Primeiro verifica se index eh valido
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();

        // Cria o nodo
        Node n = new Node(element);

        // Encadear o nodo na lista
        if (index == 0) { // se insercao no inicio
            if (count == 0) { // se a lista estava vazia
                tail = n;
            }
            else {
                n.next = head;
            }
            head = n;
        }
        else if (index == count) { // se insercao no fiim
            tail.next = n;
            tail = n;
        }
        else { // se insercao no meio
            Node ant = head;
            for (int i=0; i<index-1; i++) {
                ant = ant.next;
            }
            n.next = ant.next;
            ant.next = n;
        }

        // Atualiza o count
        count++;
    }


    /**********************************************************************************
    /*** READ | Operações de leitura de dados na lista encadeada
    /**********************************************************************************

    /**
     * Método get()
     * Retorna o elemento de uma determinada posicao da lista.
     * @param index a posição da lista
     * @return o elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer get(int index) {

        // Avalia se o índice está na faixa aceita (maior que 0 e menor ou igual ao tamanho da lista
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }

        // Se o índica selecionado é o do último elemento, retorna tail
        if (index == count-1)
            return tail.element;

        // Cria um auxiliar com o valor de head
        Node aux = head;
        int c = 0;

        // percorre todos os elementos até chegar o índice determinado
        while (c < index) {
            // associa ao próximo node
            aux = aux.next;
            c++;
        }
        return aux.element;
    }


     /**********************************************************************************
     /*** UPDATE | Operações de substituição de dados na lista encadeada
     /**********************************************************************************

     /**
     * Método set()
     * Substitui o elemento armanzenado em uma determinada posicao da lista pelo elemento indicado.
     * @param index a posicao da lista
     * @param element o elemento a ser armazenado na lista
     * @return o elemento armazenado anteriormente na posicao da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer set(int index, Integer element) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        if (index == count-1) {
            Integer auxElem = tail.element;
            tail.element = element;
            return auxElem;
        }

        Node aux = head;
        int c = 0;
        while (c < index) {
            aux = aux.next;
            c++;
        }
        Integer auxElem = aux.element;
        aux.element = element;
        return auxElem;
    }

    /**********************************************************************************
    /*** DELETE | Operações de remoção de dados na lista encadeada
    /**********************************************************************************

    /**
     * Método remove()
     * Remove a primeira ocorrencia do elemento na lista, se estiver presente.
     * @param element o elemento a ser removido
     * @return true se a lista contem o elemento especificado
     */
    public boolean remove(Integer element) {
        // Se a lista esta vazia
        if (count == 0)
            return false;

        // Se remocao do primeiro elemento da lista
        if (element.equals(head.element)) {
            if (count == 1) { // se tem apenas um elemento na lista
                tail = null;
            }
            head = head.next;
            count--;
            return true;
        }

        Node ant = head; // referencia aponta para o anterior
        Node aux = head.next; // referencia aponta para o elemento que esta sendo verificado

        for (int i=1; i<count; i++) {
            if (aux.element.equals(element)) { // se achou o elemento a ser removido
                if (aux == tail) { // se remocao do ultimo
                    tail = ant;
                    tail.next = null;
                }
                else { // se remocao do meio
                    ant.next = aux.next;
                }
                count--; // atualiza cont
                return true;
            }
            aux = aux.next;
            ant = ant.next;
        }
        // Se nao removeu
        return false;
    }

    /**
     * Método removeByIndex()
     * Remove o elemento de uma determinada posicao da lista.
     * @param index a posicao da lista
     * @return o elemento que foi removido da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer removeByIndex(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        // Se remocao do primeiro
        if (index == 0) {
            Integer elemRemovido = head.element;
            head = head.next;
            if (count == 1) {// se tinha apenas um elemento na lista
                tail = null;
            }
            count--;
            return elemRemovido;
        }

        Node ant = head;
        for (int i = 0; i < index - 1; i++) {
            ant = ant.next;
        }
        Integer elemRemovido = ant.next.element;
        if (index == count - 1) { //se remocao do ultimo
            tail = ant;
            tail.next = null;
        } else { // se remocao do meio
            ant.next = ant.next.next;
            // Alternativa para o comando acima
            // Node aux = ant.next;
            // ant.next = aux.next;
        }
        count--;
        return elemRemovido;
    }


    /**********************************************************************************
    /*** OUTRAS OPERAÇÕES
    /**********************************************************************************

    /**
     * Método contains()
     * Retorna true se a lista contem o elemento especificado.
     * @param element o elemento a ser testado
     * @return true se a lista contem o elemento especificado
     */
    public boolean contains(Integer element) { // O(n)
        Node aux = head;
        while(aux != null) {
            if (aux.element.equals(element)) {
                return true;
            }
            aux = aux.next;
        }
        return false;
    }

    /**
     * Método indexOf()
     * Retorna o indice da primeira ocorrencia do elemento na lista, ou -1 se a lista nao contem o elemento.
     * @param element o elemento a ser buscado
     * @return o indice da primeira ocorrencia do elemento na lista, ou -1 se a lista nao contem o elemento
     */
    public int indexOf(Integer element) {
        Node aux = head;
        for(int i=0; i<count; i++) {
            if (aux.element.equals(element)) {
                return i;
            }
            aux = aux.next;
        }
        return -1;
    }

    /**
     * Método isEmpty()
     * @return true se a lista nao contem elementos
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Método size()
     * @return o numero de elementos da lista
     */
    public int size() {
        return count;
    }

    /**
     * Método clear()
     * Esvazia a lista
     */
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Método toString()
     * Sobrescrita do método toString padrão para a impressão em formato específico
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        Node aux = head;

        while (aux != null) {
            s.append(aux.element.toString());
            s.append(" | ");
            aux = aux.next;
        }

        return s.toString();
    }

    /**
     * Método reverse()
     * inverte a lista encadeada




     public void reverse() {
         Node temp = null;
         Node next = null;
         Node curr = head;

         while (curr != null){
             next = curr.next;
             curr.next = temp;
             temp = curr;
             curr = next;
         }
         head = temp;
     }
     */

    /***************************************************************************************************
     /*** IMPLEMENTAÇÃO DOS MÉTODOS countOccurrences(Integer element) E boolean removeEvenNumbers( ... )
     /***************************************************************************************************

    /**
     *      Método que conta o número de ocorrências do elemento passado como parâmetro na lista, retornando este valor
     *      * @param element elemento a ser inserido
     *      * @return valor inteiro relativo ao número de ocorrências encontradas
     */

    public int countOccurences(Integer element){

        int c = 0;
        Node node = head;
        while (node != null){
            if (node.element.equals(element)){
                c++;
            }
            node = node.next;
        }
        return c;
    }

    /**
     * Método que percorre a lista removendo todos os elementos pares.
     * Defina os atributos necessários para este algoritmo, pois nenhum método já implementado pode ser chamado
     * pois nenhum método já implementado pode ser chamado.
     * @return true se houver alguma remoção, e false caso não tenham elementos pares e não seja feita remoção
     */
    public boolean removeEvenNumbers() {
        boolean removed = false;

        if (head == null) {
            return false;
        }

        Node prev = null;
        Node current = head;

        while (current != null) {
            if (current.element % 2 == 0) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    head = current.next;
                }
                count--;
                removed = true;
            } else {
                prev = current;
            }
            current = current.next;
        }

        return removed;
    }
}

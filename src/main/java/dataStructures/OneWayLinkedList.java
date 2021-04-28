package dataStructures;


import dataStructures.dataStructuresUtils.ListUtils;

public class OneWayLinkedList {
    private Node head = new Node(null); //guard
    private int size;

    public OneWayLinkedList(){
        clear();
    }

    public void clear(){
        head.setNextElement(null);
        size = 0;
    }

    public void add(Object value){
        if(head.getNextElement() == null){
            head.setNextElement(new Node(value));
        }
        Node last = head.getNextElement();
            while (last.getNextElement() != null){
                last = last.getNextElement();
            }
        ++ size;
        last.setNextElement(new Node(value));
    }

    public boolean delete(Object o){
        if(head.getNextElement() == null){
            return false;
        }
        if(head.getNextElement().getActualElement().equals(o)){
            head.setNextElement(head.getNextElement().getNextElement());
            size--;
            return true;
        }

        Node delete = head.getNextElement();
        while (delete != null && delete.getNextElement() != null){
            if(delete.getNextElement().getActualElement().equals(o)){
                delete.setNextElement(delete.getNextElement().getNextElement());
                size--;
                return true;
            }
            delete = delete.getNextElement();
        }
        return false;
    }

    public Object getObject(int index){
        ListUtils.isRange(index,size);
        Node find = head.getNextElement();
        for (int i=0; i < index; i++){
            find = find.getNextElement();
        }
        return find.getActualElement();
    }

    public Object setObject(int index, Object value){
        ListUtils.isRange(index,size);
        Node find = head.getNextElement();
        for(int i=0; i <= index; i++){
            find = find.getNextElement();
        }
        find.setValue(value);

        return value;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }


    private static final class Node{
        private Object actualElement;
        private Node nextElement;

        public Node(Object actualElement){
            this(actualElement,null);
        }

        public Node(Object sourceElement, Node nextObject){
           actualElement = sourceElement;
           nextElement = nextObject;
        }

        public Object getActualElement(){
            return actualElement;
        }

        public Node getNextElement(){
            return nextElement;
        }

        public void setNextElement(Node nextElement){
            this.nextElement = nextElement;
        }

        public void setValue(Object o ){
            this.actualElement = o;
        }
    }
}


////Jednokierunkowa lista wiązana z wartownikiem
//public class LinkedList{
//    private Node head = new Node(null); //wartownik
//    private int size; //rozmiar listy
//    /**
//     * Konstruktor domyślny, tworzy pustą listę
//     */
//    public LinkedList(){
//        clear();
//    }
//    /**
//     * Metoda "czyszcząca" listę, w rzeczywistości ustawia pierwszy element listy, czyli pole next wartownika na null
//     */
//    public void clear(){
//        head.setNext(null);
//        size=0;
//    }
//    /**
//     * Metoda dodająca nowy element do listy
//     */
//    public void add(Object value){
//        if (head.getNext()==null) head.setNext(new Node(value)); //jeśli lista jest pusta ustawiamy następnik wartownika
//        Node last = head.getNext();
//        while(last.getNext() != null) //szukamy ostatniego elementu
//            last=last.getNext();
//        ++size;
//        last.setNext(new Node(value)); //i ustawiamy jego następnik na nowy węzeł z podaną wartością value
//    }
//    /**
//     * Metoda usuwająca obiekt podany jako parametr
//     * @return true, gdy usunięto element, false w innym wypadku
//     */
//    public boolean delete(Object o){
//        if(head.getNext() == null) return false;
//        if(head.getNext().getValue().equals(o)){
//            head.setNext(head.getNext().getNext());
//            size--;
//            return true;
//        }
//
//        Node delete = head.getNext();
//        while(delete != null && delete.getNext() != null){
//            if(delete.getNext().getValue().equals(o)){
//                delete.setNext(delete.getNext().getNext());
//                size--;
//                return true;
//            }
//            delete = delete.getNext();
//        }
//        return false;
//    }
//    /**
//     * Metoda zwracająca obiekt o podanym indeksie na liście
//     * @param index - indeks elementu w liście, którego wartości oczekujemy
//     * @return - oczekiwany obiekt, lub null, gdy nie istnieje
//     */
//    public Object get(int index) throws IndexOutOfBoundsException{
//        if(index<0 || index>size) throw new IndexOutOfBoundsException();
//        Node find = head.getNext();
//        for(int i=0; i <= index; i++)
//            find = find.getNext();
//        return find.getValue();
//    }
//    public Object set(int index, Object value) throws IndexOutOfBoundsException{
//        if(index<0 || index>size) throw new IndexOutOfBoundsException();
//        Node find = head.getNext();
//        for(int i=0; i <= index; i++)
//            find = find.getNext();
//        find.setValue(value);
//        return value;
//    }
//    /**
//     * Metoda zwracająca aktualny rozmiar listy
//     * @return rozmiar listy
//     */
//    public int size(){
//        return size;
//    }
//    /**
//     * Metoda, która sprawdza, czy lista jest pusta
//     * @return true, gdy rozmiar listy wynosi 0, w innym wypadku false
//     */
//    public boolean isEmpty(){
//        return size == 0;
//    }
//
//    /**
//     * Klasa wewnętrzna, która definiuje elementy przechowywane na liście
//     */
//    private static final class Node{
//        private Object value; //aktualny element
//        private Node next; //referencja na obiekt kolejny
//        /**
//         * Konstruktor ustawiający element na obiekt podany jako argument, wstawianie na początek listy
//         * @param val obiekt, który chcemy przechowywać
//         */
//        public Node(Object val){
//            this(val, null);
//        }
//        /**
//         * Konstruktor, który pozwala wstawić element na określone miejsce
//         * @param val obiekt, który chcemy umieścić na liście
//         * @param n obiekt kolejny
//         */
//        public Node(Object val, Node n){
//            value = val;
//            next = n;
//        }
//        /**
//         * @return aktualny obiekt
//         */
//        public Object getValue(){
//            return value;
//        }
//        /**
//         * @return kolejny element
//         */
//        public Node getNext(){
//            return next;
//        }
//        /**
//         * @param n kolejny element
//         */
//        public void setNext(Node n){
//            next = n;
//        }
//
//        public void setValue(Object o){
//            value = o;
//        }
//    }
//}
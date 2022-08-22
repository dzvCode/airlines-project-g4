package com.g4.model.entity;

import static com.g4.model.entity.MyQueue.front;
import java.util.ArrayList;

public class MyDoublyLinkedList {
    
    public static Node head;
    public static int numbersNodes;
    
    public static class Node{
        public User user;
        public Node prev;
        public Node next;

        public Node(User user) {
            this.user = user;
            this.prev = null;
            this.next = null;
        }
    }
    
    public MyDoublyLinkedList(){
        this.head = null;
        this.numbersNodes = 0;
    }
    
   public static void insertAtTail(User user){
       Node temp = head;
       Node newNode = new Node(user);
       numbersNodes++;
       if(head == null){
           head = newNode;
           return;
       }
       while(temp.next != null){
           temp = temp.next;
       }
       temp.next = newNode;
       newNode.prev = temp;
   }
   
   public static void insertionSortByName() {
       Node aux1;
       Node aux2;
       User userAux;
       int m;
       for (int i = 2; i <= numbersNodes; i++) {
           aux1 = head;
           m = 1;
           while (m < i) {
               aux1 = aux1.next;
               m++;
           }
           userAux = aux1.user;
           int j = i - 1;
           aux2 = aux1.prev;
           while(j >= 1 && aux2.user.getName().compareTo(userAux.getName()) > 0){
                aux2.next.user = aux2.user;
                j--;
                aux2 = aux2.prev;
           }
           aux2 = head;
           m = 1;
           while (m < j + 1){
               aux2 = aux2.next;
               m++;
           }
           aux2.user = userAux;
       }   
   }
   
   //print
    public static void printDLL(){
       Node aux = head;
       while(aux != null){
           System.out.println(aux.user.toString());
           aux = aux.next;
       }
   }
   
   
   // Metodo para cargar los elementos de la lista en la tabla
    public static ArrayList<Object[]> upload() {
        ArrayList<Object[]> data = new ArrayList<>();
        if (head == null) {
            return data;
        }

        Node temp = head;
        while (temp != null) {
            Object[] aux = new Object[9];
            aux[0] = temp.user.getId();
            aux[1] = temp.user.getName();
            aux[2] = temp.user.getDni();
            aux[3] = temp.user.getPhone();
            aux[4] = temp.user.getEmail();
            aux[5] = temp.user.getOrigin();
            aux[6] = temp.user.getDestination();
            aux[7] = temp.user.getDepartureDate();
            aux[8] = temp.user.getTicketPrice();
            data.add(aux);
            temp = temp.next;
        }
        return data;
    }
}
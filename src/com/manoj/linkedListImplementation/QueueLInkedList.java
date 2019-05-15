package com.manoj.linkedListImplementation;

public class QueueLInkedList {
    private  Node front,rear;
    private  int size;

    void enQueue(int data){
        Node newNode = new Node(data);
        size++;
        if(rear==null){
            rear =front= newNode;
        }else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    int deQueue(){
       if(front==null){
           System.out.println("Queue is empty,underflow");
           return Integer.MIN_VALUE;
       }else {
           int data = front.getData();
           front = front.getNext();
           size--;
           return data;
       }
    }

    void traverse(){
        if(size==0){
            System.out.println("Queue is empty");
        }else{
            Node temp = front;
            System.out.println("====================");
            while (temp!=null){
                System.out.print(temp.getData()+"\t");
                temp = temp.getNext();
            }
            System.out.println("\n====================");
        }
    }
}

package com.bridgelabz;

public class LinkedList {
    Node head, tail;

    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;//56=>30=>70
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    public void append(int data) { // 56=> 30=> 70
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertInBetween(Node previousNode, Node newNode) {
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.key + " ");
                temp = temp.next;
            }
        }
    }

    public void pop() {
        if (this.head == null) {

        }
        Node temp = head;
        head = temp.next;
        temp = null;
    }

    public void popLast() {
        if (head == null)
            System.out.println("No elements to delete..");
        else if (head.next == null)
            head = null;
        else {
            Node temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
        }
    }
        public void search(int searchData)
        {
            if(head.key == searchData)
                System.out.println(searchData + " is Found");
            else
            {
                Node temp=head;

                boolean isFound=false;

                while(temp!=null)
                {
                    if(temp.key == searchData)
                    {
                        isFound = true;
                        break;
                    }

                    temp=temp.next;
                }
                System.out.println("                      ");
                if(isFound == true)
                    System.out.println(searchData+ " is Found");
                else
                    System.out.println(searchData+" is not found..");
            }
        }
    }

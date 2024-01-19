package org.dsa.linkedList;

import org.dsa.model.Employee;

public class LinkedListMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ravi",1,"Male");
        Employee employee2 = new Employee("Raj",2,"Male");
        Employee employee3 = new Employee("Mahesh",3,"Male");
        Employee employee4 = new Employee("Mohan",4,"Male");
        Employee employee5 = new Employee("Sohan",5,"Male");
        Employee employee6 = new Employee("Ramesh",6,"Male");
        EmployeeLinkedList linkedList = new EmployeeLinkedList();
        linkedList.addToFirstNode(employee1);
        linkedList.addToFirstNode(employee2);
        linkedList.addToFirstNode(employee3);
        linkedList.addToFirstNode(employee4);
        linkedList.addToFirstNode(employee5);
        linkedList.addToFirstNode(employee6);

        linkedList.printList();
        System.out.println(linkedList.getSize());
        linkedList.removeNode();

        linkedList.printList();
        System.out.println(linkedList.getSize());
    }
}

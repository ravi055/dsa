package org.dsa.linkedList;

import org.dsa.model.Employee;

public class EmployeeLinkedList {
    private EmployeeNode firstNode;
    private int size = 0;

    public void addToFirstNode(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(firstNode);
        firstNode = node;
        size++;
    }

    public void printList() {
        EmployeeNode currentNode = firstNode;
        while (currentNode != null) {
            System.out.println("Start => ");
            System.out.println(currentNode.toString());
            currentNode = currentNode.getNext();
        }
        System.out.println("Done => ");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpety() {
        return (firstNode == null);
    }

    public void removeNode() {
        if (isEmpety()) {
            return;
        }
        EmployeeNode node = firstNode;
        firstNode = node.getNext();
        node.setNext(null);
        size--;
    }
}

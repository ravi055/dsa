package org.dsa.linkedList;

import org.dsa.model.Employee;

public class EmployeeNode {
 private Employee employee;
 private EmployeeNode next;

 EmployeeNode(Employee employee){
     this.employee = employee;
 }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return ("Name :" + employee.getName() + "  id : " + employee.getId() + "  Gender :" + employee.getGender());
    }
}

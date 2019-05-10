package org.katheer.bean;

public class Student {
    private int id;
    private String name;
    private int[] marks;
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private int getTotalMarks() {
        int sum = 0;
        for (int i=0; i<marks.length; i++) {
            sum += marks[i];
        }
        return sum;
    }

    public void printStudentDetails() {
        System.out.println("Name    : " + this.getName());
        System.out.println("ID      : " + this.getId());
        System.out.println("Mark    : " + this.getTotalMarks());
        address.printAddress();
    }
}

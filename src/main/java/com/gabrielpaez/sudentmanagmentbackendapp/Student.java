package com.gabrielpaez.sudentmanagmentbackendapp;

public class Student {

    private Long id;
    private String name;
    private String email;
    private String fatherName;
    private String address;
    private String className;

    public Student(String name, String email, String fatherName, String address, String className, Long id) {
        this.name = name;
        this.email = email;
        this.fatherName = fatherName;
        this.address = address;
        this.className = className;
        this.id = id;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", email=" + email + ", fatherName=" + fatherName + ", address="
                + address + ", className=" + className + "]";
    }
}

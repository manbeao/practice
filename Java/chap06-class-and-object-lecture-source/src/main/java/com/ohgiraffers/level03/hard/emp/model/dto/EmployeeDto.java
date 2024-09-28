package com.ohgiraffers.level03.hard.emp.model.dto;

public class EmployeeDto {
    private int number;
    private String name;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bounsPoint;
    private String phone;
    private String adress;

   public EmployeeDto(){}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBounsPoint() {
        return bounsPoint;
    }

    public void setBounsPoint(double bounsPoint) {
        this.bounsPoint = bounsPoint;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}

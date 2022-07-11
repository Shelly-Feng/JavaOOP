package model;

public class Student {
    public String name, sex, id;
    public int age;

    public Student(String id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }

    public void setID(String ID){
        this.id = ID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSex(String sex){
        this.sex = sex;
    }
    public void setAge(int age){
        this.age = age;
    }


}

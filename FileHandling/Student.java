package FileHandling;

import java.io.*;
public class Student implements Serializable{
    String name;
    String classname;
    int id;
    double marks;

    public Student(String name,String classname,int id,double marks){
        this.name = name;
        this.classname = classname;
        this.id = id;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Name:"+this.name+" Class:"+this.classname+" Id:"+this.id+" Marks:"+this.marks;
    }
}

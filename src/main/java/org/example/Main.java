package org.example;

class Course{
    int id;
    String name;
    String code_name;

    //constructor

    public Course(int id, String name, String code_name){
        this.id = id;
        this.name = name;
        this.code_name = code_name;
    }
    //getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCode_name(){
        return code_name;
    }
    // also setters
    public void setId(int id){
        this.id = id;
    }

    public void setName( String name){
        this.name = name;
    }

    public void setCode_name(String code_name){
        this.code_name = code_name;
    }


}
// dirver class
public class Main {
    public static void main(String[] args) {
        Course course = new Course(1233, "Jada Simon", "ASSIG_01_CSC311");
        System.out.println("my courseID is " + course.getId());
        System.out.println("My name is " + course.getName());
        System.out.println("My code file's name is " + course.getCode_name());

    }
}
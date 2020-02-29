package student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {



    public static void main(String[] args) {

        JSONUtil util = new JSONUtil();

        Student student = new Student("Jan",
                "Kowalski",
                32);

        Student student1 = new Student("Bob", "McDonald", 89);

        Student student2 = new Student("Billy", "Weanker", 498);

        Student student3 = new Student("Laura", "Dash", 123);

        Student student4 = new Student("Carl", "Fagas",567);

        Student student5 = new Student("Mick", "Madson", 978);

        Student student6 = new Student("Max", "Rockatansky", 997);

        ObjectMapper mapper =  new ObjectMapper();

        try {
            mapper.writeValue(new File("student.json"), student);
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            mapper.writeValue(new File("student1.json"), student1);
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            mapper.writeValue(new File("student2.json"), student2);
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            mapper.writeValue(new File("student3.json"), student3);
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            mapper.writeValue(new File("student4.json"), student4);
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            mapper.writeValue(new File("student5.json"), student5);
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
            mapper.writeValue(new File("student6.json"), student6);
        } catch (IOException e){
            e.printStackTrace();
        }

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        try {
            mapper.writeValue(new File("studentList.json"), studentList);
        } catch (IOException e){
            e.printStackTrace();
        }

        util.writeList("Student's List", studentList);

        util.readList("Student's list");


	// write your code here
    }


}

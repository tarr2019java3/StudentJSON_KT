package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class Main {



    public static void main(String[] args) {

        Student student = new Student("Jan",
                "Kowalski",
                32);

        ObjectMapper mapper =  new ObjectMapper();

        try {
            mapper.writeValue(new File("student.json"), student);
        } catch (IOException e){
            e.printStackTrace();
        }
	// write your code here
    }
}

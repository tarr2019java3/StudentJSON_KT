package student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;

public class JSONUtil {

    ObjectMapper mapper = new ObjectMapper();

    public void writeList(String filename, List list) {
        try {
            mapper.writeValue(new File(filename), list);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readList(String filename) {
        try {



            Student[] students = mapper.readValue(new File(filename), Student[].class);
            {
                for (Student student: students){
                    System.out.println(student.getName() + " " + student.getLastname() + " " + student.getIndex());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

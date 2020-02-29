package pl.sda.student;

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

            File file = new File(filename);

            Student value[] = mapper.readValue(file, Student[].class);
            {
                for (int i = 0; i < value.length; i++) {
                    System.out.println(value[i].getName());
                    System.out.println(value[i].getLastname());
                    System.out.println(value[i].getIndex());
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

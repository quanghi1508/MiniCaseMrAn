package file;

import model.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private static final List<User> users = new ArrayList<>();
        public static void write() {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("src/data/Data.csv"));
                writer.write(WriteFile.users.toString());
                writer.newLine();
                writer.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }



}





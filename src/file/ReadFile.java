package file;


//import model.User;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReadFile {
//    public static List<User> read(String data, String userPassword) {
//        List<User> list = new ArrayList<>();
//        File myFile = new File(data);
//        try {
//            FileReader out = new FileReader(myFile);
//            BufferedReader reader = new BufferedReader(out);
//            String line;
//
//            while ((line = reader.readLine()) != null) {
//                list.add(converString(line));
//            }
//        } catch (Exception e) {
//
//        }
//        return list;
//    }
//
//    public static User converString(String string) {
//        String[] listData = string.split(",");
//
//        return new User(listData[0], listData[1], listData[2]);
//    }
//
//
//}

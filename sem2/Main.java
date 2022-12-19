package sem2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Float> pupils = new HashMap<>();
        pupils.put("Ivan Ivanov", 4.8f);
        pupils.put("Maria Kuznetsova", 5f);
        pupils.put("Stepan Kuzmin", 3.6f);
        pupils.put("Fedor Guev", 4.4f);
        pupils.put("Egor Petrov", 3.9f);

        TxtWriteInFile f1 = new TxtWriteInFile();
        f1.writeInFile(pupils, "f1.txt");
        
        JsonWriteInFile f2 = new JsonWriteInFile();
        f2.writeInFile(pupils, "f2.json");

        XmlWriteInFile f3 = new XmlWriteInFile();
        f3.writeInFile(pupils, "f3.xml");
    }
}

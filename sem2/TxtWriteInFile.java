package sem2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class TxtWriteInFile implements WriteInFile {

    @Override
    public void writeInFile(Map<String, Float> people, String path) {

        Set<Map.Entry<String, Float>> peoplEntry = people.entrySet();

        try (FileWriter fw = new FileWriter(path)) {

            for (Map.Entry<String,Float> entry : peoplEntry) {
                String text = entry.getKey() + "=" + entry.getValue().toString() + "\n";
                fw.write(text);
            }


        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
    
}

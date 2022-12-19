package sem2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class XmlWriteInFile implements WriteInFile {

    @Override
    public void writeInFile(Map<String, Float> people, String path) {

        Set<Map.Entry<String, Float>> peoplEntry = people.entrySet();

        try (FileWriter fw = new FileWriter(path)) {

            fw.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
            fw.write("<students>\n");
            for (Map.Entry<String, Float> entry : peoplEntry) {
                fw.write("<student>\n");
                String text = "<name>" + entry.getKey() + "</name>\n" + "<grade>" + entry.getValue().toString() + "</grade>" + "\n";
                fw.write(text);
                fw.write("</student>\n");
            }
            fw.write("</students>");

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}

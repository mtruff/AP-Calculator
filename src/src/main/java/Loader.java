//whatever
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Loader {
    String[] equation;
    FileInputStream dataFile;
    File myFile;

    Loader(File file) {
        equation = new String[(int) file.length()];
        myFile = file;
    }

    String loadFile() {
        String everything = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(myFile));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                System.out.println(line);

                while (line != null) {
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                 everything = sb.toString();
                System.out.println(everything);
            } catch (IOException e) {

            }
        }
            catch (FileNotFoundException e){
            System.out.println("kekenenene");
        }
        return everything;
    }


}

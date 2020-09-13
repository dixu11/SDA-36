package obiektowosc.wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileConnection {

    private boolean connected;


    public void connect() throws FileConnectionException{
        if (Math.random()<=0.25) { //25% szans
            throw new FileConnectionException();
        }
        connected = true;
    }

    public ArrayList<String> getData() throws NoDataException{
        ArrayList<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("ksiazki.txt"));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                lines.add(line);
            }
            if (lines.isEmpty()) {
                throw new NoDataException();
            }
        } catch (FileNotFoundException exception) {
            throw new NoDataException();
        }

        return lines;
    }

    public void disconnect() {
        connected = false;
    }

    @Override
    public String toString() {
        return "FileConnection{" +
                "connected=" + connected +
                '}';
    }
}

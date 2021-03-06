package StreamsAndFilesHomework;

import java.io.*;
import java.util.ArrayList;

public class SaveAnArrayListOfDoubles {

    public static void main(String[] args) {

        ArrayList<Double> doublesList = new ArrayList<Double>() {{
            add(5.5); add(3d); add(34.43);
        }};
        save(doublesList);
        load(doublesList);
    }

    private static void load(ArrayList<Double> doublesList) {
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new FileInputStream("C:\\Users\\Elliot\\Desktop\\SoftUni\\02.Fundamentals\\04.JavaFundamentals\\03.StreamsWithJava\\MyHomework\\doubles.list"));
            int size = doublesList.size();
            doublesList.clear();

            for (int i = 0; i < size; i++) {
                doublesList.add(input.readDouble());
            }

            System.out.println(doublesList);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void save(ArrayList<Double> doublesList) {
        ObjectOutputStream output = null;
        try {
            output = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Elliot\\Desktop\\SoftUni\\02.Fundamentals\\04.JavaFundamentals\\03.StreamsWithJava\\MyHomework\\doubles.list"));
            for (int i = 0; i < doublesList.size(); i++) {
                output.writeDouble(doublesList.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

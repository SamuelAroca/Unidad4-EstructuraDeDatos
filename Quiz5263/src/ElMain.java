import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ElMain {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("estudiantes.txt");
            BufferedReader br = new BufferedReader(fr);

            while (br.readLine() != null) {
                Object[] lines = br.lines().toArray();

                for (Object line : lines) {
                    String[] row = line.toString().split(" ");

                    String num = row[0];


                    String nombre = row[1];


                    String email = row[3];

                    ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
                    abb.insertar(num);
                }
            }//recorrido en anchura o amplitud
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

package SistemasMutimidia;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LerArquivos{

    public static void main(String[] args) {
        readFile("entrada.txt", "saida.txt");
    }

    private static void readFile(String entradatxt, String saidatxt) {
        String origem = "entrada.txt", destino = "saida.txt";
        try {
            File origen = new File(origem);
            File left = new File(destino);
            
            FileInputStream streamIn = new FileInputStream(origen);
            FileOutputStream streamOut = new FileOutputStream(left);
            
            BufferedInputStream in = new BufferedInputStream(streamIn);
            BufferedOutputStream out = new BufferedOutputStream(streamOut);

            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
                System.out.println(i);
            }

            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
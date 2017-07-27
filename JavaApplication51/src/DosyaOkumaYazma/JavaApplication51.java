package DosyaOkumaYazma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication51 {

    public static void main(String[] args) {

        ByteOku();
        ByteYaz();
        CharOku();
        CharYaz();
        BufferedReader();
        BufferedWriter();
        BufferedReaderandWriter();
        Birlestir();
        Kopyala();
    }

    static void ByteOku() {
        try {
            InputStream dosya = new FileInputStream("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme.txt");
            int c = dosya.read();
            while (c != -1) {
                System.out.print((char) c);
                c = dosya.read();
            }
            dosya.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void ByteYaz() {
        try {
            OutputStream dosya = new FileOutputStream("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme.txt");
            char[] dizi = {'H', 'e', 'l', 'l', 'o'};
            for (int i = 0; i < dizi.length; i++) {
                dosya.write(dizi[i]);

            }
            dosya.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void CharOku() {
        try {

            FileReader dosya = new FileReader("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme.txt");
            int c = dosya.read();
            while (c != -1) {
                System.out.print((char) c);
                c = dosya.read();
            }
            dosya.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void CharYaz() {
        try {
            FileWriter dosya = new FileWriter("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme.txt");
            char[] dizi = {'i', 's', 't', 'a', 'n', 'b', 'u', 'l'};
            for (int i = 0; i < dizi.length; i++) {
                dosya.write(dizi[i]);

            }
            dosya.close();
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void BufferedReader() {
        try {
            BufferedReader dosya = new BufferedReader(new FileReader("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme.txt"));
            String satir = dosya.readLine();
            while (satir != null) {
                System.out.println(satir);
                satir = dosya.readLine();
            }
            dosya.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void BufferedWriter() {
        try {
            BufferedWriter dosya = new BufferedWriter(new FileWriter("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme.txt"));
            String satir[] = {"Merhaba", "Java"};
            for (int i = 0; i < satir.length; i++) {
                dosya.write(satir[i]);
            }
            dosya.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void BufferedReaderandWriter() {
        String s = "";
        try {
            BufferedReader dosya = new BufferedReader(new FileReader("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme.txt"));
            BufferedWriter dsb = new BufferedWriter(new FileWriter("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme2.txt"));
            String satir = dosya.readLine();
            while (satir != null) {
                System.out.println(satir);
                dsb.write(satir);
                dsb.newLine(); // satır atlatır
                satir = dosya.readLine();

            }
            dosya.close();
            dsb.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void Birlestir() {
        try {
            BufferedReader dosya = new BufferedReader(new FileReader("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme.txt"));
            BufferedReader dsb = new BufferedReader(new FileReader("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme2.txt"));
            BufferedWriter dsb1 = new BufferedWriter(new FileWriter("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme3.txt"));
            String satir = dosya.readLine();
            while (satir != null) {
                System.out.println(satir);
                dsb1.write(satir);
                dsb1.newLine();
                satir = dosya.readLine();
            }
            dosya.close();
            String satir1 = dsb.readLine();
            while (satir1 != null) {
                System.out.println(satir1);
                dsb1.write(satir1);
                dsb1.newLine();
                satir1 = dsb.readLine();
            }
            dsb.close();
            dsb1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void Kopyala() {
        try {

            BufferedReader dosya = new BufferedReader(new FileReader("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme.txt"));
            BufferedWriter dsb = new BufferedWriter(new FileWriter("C:\\Users\\fsm\\Documents\\NetBeansProjects\\LabaratuvarDeneme\\deneme2.txt", true));

            String satir = dosya.readLine();
            while (satir != null) {
                System.out.println(satir);
                dsb.append(satir);
                dsb.newLine(); // satır atlatır
                satir = dosya.readLine();

            }
            dosya.close();
            dsb.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication51.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
//        FileInputStream in = null;
//        FileOutputStream out = null;

        FileReader in = null;
        FileWriter out = null;
        try {

            //для записи обьектов
//            in = new FileInputStream("res"+File.separator+ "source.txt"); // відкрити потік вводу + разделитель между файлом и каталогом
//            out = new FileOutputStream("res" + File.separator+  "target.txt");// відкрити потік виводу
            in = new FileReader("res"+File.separator+ "source.txt");
            out = new FileWriter("res" + File.separator+  "target.txt");
            int c;
           // int bytesAvailable = in.available();
           // System.out.println(bytesAvailable + " bytes");


            while ((c = in.read()) != -1) {
                // читати з потоку вводу
                out.write(c);
                // писати в потік виводу
            }


            int[]num = new int[10];
            for (int i = 0; i < num.length; i++) {
                num[i] += i;
            }

            for (int i = 0; i < num.length; i++) {
                out.write(num[i]);
            }

            for (byte i = 0; i < 100; i++) { //от 0 до 10 - непечатные служебные символы в кодовой таблице
                out.write(i+48 );
                out.write(Integer.toString(i) + " ");

            }


        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
                // закривати потоки в секції finally
                // закрити потік вводу
                // закрити потік виводу
    }
}
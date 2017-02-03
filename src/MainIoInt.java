import java.io.*;


public class MainIoInt {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        DataInputStream d = null;

        //при работе с консолью /интерактивный ввод
//        while(true)
//        try{
//            int x = d.readInt();
//            break;
//        } catch (ClassCastException e){
//            System.err.println(e.getStackTrace());
//        }


        try {

            out = new FileOutputStream("source.txt");
            for (int i = 0; i < 100; i++) {
                out.write(i);
            }
            out.flush();
            out.close(); // çàêŵèòè ïîòġê âèâîäó
            in = new FileInputStream("source.txt");
            int c;
            int bytesAvailable = in.available();
            System.out.println(bytesAvailable + " bytes");
            while ((c = in.read()) != -1) {
                System.out.println(c);
            }
        } finally { // çàêŵèâàòè ïîòîêè â ñåêöġṡ finally
            if (in != null) {
                in.close(); // çàêŵèòè ïîòġê ââîäó
            }
            if (out != null) {
                out.close(); // çàêŵèòè ïîòġê âèâîäó
            }
        }
    }
}


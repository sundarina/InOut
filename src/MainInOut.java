import java.io.IOException;

public class MainInOut {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter");
//        do {
//            char ch = (char) System.in.read();
//            System.out.println("char " + ch + " --> " + (int) ch);
//        } while (System.in.available() > 0);

        char answer = ' ';
        do {
            System.out.println("1.task1");
            System.out.println("2.task2");
            System.out.println("3.task3");
            System.out.println("y.Exid");
            answer = (char) System.in.read();

            System.in.skip(System.in.available());

            /**подавление оставшиешся байты . Scanner сам подавляет лишнее байты.
             * проблеы и переход на новую строку подавляет*/

            System.out.println((int) answer);
        } while (answer != 'y');
    }
}

public class Main {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        int index = 1;

        do {
            System.out.print(index);
            index = (index + m - 2) % n + 1;
        } while (index != 1);
    }

}
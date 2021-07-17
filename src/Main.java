import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chr = line.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(line);
        for(int i = 0, j = 1; i < chr.length && j < chr.length * 2; i++, j+=2) {
            stringBuilder = stringBuilder.insert(j, chr[i]);
        }
        System.out.println(stringBuilder);
    }
}

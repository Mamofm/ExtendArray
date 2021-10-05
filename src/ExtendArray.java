import java.util.Scanner;

public class ExtendArray {
    public static void main(String[] args) {
        int numList[], size, total=0;
        Scanner keybd = new Scanner(System.in);

        //* building dynamic array
        System.out.println();
        System.out.println("Enter a number of scores: ");
        size = keybd.nextInt();
        System.out.printf("Enter %d scores: ", size);
        numList =  new int[size];
        for (int i=0; i < numList.length; i++) {
            numList[i] = keybd.nextInt();
        }

        // total
        for (int i : numList) {
            total += i;
        }
        System.out.printf ("Total is %d\n", total);
    }
}

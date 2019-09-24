package Question_13;
import java.util.*;

public class question_13 {

    private void searchForAllPairs(int n1, int n2){ //метод находит все пары в диапазоне n1..n2(n2=2*n1)
        for(int a=n1;a<n2;a++) {
            if (a + 2 <= n2) {
                System.out.print(a + "\t");
                System.out.print(a + 2);
                System.out.println("");
            }
        }
    }
    private void searchForTwinPairs(int n1, int n2){ //метод находит все пары "близнецы" в диапазоне n1..n2(n2=2*n1)
        System.out.println("In the range from "+n1+" to "+n2+", the twin pairs are:");
        for(int a=n1;a<=n2;a++) {
            if ((a>5)&&(a % 2 != 0) && (a % 3 != 0) && (a % 5 != 0) && ((a + 2) % 5 != 0) && (a + 2 <= n2)) {
                System.out.print(a + "\t");
                System.out.print(a + 2);
                System.out.println("");
            }
            if((a>2)&&(a<=5)&&(a % 2 != 0)){
                System.out.print(a + "\t");
                System.out.print(a + 2);
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        question_13 finder = new question_13();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter n (n>2): ");
        int n1 = scanner.nextInt();
        int n2 = n1*2;
        /*finder.searchForAllPairs(n1,n2);*/
        finder.searchForTwinPairs(n1,n2);
        }
    }







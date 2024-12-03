public class OddNumbers {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter the limit :");

int limit = scanner.nextInt();

System.out.println("Odd numbers

from 1 to "limit + ":");

for (int i = 1; i <= limit; i++) {

if (i % 2 != 0) {

System.out.print(i + " ");

}

}
}
}

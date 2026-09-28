import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 52, 492, 67, 564, 92, 89, 34, 65, 183};
        int[] arr1 = {4, 52, 56, 67, 56, 92, 92, 4, 65, 183};

        Scanner scanner = new Scanner(System.in);

        catculateLength(8756);

    }

    public static void sortingArray(int[] arr) {
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j <= arr.length-1; j++) {
                if (arr[i] > arr[j]) {
                    int kecici = arr[i];
                    arr[i] = arr[j];
                    arr[j] = kecici;
                }
            }
        }
        System.out.println("from smallest to largest:");
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("from largest to smallest: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeIndex(int[] arr, Scanner scanner) {
        System.out.println("Enter a number: ");
        int firstIndex = scanner.nextInt();
        System.out.println("Enter a number: ");
        int secondIndex = scanner.nextInt();

        int muveqqeti = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = arr[muveqqeti];
    }

    public static void saveEvenNumbers(int[] arr) {
        int count = 0;
        for (int number: arr) {
            if (number % 2 == 0) {
                count++;
            }
        }

        int[] evenNumber = new int[count];
        int index = 0;
        for (int number : arr) {
          if (number % 2 == 0) {
              evenNumber[index] = number;
              index++;
          }
        }
        System.out.println("even numbers in the array: ");
        for (int number : evenNumber) {
          System.out.println(number);
        }
    }

    public static void deleteDuplicate(int[] arr) {
        int[] duplicateNumbers = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == duplicateNumbers[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                duplicateNumbers[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println(duplicateNumbers[i]);
        }
    }

    public static void qwerty(int[] arr1) {
        for (int i = 0; i <= arr1.length-1; i++) {
            for (int j = 0; j <= arr1.length-1; j++) {
                if (arr1[i] > arr1[j]) {
                    int kecici = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = kecici;
                }
            }
        }
        System.out.println(arr1[1]);
        System.out.println(arr1[arr1.length-2]);
    }

    // Methods
    // 1.
    public static void factorial(int n) {

        int number = 1;
        for (int i = n; i >= 1; i--) {
            number *= i;
        }
        System.out.println(n + "!: " + number);
    }

    // 2.
    public static void fibonacci(int n) {
        int[] fibonacci = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacci[i] = i;
                continue;
            }
            if (i == 1) {
                fibonacci[i] = i;
                continue;
            }
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        for (int number : fibonacci) {
            System.out.print(number + " ");
        }
    }

    public static void primeNumber(int n) {
        int count = 0;
        if (n < 2) {
            System.out.println(n + " sade eded deyil.");
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println(n + " sade eded deyil.");
        } else {
            System.out.println(n + " sade ededdir.");
        }
    }

    public static void isPalindrome(Scanner scanner) {
        System.out.print("Enter a word to check for a palindrome: ");
        String word = scanner.nextLine();
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
    // 5.
    public static int addition(int number) {
        int sum = 0;
        while (number > 0) {
            int last = number % 10;
            sum += last;
            number /= 10;
        }
        return sum;
    }

    public static int exponentation(Scanner scanner) {
        System.out.print("Enter base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent number: ");
        int exponent = scanner.nextInt();
        int sum = 1;
        for (int i = 0; i < exponent; i++) {
            sum *= base;
        }
        return sum;
    }

    public static int reverseNumber(int number) {
            int reversed = 0;
            while (number > 0) {
                int last = number % 10;
                reversed = reversed * 10 + last;
                number /= 10;
            }
            return reversed;
    }


    public static int catculateLength(int number) {
       String numberString = String.valueOf(number);
       return numberString.length();
    }
}
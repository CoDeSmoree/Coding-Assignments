package Module3;
//Create a class BankAccount with attributes accountNumber and balance, and methods
//deposit and withdraw. Use encapsulation.
public class BankAccount {

    static int[] accountNumber = new int[5];
    static double[] balance = new double[5];
    static int count = 0;

    static void deposit(int acc, double amount) {
        for (int i = 0; i < count; i++) {
            if (accountNumber[i] == acc) {
                balance[i] += amount;
                System.out.println("Account: " + acc + "\nBalance: " + balance[i]);
                break;
            }
        }
        if (count < accountNumber.length) {
            accountNumber[count] = acc;
            balance[count] = amount;
            System.out.println("New Account Created");
            System.out.println("Account: " + acc + "\nBalance: " + balance[count]);
            count++;
        } else {
            System.out.println("Account limit reached");
        }
    }

    static void withdraw(int acc, double amount) {
        for (int i = 0; i < count; i++) {
            if (accountNumber[i] == acc) {
                if (balance[i] < amount) {
                    System.out.println("Insufficient balance");
                }
                else {
                    balance[i] -= amount;
                    System.out.println("Balance: " + balance[i]);
                }
              break;
            }
        }
        System.out.println("Account does not exist");
    }

    public static void main(String[] args) {
        deposit(101, 201.88);
        withdraw(101, 288.5);
    }
}
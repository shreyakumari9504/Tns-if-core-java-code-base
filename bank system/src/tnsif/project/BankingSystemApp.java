package tnsif.project;

import java.util.*;

// Main application class
public class BankingSystemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingService service = new BankingServiceImpl();

        while (true) {
            System.out.println("\nBanking System");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by ID");
            System.out.println("6. List Accounts of Customer");
            System.out.println("7. List Transactions of Account");
            System.out.println("8. List Beneficiaries of Customer");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Customer Details");
                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Address: ");
                    String caddress = sc.nextLine();
                    System.out.print("Contact: ");
                    String ccontact = sc.nextLine();
                    service.addCustomer(new Customer(cid, cname, caddress, ccontact));
                    System.out.println("Customer added successfully!");
                }
                case 2 -> {
                    System.out.println("Enter Account Details");
                    System.out.print("Account ID: ");
                    int aid = sc.nextInt();
                    System.out.print("Customer ID: ");
                    int acid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Type (Saving/Current): ");
                    String atype = sc.nextLine();
                    System.out.print("Balance: ");
                    double abalance = sc.nextDouble();
                    service.addAccount(new Account(aid, acid, atype, abalance));
                    System.out.println("Account added successfully!");
                }
                case 3 -> {
                    System.out.println("Enter Beneficiary Details");
                    System.out.print("Beneficiary ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Customer ID: ");
                    int bcid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String bname = sc.nextLine();
                    System.out.print("Account Number: ");
                    String bacc = sc.nextLine();
                    System.out.print("Bank Details: ");
                    String bbank = sc.nextLine();
                    service.addBeneficiary(new Beneficiary(bid, bcid, bname, bacc, bbank));
                    System.out.println("Beneficiary added successfully!");
                }
                case 4 -> {
                    System.out.println("Enter Transaction Details");
                    System.out.print("Account ID: ");
                    int taid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Type (Deposit/Withdrawal): ");
                    String ttype = sc.nextLine();
                    System.out.print("Amount: ");
                    double tamount = sc.nextDouble();
                    service.addTransaction(new Transaction(0, taid, ttype, tamount));
                    System.out.println("Transaction added successfully!");
                }
                case 5 -> {
                    System.out.print("Enter Customer ID: ");
                    int fid = sc.nextInt();
                    Customer found = service.findCustomerById(fid);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Customer not found.");
                    }
                }
                case 6 -> {
                    System.out.print("Enter Customer ID: ");
                    int custId = sc.nextInt();
                    List<Account> accts = service.getAccountsByCustomerId(custId);
                    if (!accts.isEmpty()) {
                        accts.forEach(System.out::println);
                    } else {
                        System.out.println("No accounts found.");
                    }
                }
                case 7 -> {
                    System.out.print("Enter Account ID: ");
                    int accId = sc.nextInt();
                    List<Transaction> txns = service.getTransactionsByAccountId(accId);
                    if (!txns.isEmpty()) {
                        txns.forEach(System.out::println);
                    } else {
                        System.out.println("No transactions found.");
                    }
                }
                case 8 -> {
                    System.out.print("Enter Customer ID: ");
                    int bcid2 = sc.nextInt();
                    List<Beneficiary> bens = service.getBeneficiariesByCustomerId(bcid2);
                    if (!bens.isEmpty()) {
                        bens.forEach(System.out::println);
                    } else {
                        System.out.println("No beneficiaries found.");
                    }
                }
                case 9 -> {
                    System.out.println("Thank you for using the Banking System!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

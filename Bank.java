import java.util.Scanner;
class Account{
    private String accountHolder;
    private String accountNum;
    private double balance;
    Account(String name,String accountNumber,double balance ){
        this.accountHolder=name;
        this.accountNum=accountNumber;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited:"+amount);
        }
        else {
            System.out.println("Amount must be greater than 0");
        }
        
        }
        public void withdraw(double amount)
        {
            if(amount>balance){
                System.out.println("Amount cant be withdrawn..its insufficient balance");
            }
            else if(amount<=0){
                System.out.println("Amount must be positive");
            }
            else{
                balance-=amount;
                System.out.println("Withdrawed:"+amount);
            }
        }
       public void viewDetails(){
            System.out.println("Account Holder:"+accountHolder);
            System.out.println("Account Number:"+accountNum);
            System.out.println("Current balance: Rs."+balance);
        }
    }
class Bank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Account account=null;
        while(true){
            System.out.println("\n******BANK ACCOUNT MENU******");
            System.out.println("1.Create Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.View Details");
            System.out.println("5.Exit");
            System.out.print("Enter Choice:");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter account holder name:");
                    String name=sc.nextLine();
                    System.out.print("Enter account number:");
                    String accNo=sc.nextLine();
                    System.out.print("Enter account balance:");
                    double bal=sc.nextDouble();
                    account =new Account(name,accNo,bal);
                    System.out.print("Account created successfully...");
                    break;
                case 2:
                    if(account==null){
                        System.out.println("Create the account to deposit...");
                    }
                    System.out.print("Enter the amount to be deposited");
                    double dep=sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 3:
                    if(account==null){
                        System.out.print("Create the account to withdraw...");
                    }
                    System.out.println("Enter the amount to be withdrawal");
                    double draw=sc.nextDouble();
                    account.withdraw(draw);
                    break;        
            
                case 4:
                    if(account==null){
                        System.out.println("Create the account to deposit...");
                    }
                    account.viewDetails();
                    break;
                case 5:
                    System.out.println("Exiting..Thank you");
                    break;
                default:
                    System.out.println("Invalid choice");
            
        }
    }
}
}
package atmtest;

import javax.swing.JPanel;

/**
 * @author Java How to Program Deitel & Deitel Ch.34
 *
 */
public class ATM extends JPanel {

    private int currentStep = 0;
    private boolean userAuthenticated;
    private int currentAccountNumber;
    private Screen screen;
    private Keypad keypad;
    private CashDispenser cashDispenser;
    private DepositSlot depositSlot;
    private BankDatabase bankDatabase;

    private static final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;

    public ATM() {
        userAuthenticated = false;
        currentAccountNumber = 0;
        
    }//end ATM constructor

//    public void run() {
//
//        while (true) {
//            while (!userAuthenticated) {
//                screen.displayMessageLine("\nWelcome!");
//                authenticateUser();
//            }//end while
//
//            performTransactions();
//            userAuthenticated = false;
//            currentAccountNumber = 0;
//            screen.displayMessageLine("\nThank you! Goodbye!");
//        }//end while
//    }//end method run

    

    public void step2() {
        System.out.println("got to step two");
    }
    
    public void pressEnter(){
        
        int accountNumber = 0;
        int pinNumber = 0;
        
        if (currentStep == 0){
            accountNumber = keypad.getInput();
            currentStep = 1;
            screen.displayMessage("\nEnter your PIN: ");
        }
        else if (currentStep == 1){           
            pinNumber = keypad.getInput();
            currentStep = 2;
            userAuthenticated = bankDatabase.authenticateUser(accountNumber, pinNumber);

            if (userAuthenticated) {
                System.out.println("User Authenticated");
                currentAccountNumber = accountNumber;
            } else {
                screen.displayMessageLine("\nInvalid account number or PIN. Please try again.");
                //TODO: display welcome message again
                currentStep = 0;
            }
        }
        else if (currentStep == 2){
            
        }
    }

    private void authenticateUser() {
        while (keypad.getInput() == 0) {
            int accountNumber = keypad.getInput();

            screen.displayMessage("\nEnter your PIN: ");
            int pin = keypad.getInput();

            userAuthenticated = bankDatabase.authenticateUser(accountNumber, pin);

            if (userAuthenticated) {
                currentAccountNumber = accountNumber;
            } else {
                screen.displayMessageLine("\nInvalid account number or PIN. Please try again.");
            }
        }
    }

    private void performTransactions() {
        Transaction currentTransaction = null;
        boolean userExited = false;

        while (!userExited) {
            int mainMenuSelection = displayMainMenu();

            switch (mainMenuSelection) {
                case BALANCE_INQUIRY:
                case WITHDRAWAL:
                case DEPOSIT:

                    currentTransaction = createTransaction(mainMenuSelection);
                    currentTransaction.execute();
                    break;
                case EXIT:
                    screen.displayMessageLine("\nExiting the System...");
                    userExited = true;
                    break;
                default:
                    screen.displayMessageLine("\nYou did not enter a valid selection. Try again.");
                    break;
            }//end switch
        }//end while
    }//end method performTransactions

    private int displayMainMenu() {
        screen.displayMessageLine("\nMain menu:");
        screen.displayMessageLine("1 - View my balance");
        screen.displayMessageLine("2 - Withdraw cash");
        screen.displayMessageLine("3 - Deposit funds");
        screen.displayMessageLine("4 - Exit\n");
        screen.displayMessage("Enter a choice: ");
        return keypad.getInput();
    }//end method displayMainMenu

    private Transaction createTransaction(int type) {
        Transaction temp = null;
        switch (type) {
            case BALANCE_INQUIRY:
                temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
                break;
            case WITHDRAWAL:
                temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
                break;
            case DEPOSIT:
                temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
                break;
        }//end switch

        return temp;
    }//end method creatTransactions

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeypad(Keypad keypad) {
        this.keypad = keypad;
    }

    public void setCashDispenser(CashDispenser cashDispenser) {
        this.cashDispenser = cashDispenser;
    }

    public void setDepositSlot(DepositSlot depositSlot) {
        this.depositSlot = depositSlot;
    }

    public void setBankDatabase(BankDatabase bankDatabase) {
        this.bankDatabase = bankDatabase;
    }
    
    
}//end class ATM

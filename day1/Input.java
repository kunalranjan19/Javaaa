
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class Input{

    private static List<String> currentList = new ArrayList<String>();
    private static List<String> doneList = new ArrayList<String>();

    public static void main(String[] args) {
       // GUI g=new GUI();

        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = menu();
            switch (menuItem) {
                case 1:
                    showList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    markdone();
                    break;
                case 5:
                    showdone();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Enter a valid option");
            }
        }
    }

    public static int menu() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Main Menu");
        System.out.println("----------------------");
        System.out.println("0. Exit ");
        System.out.println("1. Display to-do list");
        System.out.println("2. Add item to list");
        System.out.println("3. Remove item from list");
        System.out.println("4. Mark done if you have completed the task");
        System.out.println("5. Display task done list");
        System.out.println();
        System.out.print("Enter choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public static void showList() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("To-Do List");
        System.out.println("----------------------");
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);
        }
        System.out.println("----------------------");


    }

    public static void addItem() {
        System.out.println("Add Item");
        System.out.println("----------------------");
        System.out.print("Enter an item: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        currentList.add(item);
        showList();
    }

    public static void removeItem() {
        System.out.println("Remove Item");
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to remove?");
        int index = scanner.nextInt();
        if((index-1)<0 || index>currentList.size()) {
            System.out.println("Wrong index number! Please enter in range of 1 to "+currentList.size());
        }else {
            currentList.remove(index-1);
        }
        System.out.println("----------------------");
        showList();
    }
    public static void list(){

    }


    public static void markdone(){

        if(currentList.size()>0) {
            System.out.println("Mark done the items that you have completed");
            System.out.println("----------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("What do you want to mark done?");
            int index = scanner.nextInt();
            if((index-1)<0 || index>currentList.size()) {
                System.out.println("Wrong index number! Please enter in range of 1 to "+currentList.size());
            }else {
                doneList.add(currentList.get(index-1));
                currentList.remove(index-1);
                System.out.println("congrats you have completed a task");
                System.out.println("do you wanna take a break if yes than press 1");
                int y=scanner.nextInt();
                if(y==1){
                    System.out.println("do you wanna play" +YELLOW+" Rock Paper Scissor"+RESET);
                    System.out.println("if yes than press 1");
                    int g=scanner.nextInt();
                    if(g==1){
                        solve();

                    }
                }
            }
            System.out.println("----------------------");

        }
        else{
            System.out.println("enter items first");
            addItem();
        }
    }
    public static void showdone(){
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Task done-List");
        System.out.println("----------------------");
        int number = 0;
        for (String i : doneList) {
            System.out.println(++number + " " + i);
        }
        System.out.println("----------------------");

    }


//1-rock
//2-paper
//3-scissor
    public static void winner(int computerinput,int userinput){
        if ((userinput == computerinput)) {
            System.out.println("Draw!");
            solve();
        }
        else if ((userinput == 1) && (computerinput == 2)) {
            System.out.println("Computer Won!");
            solve();
        }
        else if ((userinput == 1) && (computerinput == 3)) {
            System.out.println("User Won!");
            solve();
        }
        else if ((userinput == 2) && (computerinput == 1)) {
            System.out.println("User Won!");
            solve();
        }
        else if ((userinput == 2) && (computerinput == 3)) {
            System.out.println("Computer Won!");
            solve();
        }
        else if ((userinput == 3) && (computerinput == 1)) {
            System.out.println("Computer Won!");
            solve();
        }
        else if ((userinput == 3) && (computerinput == 2)) {
            System.out.println("User Won!");
            solve();
        }
    }
    public static void computer(int userinput){
        Random rand = new Random();
        int computerinput=rand.nextInt(1,4);
        if(computerinput==1) {
            System.out.println("Computer: Rock");
            winner(computerinput,userinput);
        }
        else if(computerinput==2) {
            System.out.println("Computer: Paper");
            winner(computerinput,userinput);
        }
        else if(computerinput==3) {
            System.out.println("Computer: Scissor");
            winner(computerinput,userinput);
        }
    }
        public static void solve(){
        Scanner sc = new Scanner(System.in);
        int x=1;
        while (x!=0) {
            System.out.println("Enter your choice: 0.Exit | 1.Rock | 2.Paper | 3.Scissor");
            int userinput = sc.nextInt();
            if (userinput == 9) {
                break;
            }
            else if (userinput == 1) {
                System.out.println("User: Rock");
                computer(userinput);
            }
            else if (userinput == 2) {
                System.out.println("User: Paper");
                computer(userinput);
            }
            else if (userinput == 3) {
                System.out.println("User: Scissor");
                computer(userinput);
            }
            else {
                System.out.println("Please enter a valid number");
            }
        }
    }
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
}
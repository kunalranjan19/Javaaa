import java.util.Scanner;
public class todo {
    public static void main(String[] args) {

            System.out.println("Welcome to your To-do Manager!\n");
            System.out.println("Please Enter your Name: ");
            Scanner in = new Scanner(System.in);
            String name = in.next();
            System.out.println("Hello "+name);

            int choice,n ;
            Scanner input = new Scanner(System.in);

           try {
               do {
                   //Display the Menu
                   System.out.println("Please choose an option\n");
                   System.out.println("1. Enter a task ");
                   System.out.println("2. Remove a task ");
                   System.out.println("3. Update a task ");
                   System.out.println("4. List all tasks ");
                   System.out.println("5. Exit");
                   choice = input.nextInt();

                   switch(choice) {
                       case 1:
                           System.out.println("Enter number of tasks: ");
                           n = input.nextInt();
                           int[] task=new int[n];
                           System.out.println("Enter a task ");
                           for(int i=0;i<n;i++){
                                task[i]= Integer.parseInt(input.next());
                           }
                           choice = input.nextInt();
                           break;
                       case 2:
                           System.out.println("Remove a task ");
                           choice = input.nextInt();
                           break;
                       case 3:
                           System.out.println("Remove a task ");
                           choice = input.nextInt();
                           break;
                       case 4:
                           System.out.println("Remove a task ");
                           choice = input.nextInt();
                           break;
                       case 5:
                           System.out.println("Remove a task ");
                           choice = input.nextInt();
                           break;
                   }
               } while ( choice>0);
           }catch (Exception e){
               System.out.println(e);
           }
        }
}

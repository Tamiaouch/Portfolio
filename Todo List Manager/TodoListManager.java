//Tamia Ouch
//11/11/23
//CSE 122
//C0: Creative Assignment
//TA: Kher Rucha
import java.util.*;
import java.io.*;

//This class allows the user to add, mark, load, and save their todo list

public class TodoListManager {
   public static final boolean EXTENSION_FLAG = false;
   
   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      ArrayList<String> todos = new ArrayList<String>();
      System.out.println("Welcome to your TODO List Manager!");
      System.out.println("What would you like to do?");
      if (EXTENSION_FLAG == false){
         System.out.print("(A)dd TODO, (M)ark TODO as done, (L)oad TODOs, (S)ave TODOs, (Q)uit? ");
      }
      if (EXTENSION_FLAG == true){
         System.out.print("(A)dd TODO, (D)eadlines, (M)ark TODO as done, (L)oad TODOs, (S)ave TODOs, (Q)uit? ");
      }
      String input = console.nextLine();
      while (!input.equalsIgnoreCase("Q")) {
         if(input.equalsIgnoreCase("A")){
            addItem(console, todos);
            printTodos(todos);
         }
         else if(input.equalsIgnoreCase("M")){
            markItemAsDone(console, todos);
            printTodos(todos);
         }
         else if(input.equalsIgnoreCase("d") && EXTENSION_FLAG == true){
            addDeadlines(console, todos);
            printTodos(todos);
         }
         else if(input.equalsIgnoreCase("L")){
            loadItems(console, todos);
            printTodos(todos);
         }
         else if(input.equalsIgnoreCase("S")){
            saveItems(console, todos);
            printTodos(todos);
         }
         
         else{
            System.out.println("Unknown input: " + input);
            printTodos(todos);
         }
         
         System.out.println("What would you like to do?");
         if (EXTENSION_FLAG == false){
            System.out.print("(A)dd TODO, (M)ark TODO as done, (L)oad TODOs, (S)ave TODOs, (Q)uit? ");
         }
         if (EXTENSION_FLAG == true){
            System.out.print("(A)dd TODO, (D)eadlines, (M)ark TODO as done, (L)oad TODOs, (S)ave TODOs, (Q)uit? ");
         }
         input = console.nextLine();
      }
   }
   
   // Behavior: This method prints the users todo list
   // Parameters: ArrayList: todos, list of todos
   // Returns: N/A
   public static void printTodos(List<String> todos) {
      System.out.println("Today's TODOs:");
      for(int i = 0; i<todos.size(); i++){
         System.out.print((i+1)+": "+todos.get(i));
         System.out.println("");
      }
      if(todos.isEmpty()){
         System.out.println("  You have nothing to do yet today! Relax!");
      }
      
   }
   
   // Behavior: This method adds to the users todo list
   // Exceptions: Assumes that user input is a valid number, accepts empty strings
   // Parameters: ArrayList: todos, list of todos & Scanner console
   // Returns: N/A
   public static void addItem(Scanner console, List<String> todos) {
      System.out.print("What would you like to add? ");
      String input = console.nextLine();
      System.out.println("");
      if(todos.isEmpty()){
         todos.add(input);
      }
      else{
         System.out.print("Where in the list should it be (1-");
         System.out.println((todos.size()+1) +")? (Enter for end): ");
         String spot = console.nextLine();
         if(spot.isEmpty()){
            todos.add(input);
         } else{
            int numSpot = Integer.parseInt(spot);
            if(numSpot <= todos.size()){
            todos.add(numSpot-1, input);}
            else{
               todos.add(input);
            }
         }
         
         
      }
   }
   // Behavior: This method marks and deletes users completed todos
   // Exceptions: Assumes that user input is a valid number
   // Parameters: ArrayList: todos, list of todos & Scanner console
   // Returns: N/A
   public static void markItemAsDone(Scanner console, List<String> todos) {
      if(todos.isEmpty()){
         System.out.println("All done! Nothing left to mark as done!");
      }
      else{
         System.out.print("Which item did you complete (1-");
         System.out.println((todos.size()) +")?");
         String input = console.nextLine();
         int remove = Integer.parseInt(input);
         todos.remove(remove-1);
         
      }
   }
   
   // Behavior: This method loads a todo list from users file
   // Exceptions: Assumes file exists and throws FileNotFoundException
   // Parameters: ArrayList: todos, list of todos & Scanner console
   // Returns: N/A
   public static void loadItems(Scanner console, List<String> todos)
   throws FileNotFoundException {
      System.out.print("File name? ");
      String file = console.nextLine();
      System.out.println("");
      Scanner todoScan = new Scanner(new File(file));
      todos.clear();
      while (todoScan.hasNextLine()) {
         String nextActivity = todoScan.nextLine();
         todos.add(nextActivity);
      }
   }
   
   // Behavior: This method saves users todo list to a file
   // Exceptions: Assumes that file exists, throws FileNotFoundException
   // Parameters: ArrayList: todos, list of todos & Scanner console
   // Returns: N/A
   public static void saveItems(Scanner console, List<String> todos)
   throws FileNotFoundException {
      System.out.print("File name? ");
      String file = console.nextLine();
      System.out.println("");
      PrintStream output = new PrintStream(new File(file));
      for (int i = 0; i < todos.size(); i++) {
         output.println(todos.get(i));
      }
   }

   // Behavior: This method allows the user to add deadlines to their todo list
   // Exceptions: Assumes that user input is a valid number
   // Parameters: ArrayList: todos, list of todos & Scanner console
   // Returns: N/A
   public static void addDeadlines(Scanner console, List<String> todos){
      if(EXTENSION_FLAG == true){
         if(todos.isEmpty()){
            System.out.println("All done! No deadlines are possible!");
         }
         else{
            System.out.print("Which item did you want to add a deadline to? (1-");
            System.out.print((todos.size()) +")?");
            String input = console.nextLine();
            System.out.println("");
            int pull = Integer.parseInt(input) - 1;
            String pulled = todos.get(pull);
            System.out.println("What is the deadline for this activity?");
            input = console.nextLine();
            todos.set(pull, pulled + " " + input);
            
            
            
         }
      }
   }
   
   
}
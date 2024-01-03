//Tamia Ouch
//11/11/23
//CSE 122
//P1: Music Playlist
//TA: Kher Rucha
import java.util.*;
import java.io.*;

//This class allows the user to add and play songs in their music playlist
//User can print out the song history, clear the song history, and delete from the song history

public class MusicPlaylist{
   
   public static void main(String[] args) throws IllegalStateException {
      Scanner console = new Scanner(System.in);
      Stack<String> history = new Stack<>();
      Queue<String> playlist = new LinkedList<>();
      System.out.println("Welcome to the CSE 122 Music Playlist!");
      System.out.println("(A) Add song");
      System.out.println("(P) Play song");
      System.out.println("(Pr) Print history");
      System.out.println("(C) Clear history");
      System.out.println("(D) Delete from history");
      System.out.println("(Q) Quit");
      System.out.println("");
      System.out.print("Enter your choice: ");
      String input = console.nextLine();
      
      while (!input.equalsIgnoreCase("Q")) {
         if(input.equalsIgnoreCase("A")){
            addSong(console, playlist);
         }
         else if(input.equalsIgnoreCase("P")){
            playSong(console, history, playlist);
         }
         else if(input.equalsIgnoreCase("PR")){
            printHistory(history);
         }
         else if(input.equalsIgnoreCase("C")){
            clearHistory(console, history);
         }
         else if(input.equalsIgnoreCase("D")){
            deleteHistory(console, history);
         }
         
         System.out.println("(A) Add song");
         System.out.println("(P) Play song");
         System.out.println("(Pr) Print history");
         System.out.println("(C) Clear history");
         System.out.println("(D) Delete from history");
         System.out.println("(Q) Quit");
         System.out.println("");
         System.out.print("Enter your choice: ");
         input = console.nextLine();
      }
   }

   // Behavior: This method adds songs to the playlist
   // Exceptions: Assumes string from user is non empty
   // Parameters: Console : gets input, and playlist: queue of songs 
   // Returns: N/A
   public static void addSong (Scanner console, Queue<String> playlist){
      System.out.print("Enter song name: ");
      String input2 = console.nextLine();
      playlist.add(input2);
      System.out.println("Successfully added " + input2);
      System.out.println("");
      System.out.println("");
   }

   // Behavior: Method prints the song name in the playlist and moves it to history
   // Exceptions: throws IllegalStateException if playlist is empty 
   // Parameters: console: input from user, history: stack of played songs, 
   // and playlist: queue of songs
   // Returns: N/A

   public static void playSong (Scanner console, Stack<String> history, Queue<String> playlist)
   throws IllegalStateException{
      if(playlist.isEmpty()){
         throw new IllegalStateException("Playlist is Empty");
      }
         String playing = playlist.peek();
         System.out.println("Playing song: " + playing);
         System.out.println("");
         System.out.println("");
         history.push(playing);
         playlist.remove();
      }


   // Behavior: Method prints history of played songs
   // Exceptions: throws IllegalStateException if history is empty 
   // Parameters: history: stack of played songs
   // Returns: N/A
   public static void printHistory (Stack<String> history)
   throws IllegalStateException{
      if(history.isEmpty()){
         throw new IllegalStateException("History is Empty");
      }
      
      Stack<String> backwards = new Stack<String>();
      int size = history.size();
      while(!history.isEmpty()){
         System.out.println(history.peek());
         backwards.push(history.pop());
      }
      while(!backwards.isEmpty()){
         history.push(backwards.pop());
      }
      System.out.println("");
   }
   
   public static void clearHistory(Scanner console, Stack<String> history){
      while(!history.isEmpty()){
         history.pop();
      }
   }

   // Behavior: Method deletes songs from played history based on input, if input is positive 
   // deletes from most recent, if number is negative it deletes from the beginning of history
   // Exceptions: throws IllegalArgumentException if input is greater than history size
   // Parameters: console: input from user, and history: stack of played songs
   // Returns: N/A
   public static void deleteHistory (Scanner console, Stack<String> history)
   throws IllegalArgumentException{
      
      System.out.println("A positive number will delete from recent history.");
      System.out.println("A negative number will delete from the beginning of history.");
      System.out.print("Enter number of songs to delete: ");
      String input = console.nextLine();
      int numInput = Integer.parseInt(input);
      System.out.println("");
      if(history.size() < Math.abs(numInput)){
         throw new IllegalArgumentException();
      }
      Stack<String> negativeNumber = new Stack<>();
      if(numInput > 0){
         for(int i =0; i < numInput; i++){
            history.pop();
         }
      }
      else {
         while(!history.isEmpty()){
            negativeNumber.add(history.pop());
         }
         for (int j = 0; j < (numInput * -1); j++){
            negativeNumber.pop();
         }
         while(!negativeNumber.isEmpty()){
            history.push(negativeNumber.pop());
         }
      }
      
   }
}
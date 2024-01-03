//Tamia Ouch
//11/28/23
//CSE 122
//C2: TwitterTrends
//TA: Kher Rucha
import java.util.*;
import java.io.*;

//This class replicates twitter and analyzes it with the most frequent word and least frequent
public class TwitterMain {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("tweets.txt")); // Make Scanner over tweet file
      List<String> tweets = new ArrayList<>();
      while (input.hasNextLine()) { // Add each tweet in file to List
         tweets.add(input.nextLine());
      }
      
      TweetBot bot = new TweetBot(tweets); // Create TweetBot object with list of tweets
      TwitterTrends trends = new TwitterTrends(bot); // Create TwitterTrends object
      
      System.out.print("The most frequent word is: ");
      System.out.println(trends.getMostFrequentWord());
      System.out.print("The least frequent word is: ");
      System.out.println(trends.getLeastFrequentWord());
   }
}
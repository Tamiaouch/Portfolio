//Tamia Ouch
//11/28/23
//CSE 122
//P2: TwitterTrends
//TA: Kher Rucha
import java.util.*;
import java.io.*;

//This class reads in and manages the state of tweets
public class TweetBot {
   
   private List<String> newTweetBot;
   private int index = 0;
   
   // Behavior: This method creates a list of all tweets
   // Exceptions: Throws an IllegalArgumentException if the size of the collection is less than 1.
   // Assumes the given collection contains only non-empty and distinct strings
   // Parameters: Tweets: A List of Strings that represent the tweets
   // Returns: List of Strings
   public TweetBot(List<String> tweets){
      if(tweets.size() < 1){
         throw new IllegalArgumentException();
      }
      newTweetBot = new ArrayList<>();
      int size = tweets.size();
      for(int i = 0; i < size; i++){
         newTweetBot.add(tweets.get(i));
      }
   }
   
   // Behavior: This method counts how many tweets there are
   // Exceptions: N/A
   // Parameters: N/A
   // Returns: Integer representing how many tweets there are
   public int numTweets(){
      return newTweetBot.size();
   }
   
   // Behavior: This method allows the user to add tweets
   // Exceptions: Assumes the tweet does not already exist in list of tweets
   // Parameters: Tweet: A String that represents the new tweet
   // Returns: N/A
   public void addTweet(String tweet){
      newTweetBot.add(tweet);
   }
   
   // Behavior: This method gets the next tweet
   // Exceptions: N/A
   // Parameters: N/A
   // Returns: String of the next tweet
   public String nextTweet(){
      String next = "";
      int size = numTweets();
      if(index == size){
         index = 0;
      }
      next = newTweetBot.get(index);
      index++;
      return next;
   }
   
   // Behavior: This method allows the user to remove tweets
   // Exceptions: N/A
   // Parameters: Tweet: A String that represents the tweet to remove
   // Returns: N/A
   public void removeTweet(String tweet){
      if(newTweetBot.contains(tweet) && index > newTweetBot.indexOf(tweet)){
         index--;
      }
      newTweetBot.remove(tweet);
   }
   
   // Behavior: This method starts the tweets from the beginning
   // Exceptions: N/A
   // Parameters: N/A
   // Returns: N/A
   public void reset(){
      index = 0;
   }
   
   
}   
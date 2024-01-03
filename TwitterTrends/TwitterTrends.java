//Tamia Ouch
//11/28/23
//CSE 122
//P2: TwitterTrends
//TA: Kher Rucha
import java.util.*;
import java.io.*;

//This class begins Tweetbot with the new list of tweets
public class TwitterTrends {
   
   private TweetBot tweetBot;
   
   public TwitterTrends(TweetBot bot) {
      this.tweetBot = bot;
   }
   
   // Behavior: This method allows user to get the most frequent word
   // Exceptions: N/A
   // Parameters: N/A
   // Returns: String representing the most frequent word
   public String getMostFrequentWord(){
      
      Map<String, Integer> wordCount = new HashMap<>();
      
      for(int i = 0; i <= tweetBot.numTweets(); i++){
         String tweet = tweetBot.nextTweet();
         Scanner find = new Scanner(tweet);
         while(find.hasNext()){
            String word = find.next();
            word = word.toLowerCase();
            if(wordCount.containsKey(word)){
               wordCount.put(word, wordCount.get(word)+1);
            }
            else{
               wordCount.put(word, 1);
            }
         }
      }
      
      String mostFrequent = "";
      int highest = 0;
      for (String word : wordCount.keySet()){
         if(wordCount.get(word) > highest){
            highest = wordCount.get(word);
            mostFrequent = word;
         }
      }
      return mostFrequent;
   }
   
   // Behavior: This method allows user to get the least frequent word
   // Exceptions: N/A
   // Parameters: N/A
   // Returns: String representing the least frequent word
   public String getLeastFrequentWord(){
      
      Map<String, Integer> wordCounts = new HashMap<>();
      
      for(int i = 0; i <= tweetBot.numTweets(); i++){
         String tweets = tweetBot.nextTweet();
         Scanner find = new Scanner(tweets);
         while(find.hasNext()){
            String word = find.next();
            word = word.toLowerCase();
            if(wordCounts.containsKey(word)){
               wordCounts.put(word, wordCounts.get(word)+1);
            }
            else{
               wordCounts.put(word, 1);
            }
         }
      }
      
      String leastFrequent = "";
      int lowest = Integer.MAX_VALUE;
      for (String word : wordCounts.keySet()){
         if(wordCounts.get(word) < lowest){
            lowest = wordCounts.get(word);
            leastFrequent = word;
         }
      }
      return leastFrequent;
   }
}
package basiclibrary;

import java.security.Key;
import java.util.*;

public class Tally {

    public static String tally(List<String> inputList) {
        HashMap<String, Integer> uniqueValues = new HashMap<>();
        for (int i = 0; i < inputList.size(); i++) {
            uniqueValues.put(inputList.get(i), 0);
        }
        
        for (int i = 0; i < inputList.size(); i++){
            if (uniqueValues.containsKey(inputList.get(i))) {
                uniqueValues.put(inputList.get(i), uniqueValues.get(inputList.get(i))+1);
            }
        }
        
        int max = Collections.max(uniqueValues.values());
        String winner = "";
        for (Map.Entry<String,Integer> personVote : uniqueValues.entrySet()) {
            if(max == personVote.getValue()){
                System.out.println("personVote.getKey() = " + personVote.getKey());
                winner = personVote.getKey();
            }
        }
        return winner + " received the most votes!";
    }
    

    public static void main(String[] args) {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        tally(votes);
    }
}

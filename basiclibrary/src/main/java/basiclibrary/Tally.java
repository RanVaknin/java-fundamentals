package basiclibrary;

import java.security.Key;
import java.util.*;

public class Tally {

    public static String tally(List<String> inputList) {
        String result = "";
        if(inputList.size() == 0){
            result = "No Candidates!";
        } else {
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
            System.out.println("max = " + max);
            ArrayList<String> candidates = new ArrayList<>();
            for (Map.Entry<String,Integer> personVote : uniqueValues.entrySet()) {
                if (max == personVote.getValue()) {
                    candidates.add(personVote.getKey());
                }
            }
            if (candidates.size() == 1){
                result = candidates.get(0) + " received the most votes!";
            } else {
                for (int i = 0; i < candidates.size(); i++){
                    result += " & " + candidates.get(i);
                }
                result = result.substring(3);
                result = "We have a tie between: " + result;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        List<String> votes = new ArrayList<>();
        tally(votes);
    }
}

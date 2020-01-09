package basiclibrary;

import java.util.*;

public class Tally {

    public static String tally(List<String> inputList) {
        int noVotes = 0;
        HashMap<String, Integer> uniqueValues = new HashMap<>();
        for (int i = 0; i < inputList.size(); i++) {
            uniqueValues.put(inputList.get(i), noVotes);

            if (uniqueValues.containsKey(inputList.get(i))) {
                uniqueValues.put(inputList.get(i), noVotes++);
            }

        }
        System.out.println(uniqueValues);

        return "hello";
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

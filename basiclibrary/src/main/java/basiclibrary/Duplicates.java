package basiclibrary;

public class Duplicates {
    public static boolean containsDuplicates(int[] inputArray){
        int valueToCheckAgainst = inputArray[0];
        boolean returnStatemnt = true;
        for(int i = 1; i < inputArray.length; i ++){
            if (valueToCheckAgainst != inputArray[i]){
                valueToCheckAgainst = inputArray[i];
                returnStatemnt = false;


            } else {
                returnStatemnt = true;
            }
        }
        return returnStatemnt;
    }
}

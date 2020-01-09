package basiclibrary;

import java.util.HashSet;

public class Temperature {
    public static String findMinMax(int[][] inputArray) {
        String returnStatment = "";
        HashSet<Integer> uniqueValues = new HashSet<>();
        int min = inputArray[0][0];
        int max = inputArray[0][0];
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                uniqueValues.add(inputArray[i][j]);
                if (inputArray[i][j] < min) {
                    min = inputArray[i][j];
                }
                if (inputArray[i][j] > max) {
                    max = inputArray[i][j];
                }
            }
        }
        for (int i = min; i< max+1; i++){
            if(!uniqueValues.contains(i)){
                returnStatment += "Never saw temperature: "+i+ " \n";
            }
        }
        returnStatment = returnStatment.substring(0,returnStatment.lastIndexOf(" "));

        return returnStatment;
    }


    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        findMinMax(weeklyMonthTemperatures);
    }
}





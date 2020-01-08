package basiclibrary;

import java.util.Arrays;

public class Roll {

    public static int[] rollDice(int n) {
        int[] arrayOfRolls = new int[n];
        for (int i = 0; i < n; i++) {
            int singleRoll = (int) (Math.ceil(Math.random() * 6));
            arrayOfRolls[i] = singleRoll;
            System.out.println(singleRoll);
        }
        System.out.println(Arrays.toString(arrayOfRolls));
        return arrayOfRolls;
    }
}

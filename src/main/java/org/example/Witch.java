package org.example;

public class Witch {
    private static final int[] KILL_NUMS = {1, 2, 4, 7, 12, 20, 33, 54, 88, 143};

    public static double averageKills(int aod1, int yod1, int aod2, int yod2) {

        if (aod1 < 0 || aod2 < 0) {
            return -1;
        }

        int birthyod1 = yod1 - aod1;
        int birthYear2 = yod2 - aod2;

        if (birthyod1 < 0 || birthYear2 < 0) {
            return -1;
        }

        int killSum1 = getKillSum(birthyod1);
        int killSum2 = getKillSum(birthYear2);

        return (killSum1 + killSum2) / 2.0;
    }

    private static int getKillSum(int year) {
        if (year < 1) {
            return 0;
        } else if (year <= KILL_NUMS.length) {
            return KILL_NUMS[year - 1];
        } else {
            int a = 1, b = 1;
            for (int i = 3; i <= year; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b + getKillSum(year - KILL_NUMS.length);
        }
    }
}

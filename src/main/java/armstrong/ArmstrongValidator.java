package armstrong;

public class ArmstrongValidator {

    public static boolean isValid(int candidate) {
        return candidate == arm(candidate, Integer.toString(candidate).length(), new int[]{0});
    }

    private static int arm(int candidate, int length, int[] sum) {
        if (candidate == 0) {
            return sum[0];
        }

        sum[0] += Math.pow(candidate % 10, length);
        return arm(candidate / 10, length, sum);
    }
}

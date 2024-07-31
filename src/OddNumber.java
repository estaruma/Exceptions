public class OddNumber {

    public static void checkIfOdd(int num)
        throws IllegalArgumentException {
            if (num % 2 != 0) {
                throw new IllegalArgumentException(num + " is an odd number");
            }
        }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        for (int num : nums) {
            try {
                checkIfOdd(num);
                System.out.println(num + " is an even number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

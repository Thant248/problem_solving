public class PlusOne {

    public static void main(String... args){
        int[] digits = {9, 9, 9};
        PlusOne plusOne = new PlusOne();
        int[] result = plusOne.plusone(digits);
       for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }


    public int[] plusone(int[] digits){
        int length = digits.length;
        for(int i = length - 1; i >= 0; i--){
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }
        digits = new int[length + 1];
        digits[0] = 1;
        return digits;

    }
    
}

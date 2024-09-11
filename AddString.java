public class AddString {
    public static void main(String... args){
        AddString addString = new AddString();
        String num1 = "11";
        String num2 = "123";
        String result = addString.addStrings(num1, num2);
        System.out.println(result);
    }


    public String addStrings(String num1, String num2){
        StringBuilder sb = new StringBuilder();
        int left1 = num1.length() - 1;
        int left2 = num2.length() - 1;
        int carry = 0;

        while (left1 >= 0 || left2 >= 0 || carry != 0) {
            int sum = carry;
            if (left1 >= 0) {
                sum += num1.charAt(left1) - '0';
                left1--;
            }
            
            if (left2 >= 0) {
                sum += num2.charAt(left2) - '0';
                left2--;
            }
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}

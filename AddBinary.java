/**
 * Provides a solution for adding two binary strings.
 */
public class AddBinary {
    

    public static void main(String... args){
        AddBinary addBinary = new AddBinary();
        String a = "11";
        String b = "1";
        String result = addBinary.addBinary(a, b);
        System.out.println(result);
    }


    public String addBinary(String a, String b){

    StringBuilder sb = new StringBuilder();
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry == 1) 
    {
      if(i >= 0)
        carry += a.charAt(i--) - '0';
        System.out.println("This is from i");
        System.out.println(carry);
      if(j >= 0)
        carry += b.charAt(j--) - '0';
        System.out.println("This is from j");
        System.out.println(carry);
        sb.append(carry % 2);
        carry /= 2;
        System.out.println("This is from あっぺ");
        System.out.println(carry);

    }
    return sb.reverse().toString();
  }
}

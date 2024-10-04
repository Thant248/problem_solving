
import java.util.ArrayList;
import java.util.List;

public class DifferentWaystoAddParentheses {
    public static void main(String[] args) {
        DifferentWaystoAddParentheses differentWaystoAddParentheses = new DifferentWaystoAddParentheses();
        String expression = "2*3-4*5";
        List<Integer> result = differentWaystoAddParentheses.diffWaysToCompute(expression);
        for (int num : result) {
            System.out.println(num);
        }
    }


    public List<Integer> diffWaysToCompute(String expression){
        
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++){

            char operator = expression.charAt(i);

            if (operator == '+' || operator == '-' || operator == '*') {
                List<Integer> s1 = diffWaysToCompute(expression.substring(0, i));
                List<Integer> s2 = diffWaysToCompute(expression.substring(i + 1));

                for(int a : s1){
                    for(int b : s2){
                        if (operator == '+') {
                           res.add(a +b); 
                        }
                        if(operator == '-'){
                            res.add(a - b);
                        }
                        if(operator == '*') {
                            res.add(a * b);
                        }
                    }
                }
                
            }
        }
        if (res.isEmpty()) {
            res.add(Integer.parseInt(expression));
        }
        return res;
    }
}   


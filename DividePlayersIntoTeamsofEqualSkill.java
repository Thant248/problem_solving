import java.util.Arrays;

public class DividePlayersIntoTeamsofEqualSkill {
    
    public static void main(String... args){
        DividePlayersIntoTeamsofEqualSkill dividePlayersIntoTeamsofEqualSkill = new DividePlayersIntoTeamsofEqualSkill();
        int[] skill = {3, 2, 5, 1, 3, 4};
        long result = dividePlayersIntoTeamsofEqualSkill.dividePlayers(skill);
        System.out.println(result);
    }

        public long dividePlayers(int[] skill) {
            
            Arrays.sort(skill);
            int n = skill.length;
            if (n % 2 != 0) {
                return -1;
            }

            int targetSum  = skill[0] + skill[n - 1];
            int totalChemistry = 0;

            int i = 0;
            int  j = n-1;

            while (i < j) {
                int sum = skill[i] + skill[j];
                if (sum != targetSum) {
                    return -1;
                }

                totalChemistry = totalChemistry + (skill[i] * skill[j]);
                i++;
                j--;

            }
            return totalChemistry;
            
        }
}

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String result = "";
        
        // Convert array to a single number in string format
        for (int i : num) {
            result += i;
        }

        // Convert string to integer and add k
        int newResult = Integer.parseInt(result);
        int finalResult = newResult + k;

        // Convert finalResult back to string
        String numStr = Integer.toString(finalResult);
        int[] numArray = new int[numStr.length()];

        // Convert string back to int array
        for (int i = 0; i < numStr.length(); i++) {
            numArray[i] = numStr.charAt(i) - '0';
        }

        // Convert int[] to List<Integer>
        List<Integer> resultList = new ArrayList<>();
        for (int digit : numArray) {
            resultList.add(digit);
        }

        return resultList;
    }
}

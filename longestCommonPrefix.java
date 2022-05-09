import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strs[] = new String[n];
        sc.nextLine();

        for(int i = 0; i < strs.length; i++){
            strs[i] = sc.nextLine();
        }

        System.out.println(longestCommonPref(strs));
    }

    public static String longestCommonPref(String strs[]){
        StringBuilder result = new StringBuilder();

        // sort the arrrays
        Arrays.sort(strs);

        // get the first and last strings
        String first = strs[0];
        String last = strs[strs.length - 1];

        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }
            result.append(first.charAt(i));
        }

        return result.toString();
    }
}

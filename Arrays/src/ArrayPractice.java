import java.util.Arrays;
import java.util.HashMap;

public class ArrayPractice {
    public static void main(String[] args) {
        System.out.println("hello world");
        int[] array = new int[4];
        array[0] =5;
        array[1] =8;
        array[2] =9;
        array[3] = 4;
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(getMaxOccuringChar("thhhsssuuuuuuvbadfsdfi"));

    }
    static void selectionSort(int[] array){
        for (int i=0; i < array.length;i++){
            int mini =i;
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[i]){
                    mini = j;
                }
            }
            int temp = array[i];
            array[i] = array[mini];
            array[mini] = temp;
            int hell = Integer.MIN_VALUE;
        }
    }
    public static char getMaxOccuringChar(String str) {
        char result = ' ';
        int len = str.length();
        HashMap<Character, Integer> StrArray = new HashMap<Character, Integer>();
        int val = 1;
        for(int i =0; i<len; i++) {
            char temp = str.charAt(i);
            if(!StrArray.containsKey(temp)) {
                StrArray.put(temp, val);
            }else {
                StrArray.put(temp, StrArray.get(temp)+1);
            }
        }
        int MaxVal = 0;
        for(char i : StrArray.keySet()) {
            if(StrArray.get(i) > MaxVal) {
                result = i;
                MaxVal = StrArray.get(i);
            }
        }
        return result;
    }
}

package Day20_Arrays.Arrays;
import java.util.Arrays;
public class AverageNums {
    public static void main(String[] args) {
        int[]nums = {4,5,6,15};
        double sum = 0;
        for (int number:nums) {
            sum+=number;
        }
        double avr = sum/ nums.length;
        System.out.println((avr));
        System.out.println("________________");

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};
for( String each :words){
    System.out.println(each.charAt(0) + " " + each.charAt(each.length()-1));
    System.out.println("_____________________________________________");

    String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
            "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};
for (String each1 : names){
    System.out.println(each1.charAt(0) + "." + each1.charAt(each.indexOf(" ")+1));
}



}


    }
}

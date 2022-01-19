package ForLoopStringPractice;

public class ReversestringS {
    public static void main(String[] args) {
       String str = "Wooden Spoon";
        String result = "";

       /* str.charAt(str.length()-1);


        for (int i = str.length()-1; i >=0 ; i--) {// i- index number of str
            ;
           result += str.charAt(i);
        }
*/
      str.charAt(str.length()-1);

      for (int i=str.length()-1;i<=0;i--){
          result += str.charAt(i);
      }

        System.out.println(result);
    }
}


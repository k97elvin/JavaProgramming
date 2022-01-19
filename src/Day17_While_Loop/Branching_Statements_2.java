package Day17_While_Loop;

public class Branching_Statements_2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                continue;
            }
            System.out.println(i);

        }
        System.out.println("_________________________________");




        for (int i = 0; i <11 ; i++) {
          if(i%2 !=0){
              continue;
          }
            System.out.println(i);

        }

    }
}

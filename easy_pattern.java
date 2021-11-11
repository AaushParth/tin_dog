import java.util.Scanner;

// javac easy_pattern.java
public class easy_pattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int val = 1;
        for(int i = 1; i <= n; i++){
            int ival = val;
            for(int j = 1; j <= n; j++){
                System.out.print(ival + "\t");
                ival++;
            }
            System.out.println();

            // update value of val for the next row
            if(n % 2 == 0){
                if(i < n/2){ // upper half
                    val += 2 * n;
                }else if(i == n/2){ // middle row
                    val += n;
                }else{ // lower half
                    val -= 2 * n;
                }
            }else{
                if(i <= n/2){
                    val += 2 * n;
                }else if(i == n/2 + 1){
                    val -= n;
                }else{
                    val -= 2 * n;
                }
            }
        }
        scan.close();
    }    
}

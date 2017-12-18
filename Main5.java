import java.util.Scanner;
public class Main5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int data[][] = new int[n][m];
        for(int i=0 ; i<n ; i++){
            for(int y=0 ; y<m ; y++){
                data[i][y]=scn.nextInt();
            }
        }
        for(int y=0 ; y<m ; y++){
            for(int i=0 ; i<n ; i++){
                System.out.print(data[i][y]+"\t");
            }
            System.out.println();
        }
    }
}
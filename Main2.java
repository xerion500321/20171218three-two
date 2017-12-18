import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int [][]data = new int[a][b];
        for(int i=0 ; i<a ; i++){
            for(int y=0 ; y<b ; y++){
                data[i][y]=scn.nextInt();
            }
        }
        for(int y=0 ; y<b ;y++){
            for(int i=0 ; i<a ;i++){
                System.out.print(data[i][y]+"\t");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        char[][] star = new char[b][a];

        for(int i = 0; i<star.length;i++){
            for(int j = 0; j<star[i].length;j++){
                star[i][j] = '*';
                System.out.print(star[i][j]);
            } System.out.println();
        }
    }
}
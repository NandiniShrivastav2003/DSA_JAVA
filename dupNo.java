package p1;

import java.util.Scanner;

public class dupNo {
    static int[][] marks;
    dupNo(){
        marks=new int[4][5];
    }
    void avgMarksStu(){
        int sum=0;
        int c=0;
        for(int i=0;i< 4;i++){
            for(int j=0;j<5;j++){
                sum+=marks[i][j];
            }
            System.out.println(sum/5);
            if(sum/4 < 50){
                c++;
            }
            sum=0;
        }
        System.out.println("students who have scored less than 50 in their average= "+ c );

    }
    void avgMarksInSub(){
        int sum=0;

        for(int i=0;i< 5;i++){
            for(int j=0;j<4;j++){
                sum+=marks[j][i];
            }
            System.out.println("avg marks of student " + i+1);
            System.out.println(sum/4);

            sum=0;
        }


    }
    void displayScores(){
for(int i=0;i<4;i++){
    System.out.println("Marks obtained by student=" + i+1);
    for(int j=0;j<5;j++){
        System.out.println(marks[i][j] + " ");
    }
    System.out.println("\n");
}
    }

    public static void main(String[] args) {
        dupNo obj=new dupNo();
        Scanner s=new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                marks[i][j]=s.nextInt();
            }
        }
      obj.avgMarksInSub();
        obj.avgMarksStu();
        obj.displayScores();
    }
}

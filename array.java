import java.util.*;
public class array {
    public static void update(int marks[] ,int nonchangebable){
        nonchangebable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int marks[] = {97, 98, 99};
        int nonchangebable =5;
        update(marks,nonchangebable);
        System.out.println(nonchangebable);

       
        //print out marks
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+"");
        }
        System.out.println();

    }
}
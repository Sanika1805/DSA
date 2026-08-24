// import java.util.*;

public class equal {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // // using "=="
        // if(s1 == s2){
        //     System.out.println("s1 and s2 are equal");
        // }
        // else{
        //     System.out.println("s1 and s2 are not equal");
        // }

        // if(s1 == s3){
        //     System.out.println("s1 and s3 are equal");
        // }
        // else{
        //     System.out.println("s1 and s3 are not equal");
        // }


        //// "==" consider its position 
        //// as s1 and s2 points same string nut new string points diff
        //// so when want to check value then use "s1.equal(s3)" function 

        // equal function
        if(s1.equals(s2)){
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("s1 and s3 are equal");
        }
        else{
            System.out.println("s1 and s3 are not equal");
        }       
    }
}

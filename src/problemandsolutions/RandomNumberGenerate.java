package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.
    public static void main(String[] args) {

        int [] stID=new int[10];
        Random ran= new Random(1);
        for (int i=1;i<=8;i++){
            stID[i]=ran.nextInt(8);


        }

        for (int i=1;i<stID.length;i++){
            System.out.println(stID[i]);


        }


    }

}


import java.util.Scanner;

public class Vowels
{

    public static void main(String[]args)
    {
        System.out.print("Enter The String:");
        Scanner s1 =new Scanner(System.in);
        String sentence = s1.nextLine();

        int count =0 ;

        for (int i=0 ;i<sentence.length();i++)
        {

            //Char letter = sentence.charAt(i) ;
            String letter = Character.toString(sentence.charAt(i)).toLowerCase();




            switch (letter)
            {

                case "a" :
                    count++ ;
                    break;


                case "e" :
                    count++ ;
                    break;



                case "i" :
                    count++ ;
                    break;



                case "o" :
                    count++ ;
                    break;


                case "u" :
                    count++ ;
                    break;

            }


        }

        System.out.println("Count for Vowels :::"+ count);


    }
}
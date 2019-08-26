import java.util.Scanner;

public class VCcheck
{
    public static void main(String args[])
    {
        int v=0,c=0;
        Scanner s= new Scanner(System.in);
        System.out.println(" Enter any string");

        String p=s.nextLine().toLowerCase();

        char k[]= p.toCharArray();



        for (int i = 0; i <k.length ; i++)
        {
            if ((k[i]=='a')||(k[i]=='e')||(k[i]=='i')||(k[i]=='o')||(k[i]=='u'))
            {
                v++;
            }
            else{
                if(k[i]>='a'&&k[i]<='z')
                {
                    c++;
                }
                else
                {
                    System.out.println("Number/special character is used :"+k[i]);

                }
            }

        }

        System.out.println("The total number of vowel is :"+v+" and consonant :"+c);





    }
}

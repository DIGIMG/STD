package p1;

import java.util.Scanner;
public class main {
    public static final int t_dars = 3;
    public static final int t_std = 3;



    public static void main(String[] args) {
        String name;
        float[] number= new float[t_std];
        Scanner input = new Scanner(System.in);
         studednt[] std= new studednt[t_std];


        for(int q=0;q<t_std;q++) /* دریافت نام دانش آموز */
        {
            System.out.println("Please Enter name "+q+1);
            name = input.next();
            std[q] = new studednt();
            std[q].setname(name);

            for(int w=0;w<t_dars;w++) /* دریافت نمرات دروس */
            {
                System.out.println("Please Enter Number"+ w+1);
                number[w] = Float.parseFloat(input.next());
                std[q].setnumber(number[w]);
            }

        }

   for(int r=0;r<t_std;r++)
   {
       System.out.println("Name = " + std[r].getname() );
       System.out.println("Avverage ="+ std[r].getavv() );
   }



    }



}

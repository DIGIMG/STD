public class studednt {
public static final int t_dars = 3;
public static final int t_std = 3;
String tempname;
double[] tempnumber = new double[3];
int setindex=0;
double sum =0 ;
double avverage = 0 ;


public void setname(String name)
{
    tempname = name ;
}
public String getname()
{
    return tempname;
}
public void setnumber(double number)
{
    tempnumber[setindex] = number;
    setindex++;
}

public double getavv()
{
    for (int e =0 ; e < t_dars;e++)
    {
        sum =+ tempnumber[e];
    }
    avverage = sum / t_dars;
    return avverage;
}



}

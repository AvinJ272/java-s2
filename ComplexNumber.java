import java.util.Scanner;
class ComplexNumber
{
    double real,img;
    ComplexNumber(double r,double i)
    {
        real=r;
        img=i;
    }
    public static ComplexNumber Sum(ComplexNumber C1,ComplexNumber C2)
    {
        ComplexNumber temp=new ComplexNumber(0,0);
        temp.real=C1.real+C2.real;
        temp.img=C1.img+C2.img;
        return temp;
    }
    public static void main(String args[])
    {
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real part of first Complex Number:");
        a=sc.nextInt();
        System.out.println("Enter the imaginary part of first Complex Number:");
        b=sc.nextInt();
        System.out.println("Enter the real part of second Complex Number:");
        c=sc.nextInt();
        System.out.println("Enter the imaginary part of second Complex Number:");
        d=sc.nextInt();
        ComplexNumber C1=new ComplexNumber(a,b);
        ComplexNumber C2=new ComplexNumber(c,d);
        ComplexNumber temp=Sum(C1,C2);
        System.out.println("Sum is :" + temp.real + "+" +temp.img+"i");
    }

}
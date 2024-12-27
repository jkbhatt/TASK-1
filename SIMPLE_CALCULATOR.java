package tools;
import java.util.*;
public class calc 
{
    public void sum(int a, int b)
    {
        int ans;
        ans = a+b;
        System.out.println("sum of a and b is:" + ans);
    } 
    public void sub(int a, int b)
    {
        int ans;
        ans = a-b;
        System.out.println("sub of a and b is:" + ans);
    } 
    public void multi(int a, int b)
    {
        int ans;
        ans = a*b;
        System.out.println("multiplication of a and b is:" + ans);
    } 
    public void div(int a, int b)
    {
        int ans;
        ans = a/b;
        System.out.println("Division of a and b is:" + ans);
    } 
    public static void main(String[] args) 
    {   
        int i,j;
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the value of A:");
        i= obj.nextInt();

        System.out.println("Enter the vlaue of B:");
        j= obj.nextInt();

        calc ob = new calc();
        ob.sum(i, j);
        ob.sub(i, j);
        ob.multi(i, j);
        ob.div(i, j);

        obj.close();
    }   
}

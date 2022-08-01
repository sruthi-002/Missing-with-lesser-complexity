package com.company;
import java.util.Scanner;
import java.util.*;
class missing
{
    public void  missingelement()
    {
        int count=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,j,miss=0;
        ArrayList<Integer>a = new ArrayList<Integer>();
        for(i=0;i<n;i++)
            a.add(in.nextInt());
        Collections.sort(a);
        for(i=1;i<n;i++)
        {
            if(a.get(i-1)==a.get(i))
                count++;
            if(a.contains(i+1))
                miss++;
            j =i+1;
            if (miss == 0) {
                System.out.println("The missing element is " + " " +j);
            }
            if(count>=1)
                System.out.println("The Duplicate element is "+" "+a.get(i));
            count=0;
            miss=0;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        missing m =new missing();
        m.missingelement();
    }
}

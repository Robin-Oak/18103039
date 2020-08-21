package com.company;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int[] a= new int[26];
        int[] b = new int[26];
        int ch=0;
        System.out.println("Choicews avaliable:-");
        System.out.println("1. Alphabetic sequence");
        System.out.println("2. Numeric sequence");
        System.out.println("Enter your Choice");
        ch=sc.nextInt();
        sc.nextLine();
        switch (ch)
        {

            case 1:
                System.out.println("Enter an alphabetic aequence");
                String na = sc.nextLine();
                String lna = na.toLowerCase();
                //System.out.println(lna);

                System.out.println("Enter another alphabetic sequence");
                String nb = sc.nextLine();
                String lnb = nb.toLowerCase();
                //System.out.println(lnb);

                int n1 = na.length();
                int n2 = nb.length();
                if(n1==n2)
                {
                    System.out.println("Length of strings is equal");

                    for(int i=0;i<n1;i++)
                    {
                        a[na.charAt(i)- 'a']++;
                    }
                    for(int j=0;j<n2;j++)
                    {
                        b[nb.charAt(j) - 'a']++;
                    }
                    int flag=0;
                    for(int k=0;k<26;k++)
                    {
                        if(a[k]!=b[k])
                        {
                            flag=1;
                        }
                    }
                    if(flag==0)
                    {
                        System.out.println("Is an anagram");
                    }
                    else
                    {
                        System.out.println("Not an anagram");
                    }
                }
                else
                {
                    System.out.println("Not an anagram as length is not equal");
                }
            case 2:
                int[] c= new int[10];
                int[] d = new int[10];
                System.out.println("Enter an numeric sequence");
                String ca = sc.nextLine();
                System.out.println("Enter an numeric sequence");
                String db = sc.nextLine();

                int n3 = ca.length();
                int n4 = db.length();
                if(n3==n4)
                {
                    System.out.println("Length of strings is equal");

                    for(int i=0;i<n3;i++)
                    {
                        a[ca.charAt(i)-'0']++;

                    }
                    for(int j=0;j<n4;j++)
                    {
                        b[db.charAt(j)-'0']++;
                    }
                    int flag=0;
                    for(int k=0;k<10;k++)
                    {
                        if(a[k]!=b[k])
                        {
                            flag=1;
                        }
                    }
                    if(flag==0)
                    {
                        System.out.println("Is an anagram");
                    }
                    else
                    {
                        System.out.println("Not an anagram");
                    }
                }
                else
                {
                    System.out.println("Not an anagram as length is not equal");
                }
        }
    }
}

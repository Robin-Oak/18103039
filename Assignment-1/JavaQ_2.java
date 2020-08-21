package com.company;

import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
 

                System.out.println("Enter a string:-");
                String na = sc.nextLine();
                int n1 = na.length();                // n1 string length
                String arr[]=na.split("\\ ");
                int n2= arr.length;               // n2 split array length
                // System.out.println(n2);
                Vector v = new Vector();
                int ch =0;
                int br=0;
                int dx=0;

                System.out.println("Enter total number of strings you want to change:-");
                ch=sc.nextInt();
                sc.nextLine();
                for(int i =1;i<=ch;i++)
                {
                    System.out.println("Enter "+ i+" string:-");
                    String nb = sc.nextLine();
                    v.add(nb);
                }
                int x=0;
                for(int k=0;k<n2;k++)
                {
                    if(v.contains(arr[k]))
                    {
                        x++;
                        char[] brr = arr[k].toCharArray();
                        int n3= brr.length;
                        //System.out.println(n3);
                        char[] a = new  char[n3];
                        for(int i=0;i<n3;i++)
                        {
                            if(i==0)
                            {
                                a[i]=brr[0];
                            }
                            else
                            {
                                a[i]='*';
                            }

                        }
                        System.out.print(a);
                    }
                    else
                    {

                        System.out.print(arr[k]);
                        // break;
                    }
                    System.out.println(" ");
                }
//                break;
//        }
    }
}

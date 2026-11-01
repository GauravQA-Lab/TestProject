package com.java;

public class PalindromeString
{
    public static void main(String args[])
    {
        PalindromeString obj = new PalindromeString();
        String result= obj.getPalindromeString();
        System.out.println(result);
    }
    public String getPalindromeString()
    {
        String resultInString=" ", inputString= "dad";
        char inchararray[]=inputString.toCharArray();
        int i,j, count=0;
        j=inchararray.length-1;
        for(i=0;i<=inchararray.length-1;i++)
        {

            if(inchararray[i]==inchararray[j])
            {
                count++;
                System.out.println(inchararray[i]+" "+inchararray[j]);
                j--;
            }
        }
        if(count==inchararray.length)
        {
            return resultInString = inputString + " is a Palindrome String";
        }
        else {
            {
                return resultInString = inputString + " is NOT A Palindrome String";
            }
        }
    }
}


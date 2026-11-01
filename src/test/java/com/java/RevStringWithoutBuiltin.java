package com.java;
public class RevStringWithoutBuiltin
{
public static void main(String args[])
{
RevStringWithoutBuiltin obj= new RevStringWithoutBuiltin();
obj.reverseStringWithoutBuiltInMethod();
}
public void reverseStringWithoutBuiltInMethod()
{
    int i;
    String rev= " ", inputString ="This is Java";
    String strArray[]= inputString.split(" ");
    for(i = strArray.length-1; i>=0; i--)
    {
        rev=rev+strArray[i]+" ";
    }
    System.out.println(rev);
}
}

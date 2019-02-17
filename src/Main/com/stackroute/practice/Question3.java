package com.stackroute.practice;

public class Question3 {
   class  MemberVariable {


      public String[] isMember(String name, int age, double salary)
      {
          String a=String.valueOf(age);
          String sal=String.valueOf(salary);
          String[] str= new String[3];
          str[0]=name;
          str[1]=a;
          str[2]=sal;
         return str;
      }
  }
}

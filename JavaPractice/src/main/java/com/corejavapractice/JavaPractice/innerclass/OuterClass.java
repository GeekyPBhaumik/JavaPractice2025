package com.corejavapractice.JavaPractice.innerclass;

public class OuterClass {

    private String outerClassVariable = "OuterClass variable called";

    class MemberInnerClass{
        public void display(){
            System.out.println("Inside Member Inner Class:"+outerClassVariable);
        }
    }

    public void localInnerClassMethod(){
        class MethodLocalInnerClass{
            public void display(){
                System.out.println("Calling Method Local Inner Class");
            }
        }
        MethodLocalInnerClass innerObj = new MethodLocalInnerClass();
        innerObj.display();
    }

    static class StaticInnerNestedClass{
      public void display(){
          System.out.println("Calling static nested Inner Class");
      }
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.MemberInnerClass innerClassObj = outerObj.new MemberInnerClass();
        innerClassObj.display();

        outerObj.localInnerClassMethod();
        OuterClass.StaticInnerNestedClass staticInnerNestedClassObj = new OuterClass.StaticInnerNestedClass();
        staticInnerNestedClassObj.display();
    }
}

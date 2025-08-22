package com.corejavapractice.JavaPractice.innerclass;

/*
Anonymous Class is an inner class which reduces the boilerplate code of
implementing an interface or extending a concrete class or an abstract class in a concise manner.
An Anonymous class is a class without a name.
It is also used to create a Runnable or Callable object
Without Anonymous class, we earlier needed to have a separate class that implements an interface
or extends a concrete or abstract class. With Anonymous class, no need of writing a separate class
*/
interface Greetings{
     void sayWish();
}

class NormalClassWithoutAnonymous implements Greetings{
    @Override
    public void sayWish(){
        System.out.println(" ================ Calling via a normal class ================= ");
        System.out.println("Good Morning");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Greetings withoutAnonymousObj = new NormalClassWithoutAnonymous();
        withoutAnonymousObj.sayWish();

        //Anonymous Inner Class
        Greetings anonymousObj = new Greetings() {
            @Override
            public void sayWish() {
                System.out.println(" =============== Calling via an anonymous inner class =================== ");
                System.out.println("Good Morning");
            }
        };
        anonymousObj.sayWish();
    }
}

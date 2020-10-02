package OOP.Abstract;

abstract public class MyClass {
    abstract void myFun();
}

class Help extends MyClass{
    void myFun(){
        System.out.println("Inside from Abstract Class");
    }
}
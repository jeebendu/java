package src.com.jee.oops;

class Bike{  
    void run(){System.out.println("Bike is running");}  
  }  


  class Splendor extends Bike{  
    void run(){System.out.println("Splendor Bike running safely with 60km");}  

    void color(){System.out.println("Splendor Bike color is red");}
    
    public static void main(String args[]){
        //Splendor s = new Bike();//downcasting //compile error   
        Bike b = new Splendor();//upcasting 
        b.run();  
        //b.color();//compile error

        Splendor s = new Splendor();
        s.run();
        s.color();
    }  
  }  

// Cat is a cute animal
class Animal {
    void print(){System.out.println("animal.");}
}
class Cat extends Animal{

    boolean isCute(){return true;}

    void print(){
        System.out.println("Cat is a "+ (isCute()?"Cute":"") );
    }

    public static void main(String args[]){
        Cat c = new Cat();
        c.print();
    }
    
}



class Adder{  
    //static int add(int a,int b){return a+b;}  
    static int add(int a,int b){return a+b;}  
    //static double add(int a,int b){return a+b;}  
    }  
    class TestOverloading3{  
    public static void main(String[] args){  
    int x =1;
    //int x=2; 
    System.out.println(Adder.add(11,11)); 
    }

    
}  




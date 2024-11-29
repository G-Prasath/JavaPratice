class Animal{
    String name;

    Animal(String name){
        this.name = name;
        System.out.println(name);
    }

    void makeSound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal{
    Dog(String name){
        super(name);
    }
}


public class SuperClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Super Class");
    }
}

class Animal{
public void eat(){
System.out.println("I can eat");
}
}
class Dog extends Animal{
public void eat(){
System.out.println("I eat dog food");
}
public void bark(){
System.out.println("I can bark");
}
}
class Main{
public static void main(String args[]){
Dog labrador=new Dog();
labrador.eat();
labrador.bark();
}
}
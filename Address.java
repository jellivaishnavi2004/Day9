class Address{
String city,state,country;
public Address(String city,String state,String country){
this.city=city;
this.state=state;
this.country=country;
}
}
class Employe{
int id;
String name;
Address address;
public Employe(int id,String name,Address address){
this.id=id;
this.name=name;
this.address=address;
}
void display(){
System.out.println(id+" "+name);
System.out.println(address.city+" "+address.state+" "+address.country);
}
public static void main(String args[]){
Address address1=new Address("gzb","up","india");
Address address2=new Address("gpo","up","india");
Employe e1=new Employe(111,"vaishu",address1);
Employe e2=new Employe(111,"chinnu",address2);
e1.display();
e2.display();
}
}

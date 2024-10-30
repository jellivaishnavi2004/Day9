class Employe{
float salary=40000;
}
class Programmer extends Employe{
int bonus=10000;
}
class TestInheritance{
public static void main(String args[]){
Programmer p=new Programmer();
System.out.println("Programmer salary is:"+p.salary);
System.out.println("Bonus of Progarammer is:"+p.bonus);
}
}

class Author
{
String autherName;
int age;
String place;
Author(String name,int age,String place)
{
this.autherName=name;
this.age=age;
this.place=place;
}
}
class Book{
String name;
int price;
Author auther;
Book(String n,int p,Author auther)
{
this.name=n;
this.price=p;
this.auther=auther;
}
public static void main(String args[]){
Author auther=new Author("john",43,"usa");
Book b=new Book("java for begginers",977,auther);
System.out.println("Book Name:"+b.name);
System.out.println("Book Price:"+b.price);
System.out.println("-----------Auther details--------------");
System.out.println("Author Name:"+b.auther.autherName);
System.out.println("Author Age:"+b.auther.age);
System.out.println("Author Place:"+b.auther.place);
}
}

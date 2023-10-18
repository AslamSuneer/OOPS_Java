class employee
{
int age;
int salary;
int phnum;
String name;
String add;
void printsalary(){
System.out.println("name : "+name+"\nsalary : "+salary);
}
}

class officer extends employee
{
String specialization;
String department;
void display(){
System.out.println("age : "+age+"\nphone number : "+phnum+"\naddress : "+add+"\nspecialization : "+specialization+"\ndepartment : "+department);
}
}


class manager extends employee
{
String specialization;
String department;
void display(){
System.out.println("age : "+age+"\nphone number : "+phnum+"\naddress : "+add+"\nspecialization : "+specialization+"\ndepartment : "+department);
}
}

public class emp
{
public static void main(String[] args)
{
officer ob = new officer();
ob.age=31;
ob.salary=50000;
ob.phnum=123456789;
ob.name="Varun";
ob.add="Nehru nagar,Delhi";
ob.specialization="Data Structure";
ob.department="Computer Science";
ob.printsalary();
ob.display();

System.out.println();

manager obj = new manager();
obj.age=25;
obj.salary=45000;
obj.phnum=987654321;
obj.name="Arun";
obj.add="Green valley,Nagpur";
obj.specialization="oops";
obj.department="Computer Science";
obj.printsalary();
obj.display();
}
}

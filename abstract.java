abstract class shape{
abstract void noofsides();
}
class triangle extends shape{
void noofsides(){
System.out.println("No.of sides of Triangle is 3");
}
}
class rectangle extends shape{
void noofsides(){
System.out.println("No.of sides of Rectangle is 4");
}
}
class hexagon extends shape{
void noofsides(){
System.out.println("No.of sides of hexagon is 5");
}
}
class sides{
public static void main(String[] args){
triangle t=new triangle();
rectangle r=new rectangle();
hexagon h=new hexagon();
shape obj;
obj=t;
obj.noofsides();
obj=r;
obj.noofsides();
obj=h;
obj.noofsides();
}
}

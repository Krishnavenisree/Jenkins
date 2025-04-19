import java.io.*;
import java.util.*;
class A
{
int x=23;
}
class B extends A
{
int y=33;
void display()
{
System.out.println(super.x);
}
public static void main(String args[])
{
B obj=new B();
obj.display();
}
}
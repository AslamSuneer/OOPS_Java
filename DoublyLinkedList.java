import java.util.*;
class DoublyLinkedList
{
Node head = null;
class Node
{
int data;
Node prev;
Node next;
public Node (int data)
{
this.data = data;
this.next = null;
this.prev = null;
}
}
public void insert(int data)
{
Node temp = new Node(data);
if (head == null)
{head = temp; }
else
{
Node ptr = head;
while (ptr.next != null)
{
ptr=ptr.next;
}
ptr.next = temp;
temp.prev = ptr;
}
System.out.print(data+" is entered\n");
}
public void delete()
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the element to be deleted: ");
int key=sc.nextInt();
Node temp;
Node bef;
if (head == null)
System.out.print("List is empty\n");
else if (head.next == null)
{
if (head.data == key)
{
int data= head.data;

head =null;
System.out.print(data + "deleted\n");
}
else
 System. out.print("Element not found!\n");
}
else
{
temp=head;
while(temp!= null)
{
if(temp.data==key)
{
    if (temp==head)
{
int data=head.data;
head=head.next;
head.prev = null;
System.out.print(data+" is deleted\n");
break;
}
int data =temp.data;
temp.prev.next=temp.next;
if (temp.next!=null)
temp.next.prev=temp.prev;
System.out.print(data+" is deleted\n");
break;
}
bef=temp;
temp=temp.next;
}
if(temp==null)
System.out.print("Element not found!\n");
}
}
public void display()
{
Node temp=head;
if (head ==null)
System.out.print("List is empty");
else
{
while(temp != null)
{
System.out.print(temp.data+" "); temp=temp.next;
}
}
System.out.print("\n");
}
}
class DoublyLL
{
public static void main(String args[])
{
DoublyLinkedList dll =new DoublyLinkedList();
int opt = 0;
System.out.print("\n1)Insert Element\n");
System.out.print("2) Delete element\n"); 
System.out.print("3) Display linked List\n");
System.out.print("4) Exit");
while(opt != 4)
{
System.out.print("\nEnter your choice : "); 
Scanner sc = new Scanner(System.in); 
opt = sc.nextInt();
switch(opt)
{
case 1:{
 System.out.print("Enter the element: "); 
 int data = sc.nextInt(); 
 dll.insert(data); break;
}
case 2:{dll.delete(); break;}
case 3:{dll.display(); break;}
case 4:{break; }
default:{System.out.print("Invalid choice ");break;
}}}}}

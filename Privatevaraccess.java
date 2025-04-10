import java.util.*;

class Parent
{
	public int publicVar = 10;
	
	private int privateVar = 20;
	
	public int getter() {
		return privateVar;
	}
}

class Child extends Parent
{
	public void accessvar()
	{
		System.out.println("Public variable : " + publicVar);
		System.out.println("Private variable : " + getter());
	}

}

public class Privatevaraccess 
{
	public static void main(String[] args) 
	{
		Child child = new Child();
		child.accessvar();
	}
}

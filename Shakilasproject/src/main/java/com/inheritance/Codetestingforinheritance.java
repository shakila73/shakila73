package com.inheritance;

public class Codetestingforinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   //polymorphism is one of the oops concept.it means many forms.
		                            
		Childclass obj=new Childclass();// if same method in both childclass and parent class,then child class will
		                                  //override the parentclass and this is called overriding polymorphism//
		                              //overloading polymorphism: same method name over and over with diff argument 
		                                //in the same class is oveloading polymorpphism.
		obj.getadd();
		obj.getName();
		obj.Getticket();
		
		Parentclass obj2= new Parentclass();
		obj2.getcountry();
		obj2.Getsomething();
		
		Childclass obj3= new Childclass();
		obj3.add();
		obj3.add(10, 20);
		
	}
	
	

}

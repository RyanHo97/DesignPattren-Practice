package com.atguigu.principle.segregation;

public class Segregation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//接口
interface Interface1{
	void operation1();
	void operation2();
	void operation3();
	void operation4();
	void operation5();
}

class B implements Interface1{
	public void operation1(){
		System.out.println("B实现了 operation1");
	}
	public void operation2(){
		System.out.println("B实现了 operation1");
	}
	public void operation3(){
		System.out.println("B实现了 operation1");
	}
	public void operation4(){
		System.out.println("B实现了 operation1");
	}
	public void operation5(){
		System.out.println("B实现了 operation1");
	}
}

class D implements Interface1{
	public void operation1(){
		System.out.println("D实现了 operation1");
	}
	public void operation2(){
		System.out.println("D实现了 operation1");
	}
	public void operation3(){
		System.out.println("D实现了 operation1");
	}
	public void operation4(){
		System.out.println("D实现了 operation1");
	}
	public void operation5(){
		System.out.println("D实现了 operation1");
	}
}

class A {
	public void depend1(Interface1 i){
		i.operation1();
	}
	public void depend2(Interface1 i){
		i.operation1();
	}
	public void depend3(Interface1 i){
		i.operation1();
	}
}

class C {
	public void depend1(Interface1 i){
		i.operation1();
	}
	public void depend4(Interface1 i){
		i.operation1();
	}
	public void depend5(Interface1 i){
		i.operation1();
	}
}

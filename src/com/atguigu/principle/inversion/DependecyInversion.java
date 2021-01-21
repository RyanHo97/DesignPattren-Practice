package com.atguigu.principle.inversion;

public class DependecyInversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.receive(new Email());
	}

}

class Email{
	public String getInfo(){
		return "电子邮件信息：hello,world";
	}
}

//方式2分析
class Person{
	public void receive(Email email){
		System.out.println(email.getInfo());;
		
	}
}
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
		return "�����ʼ���Ϣ��hello,world";
	}
}

//��ʽ2����
class Person{
	public void receive(Email email){
		System.out.println(email.getInfo());;
		
	}
}
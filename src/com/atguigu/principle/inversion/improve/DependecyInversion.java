package com.atguigu.principle.inversion.improve;

public class DependecyInversion {

	public static void main(String[] args) {
		//客户端无需改变
		Person person = new Person();
		person.receive(new Email());
		person.receive(new WeiXin());
	}

}


//定义接口
interface IReceiver{
	public String getInfo();
}

class Email implements IReceiver{
	public String getInfo(){
		return "电子邮件信息：hello,world";
	}
}

class WeiXin implements IReceiver{
	public String getInfo(){
		return "微信信息：hello,ok";
	}
}

//完成Person接收消息的功能
//方式2
class Person{
	public void receive(IReceiver receiver){
		System.out.println(receiver.getInfo());;
		
	}
}
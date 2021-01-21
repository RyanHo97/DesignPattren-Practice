package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility2 {
	public static void main(String[] args){
		RoadVehicle roadvehicle = new RoadVehicle();
		roadvehicle.run("Ħ�г�");
		roadvehicle.run("����");
		
		AirVehicle airvehicle = new AirVehicle();
		airvehicle.run("�ɻ�");
	}
}

//��ʽ2�ķ���
//1.���ص�һְ��ԭ��
//2.�����������ĸĶ��ܴ󣬼�����ֽ⣬ͬʱ�޸Ŀͻ���
//3.�Ľ���ֱ���޸�Vehicle�࣬�Ķ��Ĵ����Ƚ���=>����3

class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "��·����....");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "�������....");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "ˮ������....");
	}
}
package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility2 {
	public static void main(String[] args){
		RoadVehicle roadvehicle = new RoadVehicle();
		roadvehicle.run("摩托车");
		roadvehicle.run("汽车");
		
		AirVehicle airvehicle = new AirVehicle();
		airvehicle.run("飞机");
	}
}

//方式2的分析
//1.遵守单一职责原则
//2.但是这样做的改动很大，即将类分解，同时修改客户端
//3.改进：直接修改Vehicle类，改动的代码会比较少=>方案3

class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "公路运行....");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "天空运行....");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + "水中运行....");
	}
}
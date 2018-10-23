package com.example.util;

import java.util.UUID;

public class PlantUuid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//moreUuid(10);
	}

	//得到32位的uuid
	public static  String createUuid32() {
		String uuid = "";
		uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		System.out.print("---生成的uuid是---"+uuid+"\n");
		return uuid;
	}
	

	//一次生成多个uuid
	public static  String  moreUuid(Integer t) {
		String more_uuid = "";
		Integer k = 0;
		for (k=0;k<t;k++) {
			more_uuid = createUuid32();
		}
		return more_uuid;
	}
}

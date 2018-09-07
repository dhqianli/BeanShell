package com.jmeter.beanshell.testcase;




public class beanshell{
	
	
	public static void main(String[] args) {
		//加密
		System.out.println("*****加密*****");
		String password = "123123";
		//调用工具类中的方法进行加密
		String encode = SecurityUtils.getKey(password);
		System.out.println("Set my encode");
		//把值保存到jmeter变量encode中
		vars.put("encode",encode);
		String getEncode=vars.get("encode");
		System.out.println("Get my encode: " + getEncode);
	}

}

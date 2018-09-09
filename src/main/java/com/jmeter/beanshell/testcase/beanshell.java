package com.jmeter.beanshell.testcase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class beanshell{

	
	
	public void getdate() {
		try {
			//获取当前时间
			Date date = new Date();
			SimpleDateFormat SD = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
			String nowDate = SD.format(date);
			//通过日历获取明天的日期
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(SD.parse(nowDate));
			calendar.add(calendar.DAY_OF_YEAR, +3);
			String chanceDate = SD.format(calendar.getTime());
			calendar.add(calendar.DAY_OF_YEAR, +7);
			String planFinishDate = SD.format(calendar.getTime());
			vars.put("chanceDate",chanceDate);
			vars.put("planFinishDate",planFinishDate);
		} catch (Exception e) {
			// TODO: handle exception
		}

		
}
}

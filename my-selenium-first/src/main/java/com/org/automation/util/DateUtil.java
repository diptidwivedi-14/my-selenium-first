package com.org.automation.util;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class DateUtil {

	public static String getCurrentDate() {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
		String str = formatter.format(date);
		return str;

	}
	public static String getCurrentTime() {
		
		StringBuffer sb = new StringBuffer();
		
		LocalTime obj = LocalTime.now();
		
		sb.append(String.valueOf(obj.getHour())).append("-")
			.append(String.valueOf(obj.getMinute())).append("-")
			.append(String.valueOf(obj.getSecond()));
		
		return sb.toString();

	}
	
	public static String getScreenshotPathName(String lableName) {
		String pathName = "C:\\Test\\"+ getCurrentDate() +"\\"+ lableName + "_" + getCurrentTime() + ".png";
		
		return pathName;
	}

}

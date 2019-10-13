package com.example.common;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class CustomDateConverter implements Converter<String, Date>{

	public Date convert(String source) {
		// TODO Auto-generated method stub
		// 实现日期串转成日期类型
		SimpleDateFormat simpleDateFormat =new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		try {
			return simpleDateFormat.parse(source);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 绑定失败返回null
		return null;
	}

}

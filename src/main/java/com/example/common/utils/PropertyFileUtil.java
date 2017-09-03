package com.example.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 配置文件操作类
 * 
 * @author gululu
 * 
 */
public class PropertyFileUtil {
	/**
	 * 获取属性配置文件对应值
	 * 
	 * @param key
	 * @return
	 */
	public static String getValue(String key) {
		Properties p = new Properties();
		try {
			InputStream in = PropertyFileUtil.class
					.getResourceAsStream("/application.properties");// 这里有人用new
			// FileInputStream(fileName),不过这种方式找不到配置文件。有人说是在classes下，我调过了，不行。
			BufferedReader bf = new BufferedReader(new InputStreamReader(in,
					"UTF-8"));
			p.load(bf);
			
			in.close();
			
		} catch (IOException ex) {
		}

		return p.getProperty(key);
	}
}

package com.example.common.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@MapperScan("com.example.dao")
public class MyBatisConfig {
	@PropertySource(value = "application.properties")
	@Component
	@ConfigurationProperties(prefix = "spring.datasource")
	static class JdbcConfig {
		/** * 数据库用户名 */
		private String username;
		/** * 驱动名称 */
		private String driverClassName;
		/** * 数据库连接url */
		private String url;
		/** * 数据库密码 */
		private String password;

		@Bean
		public DataSource createDataSource() throws SQLException {
			return DataSourceBuilder.create(Thread.currentThread().getContextClassLoader()).driverClassName(driverClassName).url(url).username(username).password(password).build();
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getDriverClassName() {
			return driverClassName;
		}

		public void setDriverClassName(String driverClassName) {
			this.driverClassName = driverClassName;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	}
}

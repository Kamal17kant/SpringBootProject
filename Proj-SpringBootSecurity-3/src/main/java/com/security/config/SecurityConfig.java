package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	public PasswordEncoder passwordEncder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService useDetailService() {
		UserDetails normalUser=User
				.withUsername("kamal")
				.password(passwordEncder().encode("123"))
				.roles("NORMAL")
				.build();
		UserDetails adminUser=User
				.withUsername("kamalkant")
				.password(passwordEncder().encode("123"))
				.roles("ADMIN")
				.build();
		InMemoryUserDetailsManager imud=new InMemoryUserDetailsManager(normalUser,adminUser);
		return imud;
	}

	@Bean 
	public SecurityFilterChain filterchain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable()
			.authorizeHttpRequests()
			.requestMatchers("/home/public")
			.permitAll()
			.anyRequest()
			.authenticated()
			.and()
			.formLogin();
		return httpSecurity.build();
		
	}
}

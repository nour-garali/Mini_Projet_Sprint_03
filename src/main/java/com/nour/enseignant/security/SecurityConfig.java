package com.nour.enseignant.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
 @Override
 protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	 
	 PasswordEncoder passwordEncoder = passwordEncoder ();

	 auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder.encode("123")).roles("ADMIN");
	 auth.inMemoryAuthentication().withUser("nour").password(passwordEncoder.encode("123")).roles("AGENT","USER");
	 auth.inMemoryAuthentication().withUser("user1").password(passwordEncoder.encode("123")).roles("USER");

}
 
 @Override
 protected void configure(HttpSecurity http) throws Exception {
 http.authorizeRequests().antMatchers("/showCreate").hasAnyRole("ADMIN","AGENT");
 http.authorizeRequests().antMatchers("/saveEnseignant").hasAnyRole("ADMIN","AGENT");
 http.authorizeRequests().antMatchers("/listeEnseignants").hasAnyRole("ADMIN","AGENT","USER");
 
 http.authorizeRequests().antMatchers("/supprimerEnseignant","/modifierEnseignant","/updateEnseignant").hasAnyRole("ADMIN");
 http.exceptionHandling().accessDeniedPage("/accessDenied");
 
 http.authorizeRequests().anyRequest().authenticated();
 http.formLogin();
 
 }

 @Bean
 public PasswordEncoder passwordEncoder () {
 return new BCryptPasswordEncoder();
 }
 
 

}
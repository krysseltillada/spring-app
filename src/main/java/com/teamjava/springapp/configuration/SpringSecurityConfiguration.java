package com.teamjava.springapp.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.session.HttpSessionEventPublisher;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration {
	@Configuration
	public static class SpringSecurityClientAdapterConfiguration extends WebSecurityConfigurerAdapter {
		@Autowired
		private DataSource dataSource;
		
		@Bean
		@Override
		public AuthenticationManager authenticationManagerBean() throws Exception {
			return super.authenticationManagerBean();
		}
		
		@Bean
		public HttpSessionEventPublisher httpSessionEventPublisher() {
		    return new HttpSessionEventPublisher();
		}
		
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.jdbcAuthentication()
				.dataSource(dataSource)
					.usersByUsernameQuery("SELECT username, password, enabled FROM USER_CLIENT WHERE username = ?")
					.authoritiesByUsernameQuery("SELECT username, authority FROM USER_CLIENT WHERE username=? AND (authority='CLIENT' OR authority='AD AGENCY' OR authority='VENDOR')");
		}

		@Override
		protected void configure(HttpSecurity http) throws Exception {

			http.antMatcher("/**")
				.authorizeRequests()
				//.antMatchers("/images/**").permitAll()
				//	.and()
				//.authorizeRequests()
				.antMatchers("/signup").anonymous()
					.and()
				.authorizeRequests()
				.antMatchers("/profile-settings/**",
							 "/my-billboards/**",
							 "/my-contracts/**",
							 "/websocket-notification/**",
							 "/notifications/**").hasAnyAuthority("CUSTOMER")
					.and()
				.formLogin()
					.loginPage("/login")
					.defaultSuccessUrl("/")
					.permitAll()
					.and()
				.logout()
					.logoutSuccessUrl("/login?logout")
					.permitAll()
					.and()
				.csrf()
					.ignoringAntMatchers("/h2-console/**",
										 "/delete-billboard-image/**",
										 "/show-more-reviews/**",
										 "/approved-contract/**",
										 "/disapproved-contract/**",
										 "/terminate-contract/**",
										 "/post-billboard/**",
										 "/unpost-billboard/**",
										 "/show-more-view-list/**",
										 "/show-more-rated-billboards/**",
										 "/show-more-reviewed-billboards/**",
										 "/show-more-latest-billboards/**",
										 "/show-more-profile-billboard/**",
										 "/get-company-information/**",
										 "/get-notification-count/**",
										 "/show-more-notification/**",
										 "/get-billboard-address/**",
										 "/get-billboard-name/**",
										 "/get-billboard-userClient/**",
										 "/subscribe/**",
										 "/unsubscribe/**")
					.and()
				.headers()
					.frameOptions()
					.sameOrigin();

		}
	}
	
	@Configuration
	@Order(1)
	public static class SpringSecurityAdminAdapterConfiguration extends WebSecurityConfigurerAdapter {
		@Autowired
		private DataSource dataSource;
		
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.jdbcAuthentication()
				.dataSource(dataSource)
					.usersByUsernameQuery("SELECT username, password, enabled FROM ADMIN where username = ?")
					.authoritiesByUsernameQuery("SELECT username, authority FROM ADMIN where username=? AND authority='ADMIN'");
		}

		@Override
		protected void configure(HttpSecurity http) throws Exception {

			http.antMatcher("/admin/**")
					.authorizeRequests()
					.anyRequest().hasAnyAuthority("ADMIN")
					.and()
				.authorizeRequests()
				.antMatchers("/admin/dashboard/**",
							 "/admin/add-product/**").hasAnyAuthority("ADMIN")
					.and()
				.formLogin()
					.loginPage("/admin")
					.defaultSuccessUrl("/admin/dashboard")
					.permitAll()
					.and()
				.logout()
					.logoutUrl("/admin/logout")
					.logoutSuccessUrl("/admin?logout")
					.permitAll()
					.and()
				.csrf()
					.ignoringAntMatchers("/super-admin/approved-billboard/**",
										 "/super-admin/disapproved-billboard/**",
										 "/super-admin/activate-account/**",
										 "/super-admin/deactivate-account/**",
										 "/super-admin/activate-admin-account/**",
										 "/super-admin/deactivate-admin-account/**",
										 "/super-admin/admin-change-authority/**",
										 "/super-admin/get-logoutime/**",
										 "/super-admin/get-date-approved/**",
										 "/super-admin/get-billboard-approved/**",
										 "/super-admin/get-registered-users/**",
										 "/super-admin/get-notification-count/**",
										 "/super-admin/show-more-notification")
					.and()
				.headers()
					.frameOptions()
					.sameOrigin();
		}

	}
	
	
	
}

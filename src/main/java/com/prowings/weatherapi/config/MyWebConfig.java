package com.prowings.weatherapi.config;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.Getter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.prowings.weatherapi")
@PropertySource("classpath:application.properties")
@Getter
public class MyWebConfig implements WebMvcConfigurer {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public DozerBeanMapper dozerBeanMapper() {
		DozerBeanMapper mapper = new DozerBeanMapper();
		mapper.setMappingFiles(Arrays.asList("dozer_mapping.xml"));
		return mapper;
	}

}
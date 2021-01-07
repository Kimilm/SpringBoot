package info.thecodinglive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.VersionResourceResolver;

import info.thecodinglive.controller.ExecuteTimeInterceptor;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public ExecuteTimeInterceptor executeTimeInterceptor() {
		return new ExecuteTimeInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(executeTimeInterceptor()).addPathPatterns("/**").excludePathPatterns("/");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/", "/assets/")
				.setCachePeriod(60) // 1년 60 * 60 * 24 * 365
				.resourceChain(true).addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"));
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}

}

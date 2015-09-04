package org.cheztone.config;

import org.cheztone.security.SecurityConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"org.cheztone.oauth","org.cheztone.security"})
@Import({SecurityConfig.class})
public class AppConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver
                = new InternalResourceViewResolver();
        viewResolver.setViewClass(InternalResourceView.class);
        viewResolver.setPrefix("/WEB-INF/html/");
        viewResolver.setSuffix(".html");
        return viewResolver;
    }

}
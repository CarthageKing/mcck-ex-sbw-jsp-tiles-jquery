package org.carthageking.mc.mcck.ex.sbw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

	public WebMvcConfig() {
		// noop
	}

	// this bean loads our tiles definitions
	@Bean
	TilesConfigurer tilesConfigurer() {
		TilesConfigurer tc = new TilesConfigurer();
		tc.setDefinitions("/WEB-INF/views/tiles/tiles-def.xml");
		tc.setCheckRefresh(true);
		return tc;
	}

	// tells Spring web context that we have a tiles view resolver
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		TilesViewResolver tvr = new TilesViewResolver();
		registry.viewResolver(tvr);
	}
}

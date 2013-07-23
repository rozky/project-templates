package com.rozarltd.sample.webapp.config

import org.springframework.context.annotation.{Bean, Configuration}
import org.thymeleaf.templateresolver.{ITemplateResolver, ServletContextTemplateResolver}
import org.thymeleaf.spring3.SpringTemplateEngine
import org.springframework.web.servlet.ViewResolver
import org.thymeleaf.spring3.view.ThymeleafViewResolver

@Configuration
class ViewEngineConfig {

    @Bean
    def templateResolver: ITemplateResolver = {
        val resolver: ServletContextTemplateResolver = new ServletContextTemplateResolver()
        resolver.setPrefix("/WEB-INF/templates/")
        resolver.setSuffix(".html")
        resolver.setTemplateMode("HTML5")
        resolver
    }

    @Bean
    def templateEngine: SpringTemplateEngine = {
        val engine: SpringTemplateEngine = new SpringTemplateEngine()
        engine.setTemplateResolver(templateResolver)
        engine
    }

    @Bean
    def viewResolver: ViewResolver = {
        val resolver: ThymeleafViewResolver = new ThymeleafViewResolver
        resolver.setTemplateEngine(templateEngine)
        resolver.setOrder(1)
        resolver.setViewNames(Array("*.html", "*.xhtml"))
        resolver
    }
}

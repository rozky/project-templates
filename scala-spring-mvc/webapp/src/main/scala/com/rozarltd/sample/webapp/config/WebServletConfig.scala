package com.rozarltd.sample.webapp.config

import org.springframework.context.annotation.{ComponentScan, Import, Configuration}
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@Configuration
@EnableWebMvc
@Import(Array(classOf[ViewEngineConfig]))
@ComponentScan(Array("com.rozarltd.sample.webapp.controller"))
class WebServletConfig {
}

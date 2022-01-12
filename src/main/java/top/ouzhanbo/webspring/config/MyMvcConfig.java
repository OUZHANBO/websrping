package top.ouzhanbo.webspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author zhanxiangOu
 * @date 2021年12月23日15:54
 */
@Configuration
@ComponentScan(value = "top.ouzhanbo.webspring",includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})},useDefaultFilters = false)
public class MyMvcConfig {
}

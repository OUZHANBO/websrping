package top.ouzhanbo.webspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

/**
 * @author zhanxiangOu
 * @date 2021年12月24日15:01
 */
@Configuration
@ComponentScan(value = "top.ouzhanbo.webspring",includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class})},useDefaultFilters = false)
public class MyConfig {
}

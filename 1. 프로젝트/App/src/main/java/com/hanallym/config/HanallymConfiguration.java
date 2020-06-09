package com.hanallym.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableJdbcHttpSession
public class HanallymConfiguration implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/sign-in/**");

    }
}
//���� �ΰ��� ������ ������ ���ִ� �� �α��� �ϱ� ���� �α��� �ϴ� �����͸� ����� �����ִ��� Ȯ���ϰ� �α����� �ȵǾ������� �α������� �ǵ�������
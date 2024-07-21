package com.ino.test;

import org.springframework.boot.SpringApplication; // Spring Boot 애플리케이션을 시작하기 위한 유틸리티 클래스인 SpringApplication을 가져옴
import org.springframework.boot.autoconfigure.SpringBootApplication; // Spring Boot 애플리케이션의 주요 어노테이션을 가져옴

/**
 * Spring Boot 애플리케이션의 주요 어노테이션
 *
 * 아래 세 가지 기능을 결합:
 * @Configuration: 이 클래스가 설정 클래스임을 나타냅니다.
 * @EnableAutoConfiguration: Spring Boot의 자동 설정을 활성화합니다.
 * @ComponentScan: 이 패키지와 하위 패키지에서 @Component, @Service, @Repository 등을 찾아서 스프링 컨텍스트에 등록합니다.
 */
@SpringBootApplication
public class TestApplication {
    /**
     * main 메서드. 자바 애플리케이션의 진입점으로, Spring Boot 애플리케이션을 시작합니다.
     */
    public static void main(String[] args) {
        /**
         * SpringApplication.run 메서드는 애플리케이션을 시작합니다.
         * 첫 번째 매개변수로는 실행할 Spring Boot 애플리케이션 클래스(TestApplication.class)를 전달하고,
         * 두 번째 매개변수로는 커맨드 라인 인자를 전달합니다.
         */
        SpringApplication.run(TestApplication.class, args);
    }
}

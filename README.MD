SpringBootApplication аннотация объединяет три важные вещи:

1)@Configuration
Говорит Spring: В этом классе есть настройки бинов. Например, тут можно создавать ручные конфигурации

2)@EnableAutoConfiguration
Spring Boot автоматически настраивает приложение на основе зависимостей в pom.xml или build.gradle.
Пример: Если добавил зависимость spring-boot-starter-web, Spring сам настроит веб-сервер (Tomcat) и MVC

3)@ComponentScan
Spring ищет все компоненты (классы с @Controller, @Service, @Repository) в текущем пакете и подпакетах, чтобы зарегистрировать их в контексте приложения
# Spring Boot实践指南

Spring Boot知识点整理、工程实践，并结合工作案例进行深入


### 基础入门

* spring-boot-quickstart（Spring Boot快速入门案例）






spring-cloud内部异常处理要点

1、在服务提供者定义统一的异常处理类，添加@ControllerAdvice注解，然后处理异常。	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
2、定义feign.errorDecoder。解析response.body().asInputStream()内容,如果是服务提供者统一异常处理类抛出的异常，则采取相应的处理方案，否则使用默认的errorDecoder处理
3、在服务消费者也要定义一个统一的异常处理类，不过，这个类的@ResponseStatus(HttpStatus.OK)。处理异常，显示给用户

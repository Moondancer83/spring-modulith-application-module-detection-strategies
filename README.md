# Spring Modulith Application Module Detection Strategies

## Content
You can find here some custom application module detection strategies for Spring Modulith.

| Strategy                                          | Description                                                                                             |
| ------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| AnnotationBasedApplicationModuleDetectionStrategy | Detect packages as modules by @ApplicationModule annotation only. Package should be under base package. |

## How to use
1. Prerequisite: Use Spring Modulith in your application, and include `org.springframework.modulith:spring-modulith-core` package on classpath.
2. Copy the java file into your repository.
3. Set the full class name of the selected strategy as a value of `org.springframework.modulith.core.ApplicationModuleDetectionStrategy` property in `resources/META-INF/spring.facrories`.

## Motivation
We started using Spring Modulith to enforce better structured application code. As the default settings worked nicley we soon faced an regarding to modules that should live inside sub-packages.

### Context
Our application consumes services and store their responses. Later on it operates on the saved data. Separating of service client and internal data handling seemd a good idea, but resulted package structure that caused conflict in module detection.

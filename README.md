**Spring Boot Starter - EmbeddedPostgres**
**HOW TO ADD**
*1. Add jitpack repository*
```
<repositories>
    <repository>
	<id>jitpack.io</id>
	<url>https://jitpack.io</url>
    </repository>
</repositories>
```
*2. Add dependecy*
```
<dependency>
    <groupId>com.github.esempla</groupId>
    <artifactId>spring-boot-starter-embedded-postgres</artifactId>
    <version>v0.1</version>
</dependency>
```

Configuration Example:
```
embedded.postgres.database-name=test
embedded.postgres.username=user
embedded.postgres.password=user
embedded.postgres.port=5433
 
spring.datasource.url=jdbc:postgresql://localhost:5433/test
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.username=user
spring.datasource.password=user

spring.jpa.database=POSTGRESQL
 ```

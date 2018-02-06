**Spring Boot Starter - EmbeddedPostgres**

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
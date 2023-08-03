
Github repo can be cloned from https://github.com/harshsondhi/myHomeWorkOne.git
It is a atypocal springboot project

I have enabled swagger , here are few important links

1). Swagger as follow

   http://localhost:8081/swagger-ui/index.html

   It has two rest endpoints

   /api/v1/customer/all. Note one can choose user id from this endpoint

    /api/v1/customer/customer/{id}. Note substitute the user id to know info for that user

2). H2 database can be accessed from URL

    http://localhost:8081/h2-console

here are few important configurations

server.port=8081

spring.h2.console.enabled=true

spring.datasource.url=jdbc:h2:mem:testdb

spring.datasource.username=sa

spring.datasource.password=sa

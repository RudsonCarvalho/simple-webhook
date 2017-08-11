# simple-webhook

Projeto em Spring boot, REST que cadastra URLs de notificação numa base MySql, e realiza a notificação destas URLs (Post) ao receber uma mensagem e gravar na base.

# MySql Database Configuration
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/webhook
spring.datasource.username=root
spring.datasource.password=

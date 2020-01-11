# Spring Boot Send Gmail Authenticated

## Description
This is a Spring Boot Application that sends mail from a given account. The app sends 2 e-mails one simple text and another html.
Below is the information to run.
### Instructions

1. You have to enable 2-factor authentication in Google Account. 
Follow this link to create password: https://support.google.com/accounts/answer/185833?p=InvalidSecondFactor

2. Change file `application.properties` as follow
```
spring.mail.test-connection=true
spring.mail.host=smtp.gmail.com
# TLS enabled
spring.mail.port=587 
spring.mail.username= <your mail account> test@gmail.com
spring.mail.password= <your password>  16 digit password that generate in previous step


# Other properties
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.connectiontimeout=5000
spring.mail.properties.mail.smtp.timeout=5000
spring.mail.properties.mail.smtp.writetimeout=5000

# SSL, post 465
#spring.mail.properties.mail.smtp.socketFactory.port = 465
#spring.mail.properties.mail.smtp.socketFactory.class = javax.net.ssl.SSLSocketFactory

# TLS , port 587
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.ssl.trust=smtp.gmail.com
# Debug Information
spring.mail.properties.mail.debug=true
```
### File informations
* `SpringBootSendEmailSmtpAuthenticatedApplication.java`
You can specify the sender

* `HTMLMail.java`
You can specify the body of HTML
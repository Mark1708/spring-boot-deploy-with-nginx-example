# spring-boot-deploy-with-nginx-example
![Spring Boot](https://img.shields.io/badge/-springboot-0a0a0a?style=for-the-badge&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/-postgresql-0a0a0a?style=for-the-badge&logo=postgresql)
![Flyway](https://img.shields.io/badge/-flyway-0a0a0a?style=for-the-badge&logo=flyway)
![Docker](https://img.shields.io/badge/-Docker-0a0a0a?style=for-the-badge&logo=Docker)
![Ubuntu](https://img.shields.io/badge/-Ubuntu-0a0a0a?style=for-the-badge&logo=Ubuntu)
![Nginx](https://img.shields.io/badge/-Nginx-0a0a0a?style=for-the-badge&logo=Nginx)
![letsencrypt](https://img.shields.io/badge/-letsencrypt-0a0a0a?style=for-the-badge&logo=letsencrypt)
<br/>

> Гайд по деплою Spring Boot проекта на виртуальную машину Ubuntu с использованием веб-сервера Nginx и генерацией SSL сертификата

Недавно я столкнулся с задачей разработать Telegram бота. Казалось бы, что тут сложного? Ну раз надо, то разрабатывай, где тут могут быть сложности? Но вот беда, ранее я не сталкивался с задачей развертывания проекта, тем более было много вопросов касаемо получения SSL сертификата так как Telegram API работает только с HTTPS протоколом. Увы после долгих поисков я так и не нашел статьи, которая ответила бы на все вопросы, поэтому процесс деплоя затянулся из-за того, что пришлось собирать весь материал по кусочкам. Теперь, когда у меня получилось разобраться с этой проблемой, я бы хотел вам рассказать как это сделать, чтобы сэкономить вам время и бонусом 2000 рублей за SSL сертификат)

Статью вы можете почитать на [Habr](https://habr.com/ru/sandbox/177076/)


## Контактная информация
[Гурьянов Марк](https://mark1708.github.io/)
#### +7(962)024-50-04 | mark1708.work@gmail.com | [github](http://github.com/Mark1708)

![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=mark1708&repo=spring-boot-deploy-with-nginx-example&theme=chartreuse-dark&show_icons=true)


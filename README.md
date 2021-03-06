# cadastro-api

**Tecnologias**
- Java 8, Maven,
- Hibernate, HSQLDB
- JUnit, Fixture Factory, MockMvc
- Spring Boot, Spring Security, Spring Data Rest, Spring hateoas
- JWT
- Continuous Integration - Heroku integrado com o GitHub

# endpoint
https://cadastra.herokuapp.com/

# Cadastro

Method: Post
URL: /v1/usuarios

# Body:
##### Body: #####
```json
{
   "nome":"paulo",
   "email":"paulo.cocato@gmail.com",
   "senha":"123abc",
   "telefones":[
      {
         "numero":"123456789",
         "ddd":"11"
      }
   ]
}
```
Isto retornará um JSON com o usuário e o token que dará acesso ao sistema.

*Obs.: O Token é válido por 30 minutos.*

![Cadastro](/screens/Cadastro.png?raw=true "Cadastro")

# Consulta de usuário

URL: /v1/usuarios
método: GET

E no header da requisição é necessário informar o key: `Authorization`
No value é necessário informar `Bearer {token}`
Isto retornará os dados atualizados do usuário

![Consulta](/screens/Usuarios.png?raw=true "Consulta")

# Login

URL: /auth
método: POST

##### Body: #####
```json
{
   "email":"paulo.cocato@gmail.com",
   "senha":"123abc"
}
```

![Login](/screens/Login.png?raw=true "Login")

**As mensagens de erro seguem o seguinte padrão:**
```json
{ "mensagem": "mensagem de erro" }
```
# Curso-API 
Neste projeto faço uma aplicação API Rest com métodos CRUD (create, read, update e delete) utilizando Springboot <br> com banco de dados H2.

## Tecnologias utilizadas
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Springboot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![JUnit](https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white)

## Funcionalidades:
• Criar user <br> • Atualizar <br> • Listar todos <br> • Obter user por ID <br> • Excluir por ID

## ⚙️ Executando os testes 
Baixe o arquivo na sua máquina e importe utilizando o Maven.

### Como testar?
• Para realizar os testes execute a classe "ApiApplication" da pasta "br.com.praticando.api" e utilize o postman para testar suas funcionalidades. <br> • Para visualizção do H2 Database passe a url "http://localhost:8080/h2-console-api" com os requisitos que estão na file "application-local.properties".

#### Testes no Postman:
▪ Crie uma request > Body > Na aba "text" selecione "Json" e faça os testes dessa forma: <br> <br>
POST - Create 
```
localhost:8080/user
{
      "name": "fulano",
        "email": "fulano@mail.com",
        "password": "0000"
}
```
PUT - Update 
```
localhost:8080/user/1
{
        "id": 1,
        "name": "Fulano Update",
        "email": "fulano@mail.com",
        "password":"0000"
    }
```
GET - FindAll
```
localhost:8080/user
```
GET - FindById
```
localhost:8080/user/1
```
DELETE - Delete
```
localhost:8080/user/1
```
#### ✒️ Referência: 
• Valdir Cezar Tutoriais
<br> <br>
_Obrigada por acessar o repositório. Espero que tenha gostado!_ 👋 <br> <br> ![HaveAnAwesomeDayThumbsUpGIF](https://github.com/llary-y/curso-API/assets/141759410/47f52683-6513-4125-929d-3a4447e8ae03)







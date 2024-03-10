
# SA04 - Mainbooks

Trabalho dedicado a matéria de Desenvolvimento de Sistemas do curso Técnico de Desenvolvimento de Sistemas do Senai/SC

## Script Para Criação do Banco

Criado via JPA
    
## Como se conectar ao banco

Para se conectar ao banco da aplicação é necessario utilizar as informações abaixo.

`User: root`

`senha: sua_senha_do_banco`

Lembre-se de alterá-las no arquivo application.properties

```bash
# Dados de conexão com o banco de dados
spring.datasource.url=jdbc:mysql://localhost:3306/mainbooks
spring.datasource.username=root
spring.datasource.password=sua_senha_do_banco
```


## Rodando localmente

Inicie o servidor pela IDE em seu computador e no browser de sua preferência acesse:

```bash
  http://localhost:8081/mainbooks/
```

Caso não localize utilize a url abaixo:

```bash
  http://localhost:8081/mainbooks/listar
```



## Tecnologias utilizadas

**Front-end:** Thymeleaf, HTML, CSS, Bootstrap

**Back-end:** Java, JPA, Springboot




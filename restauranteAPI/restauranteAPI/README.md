# Restaurante API — Gestão de Cardápio

## Descrição

A Restaurante API é uma API REST para centralizar e gerenciar categorias, pratos, pedidos e itens de pedido. Os serviços podem ser consumidos por aplicações, sites e outros sistemas.

O projeto possui duas formas de utilização: uma interface visual web básica e a documentação interativa Swagger, que permite executar os endpoints diretamente no navegador.

## Problema que a API busca solucionar

Restaurantes que controlam o cardápio manualmente podem apresentar preços desatualizados, pratos indisponíveis sendo oferecidos e dificuldade para organizar os itens por categoria. A API centraliza essas informações e disponibiliza serviços reutilizáveis.

## Principais funcionalidades

- Cadastro, consulta, atualização e exclusão de categorias.
- Cadastro, consulta, atualização e exclusão de pratos.
- Listagem de pratos disponíveis para consumo.
- Cadastro, consulta, atualização e exclusão de pedidos.
- Cadastro e consulta de itens de pedido.
- Relacionamento entre categorias, pratos, pedidos e itens de pedido.
- Validação dos dados recebidos nas requisições.
- Bloqueio de pedidos para pratos indisponíveis.
- Cálculo automático do valor total do pedido.
- Persistência dos dados em PostgreSQL.

## Interface visual

A aplicação possui uma interface web básica em HTML, CSS e JavaScript. Nela é possível:

- Visualizar a quantidade de categorias, pratos e pedidos.
- Cadastrar categorias.
- Cadastrar pratos e definir sua disponibilidade.
- Visualizar o cardápio.
- Filtrar pratos disponíveis.
- Realizar pedidos informando o prato e a quantidade.
- Visualizar o total calculado e os pedidos recentes.

Após iniciar a aplicação, acesse a interface em:

http://localhost:8080/

## Swagger

A API também pode ser executada e testada pela documentação interativa Swagger. Nela é possível visualizar os endpoints, informar parâmetros, preencher requisições JSON e executar operações GET, POST, PUT e DELETE.

Acesse:

http://localhost:8080/swagger-ui.html

A especificação OpenAPI em JSON está disponível em:

http://localhost:8080/v3/api-docs

## Tecnologias utilizadas

- Java 17
- Spring Boot 4.1.2
- Spring Web MVC
- Spring Data JPA
- Jakarta Bean Validation
- Springdoc OpenAPI e Swagger UI
- Lombok
- PostgreSQL
- HTML, CSS e JavaScript
- Maven

## Instruções para execução

1. Instale o Java 17 ou superior e o PostgreSQL.
2. Crie um banco PostgreSQL chamado restaurante.
3. Configure usuário, senha e URL do banco em src/main/resources/application.properties.
4. Confirme que o PostgreSQL está em execução.
5. Abra um terminal na pasta do projeto.
6. Execute mvn spring-boot:run ou, no Windows, .\\mvnw.cmd spring-boot:run.
7. Acesse a interface visual em http://localhost:8080/.
8. Acesse o Swagger em http://localhost:8080/swagger-ui.html.

A aplicação cria e atualiza as tabelas automaticamente com spring.jpa.hibernate.ddl-auto=update.

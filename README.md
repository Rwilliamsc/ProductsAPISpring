### README.md

#### Estrutura do Projeto

```
products.api
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── products
│   │   │           └── api
│   │   │               ├── ProductApiApplication.java
│   │   │               ├── controller
│   │   │               │   └── ProductController.java
│   │   │               ├── model
│   │   │               │   └── Product.java
│   │   │               └── service
│   │   │                   └── ProductService.java
│   │   └── resources
│   │       └── application.properties
└── README.md
```

# Product API

Esta é uma API RESTful desenvolvida em Spring Boot para realizar operações CRUD (Create, Read, Update, Delete) em uma lista de produtos.

## Funcionalidades

- Cadastro de um novo produto.
- Consulta de todos os produtos cadastrados.
- Consulta de um produto específico por ID.
- Atualização dos dados de um produto.
- Remoção de um produto da lista.

## Requisitos

- Java 22 ou superior
- Maven

## Instruções para Execução

1. Clone o repositório:

   ```bash
   git clone https://github.com/Rwilliamsc/ProductsAPISpring.git
   cd product.api
   ```

2. Compile o projeto e baixe as dependências:

   ```bash
   mvn clean install
   ```

3. Execute a aplicação:

   ```bash
   mvn spring-boot:run
   ```

4. A API estará disponível em `http://localhost:8080/products`.

## Endpoints

- **GET /products**: Retorna a lista de todos os produtos.
- **GET /products/{id}**: Retorna os dados de um produto específico.
- **POST /products**: Cadastra um novo produto.
- **PUT /products/{id}**: Atualiza os dados de um produto existente.
- **DELETE /products/{id}**: Remove um produto da lista.

## Exemplos de Requisições

### Cadastro de um novo produto

```bash

curl -X POST http://localhost:8080/products \
     -H "Content-Type: application/json" \
     -d '{
	"name": "Camisa gola padre",
	"description":"Camisa gola padre verde",
	"category":"Vestuario",
	"price": 89.90
     }'
```

### Consulta de todos os produtos

```bash
curl -X GET http://localhost:8080/products
```

### Consulta de um produto específico por ID

```bash
curl -X GET http://localhost:8080/products/1
```

### Atualização dos dados de um produto

```bash
curl -X PUT http://localhost:8080/products/1 \
     -H "Content-Type: application/json" \
     -d '{
	"name": "Camisa oversize",
	"description":"Camisa oversize preta",
	"category":"Vestuário",
	"price": 89.90
     }'
```

### Remoção de um produto da lista

```bash
curl -X DELETE http://localhost:8080/products/1
```


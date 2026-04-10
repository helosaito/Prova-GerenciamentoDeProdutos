
API RESTful de Gerenciamento de Produtos

Aplicação Spring Boot para gerenciamento produtos.

Execução

Navegue até a pasta raiz do projeto.

Execute o comando:

Bash
./mvnw spring-boot:run
(No Windows: mvnw.cmd spring-boot:run)
Acesso em: http://localhost:8080

Comandos de Produto

Criar Produto (POST )
URI: /api/produtos
Bash
curl -X POST http://localhost:8080/api/produtos \
"Content-Type: application/json" \
'{"nome": "Celular", "descricao": "Iphone", "preco": 3.000,00"status": "DISPONIVEL"}'

Listar Todos (GET )
URI: /api/produtos
Bash
curl -X GET http://localhost:8080/api/produtos

Buscar por ID (GET )
URI: /api/produtos/{id}
Bash
curl -X GET http://localhost:8080/api/produtos/1

Atualizar (PUT )
URI: /api/produtos/{id}
Bash
curl -X PUT http://localhost:8080/api/produtos/1 \
"Content-Type: application/json" \
'{"nome": "Teclado Pro", "descricao": "RGB Pro", "preco": 280.0, "status": "DISPONIVEL"}'

Deletar (DELETE )
URI: /api/produtos/{id}
Bash
curl -X DELETE http://localhost:8080/api/produtos/1

Status do Produto (Enum )
DISPONIVEL
ESGOTADO
INATIVO
Notas
O banco de dados H2 é reiniciado a cada execução.




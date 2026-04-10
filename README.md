
API RESTful de Gerenciamento de Produtos
Aplicação Spring Boot para gerenciamento produtos.

Execução
Navegue até a pasta raiz do projeto.
Execute o comando:
Bash
./mvnw spring-boot:run
(No Windows: mvnw.cmd spring-boot:run)
Acesso em: http://localhost:8080
Endpoints de Produto
Criar Produto (POST )
URI: /api/produtos
Bash
curl -X POST http://localhost:8080/api/produtos \
-H "Content-Type: application/json" \
-d '{"nome": "Teclado", "descricao": "RGB", "preco": 250.0, "status": "DISPONIVEL"}'
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
-H "Content-Type: application/json" \
-d '{"nome": "Teclado Pro", "descricao": "RGB Pro", "preco": 280.0, "status": "DISPONIVEL"}'
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
Console H2: http://localhost:8080/h2-console



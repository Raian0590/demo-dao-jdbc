# demo-dao-jdbc

Projeto de demonstração do padrão DAO (Data Access Object) com JDBC em Java.  
Este projeto implementa operações CRUD (Create, Read, Update, Delete) para entidades de um sistema simples, usando conexão direta com banco de dados via JDBC.

## Estrutura do Projeto

- **db/**: Gerenciamento de conexão e utilitários JDBC.
- **model/entities/**: Classes de domínio (`Seller`, `Department`).
- **model/dao/**: Interfaces DAO para acesso a dados.
- **model/dao/impl/**: Implementações JDBC dos DAOs.
- **application/**: Classes para execução dos testes das funcionalidades.

## Funcionalidades

- CRUD completo para Department e Seller.
- Consultas por ID, listagem completa e por departamento.
- Testes das operações via classes Main e Program2.

## Como executar

1. **Configuração do banco de dados**  
   Crie um arquivo `db.properties` na raiz do projeto com a string de conexão e credenciais:
   ```
   dburl=jdbc:mysql://localhost:3306/seubanco
   user=usuário
   password=senha
   ```

2. **Compilação**  
   Compile o projeto com sua IDE ou via linha de comando:
   ```
   javac -cp . src/main/java/br/com/raian/application/Main.java
   ```

3. **Execução**  
   Execute a classe principal:
   ```
   java -cp . br.com.raian.application.Main
   ```

## Boas práticas implementadas

- Padrão DAO separando lógica de acesso e regras de negócio.
- Uso de `PreparedStatement` para evitar SQL Injection.
- Fechamento seguro de recursos (`Connection`, `Statement`, `ResultSet`).
- Tratamento centralizado de exceções JDBC.

## Possíveis melhorias

- Controle transacional (commit/rollback).
- Testes unitários automatizados.
- DAO genérico para evitar duplicação.
- Validação de dados antes de persistir.

## Licença

Este projeto é apenas para fins de estudo/demonstração e não possui licença específica.

---

Desenvolvido por [Raian0590](https://github.com/Raian0590)

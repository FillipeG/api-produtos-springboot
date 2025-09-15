# Estrutura princiapal

-**controller**:classes que recebem as requisições http
-**service**: regras de negocio e lógica da aplicação
-**repository**: interfaces que fazem a persistencia de dados
(Geralmente com o spring data JPA)
-**model**: ou **domain**: classes de domínio
-**config**: classes de configuração (ex.:CORS, segurança...)
-**dto**:objeto simples (POJO) criado para transportar dados.


## Comando importantes


## Executar aplicação
```bash

./mvnw sprint-boot:run

```

## Testar aplição
```bash

./mvnw test

````

# Teste de API com RestAssured - Realizar um "Post" com Validação de Status Code

## Introdução

Este documento descreve um teste de API utilizando RestAssured em uma aplicação backend Java. O objetivo do teste é realizar uma requisição "Post" para a API e validar o status code da resposta.

## Pré-requisitos

- Ambiente de desenvolvimento Java configurado.
- Projeto com RestAssured adicionado como dependência.
- API disponível para teste.

## ▶️Configuração do Projeto

Certifique-se de adicionar a dependência do RestAssured ao seu projeto. Se estiver usando Maven, adicione o seguinte ao seu arquivo `pom.xml`:
```vue
<dependencies>
    <!-- RestAssured -->
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>5.3.2</version>
        <scope>test</scope>
    </dependency>

    <!-- Cucumber -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.14.0</version>
        <scope>test</scope>
    </dependency>

    <!-- JUnit -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>

    <!-- JSON Simple -->
    <dependency>
        <groupId>com.googlecode.json-simple</groupId>
        <artifactId>json-simple</artifactId>
        <version>1.1.1</version>
    </dependency>
</dependencies>
```
## Conclusão

Este teste verifica se a API responde corretamente a uma requisição "Post" e se o status code retornado é o esperado.
Para mais detalhes sobre as funcionalidades do RestAssured, consulte a [documentação oficial](https://rest-assured.io/documentation/).

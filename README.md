## Automação API
Este é um repositório que contém a automação de alguns testes de API denominado jsonplaceholder. Os su-tópicos abaixo descrevem algumas ações tomadas na estrutução do projeto.

## Tecnologias utilizadas

 - Java 
 https://www.oracle.com/br/java/technologies/downloads/
 - Junit 
 [https://mvnrepository.com/artifact/org.junit.jupit...](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.8.0-M1)
 - RestAssured
  https://mvnrepository.com/artifact/io.rest-assured/rest-assured/4.4.0
 - Maven
 https://maven.apache.org/
 - Jackson
 https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.12.3

## Testes Automatizados

Testes para validar os códigos de retorno relacionados com as condições submetidas baseada na heurística de VADER, na qual verifico os Verbos, Autorização, Dados, Erros e Responsividade. 

## Notas Gerais

 - Armazenamos os dados que são enviados para API  através do uso de
   classes POJO.
 - Criamos dados iniciais através do uso de classes  Data Factory, para
   facilitar a criação e controle dos mesmos.
 - Nesse projeto fazemos o uso do JUNIT 5, o que nos dá a possibilidade
   de usar a notação DisplayName para dar descrições em português em
   nossos testes.
 - Foi utilizado também o formato Gerkin para descrever os testes.
 - No pdf do desafio foi citado esse link de exemplos:
   https://jsonplaceholder.typicode.com/guide.html, porém não foi
   possível abrir esse link.

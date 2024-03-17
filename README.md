# MeuProjetoJavaTP3

# Projeto de Gerenciamento de Biblioteca
Este projeto consiste na construção de uma API WEB Restful para gerenciamento de uma biblioteca, incluindo operações CRUD (Create, Read, Update, Delete) para livros e membros. Além disso, a API integra-se com uma API pública externa para obtenção de informações adicionais relevantes para o sistema de gerenciamento.

## Funcionamento de uma API WEB Restful
Uma API RESTful é uma arquitetura de comunicação entre sistemas que utiliza o protocolo HTTP para realizar operações em recursos de forma padronizada e eficiente. Alguns conceitos fundamentais incluem:

* Recursos: São os objetos manipulados pela API, identificados por URIs (Uniform Resource Identifiers).
* URIs: Endereços que identificam os recursos na API.
* Métodos HTTP: Define as operações que podem ser realizadas nos recursos, como GET, POST, PUT, DELETE, entre outros.
* Representações de Recursos: Os dados associados aos recursos podem ser representados em diferentes formatos, como JSON, XML, entre outros.

## Protocolos HTTP e HTTPS
O protocolo HTTP (Hypertext Transfer Protocol) é um protocolo de comunicação utilizado para transferência de informações na World Wide Web. Já o HTTPS (HTTP Secure) é uma extensão do HTTP que utiliza criptografia para garantir a segurança das comunicações.


Projeto de Gerenciamento de Biblioteca
Este projeto consiste na construção de uma API WEB Restful para gerenciamento de uma biblioteca, incluindo operações CRUD (Create, Read, Update, Delete) para livros e membros. Além disso, a API integra-se com uma API pública externa para obtenção de informações adicionais relevantes para o sistema de gerenciamento.

Funcionamento de uma API WEB Restful
Uma API RESTful é uma arquitetura de comunicação entre sistemas que utiliza o protocolo HTTP para realizar operações em recursos de forma padronizada e eficiente. Alguns conceitos fundamentais incluem:

Recursos: São os objetos manipulados pela API, identificados por URIs (Uniform Resource Identifiers).
URIs: Endereços que identificam os recursos na API.
Métodos HTTP: Define as operações que podem ser realizadas nos recursos, como GET, POST, PUT, DELETE, entre outros.
Representações de Recursos: Os dados associados aos recursos podem ser representados em diferentes formatos, como JSON, XML, entre outros.
Aplicação no Projeto Desenvolvido
No projeto desenvolvido, os principais recursos são Livros e Membros, identificados por URIs específicas. Os métodos HTTP utilizados para operações CRUD são:

Recurso Livros:
GET: Retorna a lista de todos os livros cadastrados.
POST: Permite a criação de um novo livro.
DELETE: Permite a exclusão de um livro com base em seu ID.
Recurso Membros:
GET: Retorna a lista de todos os membros cadastrados na biblioteca.
POST: Permite o cadastro de um novo membro na biblioteca.
DELETE: Permite a exclusão de um membro com base em seu ID.
A API segue os princípios Restful ao utilizar URIs para identificar recursos, métodos HTTP apropriados para operações CRUD e representações de recursos em JSON.

Protocolos HTTP e HTTPS
O protocolo HTTP (Hypertext Transfer Protocol) é um protocolo de comunicação utilizado para transferência de informações na World Wide Web. Já o HTTPS (HTTP Secure) é uma extensão do HTTP que utiliza criptografia para garantir a segurança das comunicações.

No projeto, o protocolo HTTP é utilizado para realizar as solicitações GET, POST e DELETE na API desenvolvida. O HTTPS poderia ser implementado no projeto para garantir a segurança da comunicação, especialmente ao lidar com informações sensíveis.

## Realização de Requests para uma API REST
A realização de requests para a API desenvolvida pode ser feita utilizando ferramentas como o Postman. Abaixo, segue um exemplo de como realizar uma solicitação GET para a API:

* Endpoint: http://localhost:8080/livros
* Método: GET
No arquivo Postman fornecido, estão inclusas as solicitações para todas as operações CRUD, permitindo uma interação completa com a API.

## Requests com Método GET usando Parâmetros
Para realizar uma solicitação GET com parâmetros, como por exemplo, para buscar livros de um determinado gênero, é necessário incluir os parâmetros na URI da solicitação. Por exemplo:

* Endpoint: http://localhost:8080/livros?genero=romance
* Método: GET
Neste exemplo, genero é o parâmetro utilizado para especificar o gênero dos livros desejados.

No projeto, o protocolo HTTP é utilizado para realizar as solicitações GET, POST e DELETE na API desenvolvida. O HTTPS poderia ser implementado no projeto para garantir a segurança da comunicação, especialmente ao lidar com informações sensíveis.

## Conclusão
O projeto implementa uma API WEB Restful para gerenciamento de uma biblioteca, seguindo os padrões Restful e utilizando o protocolo HTTP para comunicação entre sistemas. Além disso, inclui a integração com uma API pública externa e permite realizar operações CRUD de forma eficiente e segura.

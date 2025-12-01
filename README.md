# 📌 Pessoa Juridica — Arquitetura Hexagonal

## 🚀 Projeto

Este projeto foi desenvolvido utilizando o **framework Spring Boot** para criar aplicações Java modernas, eficientes e escaláveis.  
A aplicação segue o **padrão de arquitetura hexagonal (Ports & Adapters)**, garantindo separação clara entre **domínio, casos de uso e infraestrutura**, o que facilita manutenção, testes e evolução do sistema.

### Principais objetivos:
1. Utilizar o **Spring Boot** para acelerar o desenvolvimento de aplicações Java.
2. Criar uma **API RESTful** seguindo as melhores práticas de mercado para comunicação eficiente com outros sistemas.
3. Implementar **tratamento de erros personalizados** para maior robustez.
4. Conectar a aplicação ao banco de dados **PostgreSQL**, aplicando boas práticas de persistência.
5. Utilizar o padrão **DTO (Data Transfer Object)** para transferência eficiente de dados entre camadas.
6. Documentar o projeto com **JavaDoc**, tornando o código mais legível e compreensível.
7. Estruturar a aplicação com **Microsserviços**, explorando benefícios e desafios dessa arquitetura moderna.
8. Desenvolver microsserviços de forma simples e prática, utilizando tecnologias consolidadas.
9. Aplicar **Test-Driven Development (TDD)** para garantir qualidade e confiabilidade no desenvolvimento.

---

## 🧩 Arquitetura Hexagonal (Ports & Adapters)

A aplicação segue o padrão **Hexagonal Architecture**, também conhecido como **Ports & Adapters**:

- **Domínio (Core Domain):**  
  Contém as entidades e regras de negócio.
  É totalmente independente de frameworks ou infraestrutura.

- **Casos de Uso (Application Core / Use Cases):**  
  Implementam a lógica da aplicação
  Expõem **ports de entrada** (interfaces) que são consumidas pelos controladores.

- **Ports (Interfaces):**  
  - **Input Ports:** definem contratos que os controladores chamam.  
  - **Output Ports:** definem contratos para persistência e integração externa.

- **Adapters (Infraestrutura):**  
  Implementam os ports de saída, conectando o domínio ao banco de dados via **Spring Data JPA** 
  Também incluem os controladores REST como **adapters de entrada**.

➡️ Essa arquitetura garante **isolamento do domínio**, permitindo que a aplicação seja facilmente testada e evoluída sem depender diretamente de frameworks ou tecnologias externas.

---

## ⚙️ Funcionalidades

- Criar uma **API RESTful** seguindo boas práticas de mercado.  
- Persistência dos dados utilizando **PostgreSQL**.  
- Uso de **DTOs** para transferência de dados entre camadas.  
- Implementação de **TDD** para garantir qualidade e confiabilidade.  
- Estrutura modular baseada em **arquitetura hexagonal**.

---

## 🛠️ Tecnologias

Este projeto foi desenvolvido utilizando:

- **Java**
- **Spring Boot**
- **PostgreSQL**
- **H2 Database**
- **JUnit**
- **Maven**

---

## 📂 Clone o repositório

```bash
git clone git@github.com:deniscoelho-js/hex-pessoa-juridica.git

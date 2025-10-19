# 🧪 Testes Automatizados com Java + Selenium + Cucumber  

Este projeto contém testes automatizados desenvolvidos com **Java**, utilizando o framework **Selenium WebDriver** para interação com o navegador, **Cucumber (Gherkin)** para escrita dos cenários em linguagem natural e geração de **relatórios HTML** de execução.  

---

## 📁 Estrutura do Projeto  

```
📦 qa-selenium-cucumber-test
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┗ 📂 java
 ┃ ┃ ┃ ┗ 📂 utils
 ┃ ┃ ┃ ┃ ┣ 📄 DriverFactory.java            # Configurações e setup do WebDriver
 ┃ ┣ 📂 test
 ┃ ┃ ┗ 📂 java
 ┃ ┃ ┃ ┗ 📂 elements
 ┃ ┃ ┃ ┃ ┣ 📄 CandidatoElementMap.java      # Mapeamento dos elementos da página
 ┃ ┃ ┃ ┗ 📂 hooks
 ┃ ┃ ┃ ┃ ┗ 📄 Hooks.java                    # Setup e teardown dos testes
 ┃ ┃ ┃ ┗ 📂 pages
 ┃ ┃ ┃ ┃ ┗ 📄 CandidatoPage.java            # Ações da página
 ┃ ┃ ┃ ┗ 📂 runners
 ┃ ┃ ┃ ┃ ┗ 📄 CandidatoTest.java           # Runner principal do Cucumber
 ┃ ┃ ┃ ┗ 📂 steps
 ┃ ┃ ┃ ┃ ┗ 📄 CandidatoSteps.java          # Definição dos steps
 ┃ ┃ ┗ 📂 resources
 ┃ ┃ ┃ ┗ 📂 features
 ┃ ┃ ┃ ┃ ┣ 📄 Candidato.feature           # Cenários de teste (Gherkin)
 ┣ 📂 target                             # Saída dos relatórios e builds
 ┣ 📄 pom.xml                            # Gerenciador de dependências Maven
 ┗ 📄 README.md
```

---

## ⚙️ Tecnologias Utilizadas

- ☕ **Java 17+**
- 🌿 **Maven** para gerenciamento de dependências
- 🥒 **Cucumber** para BDD (Behavior Driven Development)
- 🧭 **Selenium WebDriver** para automação Web
- 🧪 **JUnit 5** como framework de testes
- 📊 **Relatório HTML do Cucumber** (gerado automaticamente após execução)

---

## 🚀 Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/softcetech/qa-selenium-cucumber-test
cd qa-selenium-cucumber-test
```

---

### 2️⃣ Execute os testes

```bash
mvn test
```

---

## 📊 Relatórios

Após a execução, o relatório HTML será gerado automaticamente em:

```
/target/cucumber-reports/index.html
```

Para abrir o relatório, basta acessar o arquivo em seu navegador:

```bash
open target/cucumber-reports/index.html
```

---

## 🧩 Estrutura do Cucumber

Os **cenários** são escritos em linguagem natural no diretório `src/test/resources/features`.

Exemplo:

```gherkin
Feature: Cadastro  de Candidato

  Scenario: Validar cadastro de candidato
    Given o usuario entra na pagina do formulario de cadastro de candidato
    When o usuario preenche as informacoes obrigatorias de cadastro
    And registra as informacoes clicando no botao SUBMIT
    Then o usuario deve validar mensagem de sucesso
```

---

## 🧠 Boas Práticas

- Cada **Step Definition** deve ser simples e delegar ações às classes de página.  
- Utilize **esperas explícitas** (`WebDriverWait`) em vez de `Thread.sleep()`.  
- Centralize a inicialização e encerramento do WebDriver.  
- Use variáveis e seletores descritivos.  

---

## 💡 Melhorias Futuras

- Testes para DADOS INVALIDOS
- Testes com autenticação
- Integração com CI/CD (GitHub Actions, Jenkins, etc.)

---

## ✍️ Autor(a)

**Claudiane Oliveira**  
🔗 [LinkedIn](https://www.linkedin.com/in/claudianeoliveiraqa/)

---

## 📃 Licença

MIT License

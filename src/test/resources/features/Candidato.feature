Feature: Cadastro  de Candidato

  Scenario: Validar cadastro de candidato
    Given o usuario entra na pagina do formulario de cadastro de candidato
    When o usuario preenche as informacoes obrigatorias de cadastro
    And registra as informacoes clicando no botao SUBMIT
    Then o usuario deve validar mensagem de sucesso

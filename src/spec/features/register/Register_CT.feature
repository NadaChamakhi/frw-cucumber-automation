Feature: Verifier le module register
  En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer

  @module_register
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur l application Mercury
    When Je clique sur le module register
    And Je saisie un data dans le champ username "<username>"
    And Je saisie un data dans le champ lastname "<lastname>"

    Examples: 
      | username | lastname |
      | Nada     | Chamakhi |
      | Ahmed    | Mestiri  |

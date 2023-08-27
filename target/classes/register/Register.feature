Feature: Je remplie les cases du registre
  En tant que utilisateur je souhaite me connecter au site Mercury

  @register
  Scenario: Je remplie les cases du registre
    Given Je me connecte sur l application Mercury Register 
    When Je saisie le firstname "Test"
    And Je saisie le lastname "Test"
    And Je saisie le phone "+21620048684"
    And Je saisie l adresse mail "nada.chamakhi.perso@gmail.com"
    And Je clique sur le bouton envoyer 
    Then Je me redirige vers la page register sucess "Thank you for registering"

 
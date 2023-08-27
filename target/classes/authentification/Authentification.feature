Feature: Je verifie la page de la connexion
  En tant que utilisateur je souhaite me connecter au site Mercury

  @connexion
  Scenario: Je verifie la page de la connexion
Given Je me connecte sur l application Mercury 
When Je saisie le username "Test"
And Je saisie le mot de passe "Test"
And Je clique sur le bouton submit 
Then Je me redirige vers la page home "Login Successfully"

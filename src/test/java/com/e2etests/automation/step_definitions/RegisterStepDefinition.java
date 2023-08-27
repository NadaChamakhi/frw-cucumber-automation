package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	
	private RegisterPage registerPage;
	
	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();
	}

	@Given("Je me connecte sur l application Mercury Register")
	public void jeMeConnecteSurLApplicationMercuryRegister() {
		registerPage.goToUrlRegister();
	
	}
	@When("Je saisie le firstname {string}")
	public void jeSaisieLeFirstname(String firstname) {
		registerPage.fillFirstName(firstname);

	}
	@When("Je saisie le lastname {string}")
	public void jeSaisieLeLastname(String lastname) {
		registerPage.fillLastName(lastname);

	}
	@When("Je saisie le phone {string}")
	public void jeSaisieLePhone(String phone) {
		registerPage.fillPhone(phone);

	}
	@When("Je saisie l adresse mail {string}")
	public void jeSaisieLAdresseMail(String adressmail) {
		registerPage.fillEmailAdress(adressmail);

	}
	@When("Je clique sur le bouton envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
		registerPage.clickBtnRegister();

	}
	@Then("Je me redirige vers la page register sucess {string}")
	public void jeMeRedirigeVersLaPageRegisterSucess(String text) {
		String message = RegisterPage.thankyouMessage.getText();
		Assert.assertEquals(text, message);
	}

	}


package co.com.sofka.stepdefinition;

import co.com.sofka.model.PracticeFormModel;
import co.com.sofka.page.PracticeFormPage;
import co.com.sofka.setup.WebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class PracticeFormStepdefinition extends WebUI {
    private PracticeFormPage practiceFormPage;
    private PracticeFormModel nata;
    private static final String ASSETION_EXCEPTION_MESSAGE ="Los valores suministrados no son los esperados: %s";

    @Given("el cliente desea buscar y seleccionar dos productos")
    public void elClienteDeseaBuscarYReservarUnVuelo() {
        try{
            generateCliente();
            generalSetup();
        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(),exception);
        }

    }
    @When("el cliente realiza la seleccion y se dirige al carrito")
    public void elClienteRealizaLaSeleccionDeLosDatosDelVuelo() throws InterruptedException {
        practiceFormPage = new PracticeFormPage(nata, driver); //INSTANCIA
        practiceFormPage.busqueda();
        practiceFormPage.fillMandatoryFields();
        practiceFormPage.pedido();

    }
    @Then("Zonafit realiza la respectivo formulario para la compra")
    public void despegarRealizaLaRespectivaReservaDelVueloParaUnaPersona() {
        //COMPARACION
        Assertions.assertEquals(practiceFormPage.menValid(),"Gracias. Tu pedido ha sido recibido.");

    }


    private void generateCliente(){
        nata = new PracticeFormModel();
        nata.setDocumento("107542385");
        nata.setEmail("nataabh@gmail.com");
        nata.setNombre("Natia");
        nata.setApellido("Gaia");
        nata.setBarraDepartamento("HUI");
        nata.setBarraCiudad("Neiv");
        nata.setDireccion("AvenidaSIEMREVIVA");
        nata.setApartamento("APTAMENTO");
        nata.setCelular("322674567");
    }

}

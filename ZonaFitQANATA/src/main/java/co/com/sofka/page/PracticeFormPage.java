package co.com.sofka.page;

import co.com.sofka.model.PracticeFormModel;
import co.com.sofka.page.common.CommonActionOnpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static io.cucumber.messages.internal.com.google.common.base.StandardSystemProperty.USER_DIR;

public class PracticeFormPage extends CommonActionOnpage {

    private final PracticeFormModel practiceFormModel;

    //For input test cases
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"mega-menu-item-198556\"]")
    private WebElement oferta;

    @FindBy(xpath = " //*[@id=\"main\"]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div/a")
    private WebElement finalizarCompra;

    @CacheLookup
    @FindBy(className = "wc-proceed-to-checkout")
    private WebElement finalizar;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"pwb_filter_by_brand_widget-2\"]/div[2]/ul/li[9]/label/input")
    private WebElement megaplex;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"pwb_filter_by_brand_widget-2\"]/div[2]/ul/li[1]/label/input")
    private WebElement life;

    @CacheLookup
    @FindBy(name = "orderby")
    private WebElement ordenar;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"wrapper\"]/div/div/div[2]/form/select/option[4]")
    private WebElement bajoAalto;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"wrapper\"]/div/div/div[2]/form/select/option[1]")
    private WebElement popularidad;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div[3]/a[2]")
    private WebElement carrito;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Ver carrito']")
    private WebElement verCarrito;

    @CacheLookup
    @FindBy(id = "billing_myfield12")
    private WebElement documento;

    @CacheLookup
    @FindBy(id = "billing_email")
    private WebElement email;

    @CacheLookup
    @FindBy(id = "billing_first_name")
    private WebElement nombre;

    @CacheLookup
    @FindBy(id = "billing_last_name")
    private WebElement apellido;

    @CacheLookup
    @FindBy(id = "select2-billing_state-container")
    private WebElement departamento;

    @CacheLookup
    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    private WebElement barraDepartamento;

    @CacheLookup
    @FindBy(id = "select2-billing_state-result-ob2k-HUI")
    private WebElement selecDepartamento;

    @CacheLookup
    @FindBy(id = "select2-billing_city-container")
    private WebElement ciudad;

    @CacheLookup
    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    private WebElement barraCiudad;

    @CacheLookup
    @FindBy(id = "billing_address_1")
    private WebElement direccion;

    @CacheLookup
    @FindBy(id = "billing_address_2")
    private WebElement apartamento;

    @CacheLookup
    @FindBy(id = "billing_phone")
    private WebElement celular;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/div/div[2]/div/p/strong")
    private WebElement pedido;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"payment\"]/div/div/p/label/span[1]")
    private WebElement terminos;

    @CacheLookup
    @FindBy(id = "place_order")
    private WebElement realizar;


    //Sikulix
    private static final String PAGE_BASE_PATCH = USER_DIR.value() + "\\src\\main\\resources\\page\\practiceform\\";
    private static final String SELECT_PICTURE_PATCH = PAGE_BASE_PATCH + "añadir.PNG";
    //private static final SELECT_PICTURE_FINALIZAR = PAGE_BASE_PATCH + "finalizar.PNG";
    private static final String CARRITO_PICTURE_PATCH = PAGE_BASE_PATCH + "carrito.PNG";
    private static final String TERMINOS_PICTURE_PATCH = PAGE_BASE_PATCH + "terminos.PNG";

    //Constructor
    public PracticeFormPage (PracticeFormModel practiceFormModel, WebDriver webDriver) {
        super(webDriver);
        this.practiceFormModel = practiceFormModel;
        PageFactory.initElements(webDriver, this);
    }

    //Funciones
    public void busqueda(){
        click(oferta);
        click(oferta);
        scrollDown();
        click(megaplex);
        scrollDown();
        scrollDown();
        scrollDown();
        scrollDown();
        click(SELECT_PICTURE_PATCH);
        click(SELECT_PICTURE_PATCH);
        scrollUp2();
        click(CARRITO_PICTURE_PATCH);
        scrollDown();
        click(finalizar);
        scrollDown();
    }

    public void busqueda2(){
        click(oferta);
        click(oferta);
        scrollDown();
        click(ordenar);
        click(bajoAalto);
        scrollDown();
        scrollDown();
        scrollDown();
        click(SELECT_PICTURE_PATCH);
        scrollDown();
        click(SELECT_PICTURE_PATCH);
        scrollDown();
        scrollUp2();
        scrollUp2();
        click(life);
        click(CARRITO_PICTURE_PATCH);
        scrollDown();
        scrollDown();
        click(finalizar);
        scrollDown();

    }
    public void fillMandatoryFields() {
        click(documento);
        typeInto(documento, practiceFormModel.getDocumento());
        click(email);
        typeInto(email, practiceFormModel.getEmail());
        click(nombre);
        typeInto(nombre, practiceFormModel.getNombre());
        click(apellido);
        typeInto(apellido, practiceFormModel.getApellido());
        click(departamento);
        click(barraDepartamento);
        typeInto(barraDepartamento, practiceFormModel.getBarraDepartamento());
        pressEnter(barraDepartamento);
        scrollDown();
        click(ciudad);
        click(barraCiudad);
        typeInto(barraCiudad, practiceFormModel.getBarraCiudad());
        pressEnter(barraCiudad);
        click(direccion);
        typeInto(direccion, practiceFormModel.getDireccion());
        click(apartamento);
        typeInto(apartamento, practiceFormModel.getApartamento());
        click(celular);
        typeInto(celular, practiceFormModel.getCelular());
        scrollDown();
    }
    public void pedido(){
        scrollDown2();
        click(TERMINOS_PICTURE_PATCH);
        click(realizar);
    }

    public void ordenar(){
        click(ordenar);
        click(bajoAalto);
    }
    public String menValid(){
        return getText(pedido).trim();
    }

}

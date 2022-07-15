package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By produto = By.xpath("//input[@id='inputNome']");
	public By preco = By.xpath("//input[@id='inputPreco']");
	public By validade = By.xpath("//input[@id='inputValidade']");
	public By adicionar = By.xpath("//button[@class='btn btn-primary']");
}

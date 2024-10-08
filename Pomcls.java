package pompac;

import org.openqa.selenium.By;

public class Pomcls {

	public By women = By.xpath("//span[text()='Women']");
	public By tops = By.xpath("//*[@id='ui-id-9']/span[2]");
	public By product= By.xpath("//a[@id='ui-id-11']/span");
	public By productimg= By.linkText("Olivia 1/4 Zip Light Jacket");
	public By color= By.id("option-label-color-93-item-49");
	public By size= By.id("option-label-size-143-item-169");
	public By addcart= By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span");
	public By compare=By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[2]/a[2]");
	public By men= By.xpath("//span[text()='Men']");
	public By top=By.id("ui-id-17");
	public By pdt= By.id("ui-id-19");
	public By pdtimg=By.linkText("Proteus Fitness Jackshirt");
	public By col=By.id("option-label-color-93-item-50");
	public By siz= By.id("option-label-size-143-item-169");
	public By cart=By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span");
	public By comp=By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[2]/a[2]");
	public By cartpage=By.xpath("//a[@data-bind=\"scope: 'minicart_content'\"]");
	public By deleteopt=By.xpath("//*[@id='mini-cart']/li[1]/div/div/div[3]/div[2]/a");
	public By delete=By.xpath("//span[text()='OK']");
	public By delopt=By.xpath("//*[@id=\"mini-cart\"]/li[2]/div/div/div[3]/div[2]/a");
	public By del=By.xpath("//span[text()='OK']");

}

package stppac;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baspac.Basclas;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pompac.Pomcls;

public class Stpcls extends Basclas{
	
		Pomcls pom= new Pomcls();

		@Given("User enter the luma url")
		public void user_enter_the_luma_url() {
		    geturl("https://magento.softwaretestingboard.com/");
		    implicitWait();

		}
		@Then("User mouseover the women item")
		public void user_mouseover_the_women_item() throws InterruptedException {
			WebElement target = driver.findElement(pom.women);
			Actions actions = new Actions(driver);
			Thread.sleep(2000);
			actions.moveToElement(target).perform();
			WebElement t = driver.findElement(pom.tops);
			Actions a= new Actions(driver);
			
			Thread.sleep(2000);
			a.moveToElement(t).perform();
			Thread.sleep(2000);
		}

		@Then("User click women product")
		public void user_click_women_product() throws InterruptedException {
			driver.findElement(pom.product).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			
			Thread.sleep(2000);
			}

		@Then("User mouseover the product image")
		public void user_mouseover_the_product_image() throws InterruptedException {
			WebElement s=driver.findElement(pom.productimg);
			Actions b= new Actions(driver);
			Thread.sleep(2000);
			b.moveToElement(s).perform();
			
			Thread.sleep(2000);

		}

		@Then("User click the color and size in women product")
		public void user_click_the_color_and_size_in_women_product() throws InterruptedException {
			driver.findElement(pom.color).click();
			Thread.sleep(2000);
			
			driver.findElement(pom.size).click();
			Thread.sleep(2000);

		}

		@Then("User Click the addcart")
		public void user_click_the_addcart() throws InterruptedException {
			driver.findElement(pom.addcart).click();
			
			Thread.sleep(2000);

		}

		@Then("User Click the add to compare button")
		public void user_click_the_add_to_compare_button() throws InterruptedException {
			driver.findElement(pom.compare).click();
			
			Thread.sleep(2000);

		}

		@Then("User mouseover the men item")
		public void user_mouseover_the_men_item() throws InterruptedException {
			WebElement target1 = driver.findElement(pom.men);
			Actions actions1 = new Actions(driver);
			Thread.sleep(2000);
			actions1.moveToElement(target1).perform();
			
			WebElement target2 = driver.findElement(pom.top);
			Actions actions2 = new Actions(driver);
			Thread.sleep(2000);
			actions2.moveToElement(target2).perform();

		}

		@Then("user click men product")
		public void user_click_men_product() throws InterruptedException {
			driver.findElement(pom.pdt).click();
			
			Thread.sleep(2000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,500)");
			
			Thread.sleep(2000);


		}

		@Then("user mouseover the men product image")
		public void user_mouseover_the_men_product_image() throws InterruptedException {
			WebElement s2=driver.findElement(pom.pdtimg);
			Actions b2= new Actions(driver);
			Thread.sleep(2000);
			b2.moveToElement(s2).perform();

		}

		@Then("user click the color and size in men product")
		public void user_click_the_color_and_size_in_men_product() throws InterruptedException {
			driver.findElement(pom.col).click();
			Thread.sleep(2000);
			
			driver.findElement(pom.siz).click();
			Thread.sleep(2000);

		}

		@Then("user click the addto cart")
		public void user_click_the_addto_cart() throws InterruptedException {
			driver.findElement(pom.cart).click();
			
			Thread.sleep(2000);

		}

		@Then("user click the addto compare")
		public void user_click_the_addto_compare() throws InterruptedException {
			driver.findElement(pom.comp).click();
			
			Thread.sleep(2000);

		}

		@Then("user select the cart page")
		public void user_select_the_cart_page() throws InterruptedException {
			driver.findElement(pom.cartpage).click();
			
			Thread.sleep(2000);
			
			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			js11.executeScript("window.scrollBy(0,100)");
			
			Thread.sleep(2000);

		}

		@Then("user select the del option")
		public void user_select_the_del_option() throws InterruptedException {
			driver.findElement(pom.deleteopt).click();
			
			Thread.sleep(2000);

		}

		@Then("First delete men product")
		public void first_delete_men_product() {
			driver.findElement(pom.delete).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}

		@Then("Again select the delete option")
		public void again_select_the_delete_option() throws InterruptedException  {
			driver.findElement(pom.delopt).click();
			
			Thread.sleep(2000);

		}

		@Then("Second delete the women product")
		public void second_delete_the_women_product() throws InterruptedException {
			driver.findElement(pom.del).click();
			
			Thread.sleep(2000);
			

		}

	}



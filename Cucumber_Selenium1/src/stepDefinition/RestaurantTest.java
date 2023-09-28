package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RestaurantTest {
	/*
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); //Create a new
	 * instance of the Chrome Driver WebDriver wd = new ChromeDriver();
	 * 
	 * //Launch the w3schools online code learning website
	 * wd.get("https://www.w3schools.com/");
	 */

	WebDriver driver;
	private CharSequence file_path;

////TC-1
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("200000");
//	    driver.findElement(By.id("description")).sendKeys("Jl Lingkar Tuktuk Kec. Simanindo, Samosir 22395 Indonesia");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Juwita.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
//	
//	//TC-2
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//		    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("100000");
//		    driver.findElement(By.id("description")).sendKeys("Jalan Linkar 30, Samosir 22395 Indonesia");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\alyssa.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-3
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//			    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//			    driver.findElement(By.id("harga")).sendKeys("50000");
//			    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Todayscafe.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
//	
//	//TC-4
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("700000");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\tuktuk.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
////TC-5
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("200000");
//	    driver.findElement(By.id("description")).sendKeys("Jl Lingkar Tuktuk Kec. Simanindo, Samosir 22395 Indonesia");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Juwita.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-6
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("100000");
//		    driver.findElement(By.id("description")).sendKeys("Jalan Linkar 30, Samosir 22395 Indonesia");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\alyssa.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-7
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//			    driver.findElement(By.id("harga")).sendKeys("50000");
//			    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Todayscafe.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
	
////TC-8
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("200000");
//	    driver.findElement(By.id("description")).sendKeys("Jl Lingkar Tuktuk Kec. Simanindo, Samosir 22395 Indonesia");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Juwita.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-9
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("100000");
//		    driver.findElement(By.id("description")).sendKeys("Jalan Linkar 30, Samosir 22395 Indonesia");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\alyssa.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-10
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("50000");
//			    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Todayscafe.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
	
////TC-11
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("200000rb");
//	    driver.findElement(By.id("description")).sendKeys("Jl Lingkar Tuktuk Kec. Simanindo, Samosir 22395 Indonesia");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Juwita.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-12
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//		    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("seratusribu");
//		    driver.findElement(By.id("description")).sendKeys("Jalan Linkar 30, Samosir 22395 Indonesia");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\alyssa.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-13
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//			    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//			    driver.findElement(By.id("harga")).sendKeys("");
//			    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Todayscafe.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
////TC-14
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("200000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Juwita.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-15
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Restauran Enak Comblek");
//		    driver.findElement(By.id("lokasi")).sendKeys("Balige");
//		    driver.findElement(By.id("harga")).sendKeys("900000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\alyssa.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-16
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("Chiked Restaurant");
//			    driver.findElement(By.id("lokasi")).sendKeys("Laguboti");
//			    driver.findElement(By.id("harga")).sendKeys("1000000");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Todayscafe.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
////TC-17
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//	    driver.findElement(By.id("lokasi")).sendKeys("Marinda123");
//	    driver.findElement(By.id("harga")).sendKeys("2123000");
//	    driver.findElement(By.id("description")).sendKeys("Jl Lingkar Utama Balige Kec. Simanindo, Danau Toba 22395 Indonesia");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-18
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//		    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("100000");
//		    driver.findElement(By.id("description")).sendKeys("Jalan Linkar 30, Samosir 22395 Indonesia");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\toba.pdf");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-19
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//			    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//			    driver.findElement(By.id("harga")).sendKeys("50000");
//			    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			    file_input.clear();
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
//	//TC-20
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("100000");
//	    driver.findElement(By.id("description")).sendKeys("Jalan Raya 30, Samosir 22395# Indonesia");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\rumba.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}

////TC-21
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("503000");
//		    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Todayscafe.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}

////TC-22
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//	WebDriver wd = new ChromeDriver();
//
//	// Launch the w3schools online code learning website
//	wd.get("https://www.w3schools.com/");*/
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/user/login");
//	 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//    driver.findElement(By.id("password")).sendKeys("maria123");
//    driver.findElement(By.xpath("//form/button")).click();
//    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//	Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//	Thread.sleep(5000);
//	
//    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//    Thread.sleep(5000);
//    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//    driver.findElement(By.id("lokasi")).sendKeys("");
//    driver.findElement(By.id("harga")).sendKeys("700000");
//    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\tuktuk.jpg");
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}
	
////TC-23
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("Jl Lingkar Tuktuk Kec. Simanindo, Samosir 22395 Indonesia");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Juwita.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-24
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("");
//		    driver.findElement(By.id("description")).sendKeys("Jalan Linkar 30, Samosir 22395 Indonesia");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\alyssa.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//}
	
//	//TC-25
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("");
//			    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Todayscafe.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
//	
	
////TC-26
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("200000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Juwita.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-27
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("100000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\alyssa.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-28
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("50000");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Todayscafe.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
////TC-29
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("250000");
//	    driver.findElement(By.id("description")).sendKeys("Jl Lingkar Tuktuk Kec. Simanindo, Samosir 22395 Indonesia");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    	file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-30
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("100000");
//		    driver.findElement(By.id("description")).sendKeys("Jalan Linkar 30, Samosir 22395 Indonesia");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    		file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-31
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("50000");
//			    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    			file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\toba.pdf");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
	
////TC-32
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("Jl Lingkar Tuktuk Kec. Simanindo, Samosir 22395 Indonesia");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Juwita.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-33
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("100000rb");
//		    driver.findElement(By.id("description")).sendKeys("Jalan Linkar 30, Samosir 22395 Indonesia");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\alyssa.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-34
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("balige");
//			    driver.findElement(By.id("harga")).sendKeys("50000rb");
//			    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Todayscafe.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
	
////TC-35
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("200000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Juwita.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-36
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("100000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\alyssa.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-37
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//			    driver.findElement(By.id("harga")).sendKeys("50000");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Todayscafe.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
////TC-38
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("200000");
//	    driver.findElement(By.id("description")).sendKeys("Jalan meredeka 45");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\toba.pdf");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-39
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("100000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\toba.pdf");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-40
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//			    driver.findElement(By.id("harga")).sendKeys("50000");
//			    driver.findElement(By.id("description")).sendKeys("Jalan sudirman");
//
//			   WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//   			file_input.clear();
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
////TC-41
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("harga")).sendKeys("200000RB");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Juwita.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
//	
//	//TC-42
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//		    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("");
//		    Thread.sleep(1000);
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\alyssa.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-43
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//			    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//			    driver.findElement(By.id("harga")).sendKeys("");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Todayscafe.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
////TC-44
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("harga")).sendKeys("200000rb");
//	    driver.findElement(By.id("description")).sendKeys("Jalan sitinjak sayar");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\toba.pdf");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
//	
//	//TC-45
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//		    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("");
//		    Thread.sleep(1000);
//		    driver.findElement(By.id("description")).sendKeys("Jalan sudirman 23");
//
//		       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    			file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-46
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//			    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//			    driver.findElement(By.id("harga")).sendKeys("");
//			    driver.findElement(By.id("description")).sendKeys("Anugrah jaya");
//
//			       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    				file_input.clear();
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
////TC-47
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("harga")).sendKeys("200000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\toba.pdf");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
//	
//	//TC-48
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//		    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("100000");
//		    Thread.sleep(1000);
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    			file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-49
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//			    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//			    driver.findElement(By.id("harga")).sendKeys("430000");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    				file_input.clear();
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}
	
//	//TC-50
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}

////TC-51
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//WebDriver wd = new ChromeDriver();
//
//// Launch the w3schools online code learning website
//wd.get("https://www.w3schools.com/");*/
//
//driver = new ChromeDriver(); 
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/user/login");
// 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//driver.findElement(By.id("password")).sendKeys("maria123");
//driver.findElement(By.xpath("//form/button")).click();
//driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//Thread.sleep(5000);
//
//driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//Thread.sleep(5000);
//driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//Thread.sleep(1000);
//driver.findElement(By.id("harga")).sendKeys("200000rb");
//driver.findElement(By.id("description")).sendKeys("");
//
//WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\toba.pdf");
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}
//
////TC-52
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//	WebDriver wd = new ChromeDriver();
//
//	// Launch the w3schools online code learning website
//	wd.get("https://www.w3schools.com/");*/
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/user/login");
//	 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//    driver.findElement(By.id("password")).sendKeys("maria123");
//    driver.findElement(By.xpath("//form/button")).click();
//    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//	Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//	Thread.sleep(5000);
//	
//    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//    Thread.sleep(5000);
//    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//    driver.findElement(By.id("harga")).sendKeys("satujuta");
//    Thread.sleep(1000);
//    driver.findElement(By.id("description")).sendKeys("");
//
//       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		file_input.clear();
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}

////TC-53
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
//	//TC-54
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("800000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}

////TC-55
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//WebDriver wd = new ChromeDriver();
//
//// Launch the w3schools online code learning website
//wd.get("https://www.w3schools.com/");*/
//
//driver = new ChromeDriver(); 
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/user/login");
// 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//driver.findElement(By.id("password")).sendKeys("maria123");
//driver.findElement(By.xpath("//form/button")).click();
//driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//Thread.sleep(5000);
//
//driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//Thread.sleep(5000);
//driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//driver.findElement(By.id("lokasi")).sendKeys("");
//Thread.sleep(1000);
//driver.findElement(By.id("harga")).sendKeys("560000");
//driver.findElement(By.id("description")).sendKeys("");
//
//WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\toba.pdf");
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}
//
////TC-56
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//	WebDriver wd = new ChromeDriver();
//
//	// Launch the w3schools online code learning website
//	wd.get("https://www.w3schools.com/");*/
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/user/login");
//	 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//    driver.findElement(By.id("password")).sendKeys("maria123");
//    driver.findElement(By.xpath("//form/button")).click();
//    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//	Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//	Thread.sleep(5000);
//	
//    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//    Thread.sleep(5000);
//    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//    driver.findElement(By.id("lokasi")).sendKeys("");
//    driver.findElement(By.id("harga")).sendKeys("512000");
//    Thread.sleep(1000);
//    driver.findElement(By.id("description")).sendKeys("");
//
//       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		file_input.clear();
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}

////TC-57
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("657000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-58
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Laguboti");
//	    driver.findElement(By.id("harga")).sendKeys("800000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}

////TC-59
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//WebDriver wd = new ChromeDriver();
//
//// Launch the w3schools online code learning website
//wd.get("https://www.w3schools.com/");*/
//
//driver = new ChromeDriver(); 
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/user/login");
// 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//driver.findElement(By.id("password")).sendKeys("maria123");
//driver.findElement(By.xpath("//form/button")).click();
//driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//Thread.sleep(5000);
//
//driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//Thread.sleep(5000);
//driver.findElement(By.id("nama_restaurant")).sendKeys("");
//driver.findElement(By.id("lokasi")).sendKeys("Parapat");
//Thread.sleep(1000);
//driver.findElement(By.id("harga")).sendKeys("560000");
//driver.findElement(By.id("description")).sendKeys("");
//
//WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\toba.pdf");
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}
//
////TC-60
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//	WebDriver wd = new ChromeDriver();
//
//	// Launch the w3schools online code learning website
//	wd.get("https://www.w3schools.com/");*/
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/user/login");
//	 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//    driver.findElement(By.id("password")).sendKeys("maria123");
//    driver.findElement(By.xpath("//form/button")).click();
//    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//	Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//	Thread.sleep(5000);
//	
//    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//    Thread.sleep(5000);
//    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//    driver.findElement(By.id("lokasi")).sendKeys("siborong-borong");
//    driver.findElement(By.id("harga")).sendKeys("512000");
//    Thread.sleep(1000);
//    driver.findElement(By.id("description")).sendKeys("");
//
//       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		file_input.clear();
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}

////TC-61
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Dolok sanggul");
//	    driver.findElement(By.id("harga")).sendKeys("657000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
////TC-62
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//WebDriver wd = new ChromeDriver();
//
//// Launch the w3schools online code learning website
//wd.get("https://www.w3schools.com/");*/
//
//driver = new ChromeDriver(); 
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/user/login");
// 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//driver.findElement(By.id("password")).sendKeys("maria123");
//driver.findElement(By.xpath("//form/button")).click();
//driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//Thread.sleep(5000);
//
//driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//Thread.sleep(5000);
//driver.findElement(By.id("nama_restaurant")).sendKeys("");
//driver.findElement(By.id("lokasi")).sendKeys("");
//Thread.sleep(1000);
//driver.findElement(By.id("harga")).sendKeys("560000");
//driver.findElement(By.id("description")).sendKeys("");
//
//WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\matahari.jpg");
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}
//
////TC-63
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//	WebDriver wd = new ChromeDriver();
//
//	// Launch the w3schools online code learning website
//	wd.get("https://www.w3schools.com/");*/
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/user/login");
//	 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//    driver.findElement(By.id("password")).sendKeys("maria123");
//    driver.findElement(By.xpath("//form/button")).click();
//    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//	Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//	Thread.sleep(5000);
//	
//    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//    Thread.sleep(5000);
//    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//    driver.findElement(By.id("lokasi")).sendKeys("");
//    driver.findElement(By.id("harga")).sendKeys("512000");
//    Thread.sleep(1000);
//    driver.findElement(By.id("description")).sendKeys("");
//
	//WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
	//file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\rumahlomak.jpg");
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}

////TC-64
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("657000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
	//WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
	//file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\sakapur.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
	
////TC-65
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Dolok sanggul");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\matahari.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
////TC-66
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//WebDriver wd = new ChromeDriver();
//
//// Launch the w3schools online code learning website
//wd.get("https://www.w3schools.com/");*/
//
//driver = new ChromeDriver(); 
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/user/login");
// 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//driver.findElement(By.id("password")).sendKeys("maria123");
//driver.findElement(By.xpath("//form/button")).click();
//driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//Thread.sleep(5000);
//
//driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//Thread.sleep(5000);
//driver.findElement(By.id("nama_restaurant")).sendKeys("");
//driver.findElement(By.id("lokasi")).sendKeys("Sabang satu13");
//Thread.sleep(1000);
//driver.findElement(By.id("harga")).sendKeys("560000rb");
//driver.findElement(By.id("description")).sendKeys("");
//
//WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\matahari.jpg");
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}
//
////TC-67
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//	WebDriver wd = new ChromeDriver();
//
//	// Launch the w3schools online code learning website
//	wd.get("https://www.w3schools.com/");*/
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/user/login");
//	 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//    driver.findElement(By.id("password")).sendKeys("maria123");
//    driver.findElement(By.xpath("//form/button")).click();
//    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//	Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//	Thread.sleep(5000);
//	
//    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//    Thread.sleep(5000);
//    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//    driver.findElement(By.id("lokasi")).sendKeys("Porsea");
//    driver.findElement(By.id("harga")).sendKeys("");
//    Thread.sleep(1000);
//    driver.findElement(By.id("description")).sendKeys("");
//
//	WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\rumahlomak.jpg");
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}

////TC-68
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Restaurant Toba");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("657000rb");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\sakapur.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-69
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Restaurant Toba");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("$20000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\sakapur.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
	
//	//TC-70
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Rumah makan barasa");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\sakapur.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
////TC-71
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("657000rb");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar balige, Toba 228999 Indonesia");
//
//	WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\sakapur.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-72
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("$20000");
//		    driver.findElement(By.id("description")).sendKeys("Jl. Astarlindam, Samosir 22395 Indonesia");
//
//		WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\sakapur.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
	
//	//TC-73
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Rumah makan barasa");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//	WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\sakapur.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
	
////TC-74
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Parapat");
//	    driver.findElement(By.id("harga")).sendKeys("659000rb");
//	    driver.findElement(By.id("description")).sendKeys("Jalan Simalungun 13");
//
//	 WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-75
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Laguboti");
//		    driver.findElement(By.id("harga")).sendKeys("#80000");
//		    driver.findElement(By.id("description")).sendKeys("Jl. Astarlindam, Samosir 22395 Indonesia");
//
//	 WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
	
//	//TC-76
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Rumah makan barasa");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//	 WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
	
////TC-77
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("659000");
//	    driver.findElement(By.id("description")).sendKeys("Jalan Simalungun 13");
//
//	 WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-78
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("80000");
//		    driver.findElement(By.id("description")).sendKeys("Jl. Astarlindam, Samosir 22395 Indonesia");
//
//	 WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
	
//	//TC-79
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("345000");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//	 WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-80
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("Jalan Linkar 30, Samosir 22395 Indonesia");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}

////TC-81
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("50000rb");
//		    driver.findElement(By.id("description")).sendKeys("Jl. Lingkar Tuktuk, Samosir 22395 Indonesia");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}


////TC-82
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//	WebDriver wd = new ChromeDriver();
//
//	// Launch the w3schools online code learning website
//	wd.get("https://www.w3schools.com/");*/
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/user/login");
//	 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//    driver.findElement(By.id("password")).sendKeys("maria123");
//    driver.findElement(By.xpath("//form/button")).click();
//    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//	Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//	Thread.sleep(5000);
//	
//    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//    Thread.sleep(5000);
//    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//    driver.findElement(By.id("lokasi")).sendKeys("");
//    driver.findElement(By.id("harga")).sendKeys("200000rb");
//    driver.findElement(By.id("description")).sendKeys("Jl Lingkar Tuktuk Kec. Simanindo, Samosir 22395 Indonesia");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}
	
	
//	//TC-83
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("Today's Cafe");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}

////TC-84
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("Tuktuk Pizzeria Restaurant");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("50000rb");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\toba.pdf");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}


////TC-85
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//	WebDriver wd = new ChromeDriver();
//
//	// Launch the w3schools online code learning website
//	wd.get("https://www.w3schools.com/");*/
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/user/login");
//	 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//    driver.findElement(By.id("password")).sendKeys("maria123");
//    driver.findElement(By.xpath("//form/button")).click();
//    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//	Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//	Thread.sleep(5000);
//	
//    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//    Thread.sleep(5000);
//    driver.findElement(By.id("nama_restaurant")).sendKeys("Juwita Cafe - Cooking Class");
//    driver.findElement(By.id("lokasi")).sendKeys("");
//    driver.findElement(By.id("harga")).sendKeys("duaraturibu");
//    driver.findElement(By.id("description")).sendKeys("");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}

	
//	//TC-86
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Parapat");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}

////TC-87
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Porsea");
//		    driver.findElement(By.id("harga")).sendKeys("56700rb");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\toba.pdf");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}


////TC-88
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//	WebDriver wd = new ChromeDriver();
//
//	// Launch the w3schools online code learning website
//	wd.get("https://www.w3schools.com/");*/
//	
//	driver = new ChromeDriver(); 
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/user/login");
//	 
//}
//
//@When("^I enter valid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//    driver.findElement(By.id("password")).sendKeys("maria123");
//    driver.findElement(By.xpath("//form/button")).click();
//    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//	Thread.sleep(5000);
//}
//
//@And("^I click button restaurant$")
//public void I_click_button_restaurant() throws Throwable {
//    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//	Thread.sleep(5000);
//	
//    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//    Thread.sleep(5000);
//    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//    driver.findElement(By.id("lokasi")).sendKeys("Laguboti");
//    driver.findElement(By.id("harga")).sendKeys("duaraturibu");
//    driver.findElement(By.id("description")).sendKeys("");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}
	
	
////TC-89
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Juwita.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-90
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("900000rb");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\alyssa.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-91
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("seratus juta rupiah");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\restaurant\\Todayscafe.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}

	
////TC-92
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("2000000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-93
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("567000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-94
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("1000000");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}

	
////TC-95
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("2000000rb");
//	    driver.findElement(By.id("description")).sendKeys("Jl Lingkar Tuktuk Kec. Simanindo, Samosir 22395 Indonesia");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-96
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("");
//		    driver.findElement(By.id("description")).sendKeys("Jl. Lingkaran, Tuktuk Siadong, Samosir 22395 Indonesia");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
	
//	//TC-97
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
//				WebDriver wd = new ChromeDriver();
//
//				// Launch the w3schools online code learning website
//				wd.get("https://www.w3schools.com/");*/
//				
//				driver = new ChromeDriver(); 
//				driver.manage().window().maximize();
//				driver.get("http://127.0.0.1:8000/user/login");
//				 
//			}
//
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//			    driver.findElement(By.id("password")).sendKeys("maria123");
//			    driver.findElement(By.xpath("//form/button")).click();
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@And("^I click button restaurant$")
//			public void I_click_button_restaurant() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("1000000rb");
//			    driver.findElement(By.id("description")).sendKeys("Tuktuk Siadong Jln. Lingkar Tuktuksiadong samosir, Samosir 22395 Indonesia");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//		}

	
////TC-98
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
///*
//		WebDriver wd = new ChromeDriver();
//
//		// Launch the w3schools online code learning website
//		wd.get("https://www.w3schools.com/");*/
//		
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/user/login");
//		 
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//	    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("maria123");
//	    driver.findElement(By.xpath("//form/button")).click();
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@And("^I click button restaurant$")
//	public void I_click_button_restaurant() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("2000000rb");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//}
	
//	//TC-99
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
//			WebDriver wd = new ChromeDriver();
//
//			// Launch the w3schools online code learning website
//			wd.get("https://www.w3schools.com/");*/
//			
//			driver = new ChromeDriver(); 
//			driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/user/login");
//			 
//		}
//
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//		    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
//		    driver.findElement(By.id("password")).sendKeys("maria123");
//		    driver.findElement(By.xpath("//form/button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@And("^I click button restaurant$")
//		public void I_click_button_restaurant() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_restaurant")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
//    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//	}
//	
	//TC-100
			@Given("^open chrome and start application$")
			public void open_chrome_and_start_application() throws Throwable {
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		/*
				WebDriver wd = new ChromeDriver();

				// Launch the w3schools online code learning website
				wd.get("https://www.w3schools.com/");*/
				
				driver = new ChromeDriver(); 
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1:8000/user/login");
				 
			}

			@When("^I enter valid username and valid password$")
			public void I_enter_valid_username_and_valid_password() throws Throwable {
			    driver.findElement(By.id("email")).sendKeys("maria569@gmail.com");
			    driver.findElement(By.id("password")).sendKeys("maria123");
			    driver.findElement(By.xpath("//form/button")).click();
			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[3]")).click();
				Thread.sleep(5000);
			}
			
			@And("^I click button restaurant$")
			public void I_click_button_restaurant() throws Throwable {
			    driver.findElement(By.xpath("//*[@id=\"collapseRestoran\"]/nav/a")).click();
				Thread.sleep(5000);
				
			    driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/div[1]/a/button")).click();
			    Thread.sleep(5000);
			    driver.findElement(By.id("nama_restaurant")).sendKeys("");
			    driver.findElement(By.id("lokasi")).sendKeys("");
			    driver.findElement(By.id("harga")).sendKeys("1000000rb");
			    driver.findElement(By.id("description")).sendKeys("");

    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"images\"]"));
    file_input.clear();
			}

			@Then("^I can login successfully$")
			public void I_can_login_successfully() throws Throwable {
				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
			}
		}

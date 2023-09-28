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

public class SmokeTest {
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

//TC-1
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
	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
		Thread.sleep(5000);
	}
	
	@And("^I click button hotel$")
	public void I_click_button_hotel() throws Throwable {
	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
		Thread.sleep(5000);
		
	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("nama_hotel")).sendKeys("hotel labersa");
	    driver.findElement(By.id("lokasi")).sendKeys("Balige");
	    driver.findElement(By.id("harga")).sendKeys("200000");
	    driver.findElement(By.id("description")).sendKeys("harga terjangkau");

	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\labersa1.jpg");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
	}
}

////TC-2
//
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
//    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//	Thread.sleep(5000);
//}
//
//@And("^I click button hotel$")
//public void I_click_button_hotel() throws Throwable {
//    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//	Thread.sleep(5000);
//	
//    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//    Thread.sleep(5000);
//    driver.findElement(By.id("nama_hotel")).sendKeys("Hotel Sumber Pulo Mas Samosir");
//    driver.findElement(By.id("lokasi")).sendKeys("Tuktok Siadong");
//    driver.findElement(By.id("harga")).sendKeys("262000");
//    driver.findElement(By.id("description")).sendKeys("Jl. Tuk Tuk Siadong, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395");
//
//    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\sumberpulo.jpg");
//}
//
//@Then("^I can login successfully$")
//public void I_can_login_successfully() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//}
//}
	
//	//TC-3
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_hotel")).sendKeys(" Hotel My Nasha Tigaras Simalungun");
//	    driver.findElement(By.id("lokasi")).sendKeys("Haranggaol Horison");
//	    driver.findElement(By.id("harga")).sendKeys("600000");
//	    driver.findElement(By.id("description")).sendKeys("Tigaras, Dolok Pardamean, Haranggaol Horison, Danau Toba, Sumatera Utara, Indonesia, 21163");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\MyNasha.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}

////TC-4
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Hotel Hotel Sapadia Parapat");
//	    driver.findElement(By.id("lokasi")).sendKeys("Parapat");
//	    driver.findElement(By.id("harga")).sendKeys(" 510000");
//	    driver.findElement(By.id("description")).sendKeys("Jalan Josep Sinaga No 2, Kab. Simalungun,, Parapat, Danau Toba, Sumatera Utara, Indonesia, 41174 ");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\SapadiaParapat.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-5
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Simanindo");
//		    driver.findElement(By.id("harga")).sendKeys(" 709000");
//		    driver.findElement(By.id("description")).sendKeys("Jl.Pangambatan Desa Tomok Samosir. Sumatera Utara. Indonesta, Samosir, Danau Toba, Sumatera Utara, Indonesia, 22359");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\TobaBeachHotel.webp");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}

////TC-6
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Balige");
//		    driver.findElement(By.id("harga")).sendKeys(" 709000");
//		    driver.findElement(By.id("description")).sendKeys("JALAN PARDEDE PASIR NO 10, PARDEDE ONAN, TOBA, BALIGE, Balige, Danau Toba, Sumatera Utara, Indonesia, 22314 ");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\TobaBeachHotel.webp");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-7
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    Thread.sleep(5000);
//			    driver.findElement(By.id("nama_hotel")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("Pangururan");
//			    driver.findElement(By.id("harga")).sendKeys(" 183260");
//			    driver.findElement(By.id("description")).sendKeys("Jl. Raya Simanindo, Dosroha, Simanindo, Kabupaten Samosir, Sumatera Utara 22395, Samosir, Danau Toba, Sumatera Utara, Indonesia,");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\panguruan.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
//	
//	//TC-8
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Tuktuk Timbul Bungalows");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("312757");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Lkr. Tuktuk, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395 ");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\tuktuk.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
//	
//	//TC-9
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Tuktuk Timbul Bungalows");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("312757");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Lkr. Tuktuk, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395 ");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\tuktuk.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	

//	//TC-10
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Hermina Hotel");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("228915");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Kol. TPR Sinaga, Tiga Raja, Girsang Sipangan Bolon, Kabupaten Simalungun, Sumatera Utara 21174, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174 ");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\hermina.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-11
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Toba Village Inn");
//		    driver.findElement(By.id("lokasi")).sendKeys("Tuktuk Siadong");
//		    driver.findElement(By.id("harga")).sendKeys("");
//		    driver.findElement(By.id("description")).sendKeys("Jalan Lingkar, Tuk tuk Siadong, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395 ");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\vilage.png");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-12
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("Darma Agung Beach Hotel Parapat");
//			    driver.findElement(By.id("lokasi")).sendKeys("Parapat");
//			    driver.findElement(By.id("harga")).sendKeys("1.000.000");
//			    driver.findElement(By.id("description")).sendKeys("Jalan Sipora-pora No. 4 Girsang, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174  ");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\darma.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
//	
//	//TC-13
//	
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//	
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Siantar Hotel Parapat");
//		    driver.findElement(By.id("lokasi")).sendKeys("Parapat");
//		    driver.findElement(By.id("harga")).sendKeys("416500");
//		    driver.findElement(By.id("description")).sendKeys("");
//	
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\siantar.jpg");
//		}
//	
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
	
//	//TC-14
//	
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//	
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Hotel Anugrah Situngkir 3 near Creative Hub Pangururan Samosir RedPartner");
//		    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("241570");
//		    driver.findElement(By.id("description")).sendKeys("");
//	
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\anugrah.png");
//		}
//	
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-15
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Dumasari Hotel");
//	    driver.findElement(By.id("lokasi")).sendKeys(" Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("241570");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\dumasari.png");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-16
//	
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Judita Cottage");
//		    driver.findElement(By.id("lokasi")).sendKeys(" Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("350000");
//		    driver.findElement(By.id("description")).sendKeys("Jalan Lingkar Tuktuk Siadong Samosir Sumatera Utara, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-17
//	
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("Anju Cottages");
//			    driver.findElement(By.id("lokasi")).sendKeys(" Tuktuk Siadong");
//			    driver.findElement(By.id("harga")).sendKeys("350000");
//			    driver.findElement(By.id("description")).sendKeys("Jalan Lingkar Tuktuk Siadong Samosir Sumatera Utara, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.clear();
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
	
//	//TC-18
//	
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Parapat View Hotel");
//	    driver.findElement(By.id("lokasi")).sendKeys("Parapat");
//	    driver.findElement(By.id("harga")).sendKeys("702957");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Sidaha Pinto No. 7 Parapat, Girsang Sipangan Bolon Simalungun, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-19
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("Hotel Parapat");
//			    driver.findElement(By.id("lokasi")).sendKeys("Parapat");
//			    driver.findElement(By.id("harga")).sendKeys("1000000000@");
//			    driver.findElement(By.id("description")).sendKeys("Jalan Sipora-pora No. 4 Girsang, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174  ");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\darma.jpeg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
	
//	
//	//TC-21
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("1204900");
//		    driver.findElement(By.id("description")).sendKeys("LABERSA TOBA HOTEL & CONVENTION CENTER   ");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\labersa.png");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-22
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("450000");
//	    driver.findElement(By.id("description")).sendKeys("alan Lingkar Tuktuk Siadong, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395  ");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\lakjon.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-23
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Hotel Anugrah Situngkir 3 near Creative Hub Pangururan Samosir RedPartner");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("");
//		    driver.findElement(By.id("description")).sendKeys(" Jalan Raya Simanindo, , Sialanguan, Pangururan, Samosir, Danau Toba, Sumatera Utara, Indonesia, 22395");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\lakjon.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
//		
	
//	//TC-24
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("Star Beach Hotel");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("");
//			    driver.findElement(By.id("description")).sendKeys(" JLN JUSTIN SIRAT LONG BEACH AJIBATA Parapat, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21455");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\star.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
//	
	
//	//TC-25
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("Star Beach Hotel");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("limaratusribu");
//			    driver.findElement(By.id("description")).sendKeys(" Jalan Pembangunan No. 1 Parapat, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\niagra.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
//	
	
//	//TC-26
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Agape Hotel Haranggaol");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("1212000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\agapa.png");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-27
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Raja Hotel Samosir");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("350000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\gambar\\raja.png");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-28
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("DIO REFAEL HOTEL TIGARAS");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("500000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\gambar\\dio.png");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-29
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Hotel Hotel Sapadia Parapat");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("510000");
//	    driver.findElement(By.id("description")).sendKeys("Jalan Josep Sinaga No 2, Kab. Simalungun,, Parapat, Danau Toba, Sumatera Utara, Indonesia, 41174");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\gambar\\SapadiaParapat.pdf");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}

//	//TC-30
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Hotel Hotel Sapadia Parapat");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("510000");
//	    driver.findElement(By.id("description")).sendKeys("Jalan Josep Sinaga No 2, Kab. Simalungun,, Parapat, Danau Toba, Sumatera Utara, Indonesia, 41174");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}

//	//TC-31
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Mafir Hotel & Restaurant");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("300000");
//		    driver.findElement(By.id("description")).sendKeys("Jalan lingkar tuktuk siadong, Samosir, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395");
//		    
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}

//	//TC-32
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Balige");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("Jalan Tarutung No.120, Balige, Danau Toba, Sumatera Utara, Indonesia, 22312");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\mutiara.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-33
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Parapat");
//	    driver.findElement(By.id("harga")).sendKeys("2345353%4");
//	    driver.findElement(By.id("description")).sendKeys("Jalan Justin Sirait No.30 Ajibata,Toba Samosir,Parapat,Danau Toba,Sumatera Utara,Indonesia,21174");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\opris.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-34
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Balige");
//	    driver.findElement(By.id("harga")).sendKeys("seratusjuta");
//	    driver.findElement(By.id("description")).sendKeys("JALAN PARDEDE PASIR NO 10, PARDEDE ONAN, TOBA, BALIGE, Balige, Danau Toba, Sumatera Utara, Indonesia, 22314 ");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\purnama.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-35
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Balige");
//	    driver.findElement(By.id("harga")).sendKeys("445500");
//	    driver.findElement(By.id("description")).sendKeys("");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\purnama.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-36
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Tuktok Siadong");
//	    driver.findElement(By.id("harga")).sendKeys("445500");
//	    driver.findElement(By.id("description")).sendKeys("");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\sumberpulo.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-37
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Tuktok Siadong");
//		    driver.findElement(By.id("harga")).sendKeys("344701");
//		    driver.findElement(By.id("description")).sendKeys("");
//		    
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\siadong.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-38
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Tuktok Siadong");
//	    driver.findElement(By.id("harga")).sendKeys("162000");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Lkr. Tuktuk No.115, Toba, Tuktuk Siadong, Simanindo, Kabupaten Samosir, Sumatera Utara 22395•(0625) 451318");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}

//	//TC-39
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Tara Bunga");
//		    driver.findElement(By.id("harga")).sendKeys("540000");
//		    driver.findElement(By.id("description")).sendKeys("l. Raya TaraBunga, Tara Bunga, Kec. Tampahan, Toba, Sumatera Utara 22312•0813-7689-0759");
//		    
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-40
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("Kabupaten Karo");
//			    driver.findElement(By.id("harga")).sendKeys("1635671");
//			    driver.findElement(By.id("description")).sendKeys("Jl. Raya Merek No.KM, RW.9, Kodon-Kodon, Kec. Merek, Kabupaten Karo, Sumatera Utara 22173•0811-6077-616");
//			    
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.clear();
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
//
	
//	//TC-41
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Laster Jony's");
//	    driver.findElement(By.id("lokasi")).sendKeys("Tuktuk Siadong");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\tuktuk.png");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-42
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Lakeside Eatery & Stay");
//		    driver.findElement(By.id("lokasi")).sendKeys("Lumban Silintong");
//		    driver.findElement(By.id("harga")).sendKeys("2.000.000");
//		    driver.findElement(By.id("description")).sendKeys("");
//		    
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\silintong.png");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-43
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys(" Tuktuk Timbul Bungalows");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\tuktuk.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-44
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys(" LABERSA TOBA HOTEL & CONVENTION CENTER");
//	    driver.findElement(By.id("lokasi")).sendKeys("Balige");
//	    driver.findElement(By.id("harga")).sendKeys("234$4657");
//	    driver.findElement(By.id("description")).sendKeys("Jalan Raya Pematangsiantar- Balige Toba  Samosir, Balige, Danau Toba, Sumatera Utara, Indonesia, 22312 ");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-45
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Agape Hotel Haranggaol");
//		    driver.findElement(By.id("lokasi")).sendKeys("Haranggaol Horison");
//		    driver.findElement(By.id("harga")).sendKeys("");
//		    driver.findElement(By.id("description")).sendKeys("Jl. Tangga Batu, Kel. Haranggaol, Kec, Haranggaol Horison, Kab. Simalungun, Haranggaol Horison, Danau Toba, Sumatera Utara, Indonesia, 21165 ");
//		    
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
//

//	//TC-46
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Pondok Tabo");
//		    driver.findElement(By.id("lokasi")).sendKeys("Simanindo");
//		    driver.findElement(By.id("harga")).sendKeys("$23456");
//		    driver.findElement(By.id("description")).sendKeys("Jl. Lkr. Tuktuk No.115, Toba, Tuktuk Siadong, Simanindo, Kabupaten Samosir, Sumatera Utara 22395•(0625) 451318 ");
//		    
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-47
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Rogate Beach Hotel");
//	    driver.findElement(By.id("lokasi")).sendKeys("Ambarita");
//	    driver.findElement(By.id("harga")).sendKeys("321750");
//	    driver.findElement(By.id("description")).sendKeys("");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}

	
//	//TC-48
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Hotel Pantai Bintang");
//		    driver.findElement(By.id("lokasi")).sendKeys("Ajibata");
//		    driver.findElement(By.id("harga")).sendKeys("321750");
//		    driver.findElement(By.id("description")).sendKeys("");
//		    
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-49
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Sony Cottage Samosir");
//		    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("179865");
//		    driver.findElement(By.id("description")).sendKeys("");
//		    
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-50
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Sony Cottage Samosir");
//	    driver.findElement(By.id("lokasi")).sendKeys("Samosir");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
//	
	
//	//TC-51
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Lakeside Eatery & Stay");
//	    driver.findElement(By.id("lokasi")).sendKeys("Lumban Silintong");
//	    driver.findElement(By.id("harga")).sendKeys("12.899.999");
//	    driver.findElement(By.id("description")).sendKeys("");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
//	
	
	//TC-52
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Hotel Hotel Sapadia Parapat");
//	    driver.findElement(By.id("lokasi")).sendKeys("Parapat");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\SapadiaParapat.pdf");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	

//	//TC-53
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Sapadia Hotel and Cottage Parapat");
//		    driver.findElement(By.id("lokasi")).sendKeys("Kabupaten Simalungun");
//		    driver.findElement(By.id("harga")).sendKeys("$$23565");
//		    driver.findElement(By.id("description")).sendKeys("");
//		    
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\SapadiaParapat.pdf");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
//		

//	//TC-54
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("Sapadia Hotel and Cottage Parapat");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("286625");
//			    driver.findElement(By.id("description")).sendKeys("");
//			    
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\SapadiaParapat.pdf");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
			


//	//TC-55
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Bagus Bay Guest House");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("315207");
//	    driver.findElement(By.id("description")).sendKeys("");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\bagus.pdf");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
//	


//	//TC-56
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Vantas Hotel Parbaba");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("346667");
//	    driver.findElement(By.id("description")).sendKeys("");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-57
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Hotel Sedayu 2");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("233720");
//		    driver.findElement(By.id("description")).sendKeys("");
//		    
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
//	

//	//TC-58
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Kabupaten Humbang Hasundutan");
//		    driver.findElement(By.id("harga")).sendKeys("233720");
//		    driver.findElement(By.id("description")).sendKeys("");
//		    
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}

	
//	//TC-59
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("Kabupaten Humbang Hasundutan");
//			    driver.findElement(By.id("harga")).sendKeys("332500");
//			    driver.findElement(By.id("description")).sendKeys("");
//			    
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.clear();
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}


//	//TC-60
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Simanindo");
//	    driver.findElement(By.id("harga")).sendKeys("350000");
//	    driver.findElement(By.id("description")).sendKeys("");
//	    
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-61
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Kabupaten Samosir");
//		    driver.findElement(By.id("harga")).sendKeys("350000");
//		    driver.findElement(By.id("description")).sendKeys("");
//		    
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\\\USER\\Downloads\\\\gambar\\sunset.pdf");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
		
	
//	//TC-62
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("350000");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\purnama.jpg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
//			
	
//	//TC-63
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("350000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\purnama.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
	
//	//TC-64
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("550000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\agapa.png");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
		
	
//	//TC-65
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("Parapat");
//			    driver.findElement(By.id("harga")).sendKeys("");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\darma.jpeg");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
//			
	
//	//TC-66
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Tuktuk Siadong");
//	    driver.findElement(By.id("harga")).sendKeys("230.000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\sibayak.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
	
//	//TC-67
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Laguboti");
//	    driver.findElement(By.id("harga")).sendKeys("6723^");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\huber.png");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
	
//	//TC-68
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Hotel Huber");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\huber.png");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
////		
	
//	//TC-69
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("Agape Hotel Haranggaol");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("limajuta12");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\agapa.png");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
			
	
//	//TC-70
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Raja Hotel Samosir");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("12limajuta");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\raja.png");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-71
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("harga4juta");
//		    driver.findElement(By.id("description")).sendKeys("Jl. Kol. TPR Sinaga, Tiga Raja, Girsang Sipangan Bolon, Kabupaten Simalungun, Sumatera Utara 21174, Parapat, Danau Toba, Sumatera Utara, Indonesia, 21174");
//		    Thread.sleep(1000);
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\hermina.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-72
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Marihat No.1, Danau Toba, Kec. Girsang Sipangan Bolon, Kabupaten Simalungun, Sumatera Utara 21174•(0625) 41012");
//
//	    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\khas.png");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
//	
	
//	//TC-73
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("lima ratus ribu");
//	    driver.findElement(By.id("description")).sendKeys("Kampung Tuktuk Siadong, Kecamatan Simanindo, Ambarita, Tuktuk Siadong, Simanindo, Kabupaten Samosir, Sumatera Utara 22395•(0625) 451346");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\kampung.png");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-74
//	
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//	
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Ambarita");
//		    driver.findElement(By.id("harga")).sendKeys("380#678");
//		    driver.findElement(By.id("description")).sendKeys("l. Silahi Sabungan, Silalahi 3, Sabungan, Paropo, Kec. Silahsabungan, Kabupaten Dairi, Sumatera Utara 22281•0811-6067-661");
//	
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\SapadiaParapat.pdf");
//		}
//	
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
	
	
//	//TC-75
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("Ambarita");
//	    driver.findElement(By.id("harga")).sendKeys("380#678");
//	    driver.findElement(By.id("description")).sendKeys("JTerletak di Tuk Tuk, 1,6 km dari Ambarita, Reggae Guest House menawarkan akomodasi dengan restoran, tempat parkir pribadi gratis, bar, dan lounge bersama. 5. Kamar triple ini memiliki balkon, pintu masuk pribadi, dan teras.");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
//	
	
//	//TC-76
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Tuk tuk");
//		    driver.findElement(By.id("harga")).sendKeys("seratusdolar");
//		    driver.findElement(By.id("description")).sendKeys("JTerletak di Tuk Tuk, 1,6 km dari Ambarita, Reggae Guest House menawarkan akomodasi dengan restoran, tempat parkir pribadi gratis, bar, dan lounge bersama. 5. Kamar triple ini memiliki balkon, pintu masuk pribadi, dan teras.");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
//		
	
//	//TC-77
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("711000");
//	    driver.findElement(By.id("description")).sendKeys(" Tuktuk Siadong, Simanindo, Kabupaten Samosir, Sumatera Utara•0813-6297-6002");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}

	
//	//TC-78
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("1079415");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Muara, Kabupaten Humbang Hasundutan, Sumatera Utara 22457•0822-9815-0711");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\muara.pdf");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-79
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("382809");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Pembangunan No.1, Parapat, Kec. Girsang Sipangan Bolon, Kabupaten Simalungun, Sumatera Utara 21174•(0625) 41028");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-80
//	
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//	
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("RedDoorz @ Tuktuk Danau Toba");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("$3000afs");
//		    driver.findElement(By.id("description")).sendKeys("Jl. Pembangunan No.1, Parapat, Kec. Girsang Sipangan Bolon, Kabupaten Simalungun, Sumatera Utara 21174•(0625) 41028");
//	
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//	
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-81
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("Marianna Resort & Convention");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("");
//		    driver.findElement(By.id("description")).sendKeys("Jl. PUD Keluarahan, Tuktuk Siadong, Simanindo, Kabupaten Samosir, Sumatera Utara 22395•(0625) 4501999");
//
//		    WebElement file_input = driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\marianna.doc");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
		

//	//TC-82
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("Pandu Lakeside Hotel");
//			    driver.findElement(By.id("lokasi")).sendKeys("dua ratus ribu rupiah");
//			    driver.findElement(By.id("harga")).sendKeys("");
//			    driver.findElement(By.id("description")).sendKeys("Jl. Kol. TPR Sinaga No.12, Tiga Raja, Kec. Girsang Sipangan Bolon, Kabupaten Simalungun, Sumatera Utara 21174•0821-6454-4981");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.clear();
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
	
//	//TC-83
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			       WebElement file_input = driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/div[2]/div[2]/div/input"));
//			       file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\marianna.doc");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
	
//	//TC-84
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Hotel kalder one");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("123233432*");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
	
//	//TC-85
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("Lake one hotel");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-86
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("Laguboti");
//		    driver.findElement(By.id("harga")).sendKeys("12jutarupiah");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-87
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("siborong-borong");
//			    driver.findElement(By.id("harga")).sendKeys("");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.clear();
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
	
//	//TC-88
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("silangit");
//	    driver.findElement(By.id("harga")).sendKeys("870.900.00");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-89
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\lakjon.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		
//		}
	
//	//TC-90
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("seratusriburupiah");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\MARIANNA.PNG");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
	
//	//TC-91
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\pandu.jpg");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-91
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\pandu.jpg");
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-92
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("3000000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-93
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("1000000");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.sendKeys("C:\\Users\\USER\\Downloads\\gambar\\sunset.pdf");
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
	
	
//	//TC-94
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("3000000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-95
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("");
//	    driver.findElement(By.id("description")).sendKeys("Jl. Lkr. Tuktuk, Samosir, Tuktuk Siadong, Danau Toba, Indonesia, 22395");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-96
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("{345.000}");
//	    driver.findElement(By.id("description")).sendKeys("JALAN PARDEDE PASIR NO 10, PARDEDE ONAN, TOBA, BALIGE, Balige, Danau Toba, Sumatera Utara, Indonesia, 22314");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-97
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("**230.990}");
//		    driver.findElement(By.id("description")).sendKeys(" Jl.Pangambatan Desa Tomok Samosir. Sumatera Utara. Indonesta, Samosir, Danau Toba, Sumatera Utara, Indonesia, 22359");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-98
//
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	/*
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
//	    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//		Thread.sleep(5000);
//	}
//
//	@And("^I click button hotel$")
//	public void I_click_button_hotel() throws Throwable {
//	    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//		Thread.sleep(5000);
//		
//	    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//	    driver.findElement(By.id("nama_hotel")).sendKeys("");
//	    driver.findElement(By.id("lokasi")).sendKeys("");
//	    driver.findElement(By.id("harga")).sendKeys("=120000");
//	    driver.findElement(By.id("description")).sendKeys("");
//
//	    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//	    file_input.clear();
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//	}
//	}
	
//	//TC-99
//
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//		/*
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
//		    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//			Thread.sleep(5000);
//		}
//
//		@And("^I click button hotel$")
//		public void I_click_button_hotel() throws Throwable {
//		    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//			Thread.sleep(5000);
//			
//		    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//		    driver.findElement(By.id("nama_hotel")).sendKeys("");
//		    driver.findElement(By.id("lokasi")).sendKeys("");
//		    driver.findElement(By.id("harga")).sendKeys("888,000");
//		    driver.findElement(By.id("description")).sendKeys("");
//
//		    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//		    file_input.clear();
//		}
//
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//		}
//		}
	
//	//TC-100
//
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//			/*
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
//			    driver.findElement(By.xpath("//*[@id=\"sidenavAccordion\"]/div/div[1]/a[2]")).click();
//				Thread.sleep(5000);
//			}
//
//			@And("^I click button hotel$")
//			public void I_click_button_hotel() throws Throwable {
//			    driver.findElement(By.xpath("//*[@id='collapseHotel']/nav/a[1]")).click();
//				Thread.sleep(5000);
//				
//			    driver.findElement(By.xpath("//main/div/div[1]/a/button")).click();
//			    driver.findElement(By.id("nama_hotel")).sendKeys("");
//			    driver.findElement(By.id("lokasi")).sendKeys("");
//			    driver.findElement(By.id("harga")).sendKeys("999,000,000");
//			    driver.findElement(By.id("description")).sendKeys("");
//
//			    WebElement file_input = driver.findElement(By.xpath("//main/div/form/div[2]/div[2]/div/input"));
//			    file_input.clear();
//			}
//
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"layoutSidenav_content\"]/main/div/form/button")).click();
//			}
//			}
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumRunner {

	public static void main(String[] args) {
		
		/*
		 *Penjelasan :
		 *Baris ini mengatur eksekutor ChromeDriver untuk digunakan oleh WebDriver Selenium. 
		 *Ini memastikan versi ChromeDriver yang tepat diunduh dan dikonfigurasi untuk digunakan dengan WebDriver.
		 *Kemudian diperintahkan ke WebDriver untuk membuka URL tujuan.
		 */
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://wordlegame.org/");
		
		/*
		 *Baris ini mencari elemen web pada halaman saat ini menggunakan selektor CSS "[data-modal-id='#modal_info']" 
		 *dan menugaskannya ke variabel caraMain. Dimana ini akan membuka bagian "Cara bermain Wordle".
		 */
		
		WebElement caraMain = driver.findElement(By.cssSelector("[data-modal-id='#modal_info']"));
		caraMain.click();
		
		/*
		 * Lalu diberikan pula jeda selama 3 detik (3000 milidetik) dengan metode Thread.sleep()
		 * agar pemain dapat membaca peraturan
		 */
		
		try {
		    Thread.sleep(3000); // Pause for 3 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		/*
		 * Baris ini mengirimkan teks "lover" ke elemen caraMain. 
		 * Ini sebenarnya mensimulasikan masukan pengguna dengan memasukkan teks ke dalam kolom masukan atau elemen serupa.
		 * Enter digunakan untuk mengirim atau mengkonfirmasi teks yang dimasukkan.
		 */
		
		caraMain.sendKeys("lover");
		caraMain.sendKeys(Keys.ENTER);
		
		/*
		 * Karena pada dasarnya Wordle adalah permainan menebak, maka diinput kata selanjutnya.
		 * Baris ini mengirimkan teks "turbo" ke elemen caraMain, mensimulasikan pengguna memasukkan kata lain.
		 */
		
		caraMain.sendKeys("turbo");
		caraMain.sendKeys(Keys.ENTER);
		
		/*
		 * Baris ini mencari elemen web pada halaman saat ini menggunakan nama kelas "give_up" 
		 * dan menugaskannya ke variabel menyerah. Elemen tersebut mewakili tombol "menyerah". 
		 */
		
		WebElement menyerah = driver.findElement(By.className("give_up"));
	    menyerah.click();
	
	}

}
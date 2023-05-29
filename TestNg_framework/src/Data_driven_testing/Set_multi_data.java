package Data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_multi_data {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./excel/data.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet("Sheet1");
	System.setProperty("webdriver.chrome.driver", "./sw1/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.com");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int count = links.size();
	for (int i = 0; i < count; i++) {
		Row row = sheet.createRow(i);
		Cell cell = row.createCell(0);
		WebElement we = links.get(i);
		String value = we.getAttribute("href");
		cell.setCellValue(value);
		
	}
	FileOutputStream fos=new FileOutputStream("./excel/data.xlsx");
	book.write(fos);
	
	
}
}

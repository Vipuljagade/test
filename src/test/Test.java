package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import junit.framework.Assert;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.apache.commons.collections.set.SynchronizedSortedSet;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class Test 
{
	public static void main(String []args) throws ParserConfigurationException, SAXException, IOException, FileNotFoundException,InterruptedException, TransformerException
    {
		try {
		    InetAddress ip = InetAddress.getLocalHost();
		    System.out.println("Current IP address : " + ip.getHostAddress());

		    Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
		    while(networks.hasMoreElements()) {
		      NetworkInterface network = networks.nextElement(); //s
		      byte[] mac = network.getHardwareAddress();

		      if(mac != null) {
		        System.out.print("Current MAC address : ");

		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < mac.length; i++) {
		          sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
		        }
		        System.out.println(sb.toString());
		      }
		    }
		  } catch (UnknownHostException e) {
		    e.printStackTrace();
		  } catch (SocketException e){
		    e.printStackTrace();
		  }
		
		
		
		
		
		
		
		
		
		/*
		CSVReader reader = new CSVReader(new FileReader("D://test11.csv"));
		String[] csvData = null;
		while((csvData = reader.readNext())!= null)
		{
			
		}
		File file = new File("D://test11.csv");
		FileOutputStream outputStream = new FileOutputStream(new File("D://test11.csv"));
		CSVWriter writter = new CSVWriter(new FileWriter(file, true), ',');
		writter.writeNext(csvData);
		writter.flush();
		
		String s1 = new String("Test");
		String s2 = new String("Test");
		if (s1==s2)
		    System.out.println("Same");
		if (s1.equals(s2))
		    System.out.println("Equals");

		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Software\\ChromdDriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.logfile", "D:\\Selenium_Automation\\chromedriver.log");
        Runtime.getRuntime().exec("E:\\Softwares\\Testing\\FileIUploadAutoit.exe");
	
        WebDriver driver = new ChromeDriver();scroll
        
        driver.get("http://10.102.65.96/nhsp/nhsbaby");
        driver.manage().window().maximize();
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(By, text))
        */
		/*
		String ab = "jsdbfkjsd";
		int len = ab.length();
		char[] ch = {'g', 'o', 'd'};
		System.out.println(String.valueOf(ch));
		ab.getChars(0, 2, ch, 0);
		char[] ch1 = ab.toCharArray();
		ab.replace('f', 'g');
		ab.matches("js%");
		ab.startsWith("hsdf");
		ab.endsWith("jsd");
		ab.toUpperCase();
		ab.toLowerCase();
		ab.trim();
		ab.equals("adjsndsa");
		ab.equalsIgnoreCase("hjdb");
		ab.charAt(0);
		ab.indexOf('g');*/
		/*
		System.out.println(StringUtils.replace("arvind", "rv", "arv"));
		System.out.println(StringUtils.reverse("12345432"));
		System.out.println(StringUtils.capitalize("test"));
		System.out.println(StringUtils.containsIgnoreCase("hsbhjasbdas", "bhja"));
		System.out.println(StringUtils.countMatches("hdsajdjsk", 'j'));
		System.out.println(StringUtils.indexOf("hsavdjsa", 'a'));
		System.out.println(StringUtils.remove("jhbdjksadkas", 'a'));
		System.out.println(StringUtils.lastIndexOf("hvvbdhasjsas", 'a'));
		*/
		
		/*
		File sourceFile = new File("D:\\Redwood_Automation\\Deleted Files\\S4H_TestData.xml");
		File destinationFile = new File("D:\\Redwood_Automation\\Deleted Files\\S4H_TestData123.xml");
		FileUtils.copyFile(sourceFile, destinationFile);
		System.out.println("Completed");
		*/
		/*
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Software\\ChromdDriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.logfile", "D:\\Selenium_Automation\\chromedriver.log");
        Runtime.getRuntime().exec("E:\\Softwares\\Testing\\FileIUploadAutoit.exe");
	
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://10.102.65.96/nhsp/nhsbaby");
        driver.manage().window().maximize();
        
		String color = driver.findElement(By.xpath("//*[@id='loginForm']/div[2]/div[2]/div[1]/div[1]/label")).getCssValue("color");
		String[] numbers = color.replace("rgba(", "").replace(")", "").split(",");
		int r = Integer.parseInt(numbers[0].trim());
		int g = Integer.parseInt(numbers[1].trim());
		int b = Integer.parseInt(numbers[2].trim());
		System.out.println("r: " + r + " g: " + g + " b: " + b);

		String hex = "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
		System.out.println(hex);
		
		System.out.println(color);
		String hex1 = Color.fromString(color).asHex();
		System.out.println("*** " + hex1);
		*/
		
		/*
		String filepath = "D:\\Redwood_Automation\\Runtime Test Data\\" + "TC001" + "_RumtimeTestData.xml";
		File fXML = new File(filepath);
        
		if(!fXML.exists())
        {
            System.out.println("File doesn't exists. Specified filepath = " + filepath);
            
            DocumentBuilderFactory dBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dBuilderFactory.newDocumentBuilder();
            Document newDoc = documentBuilder.newDocument();
            
            Node rootNode = newDoc.createElement("RuntimeTestData");
            newDoc.appendChild(rootNode);
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformerObject = transformerFactory.newTransformer();
            System.out.println("Created DOMSource");
            DOMSource docSource = new DOMSource(newDoc);
            System.out.println("Created Result");
            StreamResult docResult = new StreamResult(new File(filepath));
            transformerObject.transform(docSource, docResult);
            
            System.out.println("Created new Runtime Test Data File");
        }
		*/
		/*
		// "//td[contains(text(), '1 TO 1 CENTRE (Y00364)')]/following-sibling::td/input[@type='checkbox']"
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Software\\ChromdDriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.logfile", "D:\\Selenium_Automation\\chromedriver.log");

        WebDriver driver = new ChromeDriver();
        
        driver.get("http://10.102.65.96/nhsp/nhsbaby");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='Username']")).sendKeys("VIPUL");
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Passw0rd");
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
        Thread.sleep(10000);
        
        driver.findElement(By.xpath("//*[@id='divAccessPointsContainer']/DIV[2]/SPAN[1]/SPAN[1]/SPAN[1]")).click();
        Thread.sleep(2000);
        WebElement we = driver.findElement(By.xpath("//*[@id='AccessPointId_listbox']"));
        we.findElement(By.xpath("//li[contains(text(), 'AIR_Airedale General Hospital')]")).click();
        */
        /*
        Boolean breakloop = false;
        WebElement table = driver.findElement(By.xpath("//*[@id='dgProfessionalContactResults']/table/tbody"));
        List<WebElement> tableRows = table.findElements(By.tagName("tr"));
        table.findElement(By.xpath("//td[contains(text(), '1 TO 1 CENTRE (Y00364)')]/following-sibling::td/input[@type='checkbox']")).click();
        */
        /*
        List<WebElement> tableHeaderCells = tableRows.get(0).findElements(By.tagName("th"));
        int cellNo = -1;
        for(int count = 0; count<= tableHeaderCells.size(); count++)
        {
        	if(tableHeaderCells.get(count).getText().trim().equalsIgnoreCase("ID"))
        	{
        		cellNo = count;
        		break;
        	}
        }
        	
        
        for(int tableRowsCount = 1; tableRowsCount <= tableRows.size(); tableRowsCount++)
        {
        	
        	
        	List<WebElement> cells = tableRows.get(tableRowsCount).findElements(By.tagName("td"));
            System.out.println(cells.get(1).getText());
            if( cellNo!= -1 && cells.get(cellNo).getText().trim().replace(" ", "").equals("7707808460"))
            {
            	cells.get(cellNo).click();
            	break;
            }
            */
            /*for(WebElement cell: cells)
            {	
            	if(cell.getText().trim().replace(" ", "").equals("7707808460"))
                {
                    cell.click();
                    System.out.print("CLICKED on Element With " + cell.getText());
                    breakloop = true;
                    break;
                }
            }
            if(breakloop)
            {
            	break;
            }
            */
        }
        /*
        String zoomLevel = "'50%'";
		JavascriptExecutor je = (JavascriptExecutor)driver;
        StringBuffer javascriptValue = new StringBuffer("\"document.body.style.zoom =");
     	//javascriptValue.insert(29, zoomLevel);
        javascriptValue.append(zoomLevel);
        System.out.println(javascriptValue.toString());
        
        
        je.executeScript(javascriptValue.toString());
        
     	*/
       
		/*
		int zoomLevel = 50;
		 String javascriptValue = "\"document.body.style.zoom = '" + zoomLevel + "%';\"";
         System.out.println(javascriptValue);
         
         StringBuffer javascriptValue1 = new StringBuffer("\"document.body.style.zoom = '%';\"");
         javascriptValue1.insert(29, zoomLevel);
         System.out.println(javascriptValue1);
		*/
		/*
		String[] s = new String[]{"w", "l"};
		String[] m = ArrayUtils.clone(s);
		
		for(String j : m)
		{
			System.out.println(j);
		}
		*/
		/*
		StringBuffer sb = new StringBuffer("test");
		sb.replace(1, 2, "o");
		char[] cr = {'e', 'r'};
		sb.append(cr);
		String s = String.copyValueOf(cr);
		System.out.println(sb);
		System.out.println(String.copyValueOf(cr));
		s.getChars(0, s.length() - 1, cr, cr.length - 1);
		for(char c : cr)
		{
			System.out.println(c);
		}
		char[] ch = s.toCharArray();
		for(char chr : ch)
		{
			System.out.println("--" + chr);
		}
		String sp = "tt";
		*/
		/*
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Software\\ChromdDriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.logfile", "D:\\Selenium_Automation\\chromedriver.log");                                 
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://10.102.65.98/s4h/nhsbaby");
        JavascriptExecutor je = (JavascriptExecutor)webDriver;
        int count = 0;
        while(!(je.executeScript("return document.readyState").toString().equals("complete")))
        		{
        			Thread.sleep(1000);
        			count++;
        		}
        System.out.println(count);
        */
        /*
        String button = Keys.chord(Keys.SHIFT, Keys.RETURN);
        webDriver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
        webDriver.switchTo().defaultContent();
        //webDriver.get("http://10.102.65.96/nhsp/nhsbaby");
        //webDriver.manage().window().maximize();
        
        Thread.sleep(9000);
		JavascriptExecutor je = (JavascriptExecutor)webDriver;
		je.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		je.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(3000);
		je.executeScript("window.scrollBy(400,0)");
		Thread.sleep(3000);
		je.executeScript("window.scrollBy(-400,0)");
		Thread.sleep(2000);
		je.executeScript("window.scrollTo(0,document.body.scrollWidth)", "");
		Thread.sleep(2000);
		WebElement element = webDriver.findElement(By.xpath("/html/body/footer/span/a"));
		Thread.sleep(3000);
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(3000);
		je.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(2000);
		je.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		/*
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("LastName", "r");
		map.put("FirstName", "f");
		Set<String> s = map.keySet();
		for(String st: s)
		{
			System.out.println(st);
			s.remove(s);
		}
		*/
		/*
		FileWriter writer = new FileWriter("D://test1234.txt");
		writer.append("address1");
		writer.append(",");
		writer.append("add2");
		writer.flush();
		writer.close();
		
		CSVWriter cwriter = new CSVWriter(new FileWriter("", true), ',');
		String[] userDetails = {"mmmm", "rrrr"};
		cwriter.writeNext(userDetails);
		cwriter.close();
		D://test11.csv
		File file = new File("D://test1234.txt");
		CSVReader reader = new CSVReader(new FileReader(file));
		String[] row = null;
		while((row = reader.readNext()) != null)
		{
			for(int i=0; i< row.length; i++)
			{
				System.out.print(row[i]);
			}
			System.out.println();
		}
		*/
		/*
		CSVWriter writer = new CSVWriter(new FileWriter(file, true), ',');
		String[] userDetails = {"mmmm", "rrrr"};
		writer.writeNext(userDetails);
		writer.close();
		*/
		/*
		FileReader fr = new FileReader("D://test.csv");
		LineNumberReader lr = new LineNumberReader(fr);
		int count = 0;
		while(lr.readLine() != null)
		{
			System.out.println(lr.getLineNumber());
			//lr.setLineNumber(count);
			System.out.println((String) lr.readLine());
			count++;
		}
		System.out.println(count);
		*/
		
		/*	
		  FileInputStream inputStream = new FileInputStream("D:\\Login_Data.xlsx");
		  XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		  Sheet sheet = workbook.getSheetAt(0);
		  Sheet sheet1 = workbook.createSheet();
		  
		  for(int rowNo = 0; rowNo < sheet.getLastRowNum(); rowNo++)
		  {
			  Row currentRow = sheet.getRow(rowNo);
			  
			  for(int columnNo = 0; columnNo < currentRow.getLastCellNum(); columnNo++)
			  {
				  Cell cell = currentRow.getCell(columnNo);
				  System.out.println(cell.toString());
				 				  
			  }
			  
			 
		  }
		  
		  
		  Cell createdCell = sheet1.createRow(0).createCell(1);
		  CellStyle cellStyle = sheet1.getWorkbook().createCellStyle();
		  Font font = sheet.getWorkbook().createFont();
		  font.setBold(true);
		  font.setFontHeight((short)20);
		  cellStyle.setFont(font);
		  createdCell.setCellStyle(cellStyle);
		  createdCell.setCellValue("UserDetails");
		  
		workbook.setSheetName(3, "newsheet");  
		FileOutputStream outputStream = new FileOutputStream("D:\\Login_Data.xlsx");
		workbook.write(outputStream);
		outputStream.close();
		inputStream.close();
		workbook.close();
		*/
				
		/*
		String[] a = new String[15];
		for (int i =0; i< 10; i++)
		{
			a[i] = String.valueOf(i);
			System.out.print(a[i] + " ");
		}
		int i =5;
		for (int j =10; j< a.length; j++)
		{
			a[j] = String.valueOf(i);
			System.out.print(a[j] + " ");
			i++;
		}
		
		Set<String> m = new HashSet<String>();
		
		for(String t: a)
		{
			if(!m.add(t))
			{
				m.add(null);
				System.out.println("duplicate -- " + t);
			}
		}
		*/
			
		
		/*
		int no = 7328432;
		 	StringBuffer noTOReverse = new StringBuffer(String.valueOf(no));
		 	int nou = Integer.parseInt((noTOReverse.reverse().toString()));
		 	System.out.println(nou);
		 	
		 	HashMap<String, String> patientAge = new HashMap<String, String>();
		 	patientAge.put("Patient1", "30");
		 	patientAge.put("Patient2", "50");
		 	patientAge.put("Patient3", "50");
		 	Set Keys = patientAge.keySet();
		 	Iterator itr = Keys.iterator();
		 	
		 	for(Map.Entry<String, String> entry: patientAge.entrySet())
		 	{
		 		System.out.println(entry.getKey() + " ------------ " + entry.getValue());
		 	}
		 	
		 	Iterator<Map.Entry<String, String>> it = patientAge.entrySet().iterator();
		 	while(it.hasNext())
		 	{
		 		Map.Entry<String, String> pair = (Map.Entry) it.next();
		 		System.out.println(" =======================================" + pair.getKey());
		 		it.remove();
		 	}
		 	
		 	
		 	System.out.println("Contains Key - Patient1 " + patientAge.containsKey("Patient1"));
		 	System.out.println("size " + patientAge.size());
		 	System.out.println("String representation " + patientAge.toString());
		 	System.out.println("Replaced value to 40 " + patientAge.replace("Patient1", "40"));
		 	System.out.println("String representation " + patientAge.toString());
		 	System.out.println("isEmpty " + patientAge.isEmpty());
		 	System.out.println("Get Class " + patientAge.getClass());
		 	
		 	
		 	System.out.println("===========================================");
		
		
		 	Properties prop = new Properties();
		 	prop.put("Emp1" , "Test1");
		 	prop.put("Emp2", "Test2");
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		/*
		String str = "I use selenium webdriver. Selenium is a tool for web applications automation. selenium";
		String toBeReplaced = "selenium";
		String toReplacedWith = "Firefox";
		
		String ans = null;
		String[] astr = str.split(" ");
		StringBuffer strb = new StringBuffer();
		
		for ( int i = 0; i <= astr.length - 1; i++ ) 
		{
			if(astr[i].toString().equalsIgnoreCase(toBeReplaced))
			{
				astr[i] = toReplacedWith;
			}
			strb = strb.append(astr[i] + " ");
			
		}
		ans = StringUtils.join(astr, " ");
		System.out.println(strb);	
		System.out.println(astr.toString());
		System.out.println(ans);
		System.out.println("Contains: " + StringUtils.containsAny(ans, "web"));
		System.out.println("replaced---: " + StringUtils.replace(ans, "Selenium", "Firefox"));
		System.out.println("Delete whitespace---: " + StringUtils.deleteWhitespace(ans));
		System.out.println("replaceChars---: " + StringUtils.replaceChars(ans, 'F', 'M'));
		System.out.println("replaceChars---: " + StringUtils.reverse("hbjjk"));
		
		*/
		
    }



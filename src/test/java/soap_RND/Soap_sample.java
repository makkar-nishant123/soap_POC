package soap_RND;

public class Soap_sample {

	public void sample_test()
	{
		
	}
	
/*	
	 
	 import static com.jayway.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;

/**
 * Created by NMakkar on 1/18/2017.
 
public class test_RestAPI {

	*//**
	 * Test Script for get data API.
	 *//*

	@Test
	public void getdata_api() {
		// API Name or Command .
		String Command = "getData";

		// Input (Can be in different format) we are passing it as String.
		String Input = "{\"regionList\":[],\"functionalGroupList\":[{\"id\":\"1400004\",\"name\":\"Technical Support\"}],\"organizationList\":[{\"id\":\"1000\",\"name\":\"Cox\"}],\"lenguage\":\"1100001\",\"firstHitFlag\":\"false\",\"langList\":[{\"id\":\"1100001\",\"name\":\"English\"}],\"timezone\":\"1\",\"lobList\":[{\"id\":\"1200004\",\"name\":\"Residential\"}],\"subLobList\":[{\"id\":\"1300006\",\"name\":\"Residential\"}],\"subfunctionsList\":[{\"id\":\"1500146\",\"name\":\"Technical Support - Technical Support - Data\",\"fgId\":\"1400004\"}],\"functionsList\":[{\"id\":\"1600634\",\"name\":\"Residential - Technical Support - Data - Rancho Mission Viejo Data Tech\"}],\"coeList\":[],\"startTime\":\"0000\",\"endTime\":\"2330\",\"viewDetail\":{\"baseViewId\":\"VIEW_3\",\"viewId\":\"VIEW_3\",\"customStatus\":\"false\"}}";

		// Calling Method for API execution.
		ApiHelper.test_api(Command, Input, ContentType.JSON, null, null);
	}
	
	public static void main(String[] args) {

	    // http://services.aonaware.com/DictService/DictService.asmx?op=Define
	    // http://services.aonaware.com/DictService/DictService.asmx?wsdl
		RequestSpecification reqspec;
		reqspec = given().contentType("text/xml; charset=utf-8");
		
	   String  baseURI = "http://www.holidaywebservice.com";
	    int port = 80;
	    String word = "hand";

	    String myEnvelope = "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
	      "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">" +
	      "<soap12:Body>" +
	      "<Define xmlns=\"http://services.aonaware.com/webservices/\">" +
	      "<word>" + word + "</word>" +
	      "</Define>" +
	      "</soap12:Body>" +
	      "</soap12:Envelope>";
	    
	    
	    String myEnvelope = "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns1=\"http://www.holidaywebservice.com/HolidayService_v2/\">" + 
 "<SOAP-ENV:Body>" + 
   "<ns1:GetHolidaysAvailable>" + 
     "<ns1:countryCode>UnitedStates</ns1:countryCode>" + 
   "</ns1:GetHolidaysAvailable>" + 
 "</SOAP-ENV:Body>" + 
"</SOAP-ENV:Envelope>";
	    
	    Map<String, String> authhdrs = new HashMap<String, String>();
	    authhdrs.put("SOAPAction", "Define");
	    //authhdrs.put("Content-Length", Integer.toString( myEnvelope.length() ) );		
	    String xml = reqspec.given().request()
	      .body( myEnvelope )
	      .when().post( "http://www.holidaywebservice.com//HolidayService_v2/HolidayService2.asmx?wsdl" ).andReturn().asString();
		    
	    //String prettyXML = with(xml).prettyPrint();	    
	    System.out.println( xml );
	    
	    
	    
	  
	}*/
}
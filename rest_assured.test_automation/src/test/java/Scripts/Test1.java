package Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.restAssured.employee.base.BaseLib;
import com.restAssured.employee.util.ApiMethods;

import io.restassured.response.Response;
/**
 * 
 * @author NISARGA
 *
 */
public class Test1 extends BaseLib
{
@Test
public void getTest() throws EncryptedDocumentException, IOException
{
	Response res = ApiMethods.executeRequest("getAllEmployees", REQ_PARA_FILE_PATH, REQ_PARA_SHEET);
	System.out.println(res.prettyPrint());
}
@Test
public void postTest() throws IOException
{
	//Response res=ApiMethods.executeRequest("createEmployee",REQ_PARA_FILE_PATH,REQ_PARA_SHEET);
}
}
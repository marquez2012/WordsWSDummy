package word;

import javax.jws.WebMethod;
import javax.jws.WebService;
//"C:\Program Files\Java\jdk1.8.0_111\bin\wsgen.exe" -verbose -cp . word.WordDayWs -wsdl
//wsgen -verbose -cp . word.WordDayWs -wsdl
//http://localhost:8080/words-api-ws-0.0.1-SNAPSHOT/WordDayWs?wsdl
@WebService
public class WordDayWs {

	@WebMethod
    public String word() {
        return "sadsa";
    }
}

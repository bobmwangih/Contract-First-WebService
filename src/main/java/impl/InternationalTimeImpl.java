package impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import webServiceResources.InternationalTime;

@WebService(serviceName = "internationalTime", endpointInterface = "webServiceResources.InternationalTime", targetNamespace = "http://www.example.org/InternationalTime/", portName = "InternationalTimeSOAP", name = "InternationalTimeImpl")
public class InternationalTimeImpl implements InternationalTime {

	@Override
	public XMLGregorianCalendar getInternationaTime(String country, String city) throws DatatypeConfigurationException {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone(country + "/" + city));
		String dateS = df.format(date);
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(dateS);
	}

}

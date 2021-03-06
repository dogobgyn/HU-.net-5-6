package com.app.connector;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.tempuri.ILoginService;
import org.tempuri.ILogisticsService;
import org.tempuri.IProductService;

public class Connector {
	
	public static ILoginService getLoginServiceInterface() {
		URL wsdlURL = null;
		try {
			wsdlURL = new URL(
					"http://localhost:8733/Design_Time_Addresses/WinkelService/LoginService/?wsdl ");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		QName serviceName = new QName("http://tempuri.org/", "LoginService");
		Service service = Service.create(wsdlURL, serviceName);
		// Dit is de SEI
		ILoginService i = service.getPort(ILoginService.class);

		return i;
	}
	
	public static ILogisticsService getLogisticsServiceInterface() {
		URL wsdlURL = null;
		try {
			wsdlURL = new URL(
					"http://localhost:8733/Design_Time_Addresses/WinkelService/LogisticsService/?wsdl ");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		QName serviceName = new QName("http://tempuri.org/", "LogisticsService");
		Service service = Service.create(wsdlURL, serviceName);
		// Dit is de SEI
		ILogisticsService i = service.getPort(ILogisticsService.class);

		return i;
	}
	
	public static IProductService getProductServiceInterface() {
		URL wsdlURL = null;
		try {
			wsdlURL = new URL(
					"http://localhost:8733/Design_Time_Addresses/WinkelService/ProductService/?wsdl ");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		QName serviceName = new QName("http://tempuri.org/", "ProductService");
		Service service = Service.create(wsdlURL, serviceName);
		// Dit is de SEI
		IProductService i = service.getPort(IProductService.class);

		return i;
	}
}

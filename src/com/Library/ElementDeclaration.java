package com.Library;

public class ElementDeclaration {
	
//	-----------------------------------------------------------------------------------------
//	COMMON DECLARATION
	public static String browserCh = "ch";
	public static String browserFf = "ff";
	public static String browserEd = "ed";
	
//	-----------------------------------------------------------------------------------------
//	ACCESS INFO
	public static final String publicURL = "http://210.245.3.166:8080/cms/";
	public static final String privateURL = "http://10.1.2.35:8080/cms/";
	
//	-----------------------------------------------------------------------------------------	
//	LOGIN ELEMENT	
	public static final String headerLogin	 					= 	"html/body/form/div/div[1]";	
	public static final String txtLoginUsername	 				= 	"html/body/form/div/div[2]/input[1]";
	public static final String txtLoginPassword	 				= 	"html/body/form/div/div[2]/input[2]";
	public static final String btnLoginSubmit		 			= 	"html/body/form/div/div[2]/button";
	public static final String msgLoginFailed					=	".//*[@id='annotationBox']";
	
	public static final String headerLoginText					= 	"Content Management System";
	public static final String btnLoginSubmitText				=	"Submit";
	
	public static final String inputValidUsername 				= 	"000018325";
	public static final String inputValidPassword 				= 	"abc@123456";
	
	public static final String inputInvalidUsername				=	"0000000";
	public static final String inputInvalidPassword				=	"123123";
	public static final String msgLoginFailedContent			=	"Note : Wrong user name or password!s";
	
	
	public static final String headerMain						= 	".//*[@id='headerBar']/div[1]";
	public static final String headerMainText					= 	"TC Mobile System";
	
//	-----------------------------------------------------------------------------------------	
//	PRESENTATION LIST ELEMENT
	public static final String titlePresentationList			=	".//*[@id='addform']/div/div[1]";
	public static final String titlePresentationListText		=	"Presentation List";
	
	public static final String btnDynamicSpecSheet				=	".//*[@id='addform']/div/div[1]/span[4]/a/button";
	public static final String btnDynamicSpecSheetText			=	"Dynamic Spec Sheet";
	
	public static final String btnOrder							=	".//*[@id='addform']/div/div[1]/span[3]/a/button";
	public static final String btnOrderText						=	"Order";
	
	public static final String btnSurvey						=	".//*[@id='addform']/div/div[1]/span[2]/a/button";
	public static final String btnSurveyText					=	"Survey";
	
	public static final String btnAdd							=	".//*[@id='addform']/div/div[1]/span[1]/button";
	public static final String btnAddText						=	"Add";
}

package com.qa.Config;

public class configuration {
 
	//Testsite
	public static final String testsite="https://www.google.com/";
	public static final String browser="chrome";
//==================================================================================	
	//gmail loginPages....11Question
	
	public static final String signin="(//div[@class='gb_Vf']//a)[2]";
	public static final String username="//input[@class='whsOnd zHQkBf']";
	public static final String next1="//span[@class='VfPpkd-vQzf8d']/following-sibling::div[1]";
	public static final String password="//input[@class='whsOnd zHQkBf']";
	public static final String next2="//span[text()='Next']/following-sibling::div";
	
	public static final String Gmail1="//a[@class='gb_g']";
	//public static final String GoogleApps="//*[@id='gbwa']/div/a";
	//public static final String Gmail="//span[text()='Gmail']";
	public static final String Starred="(//a[contains(@class,'J-Ke n0')])[2]";
	public static final String TotalNoEmailStarred ="(//span[text()='5'])[2]";//(//span[text()='5'])[2]";
	//public static final String TotalNoEmail ="//*[@id=':p9']/span/span[2]";
	
	
	
//==================================================================================	
	//unread emai inbox count....12Question 
	public static final String UnreadEmail="//*[@id=':4f']";//tr[@class='zA zE']
	public static final String ReadEmailCount="//tr[@class='zA yO']";
	public static final String TotalEmail="//span[text()='66']";



//==================================================================================

    //Compose Verify email.....13Question
	public static final String Composebtn="//div[text()='Compose']";
	//public static final String Compose="/html/body/div[21]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]";
	public static final String Compose="//div[@role='dialog']";///html/body/div[20]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div";

//======================================================================================
	
	//sending email verify user recevie....14Question
	public static final String To="//textarea[@name='to']";
	public static final String Subject="//input[@name='subjectbox']";
	public static final String MsgBox="//div[contains(@class,'Ar Au')]//div[1]";
	public static final String Send="//div[@data-tooltip-delay='800']";
	public static final String Sentbtn="(//span[@class='nU ']//a)[3]";
	public static final String Sentinbox="//*[@id=':lr']";


//===================================================================================
	
	//search btn verify email inbox...15Question
	public static final String Search="//input[@placeholder='Search mail']";
	public static final String Searchbtn="//*[@id='aso_search_form_anchor']/button[4]";//button[@class='gb_yf gb_zf']";
	public static final String SearchInbox="(//span[text()='11'])[2]";
	

//================================================================

	 //verify attachmentinboxEmail...16Question
	public static final String Searchoptionbtn="//*[@id='aso_search_form_anchor']/button[2]";  //div[contains(@class,'gb_Ud gb_ee')]";
	public static final String AllMail="(//div[@data-tooltip='All Mail']//div)[2]";
	public static final String Inbox="(//div[@role='option']//div)[2]";////div[text()='Inbox']
	public static final String HasAttechment="//input[@type='checkbox']/following-sibling::label";
	public static final String Searchbtn1="(//div[text()='Search'])[2]";
	public static final String countNoTotalAttachmt="(//span[text()='2'])[2]";
    public static final String Inboxmail="//a[contains(@class,'J-Ke n0')]";

    
//==========================================================================================

   //Clickon Settingbtn and Verify settingFuntion...17Question
    public static final String Settingbtn="//div[@data-tooltip='Settings']//a[1]";
    public static final String allSetting="//button[text()='See all settings']";
    public static final String SettingsTxt="//div[contains(@class,'nH qZ')]";


//=================================================================================
   
    //create new label link.............18Question
    public static final String Createnewlabelbtn="//div[contains(@class,'CL Wj')]//a[1]";
    public static final String PleaseEnterNewLabel="//label[text()='Please enter a new label name:']/following::input";
    public static final String Createbtn="//button[text()='Create']";
    public static final String Testing="//div[@data-tooltip='Testing']";
    public static final String Testingdtbtn="//div[@data-label-name='Testing']";
    public static final String Removelabel="//div[text()='Remove label']";
    public static final String Deletelabel="//button[text()='Delete']";


//====================================================================================
    
    //Verify email Moved......19Question
    public static final String Selectemailbox="//*[@id=':io']";
    public static final String Clickegcheckbox="//*[@id=':2i']";
    public static final String MovetoIcon="//div[@data-tooltip='Move to']//div";
    public static final String label1="(//div[contains(@class,'TN aY7xie')]//div)[3]";
    public static final String labelbtn="//a[@aria-label='Label1 has menu']";
    public static final String Verifylabelmail="//tr[@aria-labelledby=':na']";
    
   /* public static final String Selectlabelmail="//*[@id=':1qi']";
    public static final String Clickegcheckbox1="//*[@id=':1ql']";
    public static final String Moveto="//div[@id=':1la']//div";
    public static final String label2="(//div[text()='label2'])[2]";
    
    public static final String Clickbtnlabel2 ="//div[@id=':kj']/div[1]/div[3]/span[1]/a[1]";
    public static final String Verifylabelbox2="//*[@id=':p5']";
   
    */
   

//==========================================================================================

  //Gmail SignOut Successfully...20Question
    
    public static final String LogobtnClick="//img[@class='gb_Ia gbii']";
    public static final String signOutClick="//a[contains(@class,'gb_Ib gb_eg')]";
    public static final String RemoveanAccount="//div[text()='Remove an account']";
    public static final String Removeemail="//body[@id='yDmH0d']/div[1]/div[2]";
    public static final String RemoveAccountYes="(//span[text()='Yes, remove'])[2]";


}

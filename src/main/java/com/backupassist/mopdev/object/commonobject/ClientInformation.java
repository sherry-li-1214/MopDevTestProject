package com.backupassist.mopdev.object.commonobject;

import java.util.ArrayList;

//import com.emc.webautomation.commonUtil.*;

import org.json.JSONObject;

/**
 * Created by sherry on 1/7/201.
 */
@SuppressWarnings("unused")

public class ClientInformation{

    private String first_name = "";
    private String last_name = "";
    private String company="";
    private String address="";
    private String post_code="";
    private String company_phone="";
    private String city="";
    private String country="";
    private String title="";
    private String email = "";
    private String phone = "";

    public ClientInformation(){
    }
    
    public ClientInformation(String firstName,String lastName,String company,String email,String phone){
       this.first_name=firstName;
       this.last_name=lastName;
       this.company=company;
       this.email=email;
       this.phone=phone;
}

   public void loadClientFromJSON(JSONObject json) throws Exception{
    	JSONObject jsonClient=(JSONObject)json.get("Client");
    	
    	  this.company=jsonClient.getString("Company");
          this.address=jsonClient.getString("Address");
          this.city=jsonClient.getString("City");
          this.post_code=jsonClient.getString("Post Code");
          
         this.country=jsonClient.getString("Country");
         this.company_phone=jsonClient.getString("Company Phone");
    	 this.first_name=jsonClient.getString("First Name");
         this.last_name=jsonClient.getString("Last Name");
         this.title=jsonClient.getString("Title");
         this.email=jsonClient.getString("Email");
         this.phone=jsonClient.getString("Phone");
    
 }
     
    @Override
    public String toString(){
        return String.format(
                "First Name:  " + this.first_name + "\n"
                + "Last Name: " + this.last_name + "\n"
                + "Company Name: " + this.company + "\n"
                + "Email:  " + this.email + "\n"
                + "Phone:  " + this.phone + "\n"
        );
    }


        /**
         * 
         * @return
         */
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company=company;
    }
  
    public String getAddress(){
    	return address;
    }
    
    public String getCity(){
    	return city;
    }
    public String getPostCode(){
    	return post_code;
    }
    public String getCountry(){
    	return country;
    }
    public String getCompanyPhone(){
    	return company_phone;
    }
    
    public String getTitle(){
    	return title;
    }
    
    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String firstName) {
      this.first_name=firstName;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
    }
  
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
  
    
    /**
     * put the wrong format information into lIST
     * 
     * @param clientInfo
     * @return
     */
   /** public ArrayList<String> getErrorFormatInfo(ClientInformation clientInfo){
    	ArrayList<String>  arrayList=new ArrayList<String>();
        if(!(InputValidation.isValidString(clientInfo.getFirstName()))) {
        	//hasResult.put(clientInfo.getFirstName(),"true");
          	arrayList.add("FirstName");
        } 
        if(!InputValidation.isValidString(clientInfo.getCompanyName())) {
        	//hasResult.put(clientInfo.getFirstName(),"true");
          	arrayList.add("FirstName");
        } 
   
        if(!InputValidation.isValidEmail(clientInfo.getEmail())){
        	arrayList.add("Email");
        }
    	
        if(!InputValidation.isValidNumbe(clientInfo.getPhone())){
        	arrayList.add("Phone");
        }
    	//Iterator  iterator= clientInfo. Iterator(clientInfo);
    	return arrayList;
    	
    }
    **/
    
   
}

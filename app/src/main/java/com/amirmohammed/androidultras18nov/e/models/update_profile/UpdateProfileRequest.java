package com.amirmohammed.androidultras18nov.e.models.update_profile;

import com.google.gson.annotations.SerializedName;

public class UpdateProfileRequest{

	@SerializedName("password")
	private String password;

	@SerializedName("phone")
	private String phone;

	@SerializedName("name")
	private String name;

	@SerializedName("email")
	private String email;

	public UpdateProfileRequest(String password, String phone, String name, String email) {
		this.password = password;
		this.phone = phone;
		this.name = name;
		this.email = email;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"UpdateProfileRequest{" + 
			"password = '" + password + '\'' + 
			",phone = '" + phone + '\'' + 
			",name = '" + name + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}
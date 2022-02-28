package com.amirmohammed.androidultras18nov.e.models.favourites.delete;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("product")
	private Product product;

	@SerializedName("id")
	private int id;

	public void setProduct(Product product){
		this.product = product;
	}

	public Product getProduct(){
		return product;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"product = '" + product + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
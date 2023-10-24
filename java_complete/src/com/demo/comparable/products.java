package com.demo.comparable;

public class products  implements Comparable<products>{


	private int id;
	private String prodName;
	
	products(int id,String prodName){
		this.id=id;
		this.prodName=prodName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	@Override
	public String toString() {
		return("value"+id+prodName);
	}
	
	

	@Override
	public int compareTo(products twoObj) {
		// TODO Auto-generated method stub
		
		//for String
	//return this.getProdName().compareTo(twoObj.getProdName());
		
		
		//for integer
		if(this.getId()<twoObj.getId()) {
			return -1;
		}
		else if(this.getId()>twoObj.getId()) {
			return 1;
		}
		else
			return 0;
			
		
	
	}
	
}

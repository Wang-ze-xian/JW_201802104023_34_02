package com.example.demo.bysj.domain;

import com.example.demo.util.IdService;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public final class Department implements Comparable<Department>,Serializable{
	@JsonProperty(value = "id")
	private int id;
	@JsonProperty(value = "description")
	private String description;
	@JsonProperty(value = "no")
	private String no;
	@JsonProperty(value = "remarks")
	private String remarks;
	@JsonProperty(value = "school")
	private School school;
	{
		this.id = IdService.getId();
	}


	public Department(String description, String no,
					  String remarks, School school) {
		super();
		this.description = description;
		this.no = no;
		this.remarks = remarks;
		this.school = school;
	}

	public Department(String description, String no, String remarks, School school, int id) {
		this.description = description;
		this.no = no;
		this.remarks = remarks;
		this.school = school;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	/**
	 * Constructs a <code>String</code> with all attributes
	 * in name = value format.
	 *
	 * @return a <code>String</code> representation 
	 * of this object.
	 */
	public String toString()
	{
	    final String TAB = "    ";
	    
	    String retValue = "";
	    
	    retValue = "Department ( "
	        + super.toString() + TAB
	        + "id = " + this.id + TAB
	        + "description = " + this.description + TAB
	        + "no = " + this.no + TAB
	        + "remarks = " + this.remarks + TAB
	        + "school_json = " + this.school + TAB
	        + " )";
	
	    return retValue;
	}

	@Override
	public int compareTo(Department o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	
}
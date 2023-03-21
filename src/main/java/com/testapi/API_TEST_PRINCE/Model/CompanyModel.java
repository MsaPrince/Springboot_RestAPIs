package com.testapi.API_TEST_PRINCE.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
@Table(name = "companyinfo_table")
public class CompanyModel {

	@Column(name="company_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer company_id;
	
	@Column
	private String company_name;
	
	@Column
	private String company_address;
	
	@Column
	private Double company_revenue;
	
	@Column
	private Integer employees_no;

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_address() {
		return company_address;
	}

	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}

	public Double getCompany_revenue() {
		return company_revenue;
	}

	public void setCompany_revenue(Double company_revenue) {
		this.company_revenue = company_revenue;
	}

	public Integer getEmployees_no() {
		return employees_no;
	}

	public void setEmployees_no(Integer employees_no) {
		this.employees_no = employees_no;
	}
	
	
	
}

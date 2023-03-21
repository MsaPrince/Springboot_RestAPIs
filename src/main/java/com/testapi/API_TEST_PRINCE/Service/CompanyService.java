package com.testapi.API_TEST_PRINCE.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapi.API_TEST_PRINCE.Model.CompanyModel;
import com.testapi.API_TEST_PRINCE.Repository.CompanyRepository;

@Service
public class CompanyService
{
	@Autowired
	CompanyRepository companyRepo;
	
	public List<CompanyModel> returnCompInfo(){
		return companyRepo.findAll();
	}
	
	public CompanyModel saveCompInfo(CompanyModel model) {
		return companyRepo.save(model);
	}
	
	public CompanyModel getCompInfById(Integer id)
	{
		Optional<CompanyModel> compMod = companyRepo.findById(id);
		 if(compMod.isPresent())
		 {
			return compMod.get();
		 }
		 
		  throw new RuntimeException("The id " + id + " is not found in the inventory");	 
	}
	
	public CompanyModel updateCompInf(CompanyModel model) {
		return companyRepo.save(model);
	}
	
	public void deleteCompIfoById(Integer id) {
		companyRepo.deleteById(id);
	}
	
	
	
}

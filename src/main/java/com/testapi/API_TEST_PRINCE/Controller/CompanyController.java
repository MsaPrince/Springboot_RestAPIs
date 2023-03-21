package com.testapi.API_TEST_PRINCE.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testapi.API_TEST_PRINCE.Model.CompanyModel;
import com.testapi.API_TEST_PRINCE.Service.CompanyService;

@RestController
public class CompanyController {

	
	@Autowired
	CompanyService service;
	
	
	@GetMapping("/compInfo")
	public List<CompanyModel> showCompInfo()
	{
		return service.returnCompInfo();
	}
	
	@GetMapping("/compInfo/{id}")
	public CompanyModel getCompInfById(@PathVariable Integer id) {
		return service.getCompInfById(id);
	}
	
	
	@PostMapping("/compInfo")
	public CompanyModel saveCompInfo(@RequestBody CompanyModel model) {
		return service.saveCompInfo(model);
	}
	
	
	@DeleteMapping("/compInfo/{id}")
	public void deleteCompInfById(@PathVariable Integer id)
	{
		service.deleteCompIfoById(id);
	}
	
	@PutMapping("/compInfo/{id}")
	public CompanyModel updateCompInfoById(@PathVariable Integer id, @RequestBody CompanyModel model) {
		model.setCompany_id(id);
		return service.updateCompInf(model);
	}
}

package com.testapi.API_TEST_PRINCE.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testapi.API_TEST_PRINCE.Model.CompanyModel;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyModel,Integer>
{

}

package in.nareshit.raghu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.entity.Specialization;
import in.nareshit.raghu.repo.SpecializationRepository;
import in.nareshit.raghu.service.ISpecializationService;

@Service
public class SpecializationServiceImpl 
	implements ISpecializationService
{

	@Autowired
	private SpecializationRepository repo; //HAS-A
	
	@Override
	public Long saveSpecialization(Specialization obj) {
		obj = repo.save(obj); //INSERT
		return obj.getSpecId();//PK
	}
}

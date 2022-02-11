package in.nareshit.raghu.service;

import java.util.List;

import in.nareshit.raghu.entity.Specialization;

public interface ISpecializationService {

	Long saveSpecialization(Specialization obj);
	List<Specialization> getAllSpecializations();
	void deleteSpecialization(Long id);
	Specialization getOneSpecialization(Long id);
}

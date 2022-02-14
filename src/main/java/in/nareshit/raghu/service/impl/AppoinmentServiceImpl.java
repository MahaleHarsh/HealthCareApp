package in.nareshit.raghu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.entity.Appoinment;
import in.nareshit.raghu.repo.AppoinmentRepository;
import in.nareshit.raghu.service.IAppoinmentService;

/**
 * @author:RAGHU SIR 
 *  Generated F/w:SHWR-Framework 
 */
@Service
public class AppoinmentServiceImpl implements IAppoinmentService {
	@Autowired
	private AppoinmentRepository repo;

	public Long saveAppoinment(Appoinment appoinment) {
		return repo.save(appoinment).getId();
	}

	public void updateAppoinment(Appoinment appoinment) {
		repo.save(appoinment);
	}

	public void deleteAppoinment(Long id) {
		repo.deleteById(id);
	}

	public Appoinment getOneAppoinment(Long id) {
		return repo.findById(id).get();
	}

	
	public List<Appoinment> getAllAppoinments() {
		return repo.findAll();
	}
}

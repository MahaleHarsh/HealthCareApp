package in.nareshit.raghu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.entity.Doctor;
import in.nareshit.raghu.repo.DoctorRepository;
import in.nareshit.raghu.service.IDoctorService;

@Service
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private DoctorRepository repo;
	
	public Long saveDoctor(Doctor doc) {
		return repo.save(doc).getDocId();
	}

	public List<Doctor> getAllDoctors() {
		return repo.findAll();
	}

	public Doctor getOneDoctor(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public void deleteDoctor(Long id) {
		repo.deleteById(id);
	}

	@Override
	public void updateDoctor(Doctor doc) {
		repo.save(doc);
	}

}

package com.example.doctor_microservice_yarab.Service;
import com.example.doctor_microservice_yarab.Model.doctorModel;
import com.example.doctor_microservice_yarab.repo.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }
    public doctorModel saveDoctor(doctorModel doctorModel) {
        return doctorRepository.save(doctorModel);
    }
    public List<doctorModel> getAllDoctors() {
        return doctorRepository.findAll();
    }


}

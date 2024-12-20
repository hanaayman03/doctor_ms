package com.example.doctor_microservice_yarab.repo;


import com.example.doctor_microservice_yarab.Model.doctorModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepository extends MongoRepository<doctorModel, Integer>{
}

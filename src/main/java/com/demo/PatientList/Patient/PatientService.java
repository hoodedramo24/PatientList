package com.demo.PatientList.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    public void addPatient(Patient newPatient){
        patientRepository.save(newPatient);
    }

    public List<Patient> findAllPatients(){
        return patientRepository.findAll();
    }

    public void deleteAllPatients(){
        patientRepository.deleteAll();
    }

    public void updatePatientByID(Patient updatePatient, Long id){
       if (patientRepository.existsById(id)){
           patientRepository.save(updatePatient);
       }
    }

    public Optional<Patient> findPatientByID(Long id){
        if (patientRepository.existsById(id)){
            return patientRepository.findById(id);
        }
        return null;
    }

    public void deletePatientByID(long id){
        if (patientRepository.existsById(id)){
            patientRepository.deleteById(id);
        }
    }
}

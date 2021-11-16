package com.demo.PatientList.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
public class PatientController {

    @Autowired
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


    //Endpoints
    @PostMapping("/patient")
    public void postPatient(@RequestBody Patient newPatient){
        patientService.addPatient(newPatient);
    }

    @GetMapping("/patient")
    public List<Patient> getPatients(){
        return patientService.findAllPatients();
    }

    @DeleteMapping("/patient")
    public void deletePatients(){
        patientService.deleteAllPatients();
    }

    @PutMapping("/patient/{id}")
    public void putPatientByID(@RequestBody Patient updatePatient, @RequestParam Long id){
        patientService.updatePatientByID(updatePatient, id);
    }

    @GetMapping("/patient/{id}")
    public Optional<Patient> getPatientByID(@RequestParam Long id){
        return patientService.findPatientByID(id);
    }

    @DeleteMapping("/patient/{id}")
    public void deletePatientByID(@RequestParam Long id){
        patientService.deletePatientByID(id);
    }
}

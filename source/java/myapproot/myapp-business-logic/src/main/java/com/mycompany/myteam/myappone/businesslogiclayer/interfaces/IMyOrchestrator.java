package com.mycompany.myteam.myappone.businesslogiclayer.interfaces;

import com.mycompany.myteam.myappone.businesslogiclayer.domain.Patient;

import java.util.Collection;

public interface IMyOrchestrator {

    Patient getAPatient(String patientKey);

    Collection<Patient> getPatientsByPaging(int pageNumber, int pageSize);

}

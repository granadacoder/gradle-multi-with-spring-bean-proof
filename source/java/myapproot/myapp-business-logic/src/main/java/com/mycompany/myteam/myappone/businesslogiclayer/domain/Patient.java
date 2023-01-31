package com.mycompany.myteam.myappone.businesslogiclayer.domain;

public final class Patient {

    private final String patientKey;

    public Patient(String patientKey) {
        this.patientKey = patientKey;
    }

    public String getPatientKey() {
        return patientKey;
    }
}

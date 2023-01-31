package com.mycompany.myteam.myappone.businesslogiclayer;

import com.mycompany.myteam.clientproxies.myclientproxy.domain.Employee;
import com.mycompany.myteam.clientproxies.myclientproxy.interfaces.IMyClientProxy;
import com.mycompany.myteam.myappone.businesslogiclayer.domain.Patient;
import com.mycompany.myteam.myappone.businesslogiclayer.interfaces.IMyOrchestrator;

import java.util.Collection;

public final class MyOrchestrator implements IMyOrchestrator {

    public static final String ERROR_MSG_STRING_GENERIC_CLIENT_IS_NULL = "IMyClientProxy is null";

    private final IMyClientProxy clientProxy;

    public MyOrchestrator(IMyClientProxy clientProxy) {
        if (null == clientProxy) {
            throw new IllegalArgumentException(ERROR_MSG_STRING_GENERIC_CLIENT_IS_NULL);
        }

        this.clientProxy = clientProxy;
    }

    @Override
    public Patient getAPatient(String patientKey) {
        Patient returnItem = null;
        Employee emp = this.clientProxy.getAEmployee(patientKey);
        if (null != emp) {
            returnItem = new Patient(emp.getEmployeeKey());
        }
        return returnItem;
    }

    @Override
    public Collection<Patient> getPatientsByPaging(int pageNumber, int pageSize) {
        Collection<Patient> returnItems = java.util.Collections.emptyList();
        Collection<Employee> emps = this.clientProxy.getEmployeesByPaging(pageNumber, pageSize);
        if (null != emps && !emps.isEmpty()) {
            returnItems = new java.util.ArrayList<>();
            for (Employee emp : emps) {
                returnItems.add(new Patient(emp.getEmployeeKey()));
            }
        }
        return returnItems;
    }
}

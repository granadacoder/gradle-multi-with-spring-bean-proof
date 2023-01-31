package com.mycompany.myteam.clientproxies.myclientproxy.interfaces;

import com.mycompany.myteam.clientproxies.myclientproxy.domain.Employee;

import java.util.Collection;

public interface IMyClientProxy {

    Employee getAEmployee(String employeeKey);

    Collection<Employee> getEmployeesByPaging(int pageNumber, int pageSize);

}

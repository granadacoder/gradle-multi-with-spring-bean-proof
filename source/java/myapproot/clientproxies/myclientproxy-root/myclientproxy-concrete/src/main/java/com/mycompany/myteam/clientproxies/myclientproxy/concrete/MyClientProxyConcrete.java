package com.mycompany.myteam.clientproxies.myclientproxy.concrete;

import com.mycompany.myteam.clientproxies.myclientproxy.domain.Employee;
import com.mycompany.myteam.clientproxies.myclientproxy.interfaces.IMyClientProxy;

import java.util.Arrays;
import java.util.Collection;

public final class MyClientProxyConcrete implements IMyClientProxy {
    @Override
    public Employee getAEmployee(String employeeKey) {
        Employee returnItem = new Employee(employeeKey);
        return returnItem;
    }

    @Override
    public Collection<Employee> getEmployeesByPaging(int pageNumber, int pageSize) {
        Employee p1 = new Employee(String.valueOf(pageNumber));
        Employee p2 = new Employee(String.valueOf(pageSize));
        Collection<Employee> returnItems = Arrays.asList(p1, p2);
        return returnItems;
    }
}

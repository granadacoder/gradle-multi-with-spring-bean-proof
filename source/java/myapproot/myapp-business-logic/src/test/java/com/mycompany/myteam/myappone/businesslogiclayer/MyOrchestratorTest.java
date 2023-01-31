package com.mycompany.myteam.myappone.businesslogiclayer;

import com.mycompany.myteam.clientproxies.myclientproxy.domain.Employee;
import com.mycompany.myteam.clientproxies.myclientproxy.interfaces.IMyClientProxy;
import com.mycompany.myteam.myappone.businesslogiclayer.domain.Patient;
import com.mycompany.myteam.myappone.businesslogiclayer.interfaces.IMyOrchestrator;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyOrchestratorTest {

    private static final String EMPLOYEE_KEY_ONE = "UnitTestEmpOne";

    @Test
    public void testOne() {
        IMyClientProxy genericClientMock = this.getDefaultIMyClientProxyMock();

        Employee emp = this.getDefaultEmployee();

        Object whenDefinition = genericClientMock
                .getAEmployee(anyString());

        when((Object) whenDefinition)
                .thenReturn(emp);

        IMyOrchestrator testItem = new MyOrchestrator(genericClientMock);

        Patient result = testItem.getAPatient("");
        Assert.assertEquals(EMPLOYEE_KEY_ONE, emp.getEmployeeKey());

    }

    private IMyClientProxy getDefaultIMyClientProxyMock() {
        IMyClientProxy returnMock = mock(IMyClientProxy.class); //, new ReturnsDeepStubs());
        when(returnMock.getAEmployee(anyString())).thenReturn(this.getDefaultEmployee());
        return returnMock;
    }

    private Employee getDefaultEmployee() {
        Employee returnItem = new Employee(EMPLOYEE_KEY_ONE);
        return returnItem;
    }

}

package tests;

import config.TestDataBaseConfig;
import my.app.entities.Customer;
import my.app.entities.Project;
import my.app.service.CustomerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataBaseConfig.class)
@WebAppConfiguration
public class CustomerServiceMockTest {

    @Autowired
    CustomerService customerService;

    private Customer expected;

    Customer customerMock;

    private String message = "test mock customer";
    private String toStringMessage = "Customer{}";

    @Before
    public void init() {
        customerMock = mock(Customer.class);
        when(customerMock.getName()).thenReturn(message);

        when(customerMock.toString()).thenReturn(toStringMessage);
    }

    @Test
    public void testMockGetByName() throws Exception {

        assertSame(customerMock.getName(), message);
    }

    @Test
    public void testToStringMethod() throws Exception {
        assertSame(customerMock.toString(), toStringMessage);
    }

    //P.S. да, я знаю, что в тупую тестирую геттер и вообще такое в здравом уме не тестируют
    // но ведь это учебный проект
}
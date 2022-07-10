package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MemoryCustomerRepository implements CustomerRepository {

    private List<Customer> customerList= new ArrayList<>();
    private CustomerLogger customerLogger;


    @Autowired    // wstrzykiwanie zaleznosci
    public MemoryCustomerRepository (CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;

    }


    @Override
    public void addCustomer() {
        customerLogger.log();


    }

    @Override
    public void removeCustomer() {
        customerLogger.log();
    }

    @Override
    public void getCustomersList() {
        customerLogger.log();
    }
}

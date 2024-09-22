package com.project.hexagonal.application.core.usecase;

import com.project.hexagonal.application.core.domain.Customer;
import com.project.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.project.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import com.project.hexagonal.application.ports.out.exception.CustomerNotFoundException;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found"));
    }

}

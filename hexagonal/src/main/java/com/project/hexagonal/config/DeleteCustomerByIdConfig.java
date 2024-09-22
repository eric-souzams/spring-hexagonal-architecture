package com.project.hexagonal.config;

import com.project.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.project.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.project.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.project.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.project.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.project.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                                           DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }

}

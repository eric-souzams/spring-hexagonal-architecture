package com.project.hexagonal.config;

import com.project.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.project.hexagonal.adapters.out.InsertCustomerAdapter;
import com.project.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.project.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       InsertCustomerAdapter insertCustomerAdapter,
                                                       SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }

}

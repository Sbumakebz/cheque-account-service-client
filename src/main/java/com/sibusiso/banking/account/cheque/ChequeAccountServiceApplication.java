package com.sibusiso.banking.account.cheque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.sibusiso.banking.account.cheque"})
@EnableJpaRepositories(basePackages="com.sibusiso.banking.account.cheque")
@EnableTransactionManagement
@EntityScan(basePackages="com.sibusiso.banking.account.cheque")
public class ChequeAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChequeAccountServiceApplication.class, args);
	}

}

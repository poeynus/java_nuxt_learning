package com.easybytes.config;

import com.easybytes.model.Customer;
import com.easybytes.model.SecurityCustomer;
import com.easybytes.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EazyBankUserDetails implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> customer = customerRepository.findByEmail(username);
        if(customer.size() == 0) {
            throw new UsernameNotFoundException("Not Found User" + username);
        }
        return  new SecurityCustomer(customer.get(0));
    }
}

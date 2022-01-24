package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Customer {
    int id;
    String name;
    String companyName;
    String lastname;
    String documentType;
    String documentNumber;
    String phoneNumber;
    String email;
    String clientType;
}

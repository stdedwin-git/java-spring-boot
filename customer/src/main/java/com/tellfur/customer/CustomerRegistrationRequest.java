package com.tellfur.customer;

public record CustomerRegistrationRequest(String firstName,
                                          String lastName,
                                          String email) {
}

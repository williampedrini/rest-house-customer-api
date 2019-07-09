package com.custodio.resthouse.customer.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("Customer API")
@RequestMapping("/customers")
public class CustomerRestController
{
    @ApiOperation("Search for all the existing registered customers.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successfully return a list of all existing customers.", response = String.class),
            @ApiResponse(code = 400, message = "An error occurred while performing the search for all customers.", response = String.class)
    })
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasAuthority('CUSTOMER_READ')")
    public String findAll()
    {
        return "findAll";
    }

    @ApiOperation("Search for a customer by a specific code.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successfully return a specific customer by code.", response = String.class),
            @ApiResponse(code = 400, message = "An error occurred while performing the search for a specific customer.", response = String.class)
    })
    @GetMapping("/{code}")
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasAuthority('CUSTOMER_READ')")
    public String findByCode(@PathVariable("code") final String code)
    {
        return "findByCode";
    }
}
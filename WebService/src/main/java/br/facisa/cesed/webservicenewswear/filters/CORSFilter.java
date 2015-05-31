package br.facisa.cesed.webservicenewswear.filters;


import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atylla
 */
public class CORSFilter implements ContainerResponseFilter{

   @Override
    public ContainerResponse filter(ContainerRequest request, ContainerResponse response) {
        response.getHttpHeaders().add("Access-Control-Allow-Origin", "*");
        response.getHttpHeaders().add("Access-Control-Allow-Headers", "content-type");
        response.getHttpHeaders().add("Access-Control-Allow-Credentials","true");
        response.getHttpHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        
        return response;
    }
    
}

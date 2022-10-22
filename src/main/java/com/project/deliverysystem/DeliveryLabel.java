package com.project.deliverysystem;

import org.springframework.stereotype.Component;

@Component
public class DeliveryLabel {
    private String message;
    private String address;

    public DeliveryLabel(){}
    public DeliveryLabel(String arg_message, String arg_address){
        this.message = arg_message;
        this.address = arg_address;
    }

    public String getAddress(){
        return address;
    }

    public String getMessage(){
        return message;
    }
}

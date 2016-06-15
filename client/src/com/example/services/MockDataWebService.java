package com.example.services;

import com.codename1.util.Callback;
import com.example.dto.UpdateDeviceRequest;
import com.example.dto.UpdateDeviceResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shannah
 */
public class MockDataWebService implements WebServiceClient {
    
   
    
    
    public MockDataWebService() {
       
    }

   
    @Override
    public void updateDeviceLocation(UpdateDeviceRequest request, Callback<UpdateDeviceResponse> callback) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

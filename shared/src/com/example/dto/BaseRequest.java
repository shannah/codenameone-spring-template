/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dto;

import java.util.Map;

/**
 *
 * @author shannah
 */
public class BaseRequest {
    private int id;
    private String deviceId;
    private Map requestData;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    } 

    /**
     * @return the requestData
     */
    public Map getRequestData() {
        return requestData;
    }

    /**
     * @param requestData the requestData to set
     */
    public void setRequestData(Map requestData) {
        this.requestData = requestData;
    }
    
}

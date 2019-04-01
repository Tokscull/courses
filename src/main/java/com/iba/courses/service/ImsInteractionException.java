package com.iba.courses.service;

import com.ibm.ims.connect.ImsConnectApiException;

public class ImsInteractionException extends Throwable {
    public ImsInteractionException(String s, ImsConnectApiException e) {
        System.out.println(s);
        System.out.println(e);
    }

}

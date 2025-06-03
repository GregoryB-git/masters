/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Map
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.ResponseValidityChecker;
import java.util.Map;

public class ResponseDataHolder {
    private int a;
    private byte[] b;
    private Map c;
    private final ResponseValidityChecker d;

    public ResponseDataHolder(ResponseValidityChecker responseValidityChecker) {
        this.d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.a;
    }

    public byte[] getResponseData() {
        return this.b;
    }

    public Map getResponseHeaders() {
        return this.c;
    }

    public boolean isValidResponse() {
        return this.d.isResponseValid(this.a);
    }

    public void setResponseCode(int n7) {
        this.a = n7;
    }

    public void setResponseData(byte[] byArray) {
        this.b = byArray;
    }

    public void setResponseHeaders(Map map) {
        this.c = map;
    }
}


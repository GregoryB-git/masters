/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Calendar
 *  java.util.GregorianCalendar
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.NetworkTask$Method;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RequestDataHolder {
    private NetworkTask$Method a = NetworkTask$Method.GET;
    private final Map b = new HashMap();
    private byte[] c = null;
    private Long d;
    private Integer e;

    public void applySendTime(long l8) {
        this.d = l8;
        l8 = TimeUnit.MILLISECONDS.toSeconds(l8);
        this.e = ((GregorianCalendar)Calendar.getInstance()).getTimeZone().getOffset(l8 * 1000L) / 1000;
    }

    public Map getHeaders() {
        return this.b;
    }

    public NetworkTask$Method getMethod() {
        return this.a;
    }

    public byte[] getPostData() {
        return this.c;
    }

    public Long getSendTimestamp() {
        return this.d;
    }

    public Integer getSendTimezoneSec() {
        return this.e;
    }

    public void setHeader(String string, String ... stringArray) {
        this.b.put((Object)string, (Object)Arrays.asList((Object[])stringArray));
    }

    public void setPostData(byte[] byArray) {
        this.a = NetworkTask$Method.POST;
        this.c = byArray;
    }
}


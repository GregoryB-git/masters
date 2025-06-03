/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.yandex.metrica.network;

import com.yandex.metrica.network.Request;
import java.util.HashMap;
import java.util.Map;

public class Request$Builder {
    private final String a;
    private String b;
    private byte[] c = new byte[0];
    private final Map d = new HashMap();

    public Request$Builder(String string) {
        this.a = string;
    }

    public Request$Builder addHeader(String string, String string2) {
        this.d.put((Object)string, (Object)string2);
        return this;
    }

    public Request build() {
        return new Request(this.a, this.b, this.c, this.d, null);
    }

    public Request$Builder post(byte[] byArray) {
        this.c = byArray;
        return this.withMethod("POST");
    }

    public Request$Builder withMethod(String string) {
        this.b = string;
        return this;
    }
}


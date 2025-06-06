/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package com.yandex.metrica.network;

import com.yandex.metrica.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Response {
    private final boolean a;
    private final int b;
    private final byte[] c;
    private final byte[] d;
    private final Map e;
    private final Throwable f;

    public Response(Throwable throwable) {
        HashMap hashMap = new HashMap();
        this(false, 0, new byte[0], new byte[0], (Map)hashMap, throwable);
    }

    public Response(boolean bl, int n7, byte[] object, byte[] byArray, Map map, Throwable throwable) {
        this.a = bl;
        this.b = n7;
        this.c = object;
        this.d = byArray;
        object = map == null ? (Object)Collections.emptyMap() : (Object)com.yandex.metrica.network.impl.e.a(map);
        this.e = (Map)object;
        this.f = throwable;
    }

    public int getCode() {
        return this.b;
    }

    public byte[] getErrorData() {
        return this.d;
    }

    public Throwable getException() {
        return this.f;
    }

    public Map getHeaders() {
        return this.e;
    }

    public byte[] getResponseData() {
        return this.c;
    }

    public boolean isCompleted() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("Response{completed=");
        stringBuilder.append(this.a);
        stringBuilder.append(", code=");
        stringBuilder.append(this.b);
        stringBuilder.append(", responseDataLength=");
        stringBuilder.append(this.c.length);
        stringBuilder.append(", errorDataLength=");
        stringBuilder.append(this.d.length);
        stringBuilder.append(", headers=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(", exception=");
        stringBuilder.append((Object)this.f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


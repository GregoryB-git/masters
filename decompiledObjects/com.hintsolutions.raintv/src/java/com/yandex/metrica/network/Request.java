/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package com.yandex.metrica.network;

import android.text.TextUtils;
import com.yandex.metrica.network.b;
import com.yandex.metrica.network.impl.e;
import java.util.Map;

public class Request {
    private final String a;
    private final String b;
    private final byte[] c;
    private final Map d;

    private Request(String string, String string2, byte[] byArray, Map map) {
        this.a = string;
        string = string2;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string = "GET";
        }
        this.b = string;
        this.c = byArray;
        this.d = e.a(map);
    }

    public /* synthetic */ Request(String string, String string2, byte[] byArray, Map map, b b3) {
        this(string, string2, byArray, map);
    }

    public byte[] getBody() {
        return this.c;
    }

    public Map getHeaders() {
        return this.d;
    }

    public String getMethod() {
        return this.b;
    }

    public String getUrl() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("Request{url=");
        stringBuilder.append(this.a);
        stringBuilder.append(", method='");
        a.B(stringBuilder, this.b, '\'', ", bodyLength=");
        stringBuilder.append(this.c.length);
        stringBuilder.append(", headers=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


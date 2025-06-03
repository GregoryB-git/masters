/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  javax.net.ssl.SSLSocketFactory
 */
package com.yandex.metrica.networktasks.api;

import android.text.TextUtils;
import com.yandex.metrica.network.NetworkClient$Builder;
import com.yandex.metrica.network.Request$Builder;
import com.yandex.metrica.network.Response;
import javax.net.ssl.SSLSocketFactory;

class a {
    public Response a(String object, String object2, SSLSocketFactory sSLSocketFactory) {
        object2 = new Request$Builder((String)object2).withMethod("GET");
        if (!TextUtils.isEmpty((CharSequence)object)) {
            ((Request$Builder)object2).addHeader("If-None-Match", (String)object);
        }
        object = new NetworkClient$Builder().withInstanceFollowRedirects(true).withSslSocketFactory(sSLSocketFactory);
        int n7 = com.yandex.metrica.networktasks.impl.a.a;
        return ((NetworkClient$Builder)object).withConnectTimeout(n7).withReadTimeout(n7).build().newCall(((Request$Builder)object2).build()).execute();
    }
}


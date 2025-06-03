/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.network.impl.c
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  javax.net.ssl.SSLSocketFactory
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.network;

import com.yandex.metrica.network.Call;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.impl.c;
import com.yandex.metrica.network.impl.d;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

public class NetworkClient {
    private final Integer a;
    private final Integer b;
    private final SSLSocketFactory c;
    private final Boolean d;
    private final Boolean e;
    private final int f;

    private NetworkClient(Integer n7, Integer n8, SSLSocketFactory sSLSocketFactory, Boolean bl, Boolean bl2, Integer n10) {
        this.a = n7;
        this.b = n8;
        this.c = sSLSocketFactory;
        this.d = bl;
        this.e = bl2;
        int n11 = n10 == null ? Integer.MAX_VALUE : n10;
        this.f = n11;
    }

    public /* synthetic */ NetworkClient(Integer n7, Integer n8, SSLSocketFactory sSLSocketFactory, Boolean bl, Boolean bl2, Integer n10, com.yandex.metrica.network.a a2) {
        this(n7, n8, sSLSocketFactory, bl, bl2, n10);
    }

    public Integer getConnectTimeout() {
        return this.a;
    }

    public Boolean getInstanceFollowRedirects() {
        return this.e;
    }

    public int getMaxResponseSize() {
        return this.f;
    }

    public Integer getReadTimeout() {
        return this.b;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.c;
    }

    public Boolean getUseCaches() {
        return this.d;
    }

    public Call newCall(Request request) {
        Intrinsics.checkNotNullParameter((Object)this, (String)"client");
        Intrinsics.checkNotNullParameter((Object)request, (String)"request");
        return new c(this, request, new d());
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("NetworkClient{connectTimeout=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", readTimeout=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", sslSocketFactory=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", useCaches=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", instanceFollowRedirects=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(", maxResponseSize=");
        return a.n(stringBuilder, this.f, '}');
    }
}


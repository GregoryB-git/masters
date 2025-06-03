/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  javax.net.ssl.SSLSocketFactory
 */
package com.yandex.metrica.network;

import com.yandex.metrica.network.NetworkClient;
import javax.net.ssl.SSLSocketFactory;

public class NetworkClient$Builder {
    private Integer a;
    private Integer b;
    private SSLSocketFactory c;
    private Boolean d;
    private Boolean e;
    private Integer f;

    public NetworkClient build() {
        return new NetworkClient(this.a, this.b, this.c, this.d, this.e, this.f, null);
    }

    public NetworkClient$Builder withConnectTimeout(int n7) {
        this.a = n7;
        return this;
    }

    public NetworkClient$Builder withInstanceFollowRedirects(boolean bl) {
        this.e = bl;
        return this;
    }

    public NetworkClient$Builder withMaxResponseSize(int n7) {
        this.f = n7;
        return this;
    }

    public NetworkClient$Builder withReadTimeout(int n7) {
        this.b = n7;
        return this;
    }

    public NetworkClient$Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.c = sSLSocketFactory;
        return this;
    }

    public NetworkClient$Builder withUseCaches(boolean bl) {
        this.d = bl;
        return this;
    }
}


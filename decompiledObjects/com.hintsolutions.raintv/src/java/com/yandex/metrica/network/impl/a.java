/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  javax.net.ssl.HttpsURLConnection
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Lambda
 */
package com.yandex.metrica.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class a
extends Lambda
implements Function0 {
    public final HttpsURLConnection a;

    public a(HttpsURLConnection httpsURLConnection) {
        this.a = httpsURLConnection;
        super(0);
    }

    public Object invoke() {
        return this.a.getInputStream();
    }
}


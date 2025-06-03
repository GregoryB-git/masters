/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.List
 */
package com.google.firebase.analytics.connector.internal;

import B3.c;
import B3.h;
import B3.r;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import n4.d;
import s3.e;
import w3.a;
import w3.b;

@Keep
public class AnalyticsConnectorRegistrar
implements ComponentRegistrar {
    public static /* synthetic */ a lambda$getComponents$0(B3.e e8) {
        return b.h((e)e8.a(e.class), (Context)e8.a(Context.class), (d)e8.a(d.class));
    }

    @SuppressLint(value={"MissingPermission"})
    @Keep
    @NonNull
    public List<c> getComponents() {
        return Arrays.asList((Object[])new c[]{c.e(a.class).b(r.k(e.class)).b(r.k(Context.class)).b(r.k(d.class)).f(x3.b.a).e().d(), O4.h.b("fire-analytics", "21.5.0")});
    }
}


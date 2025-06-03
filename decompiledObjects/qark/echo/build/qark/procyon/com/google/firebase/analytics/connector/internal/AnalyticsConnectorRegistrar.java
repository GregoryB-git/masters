// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.analytics.connector.internal;

import androidx.annotation.NonNull;
import android.annotation.SuppressLint;
import java.util.Arrays;
import B3.h;
import B3.r;
import B3.c;
import java.util.List;
import w3.b;
import n4.d;
import android.content.Context;
import w3.a;
import B3.e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;

@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar
{
    @SuppressLint({ "MissingPermission" })
    @Keep
    @NonNull
    @Override
    public List<c> getComponents() {
        return Arrays.asList(c.e(a.class).b(r.k(s3.e.class)).b(r.k(Context.class)).b(r.k(d.class)).f(x3.b.a).e().d(), O4.h.b("fire-analytics", "21.5.0"));
    }
}

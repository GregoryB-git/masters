/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.net.URL
 *  java.net.URLConnection
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.j0;
import java.net.URL;
import java.net.URLConnection;

public final class k0
extends h0 {
    public k0() {
    }

    public /* synthetic */ k0(j0 j02) {
        this();
    }

    @Override
    public final URLConnection b(URL uRL, String string2) {
        return uRL.openConnection();
    }
}


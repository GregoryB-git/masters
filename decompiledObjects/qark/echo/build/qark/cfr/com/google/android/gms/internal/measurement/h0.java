/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URL
 *  java.net.URLConnection
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.k0;
import java.net.URL;
import java.net.URLConnection;

public abstract class h0 {
    public static h0 a = new k0(null);

    public static h0 a() {
        synchronized (h0.class) {
            h0 h02 = a;
            return h02;
        }
    }

    public abstract URLConnection b(URL var1, String var2);
}


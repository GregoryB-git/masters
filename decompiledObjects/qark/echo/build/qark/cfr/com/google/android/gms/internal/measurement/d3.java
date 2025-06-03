/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import W2.m;
import W2.s;
import X2.x;
import com.google.android.gms.internal.measurement.g3;
import com.google.android.gms.internal.measurement.h3;

public final class d3 {
    public final boolean a;

    public d3(h3 h32) {
        m.k(h32, "BuildInfo must be non-null");
        this.a = h32.a() ^ true;
    }

    public final boolean a(String string2) {
        m.k(string2, "flagName must not be null");
        if (!this.a) {
            return true;
        }
        return ((x)g3.a.get()).b(string2);
    }
}


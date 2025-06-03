/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F3;
import com.google.android.gms.internal.measurement.H3;
import com.google.android.gms.internal.measurement.I3;
import com.google.android.gms.internal.measurement.k4;

public abstract class G3 {
    public static volatile int d = 100;
    public int a = d;
    public int b = Integer.MAX_VALUE;
    public boolean c = false;

    public G3() {
    }

    public /* synthetic */ G3(H3 h32) {
        this();
    }

    public static long b(long l8) {
        return - (l8 & 1L) ^ l8 >>> 1;
    }

    public static G3 c(byte[] object, int n8, int n9, boolean bl) {
        object = new F3((byte[])object, 0, n9, false, null);
        try {
            object.a(n9);
            return object;
        }
        catch (k4 k42) {
            throw new IllegalArgumentException((Throwable)k42);
        }
    }

    public static int e(int n8) {
        return - (n8 & 1) ^ n8 >>> 1;
    }

    public abstract int a(int var1);

    public abstract int d();
}


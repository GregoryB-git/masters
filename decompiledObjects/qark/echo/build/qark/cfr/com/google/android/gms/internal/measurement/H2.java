/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  java.lang.Object
 *  java.lang.SecurityException
 */
package com.google.android.gms.internal.measurement;

import android.os.Binder;
import com.google.android.gms.internal.measurement.G2;

public abstract class H2 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object a(G2 object) {
        try {
            return object.a();
        }
        catch (SecurityException securityException) {}
        long l8 = Binder.clearCallingIdentity();
        try {
            object = object.a();
            return object;
        }
        finally {
            Binder.restoreCallingIdentity((long)l8);
        }
    }
}


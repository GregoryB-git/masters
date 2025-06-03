/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Constructor
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.O3;
import com.google.android.gms.internal.measurement.Q3;
import java.lang.reflect.Constructor;

public abstract class P3 {
    public static final O3 a = new Q3();
    public static final O3 b = P3.c();

    public static O3 a() {
        O3 o32 = b;
        if (o32 != null) {
            return o32;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static O3 b() {
        return a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static O3 c() {
        try {
            return (O3)Class.forName((String)"com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            return null;
        }
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Constructor
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.E4;
import com.google.android.gms.internal.measurement.F4;
import java.lang.reflect.Constructor;

public abstract class H4 {
    public static final F4 a = H4.c();
    public static final F4 b = new E4();

    public static F4 a() {
        return a;
    }

    public static F4 b() {
        return b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static F4 c() {
        try {
            return (F4)Class.forName((String)"com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            return null;
        }
    }
}


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

import com.google.android.gms.internal.measurement.P4;
import com.google.android.gms.internal.measurement.R4;
import java.lang.reflect.Constructor;

public abstract class Q4 {
    public static final P4 a = Q4.c();
    public static final P4 b = new R4();

    public static P4 a() {
        return a;
    }

    public static P4 b() {
        return b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static P4 c() {
        try {
            return (P4)Class.forName((String)"com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            return null;
        }
    }
}


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
package com.google.protobuf;

import com.google.protobuf.F;
import com.google.protobuf.G;
import java.lang.reflect.Constructor;

public abstract class H {
    public static final F a = H.c();
    public static final F b = new G();

    public static F a() {
        return a;
    }

    public static F b() {
        return b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static F c() {
        try {
            return (F)Class.forName((String)"com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            return null;
        }
    }
}


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

import com.google.protobuf.P;
import com.google.protobuf.Q;
import java.lang.reflect.Constructor;

public abstract class S {
    public static final P a = S.c();
    public static final P b = new Q();

    public static P a() {
        return a;
    }

    public static P b() {
        return b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static P c() {
        try {
            return (P)Class.forName((String)"com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            return null;
        }
    }
}


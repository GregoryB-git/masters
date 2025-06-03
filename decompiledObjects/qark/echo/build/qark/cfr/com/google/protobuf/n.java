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
package com.google.protobuf;

import com.google.protobuf.l;
import com.google.protobuf.m;
import java.lang.reflect.Constructor;

public abstract class n {
    public static final l a = new m();
    public static final l b = n.c();

    public static l a() {
        l l8 = b;
        if (l8 != null) {
            return l8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static l b() {
        return a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static l c() {
        try {
            return (l)Class.forName((String)"com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            return null;
        }
    }
}


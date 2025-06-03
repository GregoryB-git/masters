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
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q;
import com.google.crypto.tink.shaded.protobuf.r;
import java.lang.reflect.Constructor;

public abstract class s {
    public static final q a = new r();
    public static final q b = s.c();

    public static q a() {
        q q8 = b;
        if (q8 != null) {
            return q8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static q b() {
        return a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static q c() {
        try {
            return (q)Class.forName((String)"com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            return null;
        }
    }
}


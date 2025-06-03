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
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.K;
import java.lang.reflect.Constructor;

public abstract class L {
    public static final J a = L.c();
    public static final J b = new K();

    public static J a() {
        return a;
    }

    public static J b() {
        return b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static J c() {
        try {
            return (J)Class.forName((String)"com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            return null;
        }
    }
}


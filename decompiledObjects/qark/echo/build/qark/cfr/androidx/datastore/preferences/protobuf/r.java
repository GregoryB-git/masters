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
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.q;
import java.lang.reflect.Constructor;

public abstract class r {
    public static final p a = new q();
    public static final p b = r.c();

    public static p a() {
        p p8 = b;
        if (p8 != null) {
            return p8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static p b() {
        return a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static p c() {
        try {
            return (p)Class.forName((String)"androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            return null;
        }
    }
}


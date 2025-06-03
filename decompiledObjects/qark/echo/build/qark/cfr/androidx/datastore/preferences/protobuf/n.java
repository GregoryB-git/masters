/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.o;
import java.lang.reflect.Method;

public abstract class n {
    public static final Class a = n.c();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static o a() {
        if (a == null) return o.e;
        try {
            return n.b("getEmptyRegistry");
        }
        catch (Exception exception) {
            return o.e;
        }
    }

    public static final o b(String string2) {
        return (o)a.getDeclaredMethod(string2, new Class[0]).invoke((Object)null, new Object[0]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class c() {
        try {
            return Class.forName((String)"androidx.datastore.preferences.protobuf.ExtensionRegistry");
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }
}


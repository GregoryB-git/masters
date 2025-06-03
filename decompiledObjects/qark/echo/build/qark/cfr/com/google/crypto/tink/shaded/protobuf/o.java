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
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p;
import java.lang.reflect.Method;

public abstract class o {
    public static final Class a = o.c();

    public static p a() {
        p p8 = o.b("getEmptyRegistry");
        if (p8 != null) {
            return p8;
        }
        return p.d;
    }

    public static final p b(String object) {
        Class class_ = a;
        if (class_ == null) {
            return null;
        }
        try {
            object = (p)class_.getDeclaredMethod((String)object, new Class[0]).invoke((Object)null, new Object[0]);
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Class c() {
        try {
            return Class.forName((String)"com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }
}


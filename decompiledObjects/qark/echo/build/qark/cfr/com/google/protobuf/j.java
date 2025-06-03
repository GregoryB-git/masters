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
package com.google.protobuf;

import com.google.protobuf.k;
import java.lang.reflect.Method;

public abstract class j {
    public static final Class a = j.c();

    public static k a() {
        k k8 = j.b("getEmptyRegistry");
        if (k8 != null) {
            return k8;
        }
        return k.d;
    }

    public static final k b(String object) {
        Class class_ = a;
        if (class_ == null) {
            return null;
        }
        try {
            object = (k)class_.getDeclaredMethod((String)object, new Class[0]).invoke((Object)null, new Object[0]);
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
            return Class.forName((String)"com.google.protobuf.ExtensionRegistry");
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }
}


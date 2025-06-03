/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Object
 *  java.lang.String
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.w;
import m6.c;
import m6.d;
import m6.e;
import m6.f;
import m6.g;

public abstract class v {
    public static final w a;
    public static final c[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        w w8;
        w8 = null;
        try {
            w w9;
            w8 = w9 = (w)Class.forName((String)"kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        }
        catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException instantiationException) {}
        if (w8 == null) {
            w8 = new w();
        }
        a = w8;
        b = new c[0];
    }

    public static e a(i i8) {
        return a.a(i8);
    }

    public static c b(Class class_) {
        return a.b(class_);
    }

    public static d c(Class class_) {
        return a.c(class_, "");
    }

    public static f d(n n8) {
        return a.d(n8);
    }

    public static g e(p p8) {
        return a.e(p8);
    }

    public static String f(h h8) {
        return a.f(h8);
    }

    public static String g(l l8) {
        return a.g(l8);
    }
}


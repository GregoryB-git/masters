/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 */
package kotlin.jvm.internal;

import java.lang.reflect.Type;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.p;
import m6.c;
import m6.d;
import m6.f;
import m6.g;

public class w {
    public m6.e a(i i8) {
        return i8;
    }

    public c b(Class class_) {
        return new e(class_);
    }

    public d c(Class class_, String string2) {
        return new m(class_, string2);
    }

    public f d(n n8) {
        return n8;
    }

    public g e(p p8) {
        return p8;
    }

    public String f(h object) {
        String string2 = object.getClass().getGenericInterfaces()[0].toString();
        object = string2;
        if (string2.startsWith("kotlin.jvm.functions.")) {
            object = string2.substring(21);
        }
        return object;
    }

    public String g(l l8) {
        return this.f(l8);
    }
}


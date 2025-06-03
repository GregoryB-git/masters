/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 */
package com.google.protobuf;

import com.google.protobuf.C;
import com.google.protobuf.Z;
import com.google.protobuf.a0;
import com.google.protobuf.t;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class W {
    public static final W c = new W();
    public final a0 a = new C();
    public final ConcurrentMap b = new ConcurrentHashMap();

    public static W a() {
        return c;
    }

    public Z b(Class class_, Z z8) {
        t.b((Object)class_, "messageType");
        t.b(z8, "schema");
        return (Z)this.b.putIfAbsent((Object)class_, (Object)z8);
    }

    public Z c(Class object) {
        t.b(object, "messageType");
        Z z8 = (Z)this.b.get(object);
        Object object2 = z8;
        if (z8 == null) {
            object2 = this.a.a((Class)object);
            if ((object = this.b((Class)object, (Z)object2)) != null) {
                object2 = object;
            }
        }
        return object2;
    }

    public Z d(Object object) {
        return this.c(object.getClass());
    }
}


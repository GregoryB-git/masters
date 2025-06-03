/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.G;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.f0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class a0 {
    public static final a0 c = new a0();
    public final f0 a = new G();
    public final ConcurrentMap b = new ConcurrentHashMap();

    public static a0 a() {
        return c;
    }

    public e0 b(Class class_, e0 e02) {
        z.b((Object)class_, "messageType");
        z.b(e02, "schema");
        return (e0)this.b.putIfAbsent((Object)class_, (Object)e02);
    }

    public e0 c(Class object) {
        z.b(object, "messageType");
        e0 e02 = (e0)this.b.get(object);
        Object object2 = e02;
        if (e02 == null) {
            object2 = this.a.a((Class)object);
            if ((object = this.b((Class)object, (e0)object2)) != null) {
                object2 = object;
            }
        }
        return object2;
    }

    public e0 d(Object object) {
        return this.c(object.getClass());
    }
}


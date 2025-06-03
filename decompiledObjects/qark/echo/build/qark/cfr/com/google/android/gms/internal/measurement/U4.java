/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Z4;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.v4;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class U4 {
    public static final U4 c = new U4();
    public final b5 a = new v4();
    public final ConcurrentMap b = new ConcurrentHashMap();

    public static U4 a() {
        return c;
    }

    public final Z4 b(Class object) {
        a4.f(object, "messageType");
        Z4 z42 = (Z4)this.b.get(object);
        Object object2 = z42;
        if (z42 == null) {
            object2 = this.a.a((Class)object);
            a4.f(object, "messageType");
            a4.f(object2, "schema");
            object = (Z4)this.b.putIfAbsent(object, object2);
            if (object != null) {
                object2 = object;
            }
        }
        return object2;
    }

    public final Z4 c(Object object) {
        return this.b(object.getClass());
    }
}


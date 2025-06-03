/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.s;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class p {
    public static s a(m object, s s8, f3 f32, List list) {
        if (object.q(s8.g())) {
            if ((object = object.i(s8.g())) instanceof n) {
                return ((n)object).b(f32, list);
            }
            throw new IllegalArgumentException(String.format((String)"%s is not a function", (Object[])new Object[]{s8.g()}));
        }
        if ("hasOwnProperty".equals((Object)s8.g())) {
            C2.g("hasOwnProperty", 1, list);
            if (object.q(f32.b((s)list.get(0)).g())) {
                return s.i;
            }
            return s.j;
        }
        throw new IllegalArgumentException(String.format((String)"Object has no function %s", (Object[])new Object[]{s8.g()}));
    }

    public static Iterator b(Map map) {
        return new o(map.keySet().iterator());
    }
}


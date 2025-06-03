/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.E3;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.r2;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class b4 {
    public static s a(r2 object) {
        if (object == null) {
            return s.d;
        }
        int n8 = E3.a[object.H().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        if (n8 != 5) {
                            object = String.valueOf((Object)object);
                            StringBuilder stringBuilder = new StringBuilder("Invalid entity: ");
                            stringBuilder.append((String)object);
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                    }
                    List list = object.L();
                    ArrayList arrayList = new ArrayList();
                    list = list.iterator();
                    while (list.hasNext()) {
                        arrayList.add((Object)b4.a((r2)list.next()));
                    }
                    return new v(object.J(), (List)arrayList);
                }
                if (object.N()) {
                    return new h(object.M());
                }
                return new h(null);
            }
            if (object.O()) {
                return new k(object.G());
            }
            return new k(null);
        }
        if (object.P()) {
            return new u(object.K());
        }
        return s.k;
    }

    public static s b(Object object) {
        if (object == null) {
            return s.e;
        }
        if (object instanceof String) {
            return new u((String)object);
        }
        if (object instanceof Double) {
            return new k((Double)object);
        }
        if (object instanceof Long) {
            return new k(((Long)object).doubleValue());
        }
        if (object instanceof Integer) {
            return new k(((Integer)object).doubleValue());
        }
        if (object instanceof Boolean) {
            return new h((Boolean)object);
        }
        if (object instanceof Map) {
            r r8 = new r();
            Map map = (Map)object;
            for (Object object2 : map.keySet()) {
                s s8 = b4.b(map.get(object2));
                if (object2 == null) continue;
                object = object2;
                if (!(object2 instanceof String)) {
                    object = object2.toString();
                }
                r8.a((String)object, s8);
            }
            return r8;
        }
        if (object instanceof List) {
            g g8 = new g();
            object = ((List)object).iterator();
            while (object.hasNext()) {
                g8.T(b4.b(object.next()));
            }
            return g8;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}


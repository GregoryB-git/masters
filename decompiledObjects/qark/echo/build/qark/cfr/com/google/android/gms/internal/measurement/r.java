/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.p;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class r
implements m,
s {
    public final Map o = new HashMap();

    @Override
    public final void a(String string2, s s8) {
        if (s8 == null) {
            this.o.remove((Object)string2);
            return;
        }
        this.o.put((Object)string2, (Object)s8);
    }

    public final List b() {
        return new ArrayList((Collection)this.o.keySet());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final s c() {
        r r8 = new r();
        Iterator iterator = this.o.entrySet().iterator();
        while (iterator.hasNext()) {
            Map map;
            String string2;
            Object object = (Map.Entry)iterator.next();
            if (object.getValue() instanceof m) {
                map = r8.o;
                string2 = (String)object.getKey();
                object = (s)object.getValue();
            } else {
                map = r8.o;
                string2 = (String)object.getKey();
                object = ((s)object.getValue()).c();
            }
            map.put((Object)string2, object);
        }
        return r8;
    }

    @Override
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof r)) {
            return false;
        }
        object = (r)object;
        return this.o.equals((Object)object.o);
    }

    @Override
    public final Double f() {
        return Double.NaN;
    }

    @Override
    public final String g() {
        return "[object Object]";
    }

    public int hashCode() {
        return this.o.hashCode();
    }

    @Override
    public final s i(String string2) {
        if (this.o.containsKey((Object)string2)) {
            return (s)this.o.get((Object)string2);
        }
        return s.d;
    }

    @Override
    public final Iterator k() {
        return p.b(this.o);
    }

    @Override
    public final boolean q(String string2) {
        return this.o.containsKey((Object)string2);
    }

    @Override
    public s s(String string2, f3 f32, List list) {
        if ("toString".equals((Object)string2)) {
            return new u(this.toString());
        }
        return p.a(this, new u(string2), f32, list);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        if (!this.o.isEmpty()) {
            for (String string2 : this.o.keySet()) {
                stringBuilder.append(String.format((String)"%s: %s,", (Object[])new Object[]{string2, this.o.get((Object)string2)}));
            }
            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}


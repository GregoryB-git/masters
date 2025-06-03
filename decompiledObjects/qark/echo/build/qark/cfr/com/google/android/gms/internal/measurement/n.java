/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.p;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class n
implements m,
s {
    public final String o;
    public final Map p = new HashMap();

    public n(String string2) {
        this.o = string2;
    }

    @Override
    public final void a(String string2, s s8) {
        if (s8 == null) {
            this.p.remove((Object)string2);
            return;
        }
        this.p.put((Object)string2, (Object)s8);
    }

    public abstract s b(f3 var1, List var2);

    @Override
    public s c() {
        return this;
    }

    @Override
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public final String e() {
        return this.o;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof n)) {
            return false;
        }
        object = (n)object;
        String string2 = this.o;
        if (string2 != null) {
            return string2.equals((Object)object.o);
        }
        return false;
    }

    @Override
    public final Double f() {
        return Double.NaN;
    }

    @Override
    public final String g() {
        return this.o;
    }

    public int hashCode() {
        String string2 = this.o;
        if (string2 != null) {
            return string2.hashCode();
        }
        return 0;
    }

    @Override
    public final s i(String string2) {
        if (this.p.containsKey((Object)string2)) {
            return (s)this.p.get((Object)string2);
        }
        return s.d;
    }

    @Override
    public final Iterator k() {
        return p.b(this.p);
    }

    @Override
    public final boolean q(String string2) {
        return this.p.containsKey((Object)string2);
    }

    @Override
    public final s s(String string2, f3 f32, List list) {
        if ("toString".equals((Object)string2)) {
            return new u(this.o);
        }
        return p.a(this, new u(string2), f32, list);
    }
}


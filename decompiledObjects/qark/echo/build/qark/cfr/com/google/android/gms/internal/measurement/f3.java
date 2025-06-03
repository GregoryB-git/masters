/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.E;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class f3 {
    public final f3 a;
    public E b;
    public Map c = new HashMap();
    public Map d = new HashMap();

    public f3(f3 f32, E e8) {
        this.a = f32;
        this.b = e8;
    }

    public final s a(g g8) {
        s s8 = s.d;
        Iterator iterator = g8.Z();
        while (iterator.hasNext()) {
            s s9;
            int n8 = (Integer)iterator.next();
            s8 = s9 = this.b.a(this, g8.M(n8));
            if (!(s9 instanceof l)) continue;
            s8 = s9;
            break;
        }
        return s8;
    }

    public final s b(s s8) {
        return this.b.a(this, s8);
    }

    public final s c(String string2) {
        f3 f32 = this;
        do {
            if (!f32.c.containsKey((Object)string2)) continue;
            return (s)f32.c.get((Object)string2);
        } while ((f32 = f32.a) != null);
        throw new IllegalArgumentException(String.format((String)"%s is not defined", (Object[])new Object[]{string2}));
    }

    public final f3 d() {
        return new f3(this, this.b);
    }

    public final void e(String string2, s s8) {
        if (!this.d.containsKey((Object)string2)) {
            if (s8 == null) {
                this.c.remove((Object)string2);
                return;
            }
            this.c.put((Object)string2, (Object)s8);
        }
    }

    public final void f(String string2, s s8) {
        this.e(string2, s8);
        this.d.put((Object)string2, (Object)Boolean.TRUE);
    }

    public final boolean g(String string2) {
        f3 f32 = this;
        do {
            if (!f32.c.containsKey((Object)string2)) continue;
            return true;
        } while ((f32 = f32.a) != null);
        return false;
    }

    public final void h(String string2, s s8) {
        f3 f32;
        f3 f33 = this;
        while (!f33.c.containsKey((Object)string2) && (f32 = f33.a) != null && f32.g(string2)) {
            f33 = f33.a;
        }
        if (!f33.d.containsKey((Object)string2)) {
            if (s8 == null) {
                f33.c.remove((Object)string2);
                return;
            }
            f33.c.put((Object)string2, (Object)s8);
        }
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.O3;
import com.google.android.gms.internal.measurement.S3;
import com.google.android.gms.internal.measurement.T5;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Z4;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.v5;
import com.google.android.gms.internal.measurement.x5;
import java.util.Iterator;
import java.util.Map;

public final class O4
implements Z4 {
    public final I4 a;
    public final x5 b;
    public final boolean c;
    public final O3 d;

    public O4(x5 x52, O3 o32, I4 i42) {
        this.b = x52;
        this.c = o32.d(i42);
        this.d = o32;
        this.a = i42;
    }

    public static O4 j(x5 x52, O3 o32, I4 i42) {
        return new O4(x52, o32, i42);
    }

    @Override
    public final Object a() {
        I4 i42 = this.a;
        if (i42 instanceof Y3) {
            return ((Y3)i42).y();
        }
        return i42.d().i();
    }

    @Override
    public final int b(Object object) {
        int n8;
        x5 x52 = this.b;
        int n9 = n8 = x52.e(x52.k(object));
        if (this.c) {
            n9 = n8 + this.d.b(object).a();
        }
        return n9;
    }

    @Override
    public final boolean c(Object object) {
        return this.d.b(object).n();
    }

    @Override
    public final void d(Object object, Object object2) {
        a5.n(this.b, object, object2);
        if (this.c) {
            a5.l(this.d, object, object2);
        }
    }

    @Override
    public final void e(Object object) {
        this.b.l(object);
        this.d.f(object);
    }

    @Override
    public final int f(Object object) {
        int n8;
        int n9 = n8 = this.b.k(object).hashCode();
        if (this.c) {
            n9 = n8 * 53 + this.d.b(object).hashCode();
        }
        return n9;
    }

    @Override
    public final void g(Object object, byte[] object2, int n8, int n9, p3 p32) {
        object2 = (Y3)object;
        if (object2.zzb == v5.k()) {
            object2.zzb = v5.l();
        }
        a.a(object);
        throw null;
    }

    @Override
    public final boolean h(Object object, Object object2) {
        if (!this.b.k(object).equals(this.b.k(object2))) {
            return false;
        }
        if (this.c) {
            return this.d.b(object).equals(this.d.b(object2));
        }
        return true;
    }

    @Override
    public final void i(Object object, T5 t52) {
        Object object2 = this.d.b(object).l();
        if (!object2.hasNext()) {
            object2 = this.b;
            object2.d(object2.k(object), t52);
            return;
        }
        a.a(((Map.Entry)object2.next()).getKey());
        throw null;
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import java.util.Iterator;
import java.util.List;

public final class h
implements s {
    public final boolean o;

    /*
     * Enabled aggressive block sorting
     */
    public h(Boolean bl) {
        boolean bl2 = bl == null ? false : bl;
        this.o = bl2;
    }

    @Override
    public final s c() {
        return new h(this.o);
    }

    @Override
    public final Boolean d() {
        return this.o;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        object = (h)object;
        if (this.o == object.o) {
            return true;
        }
        return false;
    }

    @Override
    public final Double f() {
        double d8 = this.o ? 1.0 : 0.0;
        return d8;
    }

    @Override
    public final String g() {
        return Boolean.toString((boolean)this.o);
    }

    public final int hashCode() {
        return Boolean.valueOf((boolean)this.o).hashCode();
    }

    @Override
    public final Iterator k() {
        return null;
    }

    @Override
    public final s s(String string2, f3 f32, List list) {
        if ("toString".equals((Object)string2)) {
            return new u(Boolean.toString((boolean)this.o));
        }
        throw new IllegalArgumentException(String.format((String)"%s.%s is not a function.", (Object[])new Object[]{Boolean.toString((boolean)this.o), string2}));
    }

    public final String toString() {
        return String.valueOf((boolean)this.o);
    }
}


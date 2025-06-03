/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.s;
import java.util.Iterator;
import java.util.List;

public final class l
implements s {
    public final s o;
    public final String p;

    public l(String string2) {
        this.o = s.d;
        this.p = string2;
    }

    public l(String string2, s s8) {
        this.o = s8;
        this.p = string2;
    }

    public final s a() {
        return this.o;
    }

    public final String b() {
        return this.p;
    }

    @Override
    public final s c() {
        return new l(this.p, this.o.c());
    }

    @Override
    public final Boolean d() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof l)) {
            return false;
        }
        String string2 = this.p;
        object = (l)object;
        if (string2.equals((Object)object.p) && this.o.equals((Object)object.o)) {
            return true;
        }
        return false;
    }

    @Override
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return this.p.hashCode() * 31 + this.o.hashCode();
    }

    @Override
    public final Iterator k() {
        return null;
    }

    @Override
    public final s s(String string2, f3 f32, List list) {
        throw new IllegalStateException("Control does not have functions");
    }
}


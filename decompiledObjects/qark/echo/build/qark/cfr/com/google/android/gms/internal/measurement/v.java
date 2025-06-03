/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class v
implements s {
    public final String o;
    public final ArrayList p;

    public v(String string2, List list) {
        this.o = string2;
        string2 = new ArrayList();
        this.p = string2;
        string2.addAll((Collection)list);
    }

    public final String a() {
        return this.o;
    }

    public final ArrayList b() {
        return this.p;
    }

    @Override
    public final s c() {
        return this;
    }

    @Override
    public final Boolean d() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof v)) {
            return false;
        }
        object = (v)object;
        String string2 = this.o;
        if (string2 != null ? !string2.equals((Object)object.o) : object.o != null) {
            return false;
        }
        string2 = this.p;
        object = object.p;
        if (string2 != null) {
            return string2.equals(object);
        }
        if (object == null) {
            return true;
        }
        return false;
    }

    @Override
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String string2 = this.o;
        int n8 = 0;
        int n9 = string2 != null ? string2.hashCode() : 0;
        string2 = this.p;
        if (string2 != null) {
            n8 = string2.hashCode();
        }
        return n9 * 31 + n8;
    }

    @Override
    public final Iterator k() {
        return null;
    }

    @Override
    public final s s(String string2, f3 f32, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}


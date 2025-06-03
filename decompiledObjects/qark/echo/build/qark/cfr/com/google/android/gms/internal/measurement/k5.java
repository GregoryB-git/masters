/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.d5;
import java.util.Map;

public final class k5
implements Comparable,
Map.Entry {
    public final Comparable o;
    public Object p;
    public final /* synthetic */ d5 q;

    public k5(d5 d52, Comparable comparable, Object object) {
        this.q = d52;
        this.o = comparable;
        this.p = object;
    }

    public k5(d5 d52, Map.Entry entry) {
        this(d52, (Comparable)entry.getKey(), entry.getValue());
    }

    public static boolean c(Object object, Object object2) {
        if (object == null) {
            if (object2 == null) {
                return true;
            }
            return false;
        }
        return object.equals(object2);
    }

    public final /* synthetic */ int compareTo(Object object) {
        object = (k5)object;
        return ((Comparable)this.getKey()).compareTo((Object)((Comparable)object.getKey()));
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        if (k5.c((Object)this.o, (object = (Map.Entry)object).getKey()) && k5.c(this.p, object.getValue())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object getKey() {
        return this.o;
    }

    public final Object getValue() {
        return this.p;
    }

    public final int hashCode() {
        Object object = this.o;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.p;
        if (object != null) {
            n8 = object.hashCode();
        }
        return n9 ^ n8;
    }

    public final Object setValue(Object object) {
        d5.n(this.q);
        Object object2 = this.p;
        this.p = object;
        return object2;
    }

    public final String toString() {
        String string2 = String.valueOf((Object)this.o);
        String string3 = String.valueOf((Object)this.p);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("=");
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }
}


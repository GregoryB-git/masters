// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Map;

public final class k5 implements Comparable, Entry
{
    public final Comparable o;
    public Object p;
    public final /* synthetic */ d5 q;
    
    public k5(final d5 q, final Comparable o, final Object p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    public k5(final d5 d5, final Entry entry) {
        this(d5, entry.getKey(), entry.getValue());
    }
    
    public static boolean c(final Object o, final Object obj) {
        if (o == null) {
            return obj == null;
        }
        return o.equals(obj);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Entry)) {
            return false;
        }
        final Entry entry = (Entry)o;
        return c(this.o, entry.getKey()) && c(this.p, entry.getValue());
    }
    
    @Override
    public final Object getValue() {
        return this.p;
    }
    
    @Override
    public final int hashCode() {
        final Comparable o = this.o;
        int hashCode = 0;
        int hashCode2;
        if (o == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = o.hashCode();
        }
        final Object p = this.p;
        if (p != null) {
            hashCode = p.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public final Object setValue(final Object p) {
        d5.n(this.q);
        final Object p2 = this.p;
        this.p = p;
        return p2;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.o);
        final String value2 = String.valueOf(this.p);
        final StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append("=");
        sb.append(value2);
        return sb.toString();
    }
}

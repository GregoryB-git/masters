// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import X2.y;

public final class e
{
    public static final y d;
    public String a;
    public long b;
    public Map c;
    
    static {
        d = y.a0("_syn", "_err", "_el");
    }
    
    public e(final String a, final long b, final Map map) {
        this.a = a;
        this.b = b;
        final HashMap c = new HashMap();
        this.c = c;
        if (map != null) {
            c.putAll(map);
        }
    }
    
    public static Object c(final String s, final Object o, final Object o2) {
        if (!e.d.contains(s) || !(o2 instanceof Double)) {
            if (s.startsWith("_")) {
                if (o instanceof String) {
                    return o2;
                }
                if (o != null) {
                    return o;
                }
                return o2;
            }
            else {
                if (o instanceof Double) {
                    return o2;
                }
                if (!(o instanceof Long)) {
                    if (o instanceof String) {
                        return o2.toString();
                    }
                    return o2;
                }
            }
        }
        return Math.round((double)o2);
    }
    
    public final long a() {
        return this.b;
    }
    
    public final Object b(final String s) {
        if (this.c.containsKey(s)) {
            return this.c.get(s);
        }
        return null;
    }
    
    public final void d(final String s, Object c) {
        if (c == null) {
            this.c.remove(s);
            return;
        }
        c = c(s, this.c.get(s), c);
        this.c.put(s, c);
    }
    
    public final String e() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return this.b == e.b && this.a.equals(e.a) && this.c.equals(e.c);
    }
    
    public final void f(final String a) {
        this.a = a;
    }
    
    public final Map g() {
        return this.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return (hashCode * 31 + (int)(b ^ b >>> 32)) * 31 + this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final long b = this.b;
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("Event{name='");
        sb.append(a);
        sb.append("', timestamp=");
        sb.append(b);
        sb.append(", params=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}

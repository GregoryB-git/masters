// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public final class f3
{
    public final f3 a;
    public E b;
    public Map c;
    public Map d;
    
    public f3(final f3 a, final E b) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = a;
        this.b = b;
    }
    
    public final s a(final g g) {
        s s = com.google.android.gms.internal.measurement.s.d;
        final Iterator z = g.Z();
        while (z.hasNext()) {
            final s s2 = s = this.b.a(this, g.M(z.next()));
            if (s2 instanceof l) {
                s = s2;
                break;
            }
        }
        return s;
    }
    
    public final s b(final s s) {
        return this.b.a(this, s);
    }
    
    public final s c(final String s) {
        f3 a = this;
        while (!a.c.containsKey(s)) {
            a = a.a;
            if (a != null) {
                continue;
            }
            throw new IllegalArgumentException(String.format("%s is not defined", s));
        }
        return (s)a.c.get(s);
    }
    
    public final f3 d() {
        return new f3(this, this.b);
    }
    
    public final void e(final String s, final s s2) {
        if (!this.d.containsKey(s)) {
            if (s2 == null) {
                this.c.remove(s);
                return;
            }
            this.c.put(s, s2);
        }
    }
    
    public final void f(final String s, final s s2) {
        this.e(s, s2);
        this.d.put(s, Boolean.TRUE);
    }
    
    public final boolean g(final String s) {
        f3 a = this;
        while (!a.c.containsKey(s)) {
            a = a.a;
            if (a != null) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    public final void h(final String s, final s s2) {
        f3 a;
        for (a = this; !a.c.containsKey(s); a = a.a) {
            final f3 a2 = a.a;
            if (a2 == null || !a2.g(s)) {
                break;
            }
        }
        if (!a.d.containsKey(s)) {
            if (s2 == null) {
                a.c.remove(s);
                return;
            }
            a.c.put(s, s2);
        }
    }
}

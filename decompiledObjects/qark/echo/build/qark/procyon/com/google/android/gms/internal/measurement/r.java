// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class r implements m, s
{
    public final Map o;
    
    public r() {
        this.o = new HashMap();
    }
    
    @Override
    public final void a(final String s, final s s2) {
        if (s2 == null) {
            this.o.remove(s);
            return;
        }
        this.o.put(s, s2);
    }
    
    public final List b() {
        return new ArrayList(this.o.keySet());
    }
    
    @Override
    public final s c() {
        final r r = new r();
        for (final Map.Entry<String, V> entry : this.o.entrySet()) {
            Map map;
            String s;
            s c;
            if (entry.getValue() instanceof m) {
                map = r.o;
                s = entry.getKey();
                c = (s)entry.getValue();
            }
            else {
                map = r.o;
                s = entry.getKey();
                c = ((s)entry.getValue()).c();
            }
            map.put(s, c);
        }
        return r;
    }
    
    @Override
    public final Boolean d() {
        return Boolean.TRUE;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof r && this.o.equals(((r)o).o));
    }
    
    @Override
    public final Double f() {
        return Double.NaN;
    }
    
    @Override
    public final String g() {
        return "[object Object]";
    }
    
    @Override
    public int hashCode() {
        return this.o.hashCode();
    }
    
    @Override
    public final s i(final String s) {
        if (this.o.containsKey(s)) {
            return this.o.get(s);
        }
        return s.d;
    }
    
    @Override
    public final Iterator k() {
        return p.b(this.o);
    }
    
    @Override
    public final boolean q(final String s) {
        return this.o.containsKey(s);
    }
    
    @Override
    public s s(final String anObject, final f3 f3, final List list) {
        if ("toString".equals(anObject)) {
            return new u(this.toString());
        }
        return p.a(this, new u(anObject), f3, list);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if (!this.o.isEmpty()) {
            for (final String s : this.o.keySet()) {
                sb.append(String.format("%s: %s,", s, this.o.get(s)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}

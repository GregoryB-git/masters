// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;

public final class C4 extends LinkedHashMap
{
    public static final C4 p;
    public boolean o;
    
    static {
        (p = new C4()).o = false;
    }
    
    public C4() {
        this.o = true;
    }
    
    public C4(final Map m) {
        super(m);
        this.o = true;
    }
    
    public static int a(final Object o) {
        if (o instanceof byte[]) {
            return a4.d((byte[])o);
        }
        if (!(o instanceof e4)) {
            return o.hashCode();
        }
        throw new UnsupportedOperationException();
    }
    
    public static C4 b() {
        return C4.p;
    }
    
    @Override
    public final void clear() {
        this.l();
        super.clear();
    }
    
    public final void d(final C4 c4) {
        this.l();
        if (!c4.isEmpty()) {
            this.putAll(c4);
        }
    }
    
    @Override
    public final Set entrySet() {
        if (this.isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof Map) {
            final Map map = (Map)o;
            if (this != map) {
                if (this.size() != map.size()) {
                    return false;
                }
                for (final Map.Entry<Object, Object> entry : this.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        return false;
                    }
                    final byte[] value = entry.getValue();
                    final byte[] value2 = map.get(entry.getKey());
                    boolean b;
                    if (value instanceof byte[] && value2 instanceof byte[]) {
                        b = Arrays.equals(value, value2);
                    }
                    else {
                        b = value.equals(value2);
                    }
                    if (!b) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public final C4 f() {
        if (this.isEmpty()) {
            return new C4();
        }
        return new C4(this);
    }
    
    public final void g() {
        this.o = false;
    }
    
    @Override
    public final int hashCode() {
        final Iterator<Map.Entry<Object, Object>> iterator = this.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Object, Object> entry = iterator.next();
            n += (a(entry.getValue()) ^ a(entry.getKey()));
        }
        return n;
    }
    
    public final boolean j() {
        return this.o;
    }
    
    public final void l() {
        if (this.o) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object put(final Object key, final Object value) {
        this.l();
        a4.e(key);
        a4.e(value);
        return super.put(key, value);
    }
    
    @Override
    public final void putAll(final Map m) {
        this.l();
        for (final Object next : m.keySet()) {
            a4.e(next);
            a4.e(m.get(next));
        }
        super.putAll(m);
    }
    
    @Override
    public final Object remove(final Object key) {
        this.l();
        return super.remove(key);
    }
}

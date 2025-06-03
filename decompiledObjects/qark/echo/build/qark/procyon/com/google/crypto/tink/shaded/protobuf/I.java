// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Set;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;

public final class I extends LinkedHashMap
{
    public static final I p;
    public boolean o;
    
    static {
        (p = new I()).o();
    }
    
    public I() {
        this.o = true;
    }
    
    public I(final Map m) {
        super(m);
        this.o = true;
    }
    
    public static int a(final Map map) {
        final Iterator<Map.Entry<Object, V>> iterator = map.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Object, V> entry = iterator.next();
            n += (b(entry.getValue()) ^ b(entry.getKey()));
        }
        return n;
    }
    
    public static int b(final Object o) {
        if (o instanceof byte[]) {
            return z.d((byte[])o);
        }
        if (!(o instanceof z.a)) {
            return o.hashCode();
        }
        throw new UnsupportedOperationException();
    }
    
    public static void d(final Map map) {
        for (final Object next : map.keySet()) {
            z.a(next);
            z.a(map.get(next));
        }
    }
    
    public static I f() {
        return I.p;
    }
    
    public static boolean j(final Object o, final Object obj) {
        if (o instanceof byte[] && obj instanceof byte[]) {
            return Arrays.equals((byte[])o, (byte[])obj);
        }
        return o.equals(obj);
    }
    
    public static boolean l(final Map map, final Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }
            if (!j(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void clear() {
        this.g();
        super.clear();
    }
    
    @Override
    public Set entrySet() {
        if (this.isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Map && l(this, (Map)o);
    }
    
    public final void g() {
        if (this.n()) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public int hashCode() {
        return a(this);
    }
    
    public boolean n() {
        return this.o;
    }
    
    public void o() {
        this.o = false;
    }
    
    public void p(final I i) {
        this.g();
        if (!i.isEmpty()) {
            this.putAll(i);
        }
    }
    
    @Override
    public Object put(final Object key, final Object value) {
        this.g();
        z.a(key);
        z.a(value);
        return super.put(key, value);
    }
    
    @Override
    public void putAll(final Map m) {
        this.g();
        d(m);
        super.putAll(m);
    }
    
    @Override
    public Object remove(final Object key) {
        this.g();
        return super.remove(key);
    }
    
    public I s() {
        if (this.isEmpty()) {
            return new I();
        }
        return new I(this);
    }
}

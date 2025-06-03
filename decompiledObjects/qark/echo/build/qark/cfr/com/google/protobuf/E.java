/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.protobuf;

import com.google.protobuf.t;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class E
extends LinkedHashMap {
    public static final E p;
    public boolean o = true;

    static {
        E e8;
        p = e8 = new E();
        e8.o();
    }

    public E() {
    }

    public E(Map map) {
        super(map);
    }

    public static int a(Map map) {
        map = map.entrySet().iterator();
        int n8 = 0;
        while (map.hasNext()) {
            Map.Entry entry = (Map.Entry)map.next();
            int n9 = E.b(entry.getKey());
            n8 += E.b(entry.getValue()) ^ n9;
        }
        return n8;
    }

    public static int b(Object object) {
        if (object instanceof byte[]) {
            return t.d((byte[])object);
        }
        if (!(object instanceof t.a)) {
            return object.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static void d(Map map) {
        for (Object object : map.keySet()) {
            t.a(object);
            t.a(map.get(object));
        }
    }

    public static E f() {
        return p;
    }

    public static boolean j(Object object, Object object2) {
        if (object instanceof byte[] && object2 instanceof byte[]) {
            return Arrays.equals((byte[])((byte[])object), (byte[])((byte[])object2));
        }
        return object.equals(object2);
    }

    public static boolean l(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }
            if (E.j(entry.getValue(), map2.get(entry.getKey()))) continue;
            return false;
        }
        return true;
    }

    public void clear() {
        this.g();
        super.clear();
    }

    public Set entrySet() {
        if (this.isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public boolean equals(Object object) {
        if (object instanceof Map && E.l((Map)this, (Map)object)) {
            return true;
        }
        return false;
    }

    public final void g() {
        if (this.n()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public int hashCode() {
        return E.a((Map)this);
    }

    public boolean n() {
        return this.o;
    }

    public void o() {
        this.o = false;
    }

    public void p(E e8) {
        this.g();
        if (!e8.isEmpty()) {
            this.putAll((Map)e8);
        }
    }

    public Object put(Object object, Object object2) {
        this.g();
        t.a(object);
        t.a(object2);
        return super.put(object, object2);
    }

    public void putAll(Map map) {
        this.g();
        E.d(map);
        super.putAll(map);
    }

    public Object remove(Object object) {
        this.g();
        return super.remove(object);
    }

    public E s() {
        if (this.isEmpty()) {
            return new E();
        }
        return new E((Map)this);
    }
}


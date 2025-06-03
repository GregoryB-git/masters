package com.google.protobuf;

import com.google.protobuf.AbstractC1154t;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class E extends LinkedHashMap {

    /* renamed from: p, reason: collision with root package name */
    public static final E f11973p;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11974o;

    static {
        E e7 = new E();
        f11973p = e7;
        e7.o();
    }

    public E() {
        this.f11974o = true;
    }

    public static int a(Map map) {
        int i7 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i7 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i7;
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC1154t.d((byte[]) obj);
        }
        if (obj instanceof AbstractC1154t.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static void d(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC1154t.a(obj);
            AbstractC1154t.a(map.get(obj));
        }
    }

    public static E f() {
        return f11973p;
    }

    public static boolean j(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static boolean l(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !j(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && l(this, (Map) obj);
    }

    public final void g() {
        if (!n()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean n() {
        return this.f11974o;
    }

    public void o() {
        this.f11974o = false;
    }

    public void p(E e7) {
        g();
        if (e7.isEmpty()) {
            return;
        }
        putAll(e7);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        g();
        AbstractC1154t.a(obj);
        AbstractC1154t.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        g();
        d(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        return super.remove(obj);
    }

    public E s() {
        return isEmpty() ? new E() : new E(this);
    }

    public E(Map map) {
        super(map);
        this.f11974o = true;
    }
}

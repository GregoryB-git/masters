package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC1110z;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class I extends LinkedHashMap {

    /* renamed from: p, reason: collision with root package name */
    public static final I f11281p;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11282o;

    static {
        I i7 = new I();
        f11281p = i7;
        i7.o();
    }

    public I() {
        this.f11282o = true;
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
            return AbstractC1110z.d((byte[]) obj);
        }
        if (obj instanceof AbstractC1110z.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static void d(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC1110z.a(obj);
            AbstractC1110z.a(map.get(obj));
        }
    }

    public static I f() {
        return f11281p;
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
        return this.f11282o;
    }

    public void o() {
        this.f11282o = false;
    }

    public void p(I i7) {
        g();
        if (i7.isEmpty()) {
            return;
        }
        putAll(i7);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        g();
        AbstractC1110z.a(obj);
        AbstractC1110z.a(obj2);
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

    public I s() {
        return isEmpty() ? new I() : new I(this);
    }

    public I(Map map) {
        super(map);
        this.f11282o = true;
    }
}

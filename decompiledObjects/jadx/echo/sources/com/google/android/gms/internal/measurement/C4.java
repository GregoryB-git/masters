package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class C4 extends LinkedHashMap {

    /* renamed from: p, reason: collision with root package name */
    public static final C4 f10326p;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10327o;

    static {
        C4 c42 = new C4();
        f10326p = c42;
        c42.f10327o = false;
    }

    public C4() {
        this.f10327o = true;
    }

    public static int a(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC0860a4.d((byte[]) obj);
        }
        if (obj instanceof InterfaceC0896e4) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static C4 b() {
        return f10326p;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        l();
        super.clear();
    }

    public final void d(C4 c42) {
        l();
        if (c42.isEmpty()) {
            return;
        }
        putAll(c42);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final C4 f() {
        return isEmpty() ? new C4() : new C4(this);
    }

    public final void g() {
        this.f10327o = false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i7 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i7;
    }

    public final boolean j() {
        return this.f10327o;
    }

    public final void l() {
        if (!this.f10327o) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        l();
        AbstractC0860a4.e(obj);
        AbstractC0860a4.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        l();
        for (Object obj : map.keySet()) {
            AbstractC0860a4.e(obj);
            AbstractC0860a4.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l();
        return super.remove(obj);
    }

    public C4(Map map) {
        super(map);
        this.f10327o = true;
    }
}

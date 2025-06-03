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
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.e4;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class C4
extends LinkedHashMap {
    public static final C4 p;
    public boolean o = true;

    static {
        C4 c42;
        p = c42 = new C4();
        c42.o = false;
    }

    public C4() {
    }

    public C4(Map map) {
        super(map);
    }

    public static int a(Object object) {
        if (object instanceof byte[]) {
            return a4.d((byte[])object);
        }
        if (!(object instanceof e4)) {
            return object.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static C4 b() {
        return p;
    }

    public final void clear() {
        this.l();
        super.clear();
    }

    public final void d(C4 c42) {
        this.l();
        if (!c42.isEmpty()) {
            this.putAll((Map)c42);
        }
    }

    public final Set entrySet() {
        if (this.isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final boolean equals(Object object) {
        if (object instanceof Map) {
            if (this != (object = (Map)object)) {
                if (this.size() == object.size()) {
                    Iterator iterator = this.entrySet().iterator();
                    while (iterator.hasNext()) {
                        Object object2 = (Map.Entry)iterator.next();
                        if (object.containsKey(object2.getKey())) {
                            Object object3 = object2.getValue();
                            object2 = object.get(object2.getKey());
                            boolean bl = object3 instanceof byte[] && object2 instanceof byte[] ? Arrays.equals((byte[])((byte[])object3), (byte[])((byte[])object2)) : object3.equals(object2);
                            if (bl) continue;
                        }
                        break;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final C4 f() {
        if (this.isEmpty()) {
            return new C4();
        }
        return new C4((Map)this);
    }

    public final void g() {
        this.o = false;
    }

    public final int hashCode() {
        Iterator iterator = this.entrySet().iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            int n9 = C4.a(entry.getKey());
            n8 += C4.a(entry.getValue()) ^ n9;
        }
        return n8;
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

    public final Object put(Object object, Object object2) {
        this.l();
        a4.e(object);
        a4.e(object2);
        return super.put(object, object2);
    }

    public final void putAll(Map map) {
        this.l();
        for (Object object : map.keySet()) {
            a4.e(object);
            a4.e(map.get(object));
        }
        super.putAll(map);
    }

    public final Object remove(Object object) {
        this.l();
        return super.remove(object);
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractMap
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NavigableMap
 *  java.util.Set
 *  java.util.SortedMap
 *  java.util.TreeMap
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.c5;
import com.google.android.gms.internal.measurement.g5;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.q5;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class d5
extends AbstractMap {
    public final int o;
    public List p;
    public Map q;
    public boolean r;
    public volatile p5 s;
    public Map t;
    public volatile h5 u;

    public d5(int n8) {
        this.o = n8;
        this.p = Collections.emptyList();
        this.q = Collections.emptyMap();
        this.t = Collections.emptyMap();
    }

    public /* synthetic */ d5(int n8, q5 q52) {
        this(n8);
    }

    public static d5 b(int n8) {
        return new c5(n8);
    }

    public static /* synthetic */ Object c(d5 d52, int n8) {
        return d52.k(n8);
    }

    public static /* synthetic */ void n(d5 d52) {
        d52.q();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(Comparable comparable) {
        int n8;
        int n9 = this.p.size();
        int n10 = n9 - 1;
        if (n10 >= 0) {
            n8 = comparable.compareTo((Object)((Comparable)((k5)this.p.get(n10)).getKey()));
            if (n8 > 0) {
                n10 = n9 + 1;
                do {
                    return - n10;
                    break;
                } while (true);
            }
            if (n8 == 0) {
                return n10;
            }
        }
        n9 = 0;
        while (n9 <= n10) {
            n8 = (n9 + n10) / 2;
            int n11 = comparable.compareTo((Object)((Comparable)((k5)this.p.get(n8)).getKey()));
            if (n11 < 0) {
                n10 = n8 - 1;
                continue;
            }
            if (n11 <= 0) return n8;
            n9 = n8 + 1;
        }
        n10 = n9 + 1;
        return - n10;
    }

    public void clear() {
        this.q();
        if (!this.p.isEmpty()) {
            this.p.clear();
        }
        if (!this.q.isEmpty()) {
            this.q.clear();
        }
    }

    public boolean containsKey(Object object) {
        if (this.a((Comparable)(object = (Comparable)object)) < 0 && !this.q.containsKey(object)) {
            return false;
        }
        return true;
    }

    public final Object d(Comparable comparable, Object object) {
        int n8;
        this.q();
        int n9 = this.a(comparable);
        if (n9 >= 0) {
            return ((k5)this.p.get(n9)).setValue(object);
        }
        this.q();
        if (this.p.isEmpty() && !(this.p instanceof ArrayList)) {
            this.p = new ArrayList(this.o);
        }
        if ((n9 = - n9 + 1) >= this.o) {
            return this.p().put((Object)comparable, object);
        }
        int n10 = this.p.size();
        if (n10 == (n8 = this.o)) {
            k5 k52 = (k5)this.p.remove(n8 - 1);
            this.p().put((Object)((Comparable)k52.getKey()), k52.getValue());
        }
        this.p.add(n9, (Object)new k5(this, comparable, object));
        return null;
    }

    public Set entrySet() {
        if (this.s == null) {
            this.s = new p5(this, null);
        }
        return this.s;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d5)) {
            return super.equals(object);
        }
        d5 d52 = (d5)((Object)object);
        int n8 = this.size();
        if (n8 != d52.size()) {
            return false;
        }
        int n9 = this.g();
        if (n9 != d52.g()) {
            object = this.entrySet();
            d52 = d52.entrySet();
            do {
                return object.equals((Object)d52);
                break;
            } while (true);
        }
        for (int i8 = 0; i8 < n9; ++i8) {
            if (this.h(i8).equals((Object)d52.h(i8))) continue;
            return false;
        }
        if (n9 == n8) return true;
        object = this.q;
        d52 = d52.q;
        return object.equals((Object)d52);
    }

    public void f() {
        if (!this.r) {
            Map map = this.q.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap((Map)this.q);
            this.q = map;
            map = this.t.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap((Map)this.t);
            this.t = map;
            this.r = true;
        }
    }

    public final int g() {
        return this.p.size();
    }

    public Object get(Object object) {
        int n8 = this.a((Comparable)(object = (Comparable)object));
        if (n8 >= 0) {
            return ((k5)this.p.get(n8)).getValue();
        }
        return this.q.get(object);
    }

    public final Map.Entry h(int n8) {
        return (Map.Entry)this.p.get(n8);
    }

    public int hashCode() {
        int n8;
        int n9 = this.g();
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n10 += ((k5)this.p.get(n8)).hashCode();
        }
        n8 = n10;
        if (this.q.size() > 0) {
            n8 = n10 + this.q.hashCode();
        }
        return n8;
    }

    public final Iterable j() {
        if (this.q.isEmpty()) {
            return j5.a();
        }
        return this.q.entrySet();
    }

    public final Object k(int n8) {
        this.q();
        Object object = ((k5)this.p.remove(n8)).getValue();
        if (!this.q.isEmpty()) {
            Iterator iterator = this.p().entrySet().iterator();
            this.p.add((Object)new k5(this, (Map.Entry)iterator.next()));
            iterator.remove();
        }
        return object;
    }

    public final Set m() {
        if (this.u == null) {
            this.u = new h5(this, null);
        }
        return this.u;
    }

    public final boolean o() {
        return this.r;
    }

    public final SortedMap p() {
        this.q();
        if (this.q.isEmpty() && !(this.q instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.q = treeMap;
            this.t = treeMap.descendingMap();
        }
        return (SortedMap)this.q;
    }

    public /* synthetic */ Object put(Object object, Object object2) {
        return this.d((Comparable)object, object2);
    }

    public final void q() {
        if (!this.r) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public Object remove(Object object) {
        this.q();
        object = (Comparable)object;
        int n8 = this.a((Comparable)object);
        if (n8 >= 0) {
            return this.k(n8);
        }
        if (this.q.isEmpty()) {
            return null;
        }
        return this.q.remove(object);
    }

    public int size() {
        return this.p.size() + this.q.size();
    }
}


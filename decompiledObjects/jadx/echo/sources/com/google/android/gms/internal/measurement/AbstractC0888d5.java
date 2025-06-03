package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.d5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0888d5 extends AbstractMap {

    /* renamed from: o, reason: collision with root package name */
    public final int f10869o;

    /* renamed from: p, reason: collision with root package name */
    public List f10870p;

    /* renamed from: q, reason: collision with root package name */
    public Map f10871q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10872r;

    /* renamed from: s, reason: collision with root package name */
    public volatile C0996p5 f10873s;

    /* renamed from: t, reason: collision with root package name */
    public Map f10874t;

    /* renamed from: u, reason: collision with root package name */
    public volatile C0924h5 f10875u;

    public AbstractC0888d5(int i7) {
        this.f10869o = i7;
        this.f10870p = Collections.emptyList();
        this.f10871q = Collections.emptyMap();
        this.f10874t = Collections.emptyMap();
    }

    public static AbstractC0888d5 b(int i7) {
        return new C0879c5(i7);
    }

    public final int a(Comparable comparable) {
        int i7;
        int size = this.f10870p.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo((Comparable) ((C0951k5) this.f10870p.get(i8)).getKey());
            if (compareTo > 0) {
                i7 = size + 1;
                return -i7;
            }
            if (compareTo == 0) {
                return i8;
            }
        }
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo((Comparable) ((C0951k5) this.f10870p.get(i10)).getKey());
            if (compareTo2 < 0) {
                i8 = i10 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        i7 = i9 + 1;
        return -i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        q();
        if (!this.f10870p.isEmpty()) {
            this.f10870p.clear();
        }
        if (this.f10871q.isEmpty()) {
            return;
        }
        this.f10871q.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f10871q.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        q();
        int a7 = a(comparable);
        if (a7 >= 0) {
            return ((C0951k5) this.f10870p.get(a7)).setValue(obj);
        }
        q();
        if (this.f10870p.isEmpty() && !(this.f10870p instanceof ArrayList)) {
            this.f10870p = new ArrayList(this.f10869o);
        }
        int i7 = -(a7 + 1);
        if (i7 >= this.f10869o) {
            return p().put(comparable, obj);
        }
        int size = this.f10870p.size();
        int i8 = this.f10869o;
        if (size == i8) {
            C0951k5 c0951k5 = (C0951k5) this.f10870p.remove(i8 - 1);
            p().put((Comparable) c0951k5.getKey(), c0951k5.getValue());
        }
        this.f10870p.add(i7, new C0951k5(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f10873s == null) {
            this.f10873s = new C0996p5(this);
        }
        return this.f10873s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0888d5)) {
            return super.equals(obj);
        }
        AbstractC0888d5 abstractC0888d5 = (AbstractC0888d5) obj;
        int size = size();
        if (size != abstractC0888d5.size()) {
            return false;
        }
        int g7 = g();
        if (g7 != abstractC0888d5.g()) {
            obj2 = entrySet();
            obj3 = abstractC0888d5.entrySet();
        } else {
            for (int i7 = 0; i7 < g7; i7++) {
                if (!h(i7).equals(abstractC0888d5.h(i7))) {
                    return false;
                }
            }
            if (g7 == size) {
                return true;
            }
            obj2 = this.f10871q;
            obj3 = abstractC0888d5.f10871q;
        }
        return obj2.equals(obj3);
    }

    public void f() {
        if (this.f10872r) {
            return;
        }
        this.f10871q = this.f10871q.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f10871q);
        this.f10874t = this.f10874t.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f10874t);
        this.f10872r = true;
    }

    public final int g() {
        return this.f10870p.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        return a7 >= 0 ? ((C0951k5) this.f10870p.get(a7)).getValue() : this.f10871q.get(comparable);
    }

    public final Map.Entry h(int i7) {
        return (Map.Entry) this.f10870p.get(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int g7 = g();
        int i7 = 0;
        for (int i8 = 0; i8 < g7; i8++) {
            i7 += ((C0951k5) this.f10870p.get(i8)).hashCode();
        }
        return this.f10871q.size() > 0 ? i7 + this.f10871q.hashCode() : i7;
    }

    public final Iterable j() {
        return this.f10871q.isEmpty() ? AbstractC0942j5.a() : this.f10871q.entrySet();
    }

    public final Object k(int i7) {
        q();
        Object value = ((C0951k5) this.f10870p.remove(i7)).getValue();
        if (!this.f10871q.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            this.f10870p.add(new C0951k5(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public final Set m() {
        if (this.f10875u == null) {
            this.f10875u = new C0924h5(this);
        }
        return this.f10875u;
    }

    public final boolean o() {
        return this.f10872r;
    }

    public final SortedMap p() {
        q();
        if (this.f10871q.isEmpty() && !(this.f10871q instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f10871q = treeMap;
            this.f10874t = treeMap.descendingMap();
        }
        return (SortedMap) this.f10871q;
    }

    public final void q() {
        if (this.f10872r) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        q();
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        if (a7 >= 0) {
            return k(a7);
        }
        if (this.f10871q.isEmpty()) {
            return null;
        }
        return this.f10871q.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f10870p.size() + this.f10871q.size();
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978n5 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public int f11060o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11061p;

    /* renamed from: q, reason: collision with root package name */
    public Iterator f11062q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC0888d5 f11063r;

    public C0978n5(AbstractC0888d5 abstractC0888d5) {
        this.f11063r = abstractC0888d5;
        this.f11060o = -1;
    }

    public final Iterator b() {
        Map map;
        if (this.f11062q == null) {
            map = this.f11063r.f10871q;
            this.f11062q = map.entrySet().iterator();
        }
        return this.f11062q;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i7 = this.f11060o + 1;
        list = this.f11063r.f10870p;
        if (i7 >= list.size()) {
            map = this.f11063r.f10871q;
            if (map.isEmpty() || !b().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.f11061p = true;
        int i7 = this.f11060o + 1;
        this.f11060o = i7;
        list = this.f11063r.f10870p;
        if (i7 < list.size()) {
            list2 = this.f11063r.f10870p;
            next = list2.get(this.f11060o);
        } else {
            next = b().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f11061p) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f11061p = false;
        this.f11063r.q();
        int i7 = this.f11060o;
        list = this.f11063r.f10870p;
        if (i7 >= list.size()) {
            b().remove();
            return;
        }
        AbstractC0888d5 abstractC0888d5 = this.f11063r;
        int i8 = this.f11060o;
        this.f11060o = i8 - 1;
        abstractC0888d5.k(i8);
    }
}

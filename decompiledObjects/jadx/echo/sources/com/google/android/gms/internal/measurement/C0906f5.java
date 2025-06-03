package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906f5 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public int f10951o;

    /* renamed from: p, reason: collision with root package name */
    public Iterator f10952p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC0888d5 f10953q;

    public C0906f5(AbstractC0888d5 abstractC0888d5) {
        List list;
        this.f10953q = abstractC0888d5;
        list = abstractC0888d5.f10870p;
        this.f10951o = list.size();
    }

    public final Iterator b() {
        Map map;
        if (this.f10952p == null) {
            map = this.f10953q.f10874t;
            this.f10952p = map.entrySet().iterator();
        }
        return this.f10952p;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i7 = this.f10951o;
        if (i7 > 0) {
            list = this.f10953q.f10870p;
            if (i7 <= list.size()) {
                return true;
            }
        }
        return b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Object obj;
        if (b().hasNext()) {
            obj = b().next();
        } else {
            list = this.f10953q.f10870p;
            int i7 = this.f10951o - 1;
            this.f10951o = i7;
            obj = list.get(i7);
        }
        return (Map.Entry) obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

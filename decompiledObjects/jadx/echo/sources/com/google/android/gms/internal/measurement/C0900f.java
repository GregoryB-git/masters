package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900f implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Iterator f10939o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Iterator f10940p;

    public C0900f(C0909g c0909g, Iterator it, Iterator it2) {
        this.f10939o = it;
        this.f10940p = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10939o.hasNext()) {
            return true;
        }
        return this.f10940p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f10939o.hasNext()) {
            return new C1034u(((Integer) this.f10939o.next()).toString());
        }
        if (this.f10940p.hasNext()) {
            return new C1034u((String) this.f10940p.next());
        }
        throw new NoSuchElementException();
    }
}

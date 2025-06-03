package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981o implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Iterator f11080o;

    public C0981o(Iterator it) {
        this.f11080o = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11080o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new C1034u((String) this.f11080o.next());
    }
}

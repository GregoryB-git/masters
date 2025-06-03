package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.m4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0968m4 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public Iterator f11049o;

    public C0968m4(Iterator it) {
        this.f11049o = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11049o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f11049o.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f11049o.remove();
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0927i implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public int f10974o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0909g f10975p;

    public C0927i(C0909g c0909g) {
        this.f10975p = c0909g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10974o < this.f10975p.U();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f10974o < this.f10975p.U()) {
            C0909g c0909g = this.f10975p;
            int i7 = this.f10974o;
            this.f10974o = i7 + 1;
            return c0909g.M(i7);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f10974o);
    }
}

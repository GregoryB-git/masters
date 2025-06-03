package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029t3 extends AbstractC1047v3 {

    /* renamed from: o, reason: collision with root package name */
    public int f11167o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final int f11168p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC1003q3 f11169q;

    public C1029t3(AbstractC1003q3 abstractC1003q3) {
        this.f11169q = abstractC1003q3;
        this.f11168p = abstractC1003q3.S();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1056w3
    public final byte a() {
        int i7 = this.f11167o;
        if (i7 >= this.f11168p) {
            throw new NoSuchElementException();
        }
        this.f11167o = i7 + 1;
        return this.f11169q.M(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11167o < this.f11168p;
    }
}

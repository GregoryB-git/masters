package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.h5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0924h5 extends C0996p5 {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC0888d5 f10970p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0924h5(AbstractC0888d5 abstractC0888d5) {
        super(abstractC0888d5);
        this.f10970p = abstractC0888d5;
    }

    @Override // com.google.android.gms.internal.measurement.C0996p5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0906f5(this.f10970p);
    }
}

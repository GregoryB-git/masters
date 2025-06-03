package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.y5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076y5 extends AbstractList implements InterfaceC0977n4, RandomAccess {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0977n4 f11218o;

    public C1076y5(InterfaceC0977n4 interfaceC0977n4) {
        this.f11218o = interfaceC0977n4;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0977n4
    public final void K(AbstractC1003q3 abstractC1003q3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0977n4
    public final List b() {
        return this.f11218o.b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return (String) this.f11218o.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new A5(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0977n4
    public final Object l(int i7) {
        return this.f11218o.l(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new B5(this, i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11218o.size();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0977n4
    public final InterfaceC0977n4 w() {
        return this;
    }
}

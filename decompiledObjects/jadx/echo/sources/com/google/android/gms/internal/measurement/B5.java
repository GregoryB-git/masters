package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class B5 implements ListIterator {

    /* renamed from: o, reason: collision with root package name */
    public ListIterator f10315o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10316p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1076y5 f10317q;

    public B5(C1076y5 c1076y5, int i7) {
        InterfaceC0977n4 interfaceC0977n4;
        this.f10317q = c1076y5;
        this.f10316p = i7;
        interfaceC0977n4 = c1076y5.f11218o;
        this.f10315o = interfaceC0977n4.listIterator(i7);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f10315o.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10315o.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f10315o.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10315o.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.f10315o.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10315o.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

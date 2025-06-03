package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class A5 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public Iterator f10290o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1076y5 f10291p;

    public A5(C1076y5 c1076y5) {
        InterfaceC0977n4 interfaceC0977n4;
        this.f10291p = c1076y5;
        interfaceC0977n4 = c1076y5.f11218o;
        this.f10290o = interfaceC0977n4.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10290o.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f10290o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1061x implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public int f11210o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1034u f11211p;

    public C1061x(C1034u c1034u) {
        this.f11211p = c1034u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i7 = this.f11210o;
        str = this.f11211p.f11174o;
        return i7 < str.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        String str;
        int i7 = this.f11210o;
        str = this.f11211p.f11174o;
        if (i7 >= str.length()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f11210o;
        this.f11210o = i8 + 1;
        return new C1034u(String.valueOf(i8));
    }
}

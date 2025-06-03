package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1052w implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public int f11203o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1034u f11204p;

    public C1052w(C1034u c1034u) {
        this.f11204p = c1034u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i7 = this.f11203o;
        str = this.f11204p.f11174o;
        return i7 < str.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        String str;
        String str2;
        int i7 = this.f11203o;
        str = this.f11204p.f11174o;
        if (i7 >= str.length()) {
            throw new NoSuchElementException();
        }
        str2 = this.f11204p.f11174o;
        int i8 = this.f11203o;
        this.f11203o = i8 + 1;
        return new C1034u(String.valueOf(str2.charAt(i8)));
    }
}

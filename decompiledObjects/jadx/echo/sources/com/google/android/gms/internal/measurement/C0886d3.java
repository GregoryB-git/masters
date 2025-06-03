package com.google.android.gms.internal.measurement;

import X2.AbstractC0705x;

/* renamed from: com.google.android.gms.internal.measurement.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0886d3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10868a;

    public C0886d3(InterfaceC0922h3 interfaceC0922h3) {
        W2.m.k(interfaceC0922h3, "BuildInfo must be non-null");
        this.f10868a = !interfaceC0922h3.a();
    }

    public final boolean a(String str) {
        W2.m.k(str, "flagName must not be null");
        if (this.f10868a) {
            return ((AbstractC0705x) AbstractC0913g3.f10963a.get()).b(str);
        }
        return true;
    }
}

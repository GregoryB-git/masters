package com.google.android.gms.measurement;

import A2.AbstractC0328n;
import R2.InterfaceC0558m4;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends AppMeasurement.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0558m4 f11247a;

    public b(InterfaceC0558m4 interfaceC0558m4) {
        super();
        AbstractC0328n.i(interfaceC0558m4);
        this.f11247a = interfaceC0558m4;
    }

    @Override // R2.InterfaceC0558m4
    public final long a() {
        return this.f11247a.a();
    }

    @Override // R2.InterfaceC0558m4
    public final List c(String str, String str2) {
        return this.f11247a.c(str, str2);
    }

    @Override // R2.InterfaceC0558m4
    public final String g() {
        return this.f11247a.g();
    }

    @Override // R2.InterfaceC0558m4
    public final String h() {
        return this.f11247a.h();
    }

    @Override // R2.InterfaceC0558m4
    public final int i(String str) {
        return this.f11247a.i(str);
    }

    @Override // R2.InterfaceC0558m4
    public final String k() {
        return this.f11247a.k();
    }

    @Override // R2.InterfaceC0558m4
    public final void l(Bundle bundle) {
        this.f11247a.l(bundle);
    }

    @Override // R2.InterfaceC0558m4
    public final String m() {
        return this.f11247a.m();
    }

    @Override // R2.InterfaceC0558m4
    public final void q(String str) {
        this.f11247a.q(str);
    }

    @Override // R2.InterfaceC0558m4
    public final void r(String str, String str2, Bundle bundle) {
        this.f11247a.r(str, str2, bundle);
    }

    @Override // R2.InterfaceC0558m4
    public final void s(String str) {
        this.f11247a.s(str);
    }

    @Override // R2.InterfaceC0558m4
    public final Map t(String str, String str2, boolean z7) {
        return this.f11247a.t(str, str2, z7);
    }

    @Override // R2.InterfaceC0558m4
    public final void u(String str, String str2, Bundle bundle) {
        this.f11247a.u(str, str2, bundle);
    }
}

package com.google.android.gms.measurement;

import A2.AbstractC0328n;
import R2.C3;
import R2.N2;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends AppMeasurement.a {

    /* renamed from: a, reason: collision with root package name */
    public final N2 f11245a;

    /* renamed from: b, reason: collision with root package name */
    public final C3 f11246b;

    public a(N2 n22) {
        super();
        AbstractC0328n.i(n22);
        this.f11245a = n22;
        this.f11246b = n22.H();
    }

    @Override // R2.InterfaceC0558m4
    public final long a() {
        return this.f11245a.L().P0();
    }

    @Override // R2.InterfaceC0558m4
    public final List c(String str, String str2) {
        return this.f11246b.C(str, str2);
    }

    @Override // R2.InterfaceC0558m4
    public final String g() {
        return this.f11246b.i0();
    }

    @Override // R2.InterfaceC0558m4
    public final String h() {
        return this.f11246b.i0();
    }

    @Override // R2.InterfaceC0558m4
    public final int i(String str) {
        AbstractC0328n.e(str);
        return 25;
    }

    @Override // R2.InterfaceC0558m4
    public final String k() {
        return this.f11246b.k0();
    }

    @Override // R2.InterfaceC0558m4
    public final void l(Bundle bundle) {
        this.f11246b.w0(bundle);
    }

    @Override // R2.InterfaceC0558m4
    public final String m() {
        return this.f11246b.j0();
    }

    @Override // R2.InterfaceC0558m4
    public final void q(String str) {
        this.f11245a.y().D(str, this.f11245a.b().b());
    }

    @Override // R2.InterfaceC0558m4
    public final void r(String str, String str2, Bundle bundle) {
        this.f11245a.H().X(str, str2, bundle);
    }

    @Override // R2.InterfaceC0558m4
    public final void s(String str) {
        this.f11245a.y().z(str, this.f11245a.b().b());
    }

    @Override // R2.InterfaceC0558m4
    public final Map t(String str, String str2, boolean z7) {
        return this.f11246b.D(str, str2, z7);
    }

    @Override // R2.InterfaceC0558m4
    public final void u(String str, String str2, Bundle bundle) {
        this.f11246b.y0(str, str2, bundle);
    }
}

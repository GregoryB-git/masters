package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class L3 implements T5 {

    /* renamed from: a, reason: collision with root package name */
    public final J3 f10480a;

    public L3(J3 j32) {
        J3 j33 = (J3) AbstractC0860a4.f(j32, "output");
        this.f10480a = j33;
        j33.f10445a = this;
    }

    public static L3 P(J3 j32) {
        L3 l32 = j32.f10445a;
        return l32 != null ? l32 : new L3(j32);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void A(int i7, long j7) {
        this.f10480a.q0(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void B(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.I(i7, ((Double) list.get(i8)).doubleValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.c(((Double) list.get(i10)).doubleValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.F(((Double) list.get(i8)).doubleValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void C(int i7, Object obj, Z4 z42) {
        J3 j32 = this.f10480a;
        j32.V(i7, 3);
        z42.i((I4) obj, j32.f10445a);
        j32.V(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void D(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.J(i7, ((Float) list.get(i8)).floatValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.d(((Float) list.get(i10)).floatValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.G(((Float) list.get(i8)).floatValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void E(int i7, String str) {
        this.f10480a.q(i7, str);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void F(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.m(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.f0(((Long) list.get(i10)).longValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.s(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void G(int i7, int i8) {
        this.f10480a.y0(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void H(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.y0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.o0(((Integer) list.get(i10)).intValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.x0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void I(int i7, long j7) {
        this.f10480a.L(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void J(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f10480a.n(i7, (AbstractC1003q3) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void K(int i7, int i8) {
        this.f10480a.K(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void L(int i7, List list, Z4 z42) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            C(i7, list.get(i8), z42);
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void M(int i7, long j7) {
        this.f10480a.m(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void N(int i7, double d7) {
        this.f10480a.I(i7, d7);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void O(int i7, float f7) {
        this.f10480a.J(i7, f7);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final int a() {
        return W5.f10704a;
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void b(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.m(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.S(((Long) list.get(i10)).longValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.s(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void c(int i7, boolean z7) {
        this.f10480a.r(i7, z7);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void d(int i7, Object obj, Z4 z42) {
        this.f10480a.p(i7, (I4) obj, z42);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void e(int i7) {
        this.f10480a.V(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void f(int i7, AbstractC1003q3 abstractC1003q3) {
        this.f10480a.n(i7, abstractC1003q3);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void g(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.l(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.k0(((Integer) list.get(i10)).intValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.k(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void h(int i7, int i8) {
        this.f10480a.b0(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void i(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.L(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.n0(((Long) list.get(i10)).longValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.N(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void j(int i7, long j7) {
        this.f10480a.L(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void k(int i7, int i8) {
        this.f10480a.l(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void l(int i7) {
        this.f10480a.V(i7, 3);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void m(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.r(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.h(((Boolean) list.get(i10)).booleanValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.O(((Boolean) list.get(i8)).booleanValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void n(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.l(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.c0(((Integer) list.get(i10)).intValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.k(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void o(int i7, D4 d42, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f10480a.V(i7, 2);
            this.f10480a.U(A4.a(d42, entry.getKey(), entry.getValue()));
            A4.b(this.f10480a, d42, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void p(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.L(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.a0(((Long) list.get(i10)).longValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.N(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void q(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.b0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.v0(((Integer) list.get(i10)).intValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.U(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void r(int i7, int i8) {
        this.f10480a.K(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void s(int i7, long j7) {
        this.f10480a.m(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void t(int i7, Object obj) {
        if (obj instanceof AbstractC1003q3) {
            this.f10480a.M(i7, (AbstractC1003q3) obj);
        } else {
            this.f10480a.o(i7, (I4) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void u(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.K(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.X(((Integer) list.get(i10)).intValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.H(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void v(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.K(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.g0(((Integer) list.get(i10)).intValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.H(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void w(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof InterfaceC0977n4)) {
            while (i8 < list.size()) {
                this.f10480a.q(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        InterfaceC0977n4 interfaceC0977n4 = (InterfaceC0977n4) list;
        while (i8 < list.size()) {
            Object l7 = interfaceC0977n4.l(i8);
            if (l7 instanceof String) {
                this.f10480a.q(i7, (String) l7);
            } else {
                this.f10480a.n(i7, (AbstractC1003q3) l7);
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void x(int i7, int i8) {
        this.f10480a.l(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void y(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f10480a.q0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f10480a.V(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += J3.j0(((Long) list.get(i10)).longValue());
        }
        this.f10480a.U(i9);
        while (i8 < list.size()) {
            this.f10480a.r0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.T5
    public final void z(int i7, List list, Z4 z42) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            d(i7, list.get(i8), z42);
        }
    }
}

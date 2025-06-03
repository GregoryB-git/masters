package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1097l implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1096k f11386a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11387a;

        static {
            int[] iArr = new int[q0.b.values().length];
            f11387a = iArr;
            try {
                iArr[q0.b.f11452x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11387a[q0.b.f11451w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11387a[q0.b.f11449u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11387a[q0.b.f11440E.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11387a[q0.b.f11442G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11387a[q0.b.f11438C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11387a[q0.b.f11450v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11387a[q0.b.f11447s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11387a[q0.b.f11441F.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11387a[q0.b.f11443H.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11387a[q0.b.f11448t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11387a[q0.b.f11453y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C1097l(AbstractC1096k abstractC1096k) {
        AbstractC1096k abstractC1096k2 = (AbstractC1096k) AbstractC1110z.b(abstractC1096k, "output");
        this.f11386a = abstractC1096k2;
        abstractC1096k2.f11380a = this;
    }

    public static C1097l P(AbstractC1096k abstractC1096k) {
        C1097l c1097l = abstractC1096k.f11380a;
        return c1097l != null ? c1097l : new C1097l(abstractC1096k);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void A(int i7, String str) {
        this.f11386a.C0(i7, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void B(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.y0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.G(((Integer) list.get(i10)).intValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.z0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void C(int i7, long j7) {
        this.f11386a.G0(i7, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void D(int i7, int i8) {
        this.f11386a.d0(i7, i8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void E(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.p0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.w(((Long) list.get(i10)).longValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.q0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void F(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.d0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.k(((Integer) list.get(i10)).intValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.e0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void G(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.b0(i7, ((Double) list.get(i8)).doubleValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.i(((Double) list.get(i10)).doubleValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.c0(((Double) list.get(i8)).doubleValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void H(int i7, int i8) {
        this.f11386a.y0(i7, i8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void I(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f11386a.a0(i7, (AbstractC1093h) list.get(i8));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void J(int i7, List list, e0 e0Var) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            O(i7, list.get(i8), e0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void K(int i7, List list, e0 e0Var) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            L(i7, list.get(i8), e0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void L(int i7, Object obj, e0 e0Var) {
        this.f11386a.r0(i7, (O) obj, e0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void M(int i7, AbstractC1093h abstractC1093h) {
        this.f11386a.a0(i7, abstractC1093h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void N(int i7, H.a aVar, Map map) {
        if (this.f11386a.T()) {
            Q(i7, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f11386a.D0(i7, 2);
            this.f11386a.F0(H.a(aVar, entry.getKey(), entry.getValue()));
            H.b(this.f11386a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void O(int i7, Object obj, e0 e0Var) {
        this.f11386a.l0(i7, (O) obj, e0Var);
    }

    public final void Q(int i7, H.a aVar, Map map) {
        int[] iArr = a.f11387a;
        throw null;
    }

    public final void R(int i7, Object obj) {
        if (obj instanceof String) {
            this.f11386a.C0(i7, (String) obj);
        } else {
            this.f11386a.a0(i7, (AbstractC1093h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void a(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.n0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.u(((Integer) list.get(i10)).intValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.o0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void b(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.j0(i7, ((Float) list.get(i8)).floatValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.q(((Float) list.get(i10)).floatValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.k0(((Float) list.get(i8)).floatValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void c(int i7, long j7) {
        this.f11386a.p0(i7, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void d(int i7, boolean z7) {
        this.f11386a.Y(i7, z7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void e(int i7, int i8) {
        this.f11386a.E0(i7, i8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void f(int i7, Object obj) {
        if (obj instanceof AbstractC1093h) {
            this.f11386a.t0(i7, (AbstractC1093h) obj);
        } else {
            this.f11386a.s0(i7, (O) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void g(int i7, int i8) {
        this.f11386a.u0(i7, i8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void h(int i7) {
        this.f11386a.D0(i7, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void i(int i7, int i8) {
        this.f11386a.n0(i7, i8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void j(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.h0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.o(((Long) list.get(i10)).longValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.i0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void k(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.u0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.C(((Integer) list.get(i10)).intValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.v0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void l(int i7, int i8) {
        this.f11386a.f0(i7, i8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void m(int i7, double d7) {
        this.f11386a.b0(i7, d7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void n(int i7, long j7) {
        this.f11386a.w0(i7, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void o(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.w0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.E(((Long) list.get(i10)).longValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.x0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void p(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.f0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.m(((Integer) list.get(i10)).intValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.g0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void q(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.G0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.P(((Long) list.get(i10)).longValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.H0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void r(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.Y(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.e(((Boolean) list.get(i10)).booleanValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.Z(((Boolean) list.get(i8)).booleanValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void s(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.E0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.N(((Integer) list.get(i10)).intValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.F0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void t(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f11386a.A0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f11386a.D0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1096k.I(((Long) list.get(i10)).longValue());
        }
        this.f11386a.F0(i9);
        while (i8 < list.size()) {
            this.f11386a.B0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void u(int i7, long j7) {
        this.f11386a.h0(i7, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public r0.a v() {
        return r0.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void w(int i7, long j7) {
        this.f11386a.A0(i7, j7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void x(int i7, float f7) {
        this.f11386a.j0(i7, f7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void y(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof D)) {
            while (i8 < list.size()) {
                this.f11386a.C0(i7, (String) list.get(i8));
                i8++;
            }
        } else {
            D d7 = (D) list;
            while (i8 < list.size()) {
                R(i7, d7.n(i8));
                i8++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void z(int i7) {
        this.f11386a.D0(i7, 4);
    }
}

package com.google.protobuf;

import com.google.protobuf.D;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1144i implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1143h f12083a;

    /* renamed from: com.google.protobuf.i$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12084a;

        static {
            int[] iArr = new int[m0.b.values().length];
            f12084a = iArr;
            try {
                iArr[m0.b.f12141x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12084a[m0.b.f12140w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12084a[m0.b.f12138u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12084a[m0.b.f12129E.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12084a[m0.b.f12131G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12084a[m0.b.f12127C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12084a[m0.b.f12139v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12084a[m0.b.f12136s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12084a[m0.b.f12130F.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12084a[m0.b.f12132H.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12084a[m0.b.f12137t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12084a[m0.b.f12142y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C1144i(AbstractC1143h abstractC1143h) {
        AbstractC1143h abstractC1143h2 = (AbstractC1143h) AbstractC1154t.b(abstractC1143h, "output");
        this.f12083a = abstractC1143h2;
        abstractC1143h2.f12071a = this;
    }

    public static C1144i P(AbstractC1143h abstractC1143h) {
        C1144i c1144i = abstractC1143h.f12071a;
        return c1144i != null ? c1144i : new C1144i(abstractC1143h);
    }

    @Override // com.google.protobuf.n0
    public void A(int i7, String str) {
        this.f12083a.L0(i7, str);
    }

    @Override // com.google.protobuf.n0
    public void B(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.H0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.J(((Integer) list.get(i10)).intValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.I0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void C(int i7, long j7) {
        this.f12083a.Q0(i7, j7);
    }

    @Override // com.google.protobuf.n0
    public void D(int i7, int i8) {
        this.f12083a.j0(i7, i8);
    }

    @Override // com.google.protobuf.n0
    public void E(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.x0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.y(((Long) list.get(i10)).longValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.y0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void F(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.j0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.l(((Integer) list.get(i10)).intValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.k0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void G(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.h0(i7, ((Double) list.get(i8)).doubleValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.j(((Double) list.get(i10)).doubleValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.i0(((Double) list.get(i8)).doubleValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void H(int i7, int i8) {
        this.f12083a.H0(i7, i8);
    }

    @Override // com.google.protobuf.n0
    public void I(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f12083a.f0(i7, (AbstractC1141f) list.get(i8));
        }
    }

    @Override // com.google.protobuf.n0
    public void J(int i7, List list, Z z7) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            N(i7, list.get(i8), z7);
        }
    }

    @Override // com.google.protobuf.n0
    public void K(int i7, List list, Z z7) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            L(i7, list.get(i8), z7);
        }
    }

    @Override // com.google.protobuf.n0
    public void L(int i7, Object obj, Z z7) {
        this.f12083a.s0(i7, (K) obj, z7);
    }

    @Override // com.google.protobuf.n0
    public void M(int i7, AbstractC1141f abstractC1141f) {
        this.f12083a.f0(i7, abstractC1141f);
    }

    @Override // com.google.protobuf.n0
    public void N(int i7, Object obj, Z z7) {
        this.f12083a.z0(i7, (K) obj, z7);
    }

    @Override // com.google.protobuf.n0
    public void O(int i7, D.a aVar, Map map) {
        if (this.f12083a.W()) {
            T(i7, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f12083a.N0(i7, 2);
            this.f12083a.P0(D.b(aVar, entry.getKey(), entry.getValue()));
            D.e(this.f12083a, aVar, entry.getKey(), entry.getValue());
        }
    }

    public final void Q(int i7, boolean z7, Object obj, D.a aVar) {
        this.f12083a.N0(i7, 2);
        this.f12083a.P0(D.b(aVar, Boolean.valueOf(z7), obj));
        D.e(this.f12083a, aVar, Boolean.valueOf(z7), obj);
    }

    public final void R(int i7, D.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = ((Integer) it.next()).intValue();
            i8++;
        }
        Arrays.sort(iArr);
        for (int i9 = 0; i9 < size; i9++) {
            int i10 = iArr[i9];
            Object obj = map.get(Integer.valueOf(i10));
            this.f12083a.N0(i7, 2);
            this.f12083a.P0(D.b(aVar, Integer.valueOf(i10), obj));
            D.e(this.f12083a, aVar, Integer.valueOf(i10), obj);
        }
    }

    public final void S(int i7, D.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            jArr[i8] = ((Long) it.next()).longValue();
            i8++;
        }
        Arrays.sort(jArr);
        for (int i9 = 0; i9 < size; i9++) {
            long j7 = jArr[i9];
            Object obj = map.get(Long.valueOf(j7));
            this.f12083a.N0(i7, 2);
            this.f12083a.P0(D.b(aVar, Long.valueOf(j7), obj));
            D.e(this.f12083a, aVar, Long.valueOf(j7), obj);
        }
    }

    public final void T(int i7, D.a aVar, Map map) {
        switch (a.f12084a[aVar.f11969a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i7, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i7, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i7, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i7, aVar, map);
                return;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                U(i7, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f11969a);
        }
    }

    public final void U(int i7, D.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            strArr[i8] = (String) it.next();
            i8++;
        }
        Arrays.sort(strArr);
        for (int i9 = 0; i9 < size; i9++) {
            String str = strArr[i9];
            Object obj = map.get(str);
            this.f12083a.N0(i7, 2);
            this.f12083a.P0(D.b(aVar, str, obj));
            D.e(this.f12083a, aVar, str, obj);
        }
    }

    public final void V(int i7, Object obj) {
        if (obj instanceof String) {
            this.f12083a.L0(i7, (String) obj);
        } else {
            this.f12083a.f0(i7, (AbstractC1141f) obj);
        }
    }

    @Override // com.google.protobuf.n0
    public void a(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.v0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.w(((Integer) list.get(i10)).intValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.w0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void b(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.p0(i7, ((Float) list.get(i8)).floatValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.r(((Float) list.get(i10)).floatValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.q0(((Float) list.get(i8)).floatValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void c(int i7, long j7) {
        this.f12083a.x0(i7, j7);
    }

    @Override // com.google.protobuf.n0
    public void d(int i7, boolean z7) {
        this.f12083a.b0(i7, z7);
    }

    @Override // com.google.protobuf.n0
    public void e(int i7, int i8) {
        this.f12083a.O0(i7, i8);
    }

    @Override // com.google.protobuf.n0
    public final void f(int i7, Object obj) {
        if (obj instanceof AbstractC1141f) {
            this.f12083a.C0(i7, (AbstractC1141f) obj);
        } else {
            this.f12083a.B0(i7, (K) obj);
        }
    }

    @Override // com.google.protobuf.n0
    public void g(int i7, int i8) {
        this.f12083a.D0(i7, i8);
    }

    @Override // com.google.protobuf.n0
    public void h(int i7) {
        this.f12083a.N0(i7, 3);
    }

    @Override // com.google.protobuf.n0
    public void i(int i7, int i8) {
        this.f12083a.v0(i7, i8);
    }

    @Override // com.google.protobuf.n0
    public void j(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.n0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.p(((Long) list.get(i10)).longValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.o0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void k(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.D0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.F(((Integer) list.get(i10)).intValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.E0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void l(int i7, int i8) {
        this.f12083a.l0(i7, i8);
    }

    @Override // com.google.protobuf.n0
    public void m(int i7, double d7) {
        this.f12083a.h0(i7, d7);
    }

    @Override // com.google.protobuf.n0
    public void n(int i7, long j7) {
        this.f12083a.F0(i7, j7);
    }

    @Override // com.google.protobuf.n0
    public void o(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.F0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.H(((Long) list.get(i10)).longValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.G0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void p(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.l0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.n(((Integer) list.get(i10)).intValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.m0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void q(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.Q0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.S(((Long) list.get(i10)).longValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.R0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void r(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.b0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.e(((Boolean) list.get(i10)).booleanValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.c0(((Boolean) list.get(i8)).booleanValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void s(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.O0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.Q(((Integer) list.get(i10)).intValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.P0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void t(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f12083a.J0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f12083a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC1143h.L(((Long) list.get(i10)).longValue());
        }
        this.f12083a.P0(i9);
        while (i8 < list.size()) {
            this.f12083a.K0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.protobuf.n0
    public void u(int i7, long j7) {
        this.f12083a.n0(i7, j7);
    }

    @Override // com.google.protobuf.n0
    public n0.a v() {
        return n0.a.ASCENDING;
    }

    @Override // com.google.protobuf.n0
    public void w(int i7, long j7) {
        this.f12083a.J0(i7, j7);
    }

    @Override // com.google.protobuf.n0
    public void x(int i7, float f7) {
        this.f12083a.p0(i7, f7);
    }

    @Override // com.google.protobuf.n0
    public void y(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof InterfaceC1160z)) {
            while (i8 < list.size()) {
                this.f12083a.L0(i7, (String) list.get(i8));
                i8++;
            }
        } else {
            InterfaceC1160z interfaceC1160z = (InterfaceC1160z) list;
            while (i8 < list.size()) {
                V(i7, interfaceC1160z.n(i8));
                i8++;
            }
        }
    }

    @Override // com.google.protobuf.n0
    public void z(int i7) {
        this.f12083a.N0(i7, 4);
    }
}

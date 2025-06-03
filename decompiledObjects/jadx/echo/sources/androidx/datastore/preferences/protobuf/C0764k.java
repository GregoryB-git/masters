package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764k implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0763j f9022a;

    /* renamed from: androidx.datastore.preferences.protobuf.k$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9023a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f9023a = iArr;
            try {
                iArr[r0.b.f9093x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9023a[r0.b.f9092w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9023a[r0.b.f9090u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9023a[r0.b.f9081E.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9023a[r0.b.f9083G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9023a[r0.b.f9079C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9023a[r0.b.f9091v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9023a[r0.b.f9088s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9023a[r0.b.f9082F.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9023a[r0.b.f9084H.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9023a[r0.b.f9089t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9023a[r0.b.f9094y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C0764k(AbstractC0763j abstractC0763j) {
        AbstractC0763j abstractC0763j2 = (AbstractC0763j) AbstractC0777y.b(abstractC0763j, "output");
        this.f9022a = abstractC0763j2;
        abstractC0763j2.f9014a = this;
    }

    public static C0764k P(AbstractC0763j abstractC0763j) {
        C0764k c0764k = abstractC0763j.f9014a;
        return c0764k != null ? c0764k : new C0764k(abstractC0763j);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void A(int i7, String str) {
        this.f9022a.L0(i7, str);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void B(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.H0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.K(((Integer) list.get(i10)).intValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.I0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void C(int i7, long j7) {
        this.f9022a.Q0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void D(int i7, int i8) {
        this.f9022a.j0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void E(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.x0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.x(((Long) list.get(i10)).longValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.y0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void F(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.j0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.k(((Integer) list.get(i10)).intValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.k0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void G(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.h0(i7, ((Double) list.get(i8)).doubleValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.i(((Double) list.get(i10)).doubleValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.i0(((Double) list.get(i8)).doubleValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void H(int i7, int i8) {
        this.f9022a.H0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void I(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f9022a.f0(i7, (AbstractC0760g) list.get(i8));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void J(int i7, AbstractC0760g abstractC0760g) {
        this.f9022a.f0(i7, abstractC0760g);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void K(int i7, Object obj, e0 e0Var) {
        this.f9022a.z0(i7, (O) obj, e0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void L(int i7, List list, e0 e0Var) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            K(i7, list.get(i8), e0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void M(int i7, List list, e0 e0Var) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            O(i7, list.get(i8), e0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void N(int i7, H.a aVar, Map map) {
        if (this.f9022a.Y()) {
            T(i7, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f9022a.N0(i7, 2);
            this.f9022a.P0(H.b(aVar, entry.getKey(), entry.getValue()));
            H.e(this.f9022a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void O(int i7, Object obj, e0 e0Var) {
        this.f9022a.s0(i7, (O) obj, e0Var);
    }

    public final void Q(int i7, boolean z7, Object obj, H.a aVar) {
        this.f9022a.N0(i7, 2);
        this.f9022a.P0(H.b(aVar, Boolean.valueOf(z7), obj));
        H.e(this.f9022a, aVar, Boolean.valueOf(z7), obj);
    }

    public final void R(int i7, H.a aVar, Map map) {
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
            this.f9022a.N0(i7, 2);
            this.f9022a.P0(H.b(aVar, Integer.valueOf(i10), obj));
            H.e(this.f9022a, aVar, Integer.valueOf(i10), obj);
        }
    }

    public final void S(int i7, H.a aVar, Map map) {
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
            this.f9022a.N0(i7, 2);
            this.f9022a.P0(H.b(aVar, Long.valueOf(j7), obj));
            H.e(this.f9022a, aVar, Long.valueOf(j7), obj);
        }
    }

    public final void T(int i7, H.a aVar, Map map) {
        switch (a.f9023a[aVar.f8900a.ordinal()]) {
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
                throw new IllegalArgumentException("does not support key type: " + aVar.f8900a);
        }
    }

    public final void U(int i7, H.a aVar, Map map) {
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
            this.f9022a.N0(i7, 2);
            this.f9022a.P0(H.b(aVar, str, obj));
            H.e(this.f9022a, aVar, str, obj);
        }
    }

    public final void V(int i7, Object obj) {
        if (obj instanceof String) {
            this.f9022a.L0(i7, (String) obj);
        } else {
            this.f9022a.f0(i7, (AbstractC0760g) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void a(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.v0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.v(((Integer) list.get(i10)).intValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.w0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void b(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.p0(i7, ((Float) list.get(i8)).floatValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.q(((Float) list.get(i10)).floatValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.q0(((Float) list.get(i8)).floatValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void c(int i7, long j7) {
        this.f9022a.x0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void d(int i7, boolean z7) {
        this.f9022a.b0(i7, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void e(int i7, int i8) {
        this.f9022a.O0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void f(int i7, Object obj) {
        if (obj instanceof AbstractC0760g) {
            this.f9022a.C0(i7, (AbstractC0760g) obj);
        } else {
            this.f9022a.B0(i7, (O) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void g(int i7, int i8) {
        this.f9022a.D0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void h(int i7) {
        this.f9022a.N0(i7, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void i(int i7, int i8) {
        this.f9022a.v0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void j(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.n0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.o(((Long) list.get(i10)).longValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.o0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void k(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.D0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.G(((Integer) list.get(i10)).intValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.E0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void l(int i7, int i8) {
        this.f9022a.l0(i7, i8);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void m(int i7, double d7) {
        this.f9022a.h0(i7, d7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void n(int i7, long j7) {
        this.f9022a.F0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void o(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.F0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.I(((Long) list.get(i10)).longValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.G0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void p(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.l0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.m(((Integer) list.get(i10)).intValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.m0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void q(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.Q0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.T(((Long) list.get(i10)).longValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.R0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void r(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.b0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.d(((Boolean) list.get(i10)).booleanValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.c0(((Boolean) list.get(i8)).booleanValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void s(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.O0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.R(((Integer) list.get(i10)).intValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.P0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void t(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f9022a.J0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f9022a.N0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0763j.M(((Long) list.get(i10)).longValue());
        }
        this.f9022a.P0(i9);
        while (i8 < list.size()) {
            this.f9022a.K0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void u(int i7, long j7) {
        this.f9022a.n0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public s0.a v() {
        return s0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void w(int i7, long j7) {
        this.f9022a.J0(i7, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void x(int i7, float f7) {
        this.f9022a.p0(i7, f7);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void y(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof D)) {
            while (i8 < list.size()) {
                this.f9022a.L0(i7, (String) list.get(i8));
                i8++;
            }
        } else {
            D d7 = (D) list;
            while (i8 < list.size()) {
                V(i7, d7.n(i8));
                i8++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void z(int i7) {
        this.f9022a.N0(i7, 4);
    }
}

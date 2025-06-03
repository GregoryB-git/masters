package v3;

import v3.r1;

/* loaded from: classes.dex */
public abstract class e implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final r1.c f15323a = new r1.c();

    @Override // v3.f1
    public final boolean A() {
        d0 d0Var = (d0) this;
        r1 J = d0Var.J();
        return !J.p() && J.m(d0Var.F(), this.f15323a).f15761p;
    }

    @Override // v3.f1
    public final boolean C() {
        return e() != -1;
    }

    @Override // v3.f1
    public final boolean D() {
        d0 d0Var = (d0) this;
        return d0Var.d() == 3 && d0Var.k() && d0Var.I() == 0;
    }

    @Override // v3.f1
    public final boolean G(int i10) {
        d0 d0Var = (d0) this;
        d0Var.u0();
        return d0Var.N.f15341a.f15905a.get(i10);
    }

    @Override // v3.f1
    public final boolean H() {
        d0 d0Var = (d0) this;
        r1 J = d0Var.J();
        return !J.p() && J.m(d0Var.F(), this.f15323a).f15762q;
    }

    @Override // v3.f1
    public final void M() {
        d0 d0Var = (d0) this;
        if (d0Var.J().p() || d0Var.g()) {
            return;
        }
        if (!C()) {
            if (Q() && H()) {
                U(d0Var.F(), 9);
                return;
            }
            return;
        }
        int e10 = e();
        if (e10 == -1) {
            return;
        }
        if (e10 == d0Var.F()) {
            S(d0Var.F(), -9223372036854775807L, true);
        } else {
            U(e10, 9);
        }
    }

    @Override // v3.f1
    public final void N() {
        d0 d0Var = (d0) this;
        d0Var.u0();
        V(12, d0Var.f15293v);
    }

    @Override // v3.f1
    public final void O() {
        d0 d0Var = (d0) this;
        d0Var.u0();
        V(11, -d0Var.f15292u);
    }

    @Override // v3.f1
    public final boolean Q() {
        d0 d0Var = (d0) this;
        r1 J = d0Var.J();
        return !J.p() && J.m(d0Var.F(), this.f15323a).a();
    }

    public final int R() {
        d0 d0Var = (d0) this;
        r1 J = d0Var.J();
        if (J.p()) {
            return -1;
        }
        int F = d0Var.F();
        d0Var.u0();
        int i10 = d0Var.F;
        if (i10 == 1) {
            i10 = 0;
        }
        d0Var.u0();
        return J.k(F, i10, d0Var.G);
    }

    public abstract void S(int i10, long j10, boolean z10);

    public final void T(int i10, long j10) {
        S(((d0) this).F(), j10, false);
    }

    public final void U(int i10, int i11) {
        S(i10, -9223372036854775807L, false);
    }

    public final void V(int i10, long j10) {
        d0 d0Var = (d0) this;
        long P = d0Var.P() + j10;
        long duration = d0Var.getDuration();
        if (duration != -9223372036854775807L) {
            P = Math.min(P, duration);
        }
        T(i10, Math.max(P, 0L));
    }

    public final void W() {
        int R = R();
        if (R == -1) {
            return;
        }
        d0 d0Var = (d0) this;
        if (R == d0Var.F()) {
            S(d0Var.F(), -9223372036854775807L, true);
        } else {
            U(R, 7);
        }
    }

    @Override // v3.f1
    public final void b() {
        ((d0) this).m0(true);
    }

    public final int e() {
        d0 d0Var = (d0) this;
        r1 J = d0Var.J();
        if (J.p()) {
            return -1;
        }
        int F = d0Var.F();
        d0Var.u0();
        int i10 = d0Var.F;
        if (i10 == 1) {
            i10 = 0;
        }
        d0Var.u0();
        return J.e(F, i10, d0Var.G);
    }

    @Override // v3.f1
    public final void j(int i10, long j10) {
        S(i10, j10, false);
    }

    @Override // v3.f1
    public final void l() {
        d0 d0Var = (d0) this;
        d0Var.u0();
        int size = d0Var.f15287o.size();
        int min = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || min == 0) {
            return;
        }
        d1 i02 = d0Var.i0(min);
        d0Var.s0(i02, 0, 1, false, !i02.f15307b.f17725a.equals(d0Var.f15276e0.f15307b.f17725a), 4, d0Var.a0(i02), -1, false);
    }

    @Override // v3.f1
    public final o0 m() {
        d0 d0Var = (d0) this;
        r1 J = d0Var.J();
        if (J.p()) {
            return null;
        }
        return J.m(d0Var.F(), this.f15323a).f15757c;
    }

    @Override // v3.f1
    public final void pause() {
        ((d0) this).m0(false);
    }

    @Override // v3.f1
    public final boolean q() {
        return R() != -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r1 <= 3000) goto L16;
     */
    @Override // v3.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() {
        /*
            r6 = this;
            r0 = r6
            v3.d0 r0 = (v3.d0) r0
            v3.r1 r1 = r0.J()
            boolean r1 = r1.p()
            if (r1 != 0) goto L40
            boolean r1 = r0.g()
            if (r1 == 0) goto L14
            goto L40
        L14:
            boolean r1 = r6.q()
            boolean r2 = r6.Q()
            r3 = 7
            if (r2 == 0) goto L28
            boolean r2 = r6.A()
            if (r2 != 0) goto L28
            if (r1 == 0) goto L40
            goto L37
        L28:
            if (r1 == 0) goto L3b
            long r1 = r0.P()
            r0.u0()
            r4 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L3b
        L37:
            r6.W()
            goto L40
        L3b:
            r0 = 0
            r6.T(r3, r0)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.e.t():void");
    }

    @Override // v3.f1
    public final void w(int i10) {
        U(i10, 10);
    }
}

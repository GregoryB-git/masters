package k9;

import ka.d0;
import ka.u;
import ma.n1;

/* loaded from: classes.dex */
public final class n implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final n f9170a = new n();

    @Override // k9.p
    public final d0 a(d0 d0Var, d0 d0Var2) {
        return d0Var2;
    }

    @Override // k9.p
    public final d0 b(u7.m mVar, d0 d0Var) {
        d0.a d02 = d0.d0();
        d02.v("server_timestamp");
        d0 k10 = d02.k();
        d0.a d03 = d0.d0();
        n1.a L = n1.L();
        L.p(mVar.f15102a);
        int i10 = mVar.f15103b;
        L.m();
        n1.H((n1) L.f11120b, i10);
        d03.w(L);
        d0 k11 = d03.k();
        u.a M = u.M();
        M.p(k10, "__type__");
        M.p(k11, "__local_write_time__");
        if (j9.p.c(d0Var)) {
            d0Var = j9.p.b(d0Var);
        }
        if (d0Var != null) {
            M.p(d0Var, "__previous_value__");
        }
        d0.a d04 = d0.d0();
        d04.t(M);
        return d04.k();
    }

    @Override // k9.p
    public final d0 c(d0 d0Var) {
        return null;
    }
}

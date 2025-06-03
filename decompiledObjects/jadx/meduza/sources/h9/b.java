package h9;

import j9.o;
import j9.s;
import java.util.Iterator;
import java.util.Map;
import ka.d0;
import ka.u;
import ma.n1;
import q0.g;

/* loaded from: classes.dex */
public final class b {
    public static void a(d0 d0Var, m.e eVar) {
        long j10;
        long j11;
        double X;
        int i10;
        switch (g.c(d0Var.c0())) {
            case 0:
                j10 = 5;
                eVar.t(j10);
                return;
            case 1:
                eVar.t(10);
                j11 = d0Var.S() ? 1L : 0L;
                eVar.t(j11);
                return;
            case 2:
                eVar.t(15);
                X = d0Var.X();
                eVar.q(X);
                return;
            case 3:
                X = d0Var.V();
                if (Double.isNaN(X)) {
                    i10 = 13;
                    j10 = i10;
                    eVar.t(j10);
                    return;
                } else {
                    eVar.t(15);
                    if (X == -0.0d) {
                        X = 0.0d;
                    }
                    eVar.q(X);
                    return;
                }
            case 4:
                n1 b02 = d0Var.b0();
                eVar.t(20);
                eVar.t(b02.K());
                j11 = b02.J();
                eVar.t(j11);
                return;
            case 5:
                String a02 = d0Var.a0();
                eVar.t(25);
                eVar.u(a02);
                eVar.t(2L);
                return;
            case 6:
                eVar.t(30);
                eVar.p(d0Var.T());
                eVar.t(2L);
                return;
            case 7:
                String Z = d0Var.Z();
                eVar.t(37);
                o t = o.t(Z);
                int q10 = t.q();
                for (int i11 = 5; i11 < q10; i11++) {
                    String n2 = t.n(i11);
                    eVar.t(60);
                    eVar.u(n2);
                }
                return;
            case 8:
                oa.a W = d0Var.W();
                eVar.t(45);
                eVar.q(W.J());
                X = W.K();
                eVar.q(X);
                return;
            case 9:
                ka.b R = d0Var.R();
                eVar.t(50);
                Iterator<d0> it = R.h().iterator();
                while (it.hasNext()) {
                    a(it.next(), eVar);
                }
                eVar.t(2L);
                return;
            case 10:
                if (s.f8710d.equals(d0Var.Y().J().get("__type__"))) {
                    i10 = Integer.MAX_VALUE;
                    j10 = i10;
                    eVar.t(j10);
                    return;
                }
                boolean l10 = s.l(d0Var);
                u Y = d0Var.Y();
                if (l10) {
                    Map<String, d0> J = Y.J();
                    eVar.t(53);
                    int L = J.get("value").R().L();
                    eVar.t(15);
                    eVar.t(L);
                    eVar.t(25);
                    eVar.u("value");
                    a(J.get("value"), eVar);
                    return;
                }
                eVar.t(55);
                for (Map.Entry<String, d0> entry : Y.J().entrySet()) {
                    String key = entry.getKey();
                    d0 value = entry.getValue();
                    eVar.t(25);
                    eVar.u(key);
                    a(value, eVar);
                }
                eVar.t(2L);
                return;
            default:
                StringBuilder l11 = defpackage.f.l("unknown index value type ");
                l11.append(defpackage.f.s(d0Var.c0()));
                throw new IllegalArgumentException(l11.toString());
        }
    }
}

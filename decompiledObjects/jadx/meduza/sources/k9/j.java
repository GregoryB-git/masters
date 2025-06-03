package k9;

import j9.s;
import ka.d0;

/* loaded from: classes.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public d0 f9164a;

    public j(d0 d0Var) {
        x6.b.Z("NumericIncrementTransformOperation expects a NumberValue operand", s.j(d0Var) || s.i(d0Var), new Object[0]);
        this.f9164a = d0Var;
    }

    @Override // k9.p
    public final d0 a(d0 d0Var, d0 d0Var2) {
        return d0Var2;
    }

    @Override // k9.p
    public final d0 b(u7.m mVar, d0 d0Var) {
        double V;
        d0.a d02;
        long X;
        d0 c10 = c(d0Var);
        if (s.j(c10) && s.j(this.f9164a)) {
            long X2 = c10.X();
            if (s.i(this.f9164a)) {
                X = (long) this.f9164a.V();
            } else {
                if (!s.j(this.f9164a)) {
                    StringBuilder l10 = defpackage.f.l("Expected 'operand' to be of Number type, but was ");
                    l10.append(this.f9164a.getClass().getCanonicalName());
                    x6.b.T(l10.toString(), new Object[0]);
                    throw null;
                }
                X = this.f9164a.X();
            }
            long j10 = X2 + X;
            if (((X2 ^ j10) & (X ^ j10)) < 0) {
                j10 = j10 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            d02 = d0.d0();
            d02.s(j10);
        } else {
            if (s.j(c10)) {
                V = c10.X();
            } else {
                x6.b.Z("Expected NumberValue to be of type DoubleValue, but was ", s.i(c10), d0Var.getClass().getCanonicalName());
                V = c10.V();
            }
            double d10 = d() + V;
            d02 = d0.d0();
            d02.q(d10);
        }
        return d02.k();
    }

    @Override // k9.p
    public final d0 c(d0 d0Var) {
        if (s.j(d0Var) || s.i(d0Var)) {
            return d0Var;
        }
        d0.a d02 = d0.d0();
        d02.s(0L);
        return d02.k();
    }

    public final double d() {
        if (s.i(this.f9164a)) {
            return this.f9164a.V();
        }
        if (s.j(this.f9164a)) {
            return this.f9164a.X();
        }
        StringBuilder l10 = defpackage.f.l("Expected 'operand' to be of Number type, but was ");
        l10.append(this.f9164a.getClass().getCanonicalName());
        x6.b.T(l10.toString(), new Object[0]);
        throw null;
    }
}

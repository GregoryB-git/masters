package nc;

/* loaded from: classes.dex */
public final class s<T> extends o1 implements r<T> {
    public s(j1 j1Var) {
        super(true);
        J(j1Var);
    }

    @Override // nc.j0
    public final Object await(ub.e<? super T> eVar) {
        Object q10 = q(eVar);
        vb.a aVar = vb.a.f16085a;
        return q10;
    }

    @Override // nc.j0
    public final T getCompleted() {
        return (T) z();
    }

    @Override // nc.j0
    public final uc.c<T> getOnAwait() {
        p1 p1Var = p1.f11543a;
        ec.i.c(p1Var, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        ec.v.a(3, p1Var);
        q1 q1Var = q1.f11544a;
        ec.i.c(q1Var, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        ec.v.a(3, q1Var);
        return new uc.d(this, p1Var, q1Var);
    }

    @Override // nc.r
    public final boolean h0(Throwable th) {
        Object X;
        u uVar = new u(th, false);
        do {
            X = X(F(), uVar);
            if (X == p2.m0.t) {
                return false;
            }
            if (X == p2.m0.f12899u) {
                break;
            }
        } while (X == p2.m0.f12900v);
        return true;
    }

    @Override // nc.r
    public final boolean i0(T t) {
        Object X;
        do {
            X = X(F(), t);
            if (X == p2.m0.t) {
                return false;
            }
            if (X == p2.m0.f12899u) {
                break;
            }
        } while (X == p2.m0.f12900v);
        return true;
    }
}

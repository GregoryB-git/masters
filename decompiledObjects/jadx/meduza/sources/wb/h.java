package wb;

import ec.t;
import ec.u;

/* loaded from: classes.dex */
public abstract class h extends g implements ec.f<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final int f16486a;

    public h(ub.e eVar) {
        super(eVar);
        this.f16486a = 2;
    }

    @Override // ec.f
    public final int getArity() {
        return this.f16486a;
    }

    @Override // wb.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        t.f5273a.getClass();
        String a10 = u.a(this);
        ec.i.d(a10, "renderLambdaToString(...)");
        return a10;
    }
}

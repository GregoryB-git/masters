package wb;

import ec.t;
import ec.u;

/* loaded from: classes.dex */
public abstract class i extends c implements ec.f<Object> {
    private final int arity;

    public i(int i10) {
        this(i10, null);
    }

    public i(int i10, ub.e<Object> eVar) {
        super(eVar);
        this.arity = i10;
    }

    @Override // ec.f
    public int getArity() {
        return this.arity;
    }

    @Override // wb.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        t.f5273a.getClass();
        String a10 = u.a(this);
        ec.i.d(a10, "renderLambdaToString(...)");
        return a10;
    }
}

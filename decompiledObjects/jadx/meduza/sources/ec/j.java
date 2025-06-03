package ec;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class j<R> implements f<R>, Serializable {
    private final int arity;

    public j(int i10) {
        this.arity = i10;
    }

    @Override // ec.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        t.f5273a.getClass();
        String a10 = u.a(this);
        i.d(a10, "renderLambdaToString(...)");
        return a10;
    }
}

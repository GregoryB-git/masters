package A0;

import d0.C1173L;
import g0.AbstractC1297a;
import g0.M;
import k0.b1;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final int f41a;

    /* renamed from: b, reason: collision with root package name */
    public final b1[] f42b;

    /* renamed from: c, reason: collision with root package name */
    public final y[] f43c;

    /* renamed from: d, reason: collision with root package name */
    public final C1173L f44d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f45e;

    public E(b1[] b1VarArr, y[] yVarArr, C1173L c1173l, Object obj) {
        AbstractC1297a.a(b1VarArr.length == yVarArr.length);
        this.f42b = b1VarArr;
        this.f43c = (y[]) yVarArr.clone();
        this.f44d = c1173l;
        this.f45e = obj;
        this.f41a = b1VarArr.length;
    }

    public boolean a(E e7) {
        if (e7 == null || e7.f43c.length != this.f43c.length) {
            return false;
        }
        for (int i7 = 0; i7 < this.f43c.length; i7++) {
            if (!b(e7, i7)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(E e7, int i7) {
        return e7 != null && M.c(this.f42b[i7], e7.f42b[i7]) && M.c(this.f43c[i7], e7.f43c[i7]);
    }

    public boolean c(int i7) {
        return this.f42b[i7] != null;
    }
}

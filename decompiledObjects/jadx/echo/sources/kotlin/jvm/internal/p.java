package kotlin.jvm.internal;

import m6.g;

/* loaded from: classes.dex */
public abstract class p extends r implements m6.g {
    public p(Class cls, String str, String str2, int i7) {
        super(c.NO_RECEIVER, cls, str, str2, i7);
    }

    @Override // kotlin.jvm.internal.c
    public m6.b computeReflected() {
        return v.e(this);
    }

    @Override // m6.g
    public g.a e() {
        ((m6.g) getReflected()).e();
        return null;
    }

    @Override // g6.p
    public Object invoke(Object obj, Object obj2) {
        return f(obj, obj2);
    }
}

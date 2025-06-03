package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class n extends r implements m6.f {
    public n(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, i7);
    }

    @Override // kotlin.jvm.internal.c
    public m6.b computeReflected() {
        return v.d(this);
    }

    @Override // g6.a
    public Object invoke() {
        return get();
    }
}

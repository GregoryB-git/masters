package f2;

import dc.l;

/* loaded from: classes.dex */
public final class h<T> extends g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f5317a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5318b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5319c;

    /* renamed from: d, reason: collision with root package name */
    public final f f5320d;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Object obj, int i10, f fVar) {
        ec.i.e(obj, "value");
        a0.j.p(i10, "verificationMode");
        this.f5317a = obj;
        this.f5318b = "a";
        this.f5319c = i10;
        this.f5320d = fVar;
    }

    @Override // f2.g
    public final T a() {
        return this.f5317a;
    }

    @Override // f2.g
    public final g<T> c(String str, l<? super T, Boolean> lVar) {
        ec.i.e(lVar, "condition");
        return lVar.invoke(this.f5317a).booleanValue() ? this : new e(this.f5317a, this.f5318b, str, this.f5320d, this.f5319c);
    }
}

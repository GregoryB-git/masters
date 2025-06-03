package eb;

import n7.g;

/* loaded from: classes.dex */
public abstract class x0<ReqT, RespT> extends e<ReqT, RespT> {
    @Override // eb.e
    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    @Override // eb.e
    public void b() {
        f().b();
    }

    @Override // eb.e
    public final void c(int i10) {
        f().c(i10);
    }

    public abstract e<?, ?> f();

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(f(), "delegate");
        return b10.toString();
    }
}

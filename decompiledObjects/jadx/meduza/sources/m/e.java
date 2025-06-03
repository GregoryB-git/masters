package m;

import eb.e1;
import java.util.List;
import ma.h;

/* loaded from: classes.dex */
public abstract class e implements wa.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9857a;

    public abstract Object c(String str);

    public abstract String d();

    public boolean e() {
        return Boolean.TRUE.equals(c("noResult"));
    }

    public abstract boolean f();

    public void g(int i10) {
    }

    public void h(int i10, long j10) {
    }

    public void i(long j10) {
    }

    public void j(long j10) {
    }

    public void k(int i10) {
    }

    public void l(int i10, long j10, long j11) {
    }

    public void m(long j10) {
    }

    public void n(long j10) {
    }

    public void o(e1 e1Var) {
    }

    public abstract void p(h hVar);

    public abstract void q(double d10);

    public abstract void r();

    public abstract void s(byte[] bArr, int i10, int i11);

    public abstract void t(long j10);

    public String toString() {
        switch (this.f9857a) {
            case 8:
                return d() + " " + ((String) c("sql")) + " " + ((List) c("arguments"));
            default:
                return super.toString();
        }
    }

    public abstract void u(String str);
}

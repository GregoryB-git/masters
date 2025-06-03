package x3;

import android.os.Handler;
import v3.d0;
import v3.i0;
import x0.q0;

/* loaded from: classes.dex */
public interface l {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f16986a;

        /* renamed from: b, reason: collision with root package name */
        public final l f16987b;

        public a(Handler handler, d0.b bVar) {
            this.f16986a = handler;
            this.f16987b = bVar;
        }

        public final void a(z3.e eVar) {
            synchronized (eVar) {
            }
            Handler handler = this.f16986a;
            if (handler != null) {
                handler.post(new q0(5, this, eVar));
            }
        }
    }

    void A(z3.e eVar);

    void C(long j10, long j11, String str);

    void g(z3.e eVar);

    void i(String str);

    void o(boolean z10);

    void p(Exception exc);

    @Deprecated
    void q();

    void s(long j10);

    void t(Exception exc);

    void u(i0 i0Var, z3.i iVar);

    void z(int i10, long j10, long j11);
}

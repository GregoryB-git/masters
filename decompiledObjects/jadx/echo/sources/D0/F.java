package D0;

import android.view.Surface;
import d0.C1177P;
import d0.C1194q;
import g0.C1295A;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface F {

    public static final class b extends Exception {

        /* renamed from: o, reason: collision with root package name */
        public final C1194q f1056o;

        public b(Throwable th, C1194q c1194q) {
            super(th);
            this.f1056o = c1194q;
        }
    }

    void A(boolean z7);

    void B();

    void C(List list);

    void D(long j7, long j8);

    boolean E();

    void F(a aVar, Executor executor);

    void G(int i7, C1194q c1194q);

    void H(C1194q c1194q);

    void I(Surface surface, C1295A c1295a);

    boolean J();

    void K(boolean z7);

    void L();

    boolean c();

    boolean e();

    void f(long j7, long j8);

    void j();

    void release();

    void u(float f7);

    void v();

    long w(long j7, boolean z7);

    Surface x();

    void y();

    void z(p pVar);

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1055a = new C0014a();

        void a(F f7);

        void b(F f7);

        void c(F f7, C1177P c1177p);

        /* renamed from: D0.F$a$a, reason: collision with other inner class name */
        public class C0014a implements a {
            @Override // D0.F.a
            public void a(F f7) {
            }

            @Override // D0.F.a
            public void b(F f7) {
            }

            @Override // D0.F.a
            public void c(F f7, C1177P c1177p) {
            }
        }
    }
}

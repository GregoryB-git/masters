package z4;

import android.os.Handler;
import v3.o0;
import v3.r1;

/* loaded from: classes.dex */
public interface t {

    public interface a {
    }

    public static final class b extends s {
        public b(Object obj) {
            super(obj, -1L);
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public b(s sVar) {
            super(sVar);
        }

        public final b b(Object obj) {
            return new b(this.f17725a.equals(obj) ? this : new s(obj, this.f17726b, this.f17727c, this.f17728d, this.f17729e));
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10, -1);
        }

        public b(Object obj, int i10, long j10) {
            super(obj, -1, -1, j10, i10);
        }
    }

    public interface c {
        void a(t tVar, r1 r1Var);
    }

    void a(c cVar);

    void b(c cVar);

    void c(a4.g gVar);

    void d(Handler handler, a4.g gVar);

    void e(c cVar, t5.l0 l0Var, w3.a0 a0Var);

    o0 f();

    void g(r rVar);

    void h();

    boolean i();

    r1 j();

    void l(c cVar);

    void m(w wVar);

    void n(Handler handler, w wVar);

    r o(b bVar, t5.b bVar2, long j10);
}

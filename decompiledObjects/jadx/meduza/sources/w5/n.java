package w5;

import android.os.Handler;
import v3.d0;
import v3.i0;

/* loaded from: classes.dex */
public interface n {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f16424a;

        /* renamed from: b, reason: collision with root package name */
        public final n f16425b;

        public a(Handler handler, d0.b bVar) {
            this.f16424a = handler;
            this.f16425b = bVar;
        }
    }

    void a(z3.e eVar);

    void b(o oVar);

    void c(String str);

    void e(int i10, long j10);

    void h(i0 i0Var, z3.i iVar);

    void k(int i10, long j10);

    void l(Object obj, long j10);

    void n(z3.e eVar);

    void v(Exception exc);

    @Deprecated
    void x();

    void y(long j10, long j11, String str);
}

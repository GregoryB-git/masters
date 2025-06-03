package A4;

import R4.l;
import S4.b;
import android.content.Context;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;
import s3.C1947e;
import s3.n;

/* loaded from: classes.dex */
public class b {

    public class a implements S4.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4.a f546a;

        public a(C4.a aVar) {
            this.f546a = aVar;
        }

        @Override // S4.b
        public b.a a() {
            return b.a.PERFORMANCE;
        }

        @Override // S4.b
        public void b(b.C0095b c0095b) {
            SessionManager.getInstance().updatePerfSession(J4.a.c(c0095b.a()));
        }

        @Override // S4.b
        public boolean c() {
            if (this.f546a.H()) {
                return C4.a.g().L();
            }
            return false;
        }
    }

    public b(C1947e c1947e, l lVar, n nVar, Executor executor) {
        Context m7 = c1947e.m();
        C4.a g7 = C4.a.g();
        g7.P(m7);
        B4.a b7 = B4.a.b();
        b7.h(m7);
        b7.i(new f());
        if (nVar != null) {
            AppStartTrace k7 = AppStartTrace.k();
            k7.u(m7);
            executor.execute(new AppStartTrace.c(k7));
        }
        lVar.e(new a(g7));
        SessionManager.getInstance().initializeGaugeCollection();
    }
}

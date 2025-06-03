// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A4;

import android.content.Context;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.metrics.AppStartTrace;
import C4.a;
import java.util.concurrent.Executor;
import s3.n;
import R4.l;
import s3.e;

public class b
{
    public b(final e e, final l l, final n n, final Executor executor) {
        final Context m = e.m();
        final a g = a.g();
        g.P(m);
        final B4.a b = B4.a.b();
        b.h(m);
        b.i((B4.a.a)new f());
        if (n != null) {
            final AppStartTrace k = AppStartTrace.k();
            k.u(m);
            executor.execute(new AppStartTrace.c(k));
        }
        l.e(new S4.b() {
            @Override
            public a a() {
                return S4.b.a.p;
            }
            
            @Override
            public void b(final b b) {
                SessionManager.getInstance().updatePerfSession(J4.a.c(b.a()));
            }
            
            @Override
            public boolean c() {
                return g.H() && C4.a.g().L();
            }
        });
        SessionManager.getInstance().initializeGaugeCollection();
    }
}

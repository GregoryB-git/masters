/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package A4;

import A4.f;
import B4.a;
import R4.l;
import S4.b;
import android.content.Context;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;
import s3.e;
import s3.n;

public class b {
    public b(e e8, l l8, n object, Executor executor) {
        e8 = e8.m();
        final C4.a a8 = C4.a.g();
        a8.P((Context)e8);
        a a9 = a.b();
        a9.h((Context)e8);
        a9.i(new f());
        if (object != null) {
            object = AppStartTrace.k();
            object.u((Context)e8);
            executor.execute((Runnable)new AppStartTrace.c((AppStartTrace)object));
        }
        l8.e(new S4.b(){

            @Override
            public b.a a() {
                return b.a.p;
            }

            @Override
            public void b(b.b object) {
                object = J4.a.c(object.a());
                SessionManager.getInstance().updatePerfSession((J4.a)object);
            }

            @Override
            public boolean c() {
                if (!a8.H()) {
                    return false;
                }
                return C4.a.g().L();
            }
        });
        SessionManager.getInstance().initializeGaugeCollection();
    }

}


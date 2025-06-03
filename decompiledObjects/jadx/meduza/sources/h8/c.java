package h8;

import android.os.Bundle;
import android.util.Log;
import b.z;
import d2.q;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c implements b, a {

    /* renamed from: a, reason: collision with root package name */
    public final q f7186a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f7187b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7188c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public CountDownLatch f7189d;

    public c(q qVar, TimeUnit timeUnit) {
        this.f7186a = qVar;
        this.f7187b = timeUnit;
    }

    @Override // h8.b
    public final void b(Bundle bundle, String str) {
        CountDownLatch countDownLatch = this.f7189d;
        if (countDownLatch != null && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // h8.a
    public final void d(Bundle bundle) {
        synchronized (this.f7188c) {
            z zVar = z.f1660e;
            zVar.q("Logging event " + Constants.FIREBASE_APPLICATION_EXCEPTION + " to Firebase Analytics with params " + bundle);
            this.f7189d = new CountDownLatch(1);
            this.f7186a.d(bundle);
            zVar.q("Awaiting app exception callback from Analytics...");
            try {
                if (this.f7189d.await(500, this.f7187b)) {
                    zVar.q("App exception callback received from Analytics listener.");
                } else {
                    zVar.s("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.f7189d = null;
        }
    }
}

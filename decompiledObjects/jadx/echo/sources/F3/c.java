package F3;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c implements b, a {

    /* renamed from: a, reason: collision with root package name */
    public final e f1976a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1977b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f1978c;

    /* renamed from: e, reason: collision with root package name */
    public CountDownLatch f1980e;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1979d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1981f = false;

    public c(e eVar, int i7, TimeUnit timeUnit) {
        this.f1976a = eVar;
        this.f1977b = i7;
        this.f1978c = timeUnit;
    }

    @Override // F3.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f1979d) {
            try {
                E3.f.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f1980e = new CountDownLatch(1);
                this.f1981f = false;
                this.f1976a.a(str, bundle);
                E3.f.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f1980e.await(this.f1977b, this.f1978c)) {
                        this.f1981f = true;
                        E3.f.f().i("App exception callback received from Analytics listener.");
                    } else {
                        E3.f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    E3.f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f1980e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F3.b
    public void t(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f1980e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}

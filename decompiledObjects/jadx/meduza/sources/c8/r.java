package c8;

import android.os.HandlerThread;
import com.google.android.gms.internal.p002firebaseauthapi.zze;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: g, reason: collision with root package name */
    public static p6.a f2508g = new p6.a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a, reason: collision with root package name */
    public volatile long f2509a;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f2510b;

    /* renamed from: c, reason: collision with root package name */
    public long f2511c;

    /* renamed from: d, reason: collision with root package name */
    public HandlerThread f2512d;

    /* renamed from: e, reason: collision with root package name */
    public zze f2513e;
    public i6.t f;

    public r(u7.f fVar) {
        f2508g.e("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f2512d = handlerThread;
        handlerThread.start();
        this.f2513e = new zze(this.f2512d.getLooper());
        fVar.a();
        this.f = new i6.t(this, fVar.f15085b);
        this.f2511c = 300000L;
    }

    public final void a() {
        f2508g.e("Scheduling refresh for " + (this.f2509a - this.f2511c), new Object[0]);
        this.f2513e.removeCallbacks(this.f);
        this.f2510b = Math.max((this.f2509a - System.currentTimeMillis()) - this.f2511c, 0L) / 1000;
        this.f2513e.postDelayed(this.f, this.f2510b * 1000);
    }
}

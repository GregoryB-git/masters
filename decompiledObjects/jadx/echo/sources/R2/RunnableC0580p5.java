package R2;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0971m7;

/* renamed from: R2.p5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0580p5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public long f5476o;

    /* renamed from: p, reason: collision with root package name */
    public long f5477p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0587q5 f5478q;

    public RunnableC0580p5(C0587q5 c0587q5, long j7, long j8) {
        this.f5478q = c0587q5;
        this.f5476o = j7;
        this.f5477p = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5478q.f5501b.e().D(new Runnable() { // from class: R2.s5
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC0580p5 runnableC0580p5 = RunnableC0580p5.this;
                C0587q5 c0587q5 = runnableC0580p5.f5478q;
                long j7 = runnableC0580p5.f5476o;
                long j8 = runnableC0580p5.f5477p;
                c0587q5.f5501b.n();
                c0587q5.f5501b.j().F().a("Application going to the background");
                c0587q5.f5501b.i().f5402s.a(true);
                c0587q5.f5501b.D(true);
                if (!c0587q5.f5501b.f().Q()) {
                    c0587q5.f5501b.f5418f.e(j8);
                    c0587q5.f5501b.E(false, false, j8);
                }
                if (C0971m7.a() && c0587q5.f5501b.f().s(K.f4787K0)) {
                    c0587q5.f5501b.j().J().b("Application backgrounded at: timestamp_millis", Long.valueOf(j7));
                } else {
                    c0587q5.f5501b.r().U("auto", "_ab", j7, new Bundle());
                }
            }
        });
    }
}

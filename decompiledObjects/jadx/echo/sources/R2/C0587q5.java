package R2;

import android.os.Handler;

/* renamed from: R2.q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587q5 {

    /* renamed from: a, reason: collision with root package name */
    public RunnableC0580p5 f5500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0552l5 f5501b;

    public C0587q5(C0552l5 c0552l5) {
        this.f5501b = c0552l5;
    }

    public final void a() {
        Handler handler;
        this.f5501b.n();
        if (this.f5500a != null) {
            handler = this.f5501b.f5415c;
            handler.removeCallbacks(this.f5500a);
        }
        this.f5501b.i().f5402s.a(false);
        this.f5501b.D(false);
    }

    public final void b(long j7) {
        Handler handler;
        this.f5500a = new RunnableC0580p5(this, this.f5501b.b().a(), j7);
        handler = this.f5501b.f5415c;
        handler.postDelayed(this.f5500a, 2000L);
    }
}

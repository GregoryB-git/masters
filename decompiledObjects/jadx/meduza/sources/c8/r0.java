package c8;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f2514a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2515b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f2516c;

    public r0(u7.f fVar) {
        fVar.a();
        Context context = fVar.f15084a;
        r rVar = new r(fVar);
        this.f2516c = false;
        this.f2514a = 0;
        this.f2515b = rVar;
        l6.b.a((Application) context.getApplicationContext());
        l6.b bVar = l6.b.f9632e;
        q0 q0Var = new q0(this);
        bVar.getClass();
        synchronized (bVar) {
            bVar.f9635c.add(q0Var);
        }
    }

    public final void a(int i10) {
        if (i10 > 0 && this.f2514a == 0) {
            this.f2514a = i10;
            if (this.f2514a > 0 && !this.f2516c) {
                this.f2515b.a();
            }
        } else if (i10 == 0 && this.f2514a != 0) {
            r rVar = this.f2515b;
            rVar.f2513e.removeCallbacks(rVar.f);
        }
        this.f2514a = i10;
    }
}

package y2;

import android.content.Context;
import java.util.UUID;
import z2.a;

/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z2.c f17417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f17418b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o2.d f17419c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f17420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f17421e;

    public y(z zVar, z2.c cVar, UUID uuid, o2.d dVar, Context context) {
        this.f17421e = zVar;
        this.f17417a = cVar;
        this.f17418b = uuid;
        this.f17419c = dVar;
        this.f17420d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f17417a.f17483a instanceof a.b)) {
                String uuid = this.f17418b.toString();
                x2.s t = this.f17421e.f17424c.t(uuid);
                if (t == null || t.f16831b.f()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((p2.r) this.f17421e.f17423b).e(uuid, this.f17419c);
                this.f17420d.startService(androidx.work.impl.foreground.a.b(this.f17420d, b.a0.s(t), this.f17419c));
            }
            this.f17417a.i(null);
        } catch (Throwable th) {
            this.f17417a.j(th);
        }
    }
}

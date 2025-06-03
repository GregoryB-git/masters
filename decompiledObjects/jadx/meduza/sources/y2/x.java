package y2;

import android.content.Context;
import android.os.Build;
import java.util.UUID;
import z2.a;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public static final String f17409o = o2.j.f("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final z2.c<Void> f17410a = new z2.c<>();

    /* renamed from: b, reason: collision with root package name */
    public final Context f17411b;

    /* renamed from: c, reason: collision with root package name */
    public final x2.s f17412c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.d f17413d;

    /* renamed from: e, reason: collision with root package name */
    public final o2.e f17414e;
    public final a3.b f;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z2.c f17415a;

        public a(z2.c cVar) {
            this.f17415a = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            if (x.this.f17410a.f17483a instanceof a.b) {
                return;
            }
            try {
                o2.d dVar = (o2.d) this.f17415a.get();
                if (dVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + x.this.f17412c.f16832c + ") but did not provide ForegroundInfo");
                }
                o2.j.d().a(x.f17409o, "Updating notification for " + x.this.f17412c.f16832c);
                x xVar = x.this;
                z2.c<Void> cVar = xVar.f17410a;
                o2.e eVar = xVar.f17414e;
                Context context = xVar.f17411b;
                UUID uuid = xVar.f17413d.f1458b.f1435a;
                z zVar = (z) eVar;
                zVar.getClass();
                z2.c cVar2 = new z2.c();
                zVar.f17422a.d(new y(zVar, cVar2, uuid, dVar, context));
                cVar.k(cVar2);
            } catch (Throwable th) {
                x.this.f17410a.j(th);
            }
        }
    }

    public x(Context context, x2.s sVar, androidx.work.d dVar, o2.e eVar, a3.b bVar) {
        this.f17411b = context;
        this.f17412c = sVar;
        this.f17413d = dVar;
        this.f17414e = eVar;
        this.f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f17412c.f16845q || Build.VERSION.SDK_INT >= 31) {
            this.f17410a.i(null);
            return;
        }
        z2.c cVar = new z2.c();
        this.f.b().execute(new x0.f(3, this, cVar));
        cVar.f(new a(cVar), this.f.b());
    }
}

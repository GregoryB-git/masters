package i9;

import java.util.concurrent.TimeUnit;
import n9.a;

/* loaded from: classes.dex */
public final class e {
    public static final long f = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: g, reason: collision with root package name */
    public static final long f7664g = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    public final a f7665a;

    /* renamed from: b, reason: collision with root package name */
    public final e9.a f7666b;

    /* renamed from: c, reason: collision with root package name */
    public final n7.q<f> f7667c;

    /* renamed from: d, reason: collision with root package name */
    public final n7.q<h> f7668d;

    /* renamed from: e, reason: collision with root package name */
    public int f7669e;

    public class a implements k1 {

        /* renamed from: a, reason: collision with root package name */
        public a.C0174a f7670a;

        /* renamed from: b, reason: collision with root package name */
        public final n9.a f7671b;

        public a(n9.a aVar) {
            this.f7671b = aVar;
        }

        @Override // i9.k1
        public final void start() {
            this.f7670a = this.f7671b.b(a.c.INDEX_BACKFILL, e.f, new u.a(this, 12));
        }

        @Override // i9.k1
        public final void stop() {
            a.C0174a c0174a = this.f7670a;
            if (c0174a != null) {
                c0174a.a();
            }
        }
    }

    public e(e9.a aVar, n9.a aVar2, n nVar) {
        aa.m0 m0Var = new aa.m0(nVar, 1);
        defpackage.d dVar = new defpackage.d(nVar, 2);
        this.f7669e = 50;
        this.f7666b = aVar;
        this.f7665a = new a(aVar2);
        this.f7667c = m0Var;
        this.f7668d = dVar;
    }
}

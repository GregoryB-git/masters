package F;

import F.f;
import F.g;
import android.graphics.Typeface;
import android.os.Handler;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final g.c f1689a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1690b;

    /* renamed from: F.a$a, reason: collision with other inner class name */
    public class RunnableC0026a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ g.c f1691o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Typeface f1692p;

        public RunnableC0026a(g.c cVar, Typeface typeface) {
            this.f1691o = cVar;
            this.f1692p = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1691o.b(this.f1692p);
        }
    }

    public class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ g.c f1694o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f1695p;

        public b(g.c cVar, int i7) {
            this.f1694o = cVar;
            this.f1695p = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1694o.a(this.f1695p);
        }
    }

    public a(g.c cVar, Handler handler) {
        this.f1689a = cVar;
        this.f1690b = handler;
    }

    public final void a(int i7) {
        this.f1690b.post(new b(this.f1689a, i7));
    }

    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f1718a);
        } else {
            a(eVar.f1719b);
        }
    }

    public final void c(Typeface typeface) {
        this.f1690b.post(new RunnableC0026a(this.f1689a, typeface));
    }
}

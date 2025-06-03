package b1;

import android.os.Handler;
import b1.k;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f1759a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1760b;

    /* renamed from: c, reason: collision with root package name */
    public a f1761c;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final p f1762a;

        /* renamed from: b, reason: collision with root package name */
        public final k.a f1763b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1764c;

        public a(p pVar, k.a aVar) {
            ec.i.e(pVar, "registry");
            ec.i.e(aVar, "event");
            this.f1762a = pVar;
            this.f1763b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f1764c) {
                return;
            }
            this.f1762a.f(this.f1763b);
            this.f1764c = true;
        }
    }

    public m0(o oVar) {
        ec.i.e(oVar, "provider");
        this.f1759a = new p(oVar);
        this.f1760b = new Handler();
    }

    public final void a(k.a aVar) {
        a aVar2 = this.f1761c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f1759a, aVar);
        this.f1761c = aVar3;
        this.f1760b.postAtFrontOfQueue(aVar3);
    }
}

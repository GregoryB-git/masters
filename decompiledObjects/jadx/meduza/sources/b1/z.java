package b1;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import b1.c0;
import b1.k;

/* loaded from: classes.dex */
public final class z implements o {

    /* renamed from: q, reason: collision with root package name */
    public static final z f1802q = new z();

    /* renamed from: a, reason: collision with root package name */
    public int f1803a;

    /* renamed from: b, reason: collision with root package name */
    public int f1804b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1807e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1805c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1806d = true;
    public final p f = new p(this);

    /* renamed from: o, reason: collision with root package name */
    public final b.d f1808o = new b.d(this, 2);

    /* renamed from: p, reason: collision with root package name */
    public final b f1809p = new b();

    public static final class a {
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            ec.i.e(activity, "activity");
            ec.i.e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b implements c0.a {
        public b() {
        }

        @Override // b1.c0.a
        public final void a() {
            z zVar = z.this;
            int i10 = zVar.f1803a + 1;
            zVar.f1803a = i10;
            if (i10 == 1 && zVar.f1806d) {
                zVar.f.f(k.a.ON_START);
                zVar.f1806d = false;
            }
        }

        @Override // b1.c0.a
        public final void onCreate() {
        }

        @Override // b1.c0.a
        public final void onResume() {
            z.this.a();
        }
    }

    public final void a() {
        int i10 = this.f1804b + 1;
        this.f1804b = i10;
        if (i10 == 1) {
            if (this.f1805c) {
                this.f.f(k.a.ON_RESUME);
                this.f1805c = false;
            } else {
                Handler handler = this.f1807e;
                ec.i.b(handler);
                handler.removeCallbacks(this.f1808o);
            }
        }
    }

    @Override // b1.o
    public final k getLifecycle() {
        return this.f;
    }
}

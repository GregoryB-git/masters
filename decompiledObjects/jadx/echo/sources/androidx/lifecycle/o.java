package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.lifecycle.d;
import androidx.lifecycle.q;

/* loaded from: classes.dex */
public class o implements h {

    /* renamed from: w, reason: collision with root package name */
    public static final o f9708w = new o();

    /* renamed from: s, reason: collision with root package name */
    public Handler f9713s;

    /* renamed from: o, reason: collision with root package name */
    public int f9709o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f9710p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9711q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9712r = true;

    /* renamed from: t, reason: collision with root package name */
    public final i f9714t = new i(this);

    /* renamed from: u, reason: collision with root package name */
    public Runnable f9715u = new a();

    /* renamed from: v, reason: collision with root package name */
    public q.a f9716v = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f();
            o.this.h();
        }
    }

    public class b implements q.a {
        public b() {
        }

        @Override // androidx.lifecycle.q.a
        public void a() {
        }

        @Override // androidx.lifecycle.q.a
        public void b() {
            o.this.b();
        }

        @Override // androidx.lifecycle.q.a
        public void c() {
            o.this.c();
        }
    }

    public class c extends androidx.lifecycle.b {

        public class a extends androidx.lifecycle.b {
            public a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@NonNull Activity activity) {
                o.this.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@NonNull Activity activity) {
                o.this.c();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                q.f(activity).h(o.this.f9716v);
            }
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            o.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NonNull Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            o.this.d();
        }
    }

    public static h i() {
        return f9708w;
    }

    public static void l(Context context) {
        f9708w.e(context);
    }

    public void a() {
        int i7 = this.f9710p - 1;
        this.f9710p = i7;
        if (i7 == 0) {
            this.f9713s.postDelayed(this.f9715u, 700L);
        }
    }

    public void b() {
        int i7 = this.f9710p + 1;
        this.f9710p = i7;
        if (i7 == 1) {
            if (!this.f9711q) {
                this.f9713s.removeCallbacks(this.f9715u);
            } else {
                this.f9714t.h(d.b.ON_RESUME);
                this.f9711q = false;
            }
        }
    }

    public void c() {
        int i7 = this.f9709o + 1;
        this.f9709o = i7;
        if (i7 == 1 && this.f9712r) {
            this.f9714t.h(d.b.ON_START);
            this.f9712r = false;
        }
    }

    public void d() {
        this.f9709o--;
        h();
    }

    public void e(Context context) {
        this.f9713s = new Handler();
        this.f9714t.h(d.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    public void f() {
        if (this.f9710p == 0) {
            this.f9711q = true;
            this.f9714t.h(d.b.ON_PAUSE);
        }
    }

    @Override // androidx.lifecycle.h
    public d g() {
        return this.f9714t;
    }

    public void h() {
        if (this.f9709o == 0 && this.f9711q) {
            this.f9714t.h(d.b.ON_STOP);
            this.f9712r = true;
        }
    }
}

package R4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import p6.AbstractC1852i;
import p6.I;
import p6.J;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final x f5780a;

    /* renamed from: b, reason: collision with root package name */
    public final X5.g f5781b;

    /* renamed from: c, reason: collision with root package name */
    public final u f5782c;

    /* renamed from: d, reason: collision with root package name */
    public final T4.f f5783d;

    /* renamed from: e, reason: collision with root package name */
    public final s f5784e;

    /* renamed from: f, reason: collision with root package name */
    public long f5785f;

    /* renamed from: g, reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f5786g;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            v.this.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            v.this.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final class b extends Z5.k implements g6.p {

        /* renamed from: o, reason: collision with root package name */
        public int f5788o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ p f5790q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, X5.d dVar) {
            super(2, dVar);
            this.f5790q = pVar;
        }

        @Override // Z5.a
        public final X5.d create(Object obj, X5.d dVar) {
            return v.this.new b(this.f5790q, dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            Object c7;
            c7 = Y5.d.c();
            int i7 = this.f5788o;
            if (i7 == 0) {
                V5.o.b(obj);
                u uVar = v.this.f5782c;
                p pVar = this.f5790q;
                this.f5788o = 1;
                if (uVar.a(pVar, this) == c7) {
                    return c7;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V5.o.b(obj);
            }
            return V5.t.f6803a;
        }

        @Override // g6.p
        public final Object invoke(I i7, X5.d dVar) {
            return ((b) create(i7, dVar)).invokeSuspend(V5.t.f6803a);
        }
    }

    public v(x timeProvider, X5.g backgroundDispatcher, u sessionInitiateListener, T4.f sessionsSettings, s sessionGenerator) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(sessionInitiateListener, "sessionInitiateListener");
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(sessionGenerator, "sessionGenerator");
        this.f5780a = timeProvider;
        this.f5781b = backgroundDispatcher;
        this.f5782c = sessionInitiateListener;
        this.f5783d = sessionsSettings;
        this.f5784e = sessionGenerator;
        this.f5785f = timeProvider.b();
        e();
        this.f5786g = new a();
    }

    public final void b() {
        this.f5785f = this.f5780a.b();
    }

    public final void c() {
        if (o6.a.l(o6.a.V(this.f5780a.b(), this.f5785f), this.f5783d.c()) > 0) {
            e();
        }
    }

    public final Application.ActivityLifecycleCallbacks d() {
        return this.f5786g;
    }

    public final void e() {
        AbstractC1852i.d(J.a(this.f5781b), null, null, new b(this.f5784e.a(), null), 3, null);
    }
}

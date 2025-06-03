/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package R4;

import R4.p;
import R4.s;
import R4.u;
import R4.x;
import T4.f;
import V5.o;
import V5.t;
import X5.d;
import X5.g;
import Y5.b;
import Z5.k;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import o6.a;
import p6.I;
import p6.J;

public final class v {
    public final x a;
    public final g b;
    public final u c;
    public final f d;
    public final s e;
    public long f;
    public final Application.ActivityLifecycleCallbacks g;

    public v(x x8, g g8, u u8, f f8, s s8) {
        Intrinsics.checkNotNullParameter(x8, "timeProvider");
        Intrinsics.checkNotNullParameter(g8, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(u8, "sessionInitiateListener");
        Intrinsics.checkNotNullParameter(f8, "sessionsSettings");
        Intrinsics.checkNotNullParameter(s8, "sessionGenerator");
        this.a = x8;
        this.b = g8;
        this.c = u8;
        this.d = f8;
        this.e = s8;
        this.f = x8.b();
        this.e();
        this.g = new Application.ActivityLifecycleCallbacks(){

            public void onActivityCreated(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
            }

            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
            }

            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                this.b();
            }

            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                this.c();
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                Intrinsics.checkNotNullParameter((Object)bundle, "outState");
            }

            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
            }

            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
            }
        };
    }

    public final void b() {
        this.f = this.a.b();
    }

    public final void c() {
        if (a.l(a.V(this.a.b(), this.f), this.d.c()) > 0) {
            this.e();
        }
    }

    public final Application.ActivityLifecycleCallbacks d() {
        return this.g;
    }

    public final void e() {
        p p8 = this.e.a();
        p6.g.d(J.a(this.b), null, null, new g6.p(this, p8, null){
            public int o;
            public final /* synthetic */ v p;
            public final /* synthetic */ p q;
            {
                this.p = v8;
                this.q = p8;
                super(2, d8);
            }

            @Override
            public final d create(Object object, d d8) {
                return new ;
            }

            public final Object invoke(I i8, d d8) {
                return (this.create(i8, d8)).invokeSuspend(t.a);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final Object invokeSuspend(Object object) {
                Object object2 = b.c();
                int n8 = this.o;
                if (n8 != 0) {
                    if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    o.b(object);
                    return t.a;
                } else {
                    o.b(object);
                    object = this.p.c;
                    p p8 = this.q;
                    this.o = 1;
                    if (object.a(p8, this) != object2) return t.a;
                    return object2;
                }
            }
        }, 3, null);
    }

}


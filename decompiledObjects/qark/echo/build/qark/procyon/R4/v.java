// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import p6.K;
import V5.o;
import Y5.b;
import V5.t;
import p6.I;
import X5.d;
import Z5.k;
import g6.p;
import p6.J;
import o6.a;
import android.os.Bundle;
import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import android.app.Application$ActivityLifecycleCallbacks;
import T4.f;
import X5.g;

public final class v
{
    public final x a;
    public final g b;
    public final u c;
    public final f d;
    public final s e;
    public long f;
    public final Application$ActivityLifecycleCallbacks g;
    
    public v(final x a, final g b, final u c, final f d, final s e) {
        Intrinsics.checkNotNullParameter(a, "timeProvider");
        Intrinsics.checkNotNullParameter(b, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(c, "sessionInitiateListener");
        Intrinsics.checkNotNullParameter(d, "sessionsSettings");
        Intrinsics.checkNotNullParameter(e, "sessionGenerator");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = a.b();
        this.e();
        this.g = (Application$ActivityLifecycleCallbacks)new Application$ActivityLifecycleCallbacks() {
            public final /* synthetic */ v o;
            
            public void onActivityCreated(final Activity activity, final Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
            
            public void onActivityDestroyed(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
            
            public void onActivityPaused(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.o.b();
            }
            
            public void onActivityResumed(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.o.c();
            }
            
            public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(bundle, "outState");
            }
            
            public void onActivityStarted(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
            
            public void onActivityStopped(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
        };
    }
    
    public static final /* synthetic */ u a(final v v) {
        return v.c;
    }
    
    public final void b() {
        this.f = this.a.b();
    }
    
    public final void c() {
        if (o6.a.l(o6.a.V(this.a.b(), this.f), this.d.c()) > 0) {
            this.e();
        }
    }
    
    public final Application$ActivityLifecycleCallbacks d() {
        return this.g;
    }
    
    public final void e() {
        p6.g.d(J.a(this.b), null, null, new p() {
            public int o;
            public final /* synthetic */ v p;
            public final /* synthetic */ R4.p q;
            
            @Override
            public final X5.d create(final Object o, final X5.d d) {
                return new p() {
                    public int o;
                    public final /* synthetic */ v p = this.p;
                    public final /* synthetic */ R4.p q = this.q;
                };
            }
            
            public final Object invoke(final I i, final X5.d d) {
                return ((v$b)this.create(i, d)).invokeSuspend(t.a);
            }
            
            @Override
            public final Object invokeSuspend(final Object o) {
                final Object c = Y5.b.c();
                final int o2 = this.o;
                if (o2 != 0) {
                    if (o2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(o);
                }
                else {
                    o.b(o);
                    final u a = v.a(this.p);
                    final R4.p q = this.q;
                    this.o = 1;
                    if (a.a(q, this) == c) {
                        return c;
                    }
                }
                return t.a;
            }
        }, 3, null);
    }
}

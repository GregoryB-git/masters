/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 */
package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.lifecycle.b;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import androidx.lifecycle.q;

public class o
implements h {
    public static final o w = new o();
    public int o = 0;
    public int p = 0;
    public boolean q = true;
    public boolean r = true;
    public Handler s;
    public final i t;
    public Runnable u;
    public q.a v;

    public o() {
        this.t = new i(this);
        this.u = new Runnable(){

            public void run() {
                o.this.f();
                o.this.h();
            }
        };
        this.v = new q.a(){

            @Override
            public void a() {
            }

            @Override
            public void b() {
                o.this.b();
            }

            @Override
            public void c() {
                o.this.c();
            }
        };
    }

    public static h i() {
        return w;
    }

    public static void l(Context context) {
        w.e(context);
    }

    public void a() {
        int n8;
        this.p = n8 = this.p - 1;
        if (n8 == 0) {
            this.s.postDelayed(this.u, 700L);
        }
    }

    public void b() {
        int n8;
        this.p = n8 = this.p + 1;
        if (n8 == 1) {
            if (this.q) {
                this.t.h(d.b.ON_RESUME);
                this.q = false;
                return;
            }
            this.s.removeCallbacks(this.u);
        }
    }

    public void c() {
        int n8;
        this.o = n8 = this.o + 1;
        if (n8 == 1 && this.r) {
            this.t.h(d.b.ON_START);
            this.r = false;
        }
    }

    public void d() {
        --this.o;
        this.h();
    }

    public void e(Context context) {
        this.s = new Handler();
        this.t.h(d.b.ON_CREATE);
        ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)new b(){

            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (Build.VERSION.SDK_INT < 29) {
                    q.f(activity).h(o.this.v);
                }
            }

            @Override
            public void onActivityPaused(Activity activity) {
                o.this.a();
            }

            public void onActivityPreCreated(@NonNull Activity activity, Bundle bundle) {
                p.a(activity, new b(){

                    public void onActivityPostResumed(@NonNull Activity activity) {
                        o.this.b();
                    }

                    public void onActivityPostStarted(@NonNull Activity activity) {
                        o.this.c();
                    }
                });
            }

            @Override
            public void onActivityStopped(Activity activity) {
                o.this.d();
            }

        });
    }

    public void f() {
        if (this.p == 0) {
            this.q = true;
            this.t.h(d.b.ON_PAUSE);
        }
    }

    @Override
    public d g() {
        return this.t;
    }

    public void h() {
        if (this.o == 0 && this.q) {
            this.t.h(d.b.ON_STOP);
            this.r = true;
        }
    }

}


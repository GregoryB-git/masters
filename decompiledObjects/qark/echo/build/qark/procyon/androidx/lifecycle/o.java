// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

import android.app.Application$ActivityLifecycleCallbacks;
import androidx.annotation.NonNull;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;

public class o implements h
{
    public static final o w;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public Handler s;
    public final i t;
    public Runnable u;
    public q.a v;
    
    static {
        w = new o();
    }
    
    public o() {
        this.o = 0;
        this.p = 0;
        this.q = true;
        this.r = true;
        this.t = new i(this);
        this.u = new Runnable() {
            @Override
            public void run() {
                androidx.lifecycle.o.this.f();
                androidx.lifecycle.o.this.h();
            }
        };
        this.v = new q.a() {
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
        return o.w;
    }
    
    public static void l(final Context context) {
        o.w.e(context);
    }
    
    public void a() {
        final int p = this.p - 1;
        this.p = p;
        if (p == 0) {
            this.s.postDelayed(this.u, 700L);
        }
    }
    
    public void b() {
        final int p = this.p + 1;
        this.p = p;
        if (p == 1) {
            if (this.q) {
                this.t.h(d.b.ON_RESUME);
                this.q = false;
                return;
            }
            this.s.removeCallbacks(this.u);
        }
    }
    
    public void c() {
        final int o = this.o + 1;
        this.o = o;
        if (o == 1 && this.r) {
            this.t.h(d.b.ON_START);
            this.r = false;
        }
    }
    
    public void d() {
        --this.o;
        this.h();
    }
    
    public void e(final Context context) {
        this.s = new Handler();
        this.t.h(d.b.ON_CREATE);
        ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new b() {
            @Override
            public void onActivityCreated(final Activity activity, final Bundle bundle) {
                if (Build$VERSION.SDK_INT < 29) {
                    androidx.lifecycle.q.f(activity).h(androidx.lifecycle.o.this.v);
                }
            }
            
            @Override
            public void onActivityPaused(final Activity activity) {
                androidx.lifecycle.o.this.a();
            }
            
            public void onActivityPreCreated(@NonNull final Activity activity, final Bundle bundle) {
                androidx.lifecycle.p.a(activity, (Application$ActivityLifecycleCallbacks)new b() {
                    public void onActivityPostResumed(@NonNull final Activity activity) {
                        androidx.lifecycle.o.this.b();
                    }
                    
                    public void onActivityPostStarted(@NonNull final Activity activity) {
                        androidx.lifecycle.o.this.c();
                    }
                });
            }
            
            @Override
            public void onActivityStopped(final Activity activity) {
                androidx.lifecycle.o.this.d();
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

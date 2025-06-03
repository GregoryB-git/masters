// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.analytics;

import android.os.BaseBundle;
import android.app.Activity;
import java.util.concurrent.BlockingQueue;
import v3.b;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import s4.h;
import java.util.Map;
import v3.d;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import V2.m;
import v3.a;
import V2.j;
import v3.c;
import R2.m4;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import android.content.Context;
import A2.n;
import java.util.concurrent.ExecutorService;
import com.google.android.gms.internal.measurement.J0;

public final class FirebaseAnalytics
{
    public static volatile FirebaseAnalytics c;
    public final J0 a;
    public ExecutorService b;
    
    public FirebaseAnalytics(final J0 a) {
        n.i(a);
        this.a = a;
    }
    
    @Keep
    @NonNull
    public static FirebaseAnalytics getInstance(@NonNull final Context context) {
        while (true) {
            if (FirebaseAnalytics.c == null) {
                // monitorenter(FirebaseAnalytics.class)
                while (true) {
                    try {
                        if (FirebaseAnalytics.c == null) {
                            FirebaseAnalytics.c = new FirebaseAnalytics(J0.e(context));
                        }
                        // monitorexit(FirebaseAnalytics.class)
                        return FirebaseAnalytics.c;
                    }
                    // monitorexit(FirebaseAnalytics.class)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    @Keep
    public static m4 getScionFrontendApiImplementation(final Context context, final Bundle bundle) {
        final J0 f = J0.f(context, null, null, null, bundle);
        if (f == null) {
            return null;
        }
        return new c(f);
    }
    
    public final j a() {
        try {
            return m.c(this.l(), new v3.a(this));
        }
        catch (RuntimeException ex) {
            this.a.i(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return m.d(ex);
        }
    }
    
    public final j b() {
        try {
            return m.c(this.l(), new d(this));
        }
        catch (RuntimeException ex) {
            this.a.i(5, "Failed to schedule task for getSessionId", null, null, null);
            return m.d(ex);
        }
    }
    
    public final void c(final String s, final Bundle bundle) {
        this.a.t(s, bundle);
    }
    
    public final void d() {
        this.a.R();
    }
    
    public final void e(final boolean b) {
        this.a.r(b);
    }
    
    public final void f(final Map map) {
        final Bundle bundle = new Bundle();
        final a a = map.get(FirebaseAnalytics.b.o);
        if (a != null) {
            final int ordinal = a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    ((BaseBundle)bundle).putString("ad_storage", "denied");
                }
            }
            else {
                ((BaseBundle)bundle).putString("ad_storage", "granted");
            }
        }
        final a a2 = map.get(FirebaseAnalytics.b.p);
        if (a2 != null) {
            final int ordinal2 = a2.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    ((BaseBundle)bundle).putString("analytics_storage", "denied");
                }
            }
            else {
                ((BaseBundle)bundle).putString("analytics_storage", "granted");
            }
        }
        final a a3 = map.get(FirebaseAnalytics.b.q);
        if (a3 != null) {
            final int ordinal3 = a3.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 == 1) {
                    ((BaseBundle)bundle).putString("ad_user_data", "denied");
                }
            }
            else {
                ((BaseBundle)bundle).putString("ad_user_data", "granted");
            }
        }
        final a a4 = map.get(FirebaseAnalytics.b.r);
        if (a4 != null) {
            final int ordinal4 = a4.ordinal();
            if (ordinal4 != 0) {
                if (ordinal4 == 1) {
                    ((BaseBundle)bundle).putString("ad_personalization", "denied");
                }
            }
            else {
                ((BaseBundle)bundle).putString("ad_personalization", "granted");
            }
        }
        this.a.G(bundle);
    }
    
    public final void g(final Bundle bundle) {
        this.a.K(bundle);
    }
    
    @Keep
    @NonNull
    public final String getFirebaseInstanceId() {
        try {
            return (String)m.b(h.t().a(), 30000L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException ex) {
            goto Label_0029;
        }
        catch (ExecutionException ex2) {
            goto Label_0048;
        }
        catch (TimeoutException ex3) {}
        goto Label_0038;
    }
    
    public final void h(final long n) {
        this.a.j(n);
    }
    
    public final void i(final String s) {
        this.a.L(s);
    }
    
    public final void j(final String s, final String s2) {
        this.a.C(s, s2);
    }
    
    public final ExecutorService l() {
        // monitorenter(FirebaseAnalytics.class)
        while (true) {
            try {
                if (this.b == null) {
                    this.b = new v3.b(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                // monitorexit(FirebaseAnalytics.class)
                return this.b;
                // monitorexit(FirebaseAnalytics.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Deprecated
    @Keep
    public final void setCurrentScreen(@NonNull final Activity activity, final String s, final String s2) {
        this.a.l(activity, s, s2);
    }
    
    public enum a
    {
        o("GRANTED", 0), 
        p("DENIED", 1);
        
        public a(final String name, final int ordinal) {
        }
    }
    
    public enum b
    {
        o("AD_STORAGE", 0), 
        p("ANALYTICS_STORAGE", 1), 
        q("AD_USER_DATA", 2), 
        r("AD_PERSONALIZATION", 3);
        
        public b(final String name, final int ordinal) {
        }
    }
}

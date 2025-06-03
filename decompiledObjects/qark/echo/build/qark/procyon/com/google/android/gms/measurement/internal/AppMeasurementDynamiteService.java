// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.measurement.internal;

import android.app.Application$ActivityLifecycleCallbacks;
import android.os.BaseBundle;
import R2.L3;
import android.text.TextUtils;
import R2.R3;
import com.google.android.gms.internal.measurement.F0;
import R2.v3;
import R2.F3;
import R2.P3;
import R2.I3;
import R2.X3;
import R2.u3;
import com.google.android.gms.internal.measurement.E0;
import R2.k4;
import android.app.Activity;
import R2.n4;
import R2.I;
import R2.D;
import R2.O5;
import H2.b;
import android.content.Context;
import com.google.android.gms.internal.measurement.H0;
import R2.N3;
import R2.S5;
import android.os.RemoteException;
import R2.C3;
import R2.d4;
import A2.n;
import R2.N4;
import R2.i3;
import com.google.android.gms.internal.measurement.y0;
import android.os.Bundle;
import androidx.annotation.NonNull;
import t.a;
import java.util.Map;
import R2.N2;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.w0;

@DynamiteApi
public class AppMeasurementDynamiteService extends w0
{
    public N2 b;
    public final Map c;
    
    public AppMeasurementDynamiteService() {
        this.b = null;
        this.c = new t.a();
    }
    
    @Override
    public void beginAdUnitExposure(@NonNull final String s, final long n) {
        this.o();
        this.b.y().z(s, n);
    }
    
    @Override
    public void clearConditionalUserProperty(@NonNull final String s, @NonNull final String s2, @NonNull final Bundle bundle) {
        this.o();
        this.b.H().X(s, s2, bundle);
    }
    
    @Override
    public void clearMeasurementEnabled(final long n) {
        this.o();
        this.b.H().R(null);
    }
    
    @Override
    public void endAdUnitExposure(@NonNull final String s, final long n) {
        this.o();
        this.b.y().D(s, n);
    }
    
    @Override
    public void generateEventId(final y0 y0) {
        this.o();
        final long p = this.b.L().P0();
        this.o();
        this.b.L().T(y0, p);
    }
    
    @Override
    public void getAppInstanceId(final y0 y0) {
        this.o();
        this.b.e().D(new i3(this, y0));
    }
    
    @Override
    public void getCachedAppInstanceId(final y0 y0) {
        this.o();
        this.v(y0, this.b.H().i0());
    }
    
    @Override
    public void getConditionalUserProperties(final String s, final String s2, final y0 y0) {
        this.o();
        this.b.e().D(new N4(this, y0, s, s2));
    }
    
    @Override
    public void getCurrentScreenClass(final y0 y0) {
        this.o();
        this.v(y0, this.b.H().j0());
    }
    
    @Override
    public void getCurrentScreenName(final y0 y0) {
        this.o();
        this.v(y0, this.b.H().k0());
    }
    
    @Override
    public void getGmpAppId(final y0 y0) {
        this.o();
        this.v(y0, this.b.H().l0());
    }
    
    @Override
    public void getMaxUserProperties(final String s, final y0 y0) {
        this.o();
        this.b.H();
        n.e(s);
        this.o();
        this.b.L().S(y0, 25);
    }
    
    @Override
    public void getSessionId(final y0 y0) {
        this.o();
        final C3 h = this.b.H();
        h.e().D(new d4(h, y0));
    }
    
    @Override
    public void getTestFlag(final y0 y0, final int n) {
        this.o();
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        this.b.L().S(y0, this.b.H().g0());
                        return;
                    }
                    if (n != 4) {
                        return;
                    }
                    this.b.L().X(y0, this.b.H().e0());
                    return;
                }
                else {
                    final S5 l = this.b.L();
                    final double doubleValue = this.b.H().f0();
                    final Bundle bundle = new Bundle();
                    ((BaseBundle)bundle).putDouble("r", doubleValue);
                    try {
                        y0.l(bundle);
                        return;
                    }
                    catch (RemoteException ex) {
                        l.a.j().L().b("Error returning double value to wrapper", ex);
                        return;
                    }
                }
            }
            this.b.L().T(y0, this.b.H().h0());
            return;
        }
        this.b.L().V(y0, this.b.H().m0());
    }
    
    @Override
    public void getUserProperties(final String s, final String s2, final boolean b, final y0 y0) {
        this.o();
        this.b.e().D(new N3(this, y0, s, s2, b));
    }
    
    @Override
    public void initForTests(@NonNull final Map map) {
        this.o();
    }
    
    @Override
    public void initialize(final H2.a a, final H0 h0, final long l) {
        final N2 b = this.b;
        if (b == null) {
            this.b = N2.c((Context)n.i(H2.b.v(a)), h0, l);
            return;
        }
        b.j().L().a("Attempting to initialize multiple times");
    }
    
    @Override
    public void isDataCollectionEnabled(final y0 y0) {
        this.o();
        this.b.e().D(new O5(this, y0));
    }
    
    @Override
    public void logEvent(@NonNull final String s, @NonNull final String s2, @NonNull final Bundle bundle, final boolean b, final boolean b2, final long n) {
        this.o();
        this.b.H().Z(s, s2, bundle, b, b2, n);
    }
    
    @Override
    public void logEventAndBundle(final String s, final String s2, final Bundle bundle, final y0 y0, final long n) {
        this.o();
        n.e(s2);
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        }
        else {
            bundle2 = new Bundle();
        }
        ((BaseBundle)bundle2).putString("_o", "app");
        this.b.e().D(new n4(this, y0, new I(s2, new D(bundle), "app", n), s));
    }
    
    @Override
    public void logHealthData(final int n, @NonNull final String s, @NonNull final H2.a a, @NonNull final H2.a a2, @NonNull final H2.a a3) {
        this.o();
        final Object o = null;
        Object v;
        if (a == null) {
            v = null;
        }
        else {
            v = H2.b.v(a);
        }
        Object v2;
        if (a2 == null) {
            v2 = null;
        }
        else {
            v2 = H2.b.v(a2);
        }
        Object v3;
        if (a3 == null) {
            v3 = o;
        }
        else {
            v3 = H2.b.v(a3);
        }
        this.b.j().z(n, true, false, s, v, v2, v3);
    }
    
    public final void o() {
        if (this.b != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }
    
    @Override
    public void onActivityCreated(@NonNull final H2.a a, @NonNull final Bundle bundle, final long n) {
        this.o();
        final k4 c = this.b.H().c;
        if (c != null) {
            this.b.H().o0();
            ((Application$ActivityLifecycleCallbacks)c).onActivityCreated((Activity)H2.b.v(a), bundle);
        }
    }
    
    @Override
    public void onActivityDestroyed(@NonNull final H2.a a, final long n) {
        this.o();
        final k4 c = this.b.H().c;
        if (c != null) {
            this.b.H().o0();
            ((Application$ActivityLifecycleCallbacks)c).onActivityDestroyed((Activity)H2.b.v(a));
        }
    }
    
    @Override
    public void onActivityPaused(@NonNull final H2.a a, final long n) {
        this.o();
        final k4 c = this.b.H().c;
        if (c != null) {
            this.b.H().o0();
            ((Application$ActivityLifecycleCallbacks)c).onActivityPaused((Activity)H2.b.v(a));
        }
    }
    
    @Override
    public void onActivityResumed(@NonNull final H2.a a, final long n) {
        this.o();
        final k4 c = this.b.H().c;
        if (c != null) {
            this.b.H().o0();
            ((Application$ActivityLifecycleCallbacks)c).onActivityResumed((Activity)H2.b.v(a));
        }
    }
    
    @Override
    public void onActivitySaveInstanceState(final H2.a a, final y0 y0, final long n) {
        this.o();
        final k4 c = this.b.H().c;
        final Bundle bundle = new Bundle();
        if (c != null) {
            this.b.H().o0();
            ((Application$ActivityLifecycleCallbacks)c).onActivitySaveInstanceState((Activity)H2.b.v(a), bundle);
        }
        try {
            y0.l(bundle);
        }
        catch (RemoteException ex) {
            this.b.j().L().b("Error returning bundle value to wrapper", ex);
        }
    }
    
    @Override
    public void onActivityStarted(@NonNull final H2.a a, final long n) {
        this.o();
        final k4 c = this.b.H().c;
        if (c != null) {
            this.b.H().o0();
            ((Application$ActivityLifecycleCallbacks)c).onActivityStarted((Activity)H2.b.v(a));
        }
    }
    
    @Override
    public void onActivityStopped(@NonNull final H2.a a, final long n) {
        this.o();
        final k4 c = this.b.H().c;
        if (c != null) {
            this.b.H().o0();
            ((Application$ActivityLifecycleCallbacks)c).onActivityStopped((Activity)H2.b.v(a));
        }
    }
    
    @Override
    public void performAction(final Bundle bundle, final y0 y0, final long n) {
        this.o();
        y0.l(null);
    }
    
    @Override
    public void registerOnMeasurementEventListener(final E0 e0) {
        this.o();
        final Map c = this.c;
        // monitorenter(c)
        while (true) {
            try {
                u3 u3;
                if ((u3 = this.c.get(e0.a())) == null) {
                    u3 = new b(e0);
                    this.c.put(e0.a(), u3);
                }
                // monitorexit(c)
                this.b.H().I(u3);
                return;
                // monitorexit(c)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void resetAnalyticsData(final long n) {
        this.o();
        final C3 h = this.b.H();
        h.T(null);
        h.e().D(new X3(h, n));
    }
    
    @Override
    public void setConditionalUserProperty(@NonNull final Bundle bundle, final long n) {
        this.o();
        if (bundle == null) {
            this.b.j().G().a("Conditional user property must not be null");
            return;
        }
        this.b.H().Q(bundle, n);
    }
    
    @Override
    public void setConsent(@NonNull final Bundle bundle, final long n) {
        this.o();
        final C3 h = this.b.H();
        h.e().G(new I3(h, bundle, n));
    }
    
    @Override
    public void setConsentThirdParty(@NonNull final Bundle bundle, final long n) {
        this.o();
        this.b.H().P(bundle, -20, n);
    }
    
    @Override
    public void setCurrentScreen(@NonNull final H2.a a, @NonNull final String s, @NonNull final String s2, final long n) {
        this.o();
        this.b.I().N((Activity)H2.b.v(a), s, s2);
    }
    
    @Override
    public void setDataCollectionEnabled(final boolean b) {
        this.o();
        final C3 h = this.b.H();
        h.v();
        h.e().D(new P3(h, b));
    }
    
    @Override
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        this.o();
        final C3 h = this.b.H();
        if (bundle == null) {
            bundle = null;
        }
        else {
            bundle = new Bundle(bundle);
        }
        h.e().D(new F3(h, bundle));
    }
    
    @Override
    public void setEventInterceptor(final E0 e0) {
        this.o();
        final a a = new a(e0);
        if (this.b.e().J()) {
            this.b.H().J(a);
            return;
        }
        this.b.e().D(new com.google.android.gms.measurement.internal.a(this, a));
    }
    
    @Override
    public void setInstanceIdProvider(final F0 f0) {
        this.o();
    }
    
    @Override
    public void setMeasurementEnabled(final boolean b, final long n) {
        this.o();
        this.b.H().R(b);
    }
    
    @Override
    public void setMinimumSessionDuration(final long n) {
        this.o();
    }
    
    @Override
    public void setSessionTimeoutDuration(final long n) {
        this.o();
        final C3 h = this.b.H();
        h.e().D(new R3(h, n));
    }
    
    @Override
    public void setUserId(@NonNull final String s, final long n) {
        this.o();
        final C3 h = this.b.H();
        if (s != null && TextUtils.isEmpty((CharSequence)s)) {
            h.a.j().L().a("User ID must be non-empty or null");
            return;
        }
        h.e().D(new L3(h, s));
        h.c0(null, "_id", s, true, n);
    }
    
    @Override
    public void setUserProperty(@NonNull final String s, @NonNull final String s2, @NonNull final H2.a a, final boolean b, final long n) {
        this.o();
        this.b.H().c0(s, s2, b.v(a), b, n);
    }
    
    @Override
    public void unregisterOnMeasurementEventListener(final E0 e0) {
        this.o();
        Object c = this.c;
        synchronized (c) {
            final u3 u3 = this.c.remove(e0.a());
            // monitorexit(c)
            c = u3;
            if (u3 == null) {
                c = new b(e0);
            }
            this.b.H().u0((u3)c);
        }
    }
    
    public final void v(final y0 y0, final String s) {
        this.o();
        this.b.L().V(y0, s);
    }
    
    public final class a implements v3
    {
        public E0 a;
        
        public a(final E0 a) {
            this.a = a;
        }
        
        @Override
        public final void a(final String s, final String s2, final Bundle bundle, final long n) {
            try {
                this.a.L(s, s2, bundle, n);
            }
            catch (RemoteException ex) {
                final N2 b = AppMeasurementDynamiteService.this.b;
                if (b != null) {
                    b.j().L().b("Event interceptor threw exception", ex);
                }
            }
        }
    }
    
    public final class b implements u3
    {
        public E0 a;
        
        public b(final E0 a) {
            this.a = a;
        }
        
        @Override
        public final void a(final String s, final String s2, final Bundle bundle, final long n) {
            try {
                this.a.L(s, s2, bundle, n);
            }
            catch (RemoteException ex) {
                final N2 b = AppMeasurementDynamiteService.this.b;
                if (b != null) {
                    b.j().L().b("Event listener threw exception", ex);
                }
            }
        }
    }
}

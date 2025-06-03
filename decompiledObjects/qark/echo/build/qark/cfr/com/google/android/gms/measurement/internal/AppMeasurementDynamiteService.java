/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Map
 */
package com.google.android.gms.measurement.internal;

import A2.n;
import R2.B;
import R2.C3;
import R2.D;
import R2.F3;
import R2.G2;
import R2.I;
import R2.I3;
import R2.L3;
import R2.N2;
import R2.N3;
import R2.N4;
import R2.O5;
import R2.P3;
import R2.R3;
import R2.S5;
import R2.X3;
import R2.Y1;
import R2.a2;
import R2.d4;
import R2.i3;
import R2.k4;
import R2.m3;
import R2.n4;
import R2.u3;
import R2.v3;
import R2.v4;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.F0;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.y0;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService
extends w0 {
    public N2 b = null;
    public final Map c = new t.a();

    @Override
    public void beginAdUnitExposure(@NonNull String string2, long l8) {
        this.o();
        this.b.y().z(string2, l8);
    }

    @Override
    public void clearConditionalUserProperty(@NonNull String string2, @NonNull String string3, @NonNull Bundle bundle) {
        this.o();
        this.b.H().X(string2, string3, bundle);
    }

    @Override
    public void clearMeasurementEnabled(long l8) {
        this.o();
        this.b.H().R(null);
    }

    @Override
    public void endAdUnitExposure(@NonNull String string2, long l8) {
        this.o();
        this.b.y().D(string2, l8);
    }

    @Override
    public void generateEventId(y0 y02) {
        this.o();
        long l8 = this.b.L().P0();
        this.o();
        this.b.L().T(y02, l8);
    }

    @Override
    public void getAppInstanceId(y0 y02) {
        this.o();
        this.b.e().D(new i3(this, y02));
    }

    @Override
    public void getCachedAppInstanceId(y0 y02) {
        this.o();
        this.v(y02, this.b.H().i0());
    }

    @Override
    public void getConditionalUserProperties(String string2, String string3, y0 y02) {
        this.o();
        this.b.e().D(new N4(this, y02, string2, string3));
    }

    @Override
    public void getCurrentScreenClass(y0 y02) {
        this.o();
        this.v(y02, this.b.H().j0());
    }

    @Override
    public void getCurrentScreenName(y0 y02) {
        this.o();
        this.v(y02, this.b.H().k0());
    }

    @Override
    public void getGmpAppId(y0 y02) {
        this.o();
        this.v(y02, this.b.H().l0());
    }

    @Override
    public void getMaxUserProperties(String string2, y0 y02) {
        this.o();
        this.b.H();
        n.e(string2);
        this.o();
        this.b.L().S(y02, 25);
    }

    @Override
    public void getSessionId(y0 y02) {
        this.o();
        C3 c32 = this.b.H();
        c32.e().D(new d4(c32, y02));
    }

    @Override
    public void getTestFlag(y0 y02, int n8) {
        this.o();
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            return;
                        }
                        this.b.L().X(y02, this.b.H().e0());
                        return;
                    }
                    this.b.L().S(y02, this.b.H().g0());
                    return;
                }
                S5 s52 = this.b.L();
                double d8 = this.b.H().f0();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", d8);
                try {
                    y02.l(bundle);
                    return;
                }
                catch (RemoteException remoteException) {
                    s52.a.j().L().b("Error returning double value to wrapper", (Object)remoteException);
                    return;
                }
            }
            this.b.L().T(y02, this.b.H().h0());
            return;
        }
        this.b.L().V(y02, this.b.H().m0());
    }

    @Override
    public void getUserProperties(String string2, String string3, boolean bl, y0 y02) {
        this.o();
        this.b.e().D(new N3(this, y02, string2, string3, bl));
    }

    @Override
    public void initForTests(@NonNull Map map) {
        this.o();
    }

    @Override
    public void initialize(H2.a a8, H0 h02, long l8) {
        N2 n22 = this.b;
        if (n22 == null) {
            this.b = N2.c((Context)n.i((Object)((Context)H2.b.v(a8))), h02, l8);
            return;
        }
        n22.j().L().a("Attempting to initialize multiple times");
    }

    @Override
    public void isDataCollectionEnabled(y0 y02) {
        this.o();
        this.b.e().D(new O5(this, y02));
    }

    @Override
    public void logEvent(@NonNull String string2, @NonNull String string3, @NonNull Bundle bundle, boolean bl, boolean bl2, long l8) {
        this.o();
        this.b.H().Z(string2, string3, bundle, bl, bl2, l8);
    }

    @Override
    public void logEventAndBundle(String string2, String object, Bundle bundle, y0 y02, long l8) {
        this.o();
        n.e((String)object);
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", "app");
        object = new I((String)object, new D(bundle), "app", l8);
        this.b.e().D(new n4(this, y02, (I)object, string2));
    }

    @Override
    public void logHealthData(int n8, @NonNull String string2, @NonNull H2.a object, @NonNull H2.a object2, @NonNull H2.a object3) {
        this.o();
        Object var6_6 = null;
        object = object == null ? null : H2.b.v((H2.a)object);
        object2 = object2 == null ? null : H2.b.v((H2.a)object2);
        object3 = object3 == null ? var6_6 : H2.b.v((H2.a)object3);
        this.b.j().z(n8, true, false, string2, object, object2, object3);
    }

    public final void o() {
        if (this.b != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    @Override
    public void onActivityCreated(@NonNull H2.a a8, @NonNull Bundle bundle, long l8) {
        this.o();
        k4 k42 = this.b.H().c;
        if (k42 != null) {
            this.b.H().o0();
            k42.onActivityCreated((Activity)H2.b.v(a8), bundle);
        }
    }

    @Override
    public void onActivityDestroyed(@NonNull H2.a a8, long l8) {
        this.o();
        k4 k42 = this.b.H().c;
        if (k42 != null) {
            this.b.H().o0();
            k42.onActivityDestroyed((Activity)H2.b.v(a8));
        }
    }

    @Override
    public void onActivityPaused(@NonNull H2.a a8, long l8) {
        this.o();
        k4 k42 = this.b.H().c;
        if (k42 != null) {
            this.b.H().o0();
            k42.onActivityPaused((Activity)H2.b.v(a8));
        }
    }

    @Override
    public void onActivityResumed(@NonNull H2.a a8, long l8) {
        this.o();
        k4 k42 = this.b.H().c;
        if (k42 != null) {
            this.b.H().o0();
            k42.onActivityResumed((Activity)H2.b.v(a8));
        }
    }

    @Override
    public void onActivitySaveInstanceState(H2.a a8, y0 y02, long l8) {
        this.o();
        k4 k42 = this.b.H().c;
        Bundle bundle = new Bundle();
        if (k42 != null) {
            this.b.H().o0();
            k42.onActivitySaveInstanceState((Activity)H2.b.v(a8), bundle);
        }
        try {
            y02.l(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.b.j().L().b("Error returning bundle value to wrapper", (Object)remoteException);
            return;
        }
    }

    @Override
    public void onActivityStarted(@NonNull H2.a a8, long l8) {
        this.o();
        k4 k42 = this.b.H().c;
        if (k42 != null) {
            this.b.H().o0();
            k42.onActivityStarted((Activity)H2.b.v(a8));
        }
    }

    @Override
    public void onActivityStopped(@NonNull H2.a a8, long l8) {
        this.o();
        k4 k42 = this.b.H().c;
        if (k42 != null) {
            this.b.H().o0();
            k42.onActivityStopped((Activity)H2.b.v(a8));
        }
    }

    @Override
    public void performAction(Bundle bundle, y0 y02, long l8) {
        this.o();
        y02.l(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void registerOnMeasurementEventListener(E0 e02) {
        u3 u32;
        this.o();
        Map map = this.c;
        // MONITORENTER : map
        u3 u33 = u32 = (u3)this.c.get((Object)e02.a());
        if (u32 == null) {
            u33 = new b(e02);
            this.c.put((Object)e02.a(), (Object)u33);
        }
        // MONITOREXIT : map
        this.b.H().I(u33);
    }

    @Override
    public void resetAnalyticsData(long l8) {
        this.o();
        C3 c32 = this.b.H();
        c32.T(null);
        c32.e().D(new X3(c32, l8));
    }

    @Override
    public void setConditionalUserProperty(@NonNull Bundle bundle, long l8) {
        this.o();
        if (bundle == null) {
            this.b.j().G().a("Conditional user property must not be null");
            return;
        }
        this.b.H().Q(bundle, l8);
    }

    @Override
    public void setConsent(@NonNull Bundle bundle, long l8) {
        this.o();
        C3 c32 = this.b.H();
        c32.e().G(new I3(c32, bundle, l8));
    }

    @Override
    public void setConsentThirdParty(@NonNull Bundle bundle, long l8) {
        this.o();
        this.b.H().P(bundle, -20, l8);
    }

    @Override
    public void setCurrentScreen(@NonNull H2.a a8, @NonNull String string2, @NonNull String string3, long l8) {
        this.o();
        this.b.I().N((Activity)H2.b.v(a8), string2, string3);
    }

    @Override
    public void setDataCollectionEnabled(boolean bl) {
        this.o();
        C3 c32 = this.b.H();
        c32.v();
        c32.e().D(new P3(c32, bl));
    }

    @Override
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        this.o();
        C3 c32 = this.b.H();
        bundle = bundle == null ? null : new Bundle(bundle);
        c32.e().D(new F3(c32, bundle));
    }

    @Override
    public void setEventInterceptor(E0 object) {
        this.o();
        object = new a((E0)object);
        if (this.b.e().J()) {
            this.b.H().J((v3)object);
            return;
        }
        this.b.e().D(new com.google.android.gms.measurement.internal.a(this, (a)object));
    }

    @Override
    public void setInstanceIdProvider(F0 f02) {
        this.o();
    }

    @Override
    public void setMeasurementEnabled(boolean bl, long l8) {
        this.o();
        this.b.H().R(bl);
    }

    @Override
    public void setMinimumSessionDuration(long l8) {
        this.o();
    }

    @Override
    public void setSessionTimeoutDuration(long l8) {
        this.o();
        C3 c32 = this.b.H();
        c32.e().D(new R3(c32, l8));
    }

    @Override
    public void setUserId(@NonNull String string2, long l8) {
        this.o();
        C3 c32 = this.b.H();
        if (string2 != null && TextUtils.isEmpty((CharSequence)string2)) {
            c32.a.j().L().a("User ID must be non-empty or null");
            return;
        }
        c32.e().D(new L3(c32, string2));
        c32.c0(null, "_id", string2, true, l8);
    }

    @Override
    public void setUserProperty(@NonNull String string2, @NonNull String string3, @NonNull H2.a object, boolean bl, long l8) {
        this.o();
        object = H2.b.v((H2.a)object);
        this.b.H().c0(string2, string3, object, bl, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void unregisterOnMeasurementEventListener(E0 e02) {
        u3 u32;
        this.o();
        Object object = this.c;
        synchronized (object) {
            u32 = (u3)this.c.remove((Object)e02.a());
        }
        object = u32;
        if (u32 == null) {
            object = new b(e02);
        }
        this.b.H().u0((u3)object);
    }

    public final void v(y0 y02, String string2) {
        this.o();
        this.b.L().V(y02, string2);
    }

    public final class a
    implements v3 {
        public E0 a;

        public a(E0 e02) {
            this.a = e02;
        }

        @Override
        public final void a(String string2, String object, Bundle bundle, long l8) {
            try {
                this.a.L(string2, (String)object, bundle, l8);
                return;
            }
            catch (RemoteException remoteException) {
                object = AppMeasurementDynamiteService.this.b;
                if (object != null) {
                    object.j().L().b("Event interceptor threw exception", (Object)remoteException);
                }
                return;
            }
        }
    }

    public final class b
    implements u3 {
        public E0 a;

        public b(E0 e02) {
            this.a = e02;
        }

        @Override
        public final void a(String string2, String object, Bundle bundle, long l8) {
            try {
                this.a.L(string2, (String)object, bundle, l8);
                return;
            }
            catch (RemoteException remoteException) {
                object = AppMeasurementDynamiteService.this.b;
                if (object != null) {
                    object.j().L().b("Event listener threw exception", (Object)remoteException);
                }
                return;
            }
        }
    }

}


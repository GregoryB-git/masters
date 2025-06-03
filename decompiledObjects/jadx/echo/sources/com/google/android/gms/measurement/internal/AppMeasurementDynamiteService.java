package com.google.android.gms.measurement.internal;

import A2.AbstractC0328n;
import R2.C0544k4;
import R2.C3;
import R2.D;
import R2.I;
import R2.InterfaceC0612u3;
import R2.InterfaceC0619v3;
import R2.N2;
import R2.N3;
import R2.N4;
import R2.O5;
import R2.P3;
import R2.R3;
import R2.RunnableC0495d4;
import R2.RunnableC0529i3;
import R2.RunnableC0565n4;
import R2.S5;
import R2.X3;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractBinderC1053w0;
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.F0;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.InterfaceC1071y0;
import java.util.Map;
import t.C1958a;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC1053w0 {

    /* renamed from: b, reason: collision with root package name */
    public N2 f11248b = null;

    /* renamed from: c, reason: collision with root package name */
    public final Map f11249c = new C1958a();

    public class a implements InterfaceC0619v3 {

        /* renamed from: a, reason: collision with root package name */
        public E0 f11250a;

        public a(E0 e02) {
            this.f11250a = e02;
        }

        @Override // R2.InterfaceC0619v3
        public final void a(String str, String str2, Bundle bundle, long j7) {
            try {
                this.f11250a.L(str, str2, bundle, j7);
            } catch (RemoteException e7) {
                N2 n22 = AppMeasurementDynamiteService.this.f11248b;
                if (n22 != null) {
                    n22.j().L().b("Event interceptor threw exception", e7);
                }
            }
        }
    }

    public class b implements InterfaceC0612u3 {

        /* renamed from: a, reason: collision with root package name */
        public E0 f11252a;

        public b(E0 e02) {
            this.f11252a = e02;
        }

        @Override // R2.InterfaceC0612u3
        public final void a(String str, String str2, Bundle bundle, long j7) {
            try {
                this.f11252a.L(str, str2, bundle, j7);
            } catch (RemoteException e7) {
                N2 n22 = AppMeasurementDynamiteService.this.f11248b;
                if (n22 != null) {
                    n22.j().L().b("Event listener threw exception", e7);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void beginAdUnitExposure(@NonNull String str, long j7) {
        o();
        this.f11248b.y().z(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        o();
        this.f11248b.H().X(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void clearMeasurementEnabled(long j7) {
        o();
        this.f11248b.H().R(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void endAdUnitExposure(@NonNull String str, long j7) {
        o();
        this.f11248b.y().D(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void generateEventId(InterfaceC1071y0 interfaceC1071y0) {
        o();
        long P02 = this.f11248b.L().P0();
        o();
        this.f11248b.L().T(interfaceC1071y0, P02);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void getAppInstanceId(InterfaceC1071y0 interfaceC1071y0) {
        o();
        this.f11248b.e().D(new RunnableC0529i3(this, interfaceC1071y0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void getCachedAppInstanceId(InterfaceC1071y0 interfaceC1071y0) {
        o();
        v(interfaceC1071y0, this.f11248b.H().i0());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void getConditionalUserProperties(String str, String str2, InterfaceC1071y0 interfaceC1071y0) {
        o();
        this.f11248b.e().D(new N4(this, interfaceC1071y0, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void getCurrentScreenClass(InterfaceC1071y0 interfaceC1071y0) {
        o();
        v(interfaceC1071y0, this.f11248b.H().j0());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void getCurrentScreenName(InterfaceC1071y0 interfaceC1071y0) {
        o();
        v(interfaceC1071y0, this.f11248b.H().k0());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void getGmpAppId(InterfaceC1071y0 interfaceC1071y0) {
        o();
        v(interfaceC1071y0, this.f11248b.H().l0());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void getMaxUserProperties(String str, InterfaceC1071y0 interfaceC1071y0) {
        o();
        this.f11248b.H();
        AbstractC0328n.e(str);
        o();
        this.f11248b.L().S(interfaceC1071y0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void getSessionId(InterfaceC1071y0 interfaceC1071y0) {
        o();
        C3 H6 = this.f11248b.H();
        H6.e().D(new RunnableC0495d4(H6, interfaceC1071y0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void getTestFlag(InterfaceC1071y0 interfaceC1071y0, int i7) {
        o();
        if (i7 == 0) {
            this.f11248b.L().V(interfaceC1071y0, this.f11248b.H().m0());
            return;
        }
        if (i7 == 1) {
            this.f11248b.L().T(interfaceC1071y0, this.f11248b.H().h0().longValue());
            return;
        }
        if (i7 != 2) {
            if (i7 == 3) {
                this.f11248b.L().S(interfaceC1071y0, this.f11248b.H().g0().intValue());
                return;
            } else {
                if (i7 != 4) {
                    return;
                }
                this.f11248b.L().X(interfaceC1071y0, this.f11248b.H().e0().booleanValue());
                return;
            }
        }
        S5 L6 = this.f11248b.L();
        double doubleValue = this.f11248b.H().f0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            interfaceC1071y0.l(bundle);
        } catch (RemoteException e7) {
            L6.f5424a.j().L().b("Error returning double value to wrapper", e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void getUserProperties(String str, String str2, boolean z7, InterfaceC1071y0 interfaceC1071y0) {
        o();
        this.f11248b.e().D(new N3(this, interfaceC1071y0, str, str2, z7));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void initForTests(@NonNull Map map) {
        o();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void initialize(H2.a aVar, H0 h02, long j7) {
        N2 n22 = this.f11248b;
        if (n22 == null) {
            this.f11248b = N2.c((Context) AbstractC0328n.i((Context) H2.b.v(aVar)), h02, Long.valueOf(j7));
        } else {
            n22.j().L().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void isDataCollectionEnabled(InterfaceC1071y0 interfaceC1071y0) {
        o();
        this.f11248b.e().D(new O5(this, interfaceC1071y0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z7, boolean z8, long j7) {
        o();
        this.f11248b.H().Z(str, str2, bundle, z7, z8, j7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1071y0 interfaceC1071y0, long j7) {
        o();
        AbstractC0328n.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f11248b.e().D(new RunnableC0565n4(this, interfaceC1071y0, new I(str2, new D(bundle), "app", j7), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void logHealthData(int i7, @NonNull String str, @NonNull H2.a aVar, @NonNull H2.a aVar2, @NonNull H2.a aVar3) {
        o();
        this.f11248b.j().z(i7, true, false, str, aVar == null ? null : H2.b.v(aVar), aVar2 == null ? null : H2.b.v(aVar2), aVar3 != null ? H2.b.v(aVar3) : null);
    }

    public final void o() {
        if (this.f11248b == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void onActivityCreated(@NonNull H2.a aVar, @NonNull Bundle bundle, long j7) {
        o();
        C0544k4 c0544k4 = this.f11248b.H().f4568c;
        if (c0544k4 != null) {
            this.f11248b.H().o0();
            c0544k4.onActivityCreated((Activity) H2.b.v(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void onActivityDestroyed(@NonNull H2.a aVar, long j7) {
        o();
        C0544k4 c0544k4 = this.f11248b.H().f4568c;
        if (c0544k4 != null) {
            this.f11248b.H().o0();
            c0544k4.onActivityDestroyed((Activity) H2.b.v(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void onActivityPaused(@NonNull H2.a aVar, long j7) {
        o();
        C0544k4 c0544k4 = this.f11248b.H().f4568c;
        if (c0544k4 != null) {
            this.f11248b.H().o0();
            c0544k4.onActivityPaused((Activity) H2.b.v(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void onActivityResumed(@NonNull H2.a aVar, long j7) {
        o();
        C0544k4 c0544k4 = this.f11248b.H().f4568c;
        if (c0544k4 != null) {
            this.f11248b.H().o0();
            c0544k4.onActivityResumed((Activity) H2.b.v(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void onActivitySaveInstanceState(H2.a aVar, InterfaceC1071y0 interfaceC1071y0, long j7) {
        o();
        C0544k4 c0544k4 = this.f11248b.H().f4568c;
        Bundle bundle = new Bundle();
        if (c0544k4 != null) {
            this.f11248b.H().o0();
            c0544k4.onActivitySaveInstanceState((Activity) H2.b.v(aVar), bundle);
        }
        try {
            interfaceC1071y0.l(bundle);
        } catch (RemoteException e7) {
            this.f11248b.j().L().b("Error returning bundle value to wrapper", e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void onActivityStarted(@NonNull H2.a aVar, long j7) {
        o();
        C0544k4 c0544k4 = this.f11248b.H().f4568c;
        if (c0544k4 != null) {
            this.f11248b.H().o0();
            c0544k4.onActivityStarted((Activity) H2.b.v(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void onActivityStopped(@NonNull H2.a aVar, long j7) {
        o();
        C0544k4 c0544k4 = this.f11248b.H().f4568c;
        if (c0544k4 != null) {
            this.f11248b.H().o0();
            c0544k4.onActivityStopped((Activity) H2.b.v(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void performAction(Bundle bundle, InterfaceC1071y0 interfaceC1071y0, long j7) {
        o();
        interfaceC1071y0.l(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void registerOnMeasurementEventListener(E0 e02) {
        InterfaceC0612u3 interfaceC0612u3;
        o();
        synchronized (this.f11249c) {
            try {
                interfaceC0612u3 = (InterfaceC0612u3) this.f11249c.get(Integer.valueOf(e02.a()));
                if (interfaceC0612u3 == null) {
                    interfaceC0612u3 = new b(e02);
                    this.f11249c.put(Integer.valueOf(e02.a()), interfaceC0612u3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11248b.H().I(interfaceC0612u3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void resetAnalyticsData(long j7) {
        o();
        C3 H6 = this.f11248b.H();
        H6.T(null);
        H6.e().D(new X3(H6, j7));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j7) {
        o();
        if (bundle == null) {
            this.f11248b.j().G().a("Conditional user property must not be null");
        } else {
            this.f11248b.H().Q(bundle, j7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setConsent(@NonNull final Bundle bundle, final long j7) {
        o();
        final C3 H6 = this.f11248b.H();
        H6.e().G(new Runnable() { // from class: R2.I3
            @Override // java.lang.Runnable
            public final void run() {
                C3 c32 = C3.this;
                Bundle bundle2 = bundle;
                long j8 = j7;
                if (TextUtils.isEmpty(c32.p().G())) {
                    c32.P(bundle2, 0, j8);
                } else {
                    c32.j().M().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setConsentThirdParty(@NonNull Bundle bundle, long j7) {
        o();
        this.f11248b.H().P(bundle, -20, j7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setCurrentScreen(@NonNull H2.a aVar, @NonNull String str, @NonNull String str2, long j7) {
        o();
        this.f11248b.I().N((Activity) H2.b.v(aVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setDataCollectionEnabled(boolean z7) {
        o();
        C3 H6 = this.f11248b.H();
        H6.v();
        H6.e().D(new P3(H6, z7));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        o();
        final C3 H6 = this.f11248b.H();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        H6.e().D(new Runnable() { // from class: R2.F3
            @Override // java.lang.Runnable
            public final void run() {
                C3.this.O(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setEventInterceptor(E0 e02) {
        o();
        a aVar = new a(e02);
        if (this.f11248b.e().J()) {
            this.f11248b.H().J(aVar);
        } else {
            this.f11248b.e().D(new com.google.android.gms.measurement.internal.a(this, aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setInstanceIdProvider(F0 f02) {
        o();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setMeasurementEnabled(boolean z7, long j7) {
        o();
        this.f11248b.H().R(Boolean.valueOf(z7));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setMinimumSessionDuration(long j7) {
        o();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setSessionTimeoutDuration(long j7) {
        o();
        C3 H6 = this.f11248b.H();
        H6.e().D(new R3(H6, j7));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setUserId(@NonNull final String str, long j7) {
        o();
        final C3 H6 = this.f11248b.H();
        if (str != null && TextUtils.isEmpty(str)) {
            H6.f5424a.j().L().a("User ID must be non-empty or null");
        } else {
            H6.e().D(new Runnable() { // from class: R2.L3
                @Override // java.lang.Runnable
                public final void run() {
                    C3 c32 = C3.this;
                    if (c32.p().K(str)) {
                        c32.p().I();
                    }
                }
            });
            H6.c0(null, "_id", str, true, j7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull H2.a aVar, boolean z7, long j7) {
        o();
        this.f11248b.H().c0(str, str2, H2.b.v(aVar), z7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public void unregisterOnMeasurementEventListener(E0 e02) {
        InterfaceC0612u3 interfaceC0612u3;
        o();
        synchronized (this.f11249c) {
            interfaceC0612u3 = (InterfaceC0612u3) this.f11249c.remove(Integer.valueOf(e02.a()));
        }
        if (interfaceC0612u3 == null) {
            interfaceC0612u3 = new b(e02);
        }
        this.f11248b.H().u0(interfaceC0612u3);
    }

    public final void v(InterfaceC1071y0 interfaceC1071y0, String str) {
        o();
        this.f11248b.L().V(interfaceC1071y0, str);
    }
}

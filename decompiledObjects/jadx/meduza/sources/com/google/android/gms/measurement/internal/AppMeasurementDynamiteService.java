package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.internal.measurement.zzdr;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.internal.measurement.zzdx;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzeb;
import e7.a0;
import e7.b1;
import e7.f0;
import e7.f2;
import e7.h3;
import e7.i4;
import e7.j2;
import e7.j3;
import e7.k3;
import e7.m3;
import e7.n3;
import e7.o2;
import e7.o3;
import e7.p2;
import e7.q3;
import e7.q4;
import e7.r6;
import e7.s2;
import e7.s3;
import e7.s4;
import e7.t3;
import e7.x3;
import e7.z3;
import i6.p;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l6.q0;
import m6.j;

/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends zzdo {

    /* renamed from: a, reason: collision with root package name */
    public j2 f2900a = null;

    /* renamed from: b, reason: collision with root package name */
    public final r.b f2901b = new r.b();

    public class a implements h3 {

        /* renamed from: a, reason: collision with root package name */
        public zzdw f2902a;

        public a(zzdw zzdwVar) {
            this.f2902a = zzdwVar;
        }

        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f2902a.zza(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                j2 j2Var = AppMeasurementDynamiteService.this.f2900a;
                if (j2Var != null) {
                    j2Var.zzj().f4063r.c("Event interceptor threw exception", e10);
                }
            }
        }
    }

    public class b implements j3 {

        /* renamed from: a, reason: collision with root package name */
        public zzdw f2904a;

        public b(zzdw zzdwVar) {
            this.f2904a = zzdwVar;
        }

        @Override // e7.j3
        public final void a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f2904a.zza(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                j2 j2Var = AppMeasurementDynamiteService.this.f2900a;
                if (j2Var != null) {
                    j2Var.zzj().f4063r.c("Event listener threw exception", e10);
                }
            }
        }
    }

    public static void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdr zzdrVar) {
        try {
            zzdrVar.a_();
        } catch (RemoteException e10) {
            j2 j2Var = appMeasurementDynamiteService.f2900a;
            j.i(j2Var);
            j2Var.zzj().f4063r.c("Failed to call IDynamiteUploadBatchesCallback", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void beginAdUnitExposure(String str, long j10) {
        g();
        e7.a aVar = this.f2900a.f4374y;
        if (aVar == null) {
            throw new IllegalStateException("Component not created");
        }
        aVar.u(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        g();
        this.f2900a.k().a(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void clearMeasurementEnabled(long j10) {
        g();
        k3 k10 = this.f2900a.k();
        k10.t();
        k10.zzl().u(new q0(2, k10, (Object) null));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void endAdUnitExposure(String str, long j10) {
        g();
        e7.a aVar = this.f2900a.f4374y;
        if (aVar == null) {
            throw new IllegalStateException("Component not created");
        }
        aVar.x(str, j10);
    }

    public final void g() {
        if (this.f2900a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void generateEventId(zzdq zzdqVar) {
        g();
        long y02 = this.f2900a.m().y0();
        g();
        this.f2900a.m().G(zzdqVar, y02);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void getAppInstanceId(zzdq zzdqVar) {
        g();
        this.f2900a.zzl().u(new p(this, zzdqVar, 4));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void getCachedAppInstanceId(zzdq zzdqVar) {
        g();
        r(this.f2900a.k().f4424p.get(), zzdqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void getConditionalUserProperties(String str, String str2, zzdq zzdqVar) {
        g();
        this.f2900a.zzl().u(new o2(this, zzdqVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void getCurrentScreenClass(zzdq zzdqVar) {
        g();
        j2 j2Var = (j2) this.f2900a.k().f3407b;
        j2.b(j2Var.f4372w);
        q4 q4Var = j2Var.f4372w.f4640d;
        r(q4Var != null ? q4Var.f4590b : null, zzdqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void getCurrentScreenName(zzdq zzdqVar) {
        g();
        j2 j2Var = (j2) this.f2900a.k().f3407b;
        j2.b(j2Var.f4372w);
        q4 q4Var = j2Var.f4372w.f4640d;
        r(q4Var != null ? q4Var.f4589a : null, zzdqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void getGmpAppId(zzdq zzdqVar) {
        g();
        k3 k10 = this.f2900a.k();
        String str = ((j2) k10.f3407b).f4361b;
        if (str == null) {
            str = null;
            try {
                Context zza = k10.zza();
                String str2 = ((j2) k10.f3407b).A;
                j.i(zza);
                Resources resources = zza.getResources();
                if (TextUtils.isEmpty(str2)) {
                    str2 = f2.a(zza);
                }
                int identifier = resources.getIdentifier("google_app_id", "string", str2);
                if (identifier != 0) {
                    try {
                        str = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            } catch (IllegalStateException e10) {
                ((j2) k10.f3407b).zzj().f4060o.c("getGoogleAppId failed with exception", e10);
            }
        }
        r(str, zzdqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void getMaxUserProperties(String str, zzdq zzdqVar) {
        g();
        this.f2900a.k();
        j.e(str);
        g();
        this.f2900a.m().F(zzdqVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void getSessionId(zzdq zzdqVar) {
        g();
        k3 k10 = this.f2900a.k();
        k10.zzl().u(new s2(2, k10, zzdqVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void getTestFlag(zzdq zzdqVar, int i10) {
        g();
        int i11 = 1;
        if (i10 == 0) {
            r6 m10 = this.f2900a.m();
            k3 k10 = this.f2900a.k();
            k10.getClass();
            AtomicReference atomicReference = new AtomicReference();
            m10.N((String) k10.zzl().q(atomicReference, 15000L, "String test flag value", new m3(k10, atomicReference, i11)), zzdqVar);
            return;
        }
        if (i10 == 1) {
            r6 m11 = this.f2900a.m();
            k3 k11 = this.f2900a.k();
            k11.getClass();
            AtomicReference atomicReference2 = new AtomicReference();
            m11.G(zzdqVar, ((Long) k11.zzl().q(atomicReference2, 15000L, "long test flag value", new q3(k11, atomicReference2, i11))).longValue());
            return;
        }
        int i12 = 2;
        if (i10 == 2) {
            r6 m12 = this.f2900a.m();
            k3 k12 = this.f2900a.k();
            k12.getClass();
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) k12.zzl().q(atomicReference3, 15000L, "double test flag value", new m3(k12, atomicReference3, i12))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzdqVar.zza(bundle);
                return;
            } catch (RemoteException e10) {
                ((j2) m12.f3407b).zzj().f4063r.c("Error returning double value to wrapper", e10);
                return;
            }
        }
        if (i10 == 3) {
            r6 m13 = this.f2900a.m();
            k3 k13 = this.f2900a.k();
            k13.getClass();
            AtomicReference atomicReference4 = new AtomicReference();
            m13.F(zzdqVar, ((Integer) k13.zzl().q(atomicReference4, 15000L, "int test flag value", new t3(k13, atomicReference4, i11))).intValue());
            return;
        }
        if (i10 != 4) {
            return;
        }
        r6 m14 = this.f2900a.m();
        k3 k14 = this.f2900a.k();
        k14.getClass();
        AtomicReference atomicReference5 = new AtomicReference();
        m14.I(zzdqVar, ((Boolean) k14.zzl().q(atomicReference5, 15000L, "boolean test flag value", new t3(k14, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void getUserProperties(String str, String str2, boolean z10, zzdq zzdqVar) {
        g();
        this.f2900a.zzl().u(new n3(this, zzdqVar, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void initForTests(Map map) {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void initialize(IObjectWrapper iObjectWrapper, zzdz zzdzVar, long j10) {
        j2 j2Var = this.f2900a;
        if (j2Var != null) {
            j2Var.zzj().f4063r.b("Attempting to initialize multiple times");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        j.i(context);
        this.f2900a = j2.a(context, zzdzVar, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void isDataCollectionEnabled(zzdq zzdqVar) {
        g();
        this.f2900a.zzl().u(new q0(6, this, zzdqVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        g();
        this.f2900a.k().E(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzdq zzdqVar, long j10) {
        g();
        j.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f2900a.zzl().u(new p2(this, zzdqVar, new f0(str2, new a0(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        g();
        this.f2900a.zzj().t(i10, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10) {
        g();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        j.i(activity);
        onActivityCreatedByScionActivityInfo(zzeb.zza(activity), bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivityCreatedByScionActivityInfo(zzeb zzebVar, Bundle bundle, long j10) {
        g();
        i4 i4Var = this.f2900a.k().f4421d;
        if (i4Var != null) {
            this.f2900a.k().K();
            i4Var.b(zzebVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10) {
        g();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        j.i(activity);
        onActivityDestroyedByScionActivityInfo(zzeb.zza(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivityDestroyedByScionActivityInfo(zzeb zzebVar, long j10) {
        g();
        i4 i4Var = this.f2900a.k().f4421d;
        if (i4Var != null) {
            this.f2900a.k().K();
            i4Var.a(zzebVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j10) {
        g();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        j.i(activity);
        onActivityPausedByScionActivityInfo(zzeb.zza(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivityPausedByScionActivityInfo(zzeb zzebVar, long j10) {
        g();
        i4 i4Var = this.f2900a.k().f4421d;
        if (i4Var != null) {
            this.f2900a.k().K();
            i4Var.c(zzebVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j10) {
        g();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        j.i(activity);
        onActivityResumedByScionActivityInfo(zzeb.zza(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivityResumedByScionActivityInfo(zzeb zzebVar, long j10) {
        g();
        i4 i4Var = this.f2900a.k().f4421d;
        if (i4Var != null) {
            this.f2900a.k().K();
            i4Var.e(zzebVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdq zzdqVar, long j10) {
        g();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        j.i(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzeb.zza(activity), zzdqVar, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivitySaveInstanceStateByScionActivityInfo(zzeb zzebVar, zzdq zzdqVar, long j10) {
        g();
        i4 i4Var = this.f2900a.k().f4421d;
        Bundle bundle = new Bundle();
        if (i4Var != null) {
            this.f2900a.k().K();
            i4Var.d(zzebVar, bundle);
        }
        try {
            zzdqVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f2900a.zzj().f4063r.c("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j10) {
        g();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        j.i(activity);
        onActivityStartedByScionActivityInfo(zzeb.zza(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivityStartedByScionActivityInfo(zzeb zzebVar, long j10) {
        g();
        if (this.f2900a.k().f4421d != null) {
            this.f2900a.k().K();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j10) {
        g();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        j.i(activity);
        onActivityStoppedByScionActivityInfo(zzeb.zza(activity), j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void onActivityStoppedByScionActivityInfo(zzeb zzebVar, long j10) {
        g();
        if (this.f2900a.k().f4421d != null) {
            this.f2900a.k().K();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void performAction(Bundle bundle, zzdq zzdqVar, long j10) {
        g();
        zzdqVar.zza(null);
    }

    public final void r(String str, zzdq zzdqVar) {
        g();
        this.f2900a.m().N(str, zzdqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void registerOnMeasurementEventListener(zzdw zzdwVar) {
        Object obj;
        g();
        synchronized (this.f2901b) {
            obj = (j3) this.f2901b.getOrDefault(Integer.valueOf(zzdwVar.zza()), null);
            if (obj == null) {
                obj = new b(zzdwVar);
                this.f2901b.put(Integer.valueOf(zzdwVar.zza()), obj);
            }
        }
        k3 k10 = this.f2900a.k();
        k10.t();
        if (k10.f.add(obj)) {
            return;
        }
        k10.zzj().f4063r.b("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void resetAnalyticsData(long j10) {
        g();
        k3 k10 = this.f2900a.k();
        k10.P(null);
        k10.zzl().u(new z3(k10, j10, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0200 A[LOOP:1: B:27:0x00d7->B:63:0x0200, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzdl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void retrieveAndUploadBatches(com.google.android.gms.internal.measurement.zzdr r22) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.retrieveAndUploadBatches(com.google.android.gms.internal.measurement.zzdr):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        g();
        if (bundle == null) {
            this.f2900a.zzj().f4060o.b("Conditional user property must not be null");
        } else {
            this.f2900a.k().w(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setConsent(Bundle bundle, long j10) {
        g();
        k3 k10 = this.f2900a.k();
        k10.zzl().v(new s3(k10, bundle, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setConsentThirdParty(Bundle bundle, long j10) {
        g();
        this.f2900a.k().v(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10) {
        g();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        j.i(activity);
        setCurrentScreenByScionActivityInfo(zzeb.zza(activity), str, str2, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setCurrentScreenByScionActivityInfo(zzeb zzebVar, String str, String str2, long j10) {
        b1 b1Var;
        Integer valueOf;
        String str3;
        b1 b1Var2;
        String str4;
        g();
        j2 j2Var = this.f2900a;
        j2.b(j2Var.f4372w);
        s4 s4Var = j2Var.f4372w;
        if (s4Var.h().A()) {
            q4 q4Var = s4Var.f4640d;
            if (q4Var == null) {
                b1Var2 = s4Var.zzj().t;
                str4 = "setCurrentScreen cannot be called while no activity active";
            } else if (s4Var.f4642o.get(Integer.valueOf(zzebVar.zza)) == null) {
                b1Var2 = s4Var.zzj().t;
                str4 = "setCurrentScreen must be called with an activity in the activity lifecycle";
            } else {
                if (str2 == null) {
                    str2 = s4Var.b(zzebVar.zzb, "Activity");
                }
                boolean equals = Objects.equals(q4Var.f4590b, str2);
                boolean equals2 = Objects.equals(q4Var.f4589a, str);
                if (!equals || !equals2) {
                    if (str != null && (str.length() <= 0 || str.length() > s4Var.h().n(null, false))) {
                        b1Var = s4Var.zzj().t;
                        valueOf = Integer.valueOf(str.length());
                        str3 = "Invalid screen name length in setCurrentScreen. Length";
                    } else {
                        if (str2 == null || (str2.length() > 0 && str2.length() <= s4Var.h().n(null, false))) {
                            s4Var.zzj().f4067w.d("Setting current screen to name, class", str == null ? "null" : str, str2);
                            q4 q4Var2 = new q4(s4Var.k().y0(), str, str2);
                            s4Var.f4642o.put(Integer.valueOf(zzebVar.zza), q4Var2);
                            s4Var.z(zzebVar.zzb, q4Var2, true);
                            return;
                        }
                        b1Var = s4Var.zzj().t;
                        valueOf = Integer.valueOf(str2.length());
                        str3 = "Invalid class name length in setCurrentScreen. Length";
                    }
                    b1Var.c(str3, valueOf);
                    return;
                }
                b1Var2 = s4Var.zzj().t;
                str4 = "setCurrentScreen cannot be called with the same class and name";
            }
        } else {
            b1Var2 = s4Var.zzj().t;
            str4 = "setCurrentScreen cannot be called while screen reporting is disabled.";
        }
        b1Var2.b(str4);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setDataCollectionEnabled(boolean z10) {
        g();
        k3 k10 = this.f2900a.k();
        k10.t();
        k10.zzl().u(new x3(k10, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setDefaultEventParameters(Bundle bundle) {
        g();
        k3 k10 = this.f2900a.k();
        k10.getClass();
        k10.zzl().u(new o3(k10, bundle == null ? new Bundle() : new Bundle(bundle), 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setEventInterceptor(zzdw zzdwVar) {
        g();
        a aVar = new a(zzdwVar);
        if (!this.f2900a.zzl().w()) {
            this.f2900a.zzl().u(new com.google.android.gms.measurement.internal.a(this, aVar));
            return;
        }
        k3 k10 = this.f2900a.k();
        k10.l();
        k10.t();
        h3 h3Var = k10.f4422e;
        if (aVar != h3Var) {
            j.k(h3Var == null, "EventInterceptor already set.");
        }
        k10.f4422e = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setInstanceIdProvider(zzdx zzdxVar) {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setMeasurementEnabled(boolean z10, long j10) {
        g();
        k3 k10 = this.f2900a.k();
        Boolean valueOf = Boolean.valueOf(z10);
        k10.t();
        k10.zzl().u(new q0(2, k10, valueOf));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setMinimumSessionDuration(long j10) {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setSessionTimeoutDuration(long j10) {
        g();
        k3 k10 = this.f2900a.k();
        k10.zzl().u(new z3(k10, j10, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setSgtmDebugInfo(Intent intent) {
        g();
        k3 k10 = this.f2900a.k();
        k10.getClass();
        Uri data = intent.getData();
        if (data == null) {
            k10.zzj().f4065u.b("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            k10.zzj().f4065u.b("Preview Mode was not enabled.");
            k10.h().f4228d = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        k10.zzj().f4065u.c("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
        k10.h().f4228d = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setUserId(String str, long j10) {
        g();
        k3 k10 = this.f2900a.k();
        if (str != null) {
            k10.getClass();
            if (TextUtils.isEmpty(str)) {
                ((j2) k10.f3407b).zzj().f4063r.b("User ID must be non-empty or null");
                return;
            }
        }
        k10.zzl().u(new p(6, k10, str));
        k10.G(null, "_id", str, true, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10) {
        g();
        this.f2900a.k().G(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public void unregisterOnMeasurementEventListener(zzdw zzdwVar) {
        Object obj;
        g();
        synchronized (this.f2901b) {
            obj = (j3) this.f2901b.remove(Integer.valueOf(zzdwVar.zza()));
        }
        if (obj == null) {
            obj = new b(zzdwVar);
        }
        k3 k10 = this.f2900a.k();
        k10.t();
        if (k10.f.remove(obj)) {
            return;
        }
        k10.zzj().f4063r.b("OnEventListener had not been registered");
    }
}

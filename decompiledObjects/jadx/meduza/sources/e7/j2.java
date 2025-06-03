package e7;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzhx;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class j2 implements c3 {
    public static volatile j2 R;
    public final String A;
    public w0 B;
    public w4 C;
    public z D;
    public t0 E;
    public o4 F;
    public Boolean H;
    public long I;
    public volatile Boolean J;
    public Boolean K;
    public Boolean L;
    public volatile boolean M;
    public int N;
    public int O;
    public final long Q;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4360a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4361b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4362c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4363d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4364e;
    public final nc.g0 f;

    /* renamed from: o, reason: collision with root package name */
    public final h f4365o;

    /* renamed from: p, reason: collision with root package name */
    public final l1 f4366p;

    /* renamed from: q, reason: collision with root package name */
    public final a1 f4367q;

    /* renamed from: r, reason: collision with root package name */
    public final e2 f4368r;

    /* renamed from: s, reason: collision with root package name */
    public final q5 f4369s;
    public final r6 t;

    /* renamed from: u, reason: collision with root package name */
    public final x0 f4370u;

    /* renamed from: v, reason: collision with root package name */
    public final b.z f4371v;

    /* renamed from: w, reason: collision with root package name */
    public final s4 f4372w;

    /* renamed from: x, reason: collision with root package name */
    public final k3 f4373x;

    /* renamed from: y, reason: collision with root package name */
    public final a f4374y;

    /* renamed from: z, reason: collision with root package name */
    public final l4 f4375z;
    public boolean G = false;
    public AtomicInteger P = new AtomicInteger(0);

    public j2(i3 i3Var) {
        Bundle bundle;
        int i10 = 0;
        Context context = i3Var.f4317a;
        nc.g0 g0Var = new nc.g0();
        this.f = g0Var;
        x6.b.f17193c = g0Var;
        this.f4360a = context;
        this.f4361b = i3Var.f4318b;
        this.f4362c = i3Var.f4319c;
        this.f4363d = i3Var.f4320d;
        this.f4364e = i3Var.f4323h;
        this.J = i3Var.f4321e;
        this.A = i3Var.f4325j;
        int i11 = 1;
        this.M = true;
        zzdz zzdzVar = i3Var.f4322g;
        if (zzdzVar != null && (bundle = zzdzVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.K = (Boolean) obj;
            }
            Object obj2 = zzdzVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.L = (Boolean) obj2;
            }
        }
        zzhx.zzb(context);
        this.f4371v = b.z.f1662p;
        Long l10 = i3Var.f4324i;
        this.Q = l10 != null ? l10.longValue() : System.currentTimeMillis();
        this.f4365o = new h(this);
        l1 l1Var = new l1(this);
        l1Var.n();
        this.f4366p = l1Var;
        a1 a1Var = new a1(this);
        a1Var.n();
        this.f4367q = a1Var;
        r6 r6Var = new r6(this);
        r6Var.n();
        this.t = r6Var;
        this.f4370u = new x0(new b1.v(this, i10));
        this.f4374y = new a(this);
        s4 s4Var = new s4(this);
        s4Var.u();
        this.f4372w = s4Var;
        k3 k3Var = new k3(this);
        k3Var.u();
        this.f4373x = k3Var;
        q5 q5Var = new q5(this);
        q5Var.u();
        this.f4369s = q5Var;
        l4 l4Var = new l4(this);
        l4Var.n();
        this.f4375z = l4Var;
        e2 e2Var = new e2(this);
        e2Var.n();
        this.f4368r = e2Var;
        zzdz zzdzVar2 = i3Var.f4322g;
        if (zzdzVar2 != null && zzdzVar2.zzb != 0) {
            i10 = 1;
        }
        int i12 = i10 ^ 1;
        if (context.getApplicationContext() instanceof Application) {
            k3 k10 = k();
            if (k10.zza().getApplicationContext() instanceof Application) {
                Application application = (Application) k10.zza().getApplicationContext();
                if (k10.f4421d == null) {
                    k10.f4421d = new i4(k10);
                }
                if (i12 != 0) {
                    application.unregisterActivityLifecycleCallbacks(k10.f4421d);
                    application.registerActivityLifecycleCallbacks(k10.f4421d);
                    k10.zzj().f4067w.b("Registered activity lifecycle callback");
                }
            }
        } else {
            zzj().f4063r.b("Application context is not an Application");
        }
        e2Var.u(new l6.q0(i11, this, i3Var));
    }

    public static j2 a(Context context, zzdz zzdzVar, Long l10) {
        Bundle bundle;
        if (zzdzVar != null && (zzdzVar.zze == null || zzdzVar.zzf == null)) {
            zzdzVar = new zzdz(zzdzVar.zza, zzdzVar.zzb, zzdzVar.zzc, zzdzVar.zzd, null, null, zzdzVar.zzg, null);
        }
        m6.j.i(context);
        m6.j.i(context.getApplicationContext());
        if (R == null) {
            synchronized (j2.class) {
                if (R == null) {
                    R = new j2(new i3(context, zzdzVar, l10));
                }
            }
        } else if (zzdzVar != null && (bundle = zzdzVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            m6.j.i(R);
            R.J = Boolean.valueOf(zzdzVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        m6.j.i(R);
        return R;
    }

    public static void b(j0 j0Var) {
        if (j0Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!j0Var.f4356c) {
            throw new IllegalStateException(defpackage.f.j("Component not initialized: ", String.valueOf(j0Var.getClass())));
        }
    }

    public static void c(d3 d3Var) {
        if (d3Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!d3Var.f4148c) {
            throw new IllegalStateException(defpackage.f.j("Component not initialized: ", String.valueOf(d3Var.getClass())));
        }
    }

    public final boolean d() {
        return f() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r5.I) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r5 = this;
            boolean r0 = r5.G
            if (r0 == 0) goto Lc4
            e7.e2 r0 = r5.zzl()
            r0.l()
            java.lang.Boolean r0 = r5.H
            if (r0 == 0) goto L33
            long r1 = r5.I
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L33
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lbd
            b.z r0 = r5.f4371v
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r5.I
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lbd
        L33:
            b.z r0 = r5.f4371v
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.I = r0
            e7.r6 r0 = r5.m()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.q0(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L7e
            e7.r6 r0 = r5.m()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.q0(r3)
            if (r0 == 0) goto L7e
            android.content.Context r0 = r5.f4360a
            x6.c r0 = x6.d.a(r0)
            boolean r0 = r0.c()
            if (r0 != 0) goto L7c
            e7.h r0 = r5.f4365o
            boolean r0 = r0.C()
            if (r0 != 0) goto L7c
            android.content.Context r0 = r5.f4360a
            boolean r0 = e7.r6.R(r0)
            if (r0 == 0) goto L7e
            android.content.Context r0 = r5.f4360a
            boolean r0 = e7.r6.c0(r0)
            if (r0 == 0) goto L7e
        L7c:
            r0 = r1
            goto L7f
        L7e:
            r0 = r2
        L7f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.H = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbd
            e7.r6 r0 = r5.m()
            e7.t0 r3 = r5.h()
            java.lang.String r3 = r3.w()
            e7.t0 r4 = r5.h()
            r4.t()
            java.lang.String r4 = r4.f4664w
            boolean r0 = r0.V(r3, r4)
            if (r0 != 0) goto Lb7
            e7.t0 r0 = r5.h()
            r0.t()
            java.lang.String r0 = r0.f4664w
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb6
            goto Lb7
        Lb6:
            r1 = r2
        Lb7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.H = r0
        Lbd:
            java.lang.Boolean r0 = r5.H
            boolean r0 = r0.booleanValue()
            return r0
        Lc4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.j2.e():boolean");
    }

    public final int f() {
        zzl().l();
        if (this.f4365o.B()) {
            return 1;
        }
        Boolean bool = this.L;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzl().l();
        if (!this.M) {
            return 8;
        }
        Boolean z10 = j().z();
        if (z10 != null) {
            return z10.booleanValue() ? 0 : 3;
        }
        Boolean v10 = this.f4365o.v("firebase_analytics_collection_enabled");
        if (v10 != null) {
            return v10.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.K;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.J == null || this.J.booleanValue()) ? 0 : 7;
    }

    public final z g() {
        c(this.D);
        return this.D;
    }

    public final t0 h() {
        b(this.E);
        return this.E;
    }

    public final x0 i() {
        return this.f4370u;
    }

    public final l1 j() {
        l1 l1Var = this.f4366p;
        if (l1Var != null) {
            return l1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    public final k3 k() {
        b(this.f4373x);
        return this.f4373x;
    }

    public final w4 l() {
        b(this.C);
        return this.C;
    }

    public final r6 m() {
        r6 r6Var = this.t;
        if (r6Var != null) {
            return r6Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Override // e7.c3
    public final Context zza() {
        return this.f4360a;
    }

    @Override // e7.c3
    public final v6.b zzb() {
        return this.f4371v;
    }

    @Override // e7.c3
    public final nc.g0 zzd() {
        return this.f;
    }

    @Override // e7.c3
    public final a1 zzj() {
        c(this.f4367q);
        return this.f4367q;
    }

    @Override // e7.c3
    public final e2 zzl() {
        c(this.f4368r);
        return this.f4368r;
    }
}

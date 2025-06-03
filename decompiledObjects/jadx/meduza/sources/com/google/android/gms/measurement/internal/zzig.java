package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b.z;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.measurement.internal.zzig;
import defpackage.g;
import e7.a1;
import e7.a3;
import e7.b3;
import e7.b6;
import e7.d6;
import e7.e;
import e7.f;
import e7.f0;
import e7.f6;
import e7.h0;
import e7.i6;
import e7.k2;
import e7.k6;
import e7.l2;
import e7.n;
import e7.n2;
import e7.n6;
import e7.o;
import e7.o2;
import e7.o6;
import e7.p0;
import e7.p2;
import e7.q2;
import e7.q6;
import e7.r2;
import e7.r6;
import e7.s0;
import e7.s6;
import e7.t2;
import e7.u2;
import e7.v1;
import e7.v2;
import e7.w2;
import e7.x2;
import e7.y2;
import e7.z2;
import j6.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import m6.j;
import v6.h;

/* loaded from: classes.dex */
public final class zzig extends zzfy {

    /* renamed from: a, reason: collision with root package name */
    public final i6 f2908a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f2909b;

    /* renamed from: c, reason: collision with root package name */
    public String f2910c;

    public zzig(i6 i6Var) {
        j.i(i6Var);
        this.f2908a = i6Var;
        this.f2910c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0109, code lost:
    
        if (java.lang.System.currentTimeMillis() > (15000 + r3)) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zza(com.google.android.gms.measurement.internal.zzig r21, android.os.Bundle r22, java.lang.String r23, e7.k6 r24) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzig.zza(com.google.android.gms.measurement.internal.zzig, android.os.Bundle, java.lang.String, e7.k6):void");
    }

    public static /* synthetic */ void zza(zzig zzigVar, k6 k6Var) {
        zzigVar.f2908a.c0();
        zzigVar.f2908a.W(k6Var);
    }

    public static /* synthetic */ void zzb(zzig zzigVar, k6 k6Var) {
        zzigVar.f2908a.c0();
        zzigVar.f2908a.U(k6Var);
    }

    @Override // e7.n0
    public final void C(k6 k6Var) {
        j.e(k6Var.f4437a);
        j.i(k6Var.C);
        r(new r2(this, k6Var, 1));
    }

    @Override // e7.n0
    public final void E0(k6 k6Var) {
        e3(k6Var);
        f3(new l2(this, k6Var, 1));
    }

    @Override // e7.n0
    public final void F(f fVar, k6 k6Var) {
        j.i(fVar);
        j.i(fVar.f4184c);
        e3(k6Var);
        f fVar2 = new f(fVar);
        fVar2.f4182a = k6Var.f4437a;
        f3(new k2(this, fVar2, k6Var));
    }

    @Override // e7.n0
    public final void M1(k6 k6Var, e eVar) {
        if (this.f2908a.R().x(null, h0.K0)) {
            e3(k6Var);
            f3(new k2(this, k6Var, eVar));
        }
    }

    @Override // e7.n0
    public final void M2(k6 k6Var) {
        j.e(k6Var.f4437a);
        d3(k6Var.f4437a, false);
        f3(new l2(this, k6Var, 2));
    }

    @Override // e7.n0
    public final void N1(k6 k6Var, d6 d6Var, s0 s0Var) {
        if (this.f2908a.R().x(null, h0.K0)) {
            e3(k6Var);
            String str = k6Var.f4437a;
            j.i(str);
            this.f2908a.zzl().u(new o2(this, str, d6Var, s0Var, 0));
        }
    }

    @Override // e7.n0
    public final List<q6> O2(String str, String str2, boolean z10, k6 k6Var) {
        e3(k6Var);
        String str3 = k6Var.f4437a;
        j.i(str3);
        try {
            List<s6> list = (List) this.f2908a.zzl().p(new u2(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s6 s6Var : list) {
                if (z10 || !r6.r0(s6Var.f4651c)) {
                    arrayList.add(new q6(s6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f2908a.zzj().f4060o.d("Failed to query user properties. appId", a1.p(k6Var.f4437a), e10);
            return Collections.emptyList();
        }
    }

    @Override // e7.n0
    public final List<f> T2(String str, String str2, k6 k6Var) {
        e3(k6Var);
        String str3 = k6Var.f4437a;
        j.i(str3);
        try {
            return (List) this.f2908a.zzl().p(new w2(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f2908a.zzj().f4060o.c("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // e7.n0
    public final void V(f0 f0Var, k6 k6Var) {
        j.i(f0Var);
        e3(k6Var);
        f3(new x2(this, f0Var, k6Var, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e7.n0
    public final String V1(k6 k6Var) {
        e3(k6Var);
        i6 i6Var = this.f2908a;
        try {
            return (String) i6Var.zzl().p(new y2(i6Var, k6Var, 1)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            i6Var.zzj().f4060o.d("Failed to get app instance id. appId", a1.p(k6Var.f4437a), e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e7.n0
    public final byte[] V2(f0 f0Var, String str) {
        j.e(str);
        j.i(f0Var);
        d3(str, true);
        this.f2908a.zzj().f4066v.c("Log and bundle. event", this.f2908a.t.f4370u.c(f0Var.f4192a));
        ((z) this.f2908a.zzb()).getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f2908a.zzl().t(new z2(this, f0Var, str)).get();
            if (bArr == null) {
                this.f2908a.zzj().f4060o.c("Log and bundle returned null. appId", a1.p(str));
                bArr = new byte[0];
            }
            ((z) this.f2908a.zzb()).getClass();
            this.f2908a.zzj().f4066v.a(this.f2908a.t.f4370u.c(f0Var.f4192a), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime), "Log and bundle processed. event, size, time_ms");
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f2908a.zzj().f4060o.a(a1.p(str), this.f2908a.t.f4370u.c(f0Var.f4192a), e10, "Failed to log and bundle. appId, event, error");
            return null;
        }
    }

    @Override // e7.n0
    public final void Y1(k6 k6Var) {
        e3(k6Var);
        f3(new r2(this, k6Var, 0));
    }

    @Override // e7.n0
    public final void d1(long j10, String str, String str2, String str3) {
        f3(new q2(this, str2, str3, str, j10));
    }

    public final void d3(String str, boolean z10) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            this.f2908a.zzj().f4060o.b("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f2909b == null) {
                    if (!"com.google.android.gms".equals(this.f2910c) && !h.a(this.f2908a.t.f4360a, Binder.getCallingUid()) && !k.a(this.f2908a.t.f4360a).b(Binder.getCallingUid())) {
                        z11 = false;
                        this.f2909b = Boolean.valueOf(z11);
                    }
                    z11 = true;
                    this.f2909b = Boolean.valueOf(z11);
                }
                if (this.f2909b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f2908a.zzj().f4060o.c("Measurement Service called with invalid calling package. appId", a1.p(str));
                throw e10;
            }
        }
        if (this.f2910c == null) {
            Context context = this.f2908a.t.f4360a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = j6.j.f8500a;
            if (h.b(context, str, callingUid)) {
                this.f2910c = str;
            }
        }
        if (str.equals(this.f2910c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    public final void e3(k6 k6Var) {
        j.i(k6Var);
        j.e(k6Var.f4437a);
        d3(k6Var.f4437a, false);
        this.f2908a.b0().V(k6Var.f4438b, k6Var.f4450x);
    }

    public final void f3(Runnable runnable) {
        if (this.f2908a.zzl().w()) {
            runnable.run();
        } else {
            this.f2908a.zzl().u(runnable);
        }
    }

    public final void g(f0 f0Var, String str, String str2) {
        j.i(f0Var);
        j.e(str);
        d3(str, true);
        f3(new x2(this, f0Var, str, 1));
    }

    @Override // e7.n0
    public final void g0(q6 q6Var, k6 k6Var) {
        j.i(q6Var);
        e3(k6Var);
        f3(new v1(this, q6Var, k6Var, 1));
    }

    @Override // e7.n0
    public final List<q6> h0(String str, String str2, String str3, boolean z10) {
        d3(str, true);
        try {
            List<s6> list = (List) this.f2908a.zzl().p(new t2(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s6 s6Var : list) {
                if (z10 || !r6.r0(s6Var.f4651c)) {
                    arrayList.add(new q6(s6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f2908a.zzj().f4060o.d("Failed to get user properties as. appId", a1.p(str), e10);
            return Collections.emptyList();
        }
    }

    @Override // e7.n0
    public final List<f> h1(String str, String str2, String str3) {
        d3(str, true);
        try {
            return (List) this.f2908a.zzl().p(new v2(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f2908a.zzj().f4060o.c("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // e7.n0
    public final void h2(final k6 k6Var, final Bundle bundle, final p0 p0Var) {
        e3(k6Var);
        final String str = k6Var.f4437a;
        j.i(str);
        this.f2908a.zzl().u(new Runnable() { // from class: e7.m2
            @Override // java.lang.Runnable
            public final void run() {
                zzig.zza(zzig.this, k6Var, bundle, p0Var, str);
            }
        });
    }

    @Override // e7.n0
    public final void k0(k6 k6Var) {
        j.e(k6Var.f4437a);
        j.i(k6Var.C);
        r(new n2(this, k6Var, 0));
    }

    @Override // e7.n0
    public final void l1(k6 k6Var) {
        j.e(k6Var.f4437a);
        j.i(k6Var.C);
        r(new l2(this, k6Var, 0));
    }

    @Override // e7.n0
    public final List m(Bundle bundle, k6 k6Var) {
        e3(k6Var);
        j.i(k6Var.f4437a);
        try {
            if (!this.f2908a.R().x(null, h0.f4241d1)) {
                return (List) this.f2908a.zzl().p(new b3(this, k6Var, bundle)).get();
            }
            try {
                return (List) this.f2908a.zzl().t(new a3(this, k6Var, bundle)).get(10000L, TimeUnit.MILLISECONDS);
            } catch (TimeoutException e10) {
                e = e10;
                this.f2908a.zzj().f4060o.d("Failed to get trigger URIs. appId", a1.p(k6Var.f4437a), e);
                return Collections.emptyList();
            }
        } catch (InterruptedException e11) {
            e = e11;
        } catch (ExecutionException e12) {
            e = e12;
        }
    }

    @Override // e7.n0
    /* renamed from: m, reason: collision with other method in class */
    public final void mo0m(Bundle bundle, k6 k6Var) {
        e3(k6Var);
        String str = k6Var.f4437a;
        j.i(str);
        f3(new p2(this, bundle, str, k6Var));
    }

    public final void r(Runnable runnable) {
        if (this.f2908a.zzl().w()) {
            runnable.run();
        } else {
            this.f2908a.zzl().v(runnable);
        }
    }

    @Override // e7.n0
    public final void r2(k6 k6Var) {
        e3(k6Var);
        f3(new n2(this, k6Var, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e7.n0
    public final n v1(k6 k6Var) {
        e3(k6Var);
        j.e(k6Var.f4437a);
        try {
            return (n) this.f2908a.zzl().t(new y2(this, k6Var, 0)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f2908a.zzj().f4060o.d("Failed to get consent. appId", a1.p(k6Var.f4437a), e10);
            return new n(null);
        }
    }

    public static void zza(zzig zzigVar, k6 k6Var, Bundle bundle, p0 p0Var, String str) {
        zzigVar.f2908a.c0();
        try {
            p0Var.zza(zzigVar.f2908a.j(bundle, k6Var));
        } catch (RemoteException e10) {
            zzigVar.f2908a.zzj().f4060o.d("Failed to return trigger URIs for app", str, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zza(com.google.android.gms.measurement.internal.zzig r28, e7.k6 r29, e7.e r30) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzig.zza(com.google.android.gms.measurement.internal.zzig, e7.k6, e7.e):void");
    }

    public static void zza(zzig zzigVar, String str, d6 d6Var, s0 s0Var) {
        f6 f6Var;
        zzigVar.f2908a.c0();
        i6 i6Var = zzigVar.f2908a;
        if (!i6Var.R().x(null, h0.K0)) {
            f6Var = new f6(Collections.emptyList());
        } else {
            a0.j.q(i6Var);
            o oVar = i6Var.f4332c;
            i6.q(oVar);
            List<n6> C = oVar.C(str, d6Var, h0.f4279x.a(null).intValue());
            ArrayList arrayList = new ArrayList();
            for (n6 n6Var : C) {
                if (i6Var.V(n6Var.f4522c)) {
                    Bundle bundle = new Bundle();
                    for (Map.Entry<String, String> entry : n6Var.f4523d.entrySet()) {
                        bundle.putString(entry.getKey(), entry.getValue());
                    }
                    b6 b6Var = new b6(n6Var.f4520a, n6Var.f4521b.zzce(), n6Var.f4522c, bundle, g.a(n6Var.f4524e), n6Var.f, "");
                    try {
                        zzgf.zzj.zzb zzbVar = (zzgf.zzj.zzb) o6.z(zzgf.zzj.zzb(), b6Var.f4118b);
                        for (int i10 = 0; i10 < zzbVar.zza(); i10++) {
                            zzgf.zzk.zza zzch = zzbVar.zza(i10).zzch();
                            ((z) i6Var.zzb()).getClass();
                            zzbVar.zza(i10, zzch.zzl(System.currentTimeMillis()));
                        }
                        b6Var.f4118b = ((zzgf.zzj) ((zzkg) zzbVar.zzaj())).zzce();
                        if (i6Var.zzj().u(2)) {
                            o6 o6Var = i6Var.f4335o;
                            i6.q(o6Var);
                            b6Var.f4122o = o6Var.C((zzgf.zzj) ((zzkg) zzbVar.zzaj()));
                        }
                        arrayList.add(b6Var);
                    } catch (zzkp unused) {
                        i6Var.zzj().f4063r.c("Failed to parse queued batch. appId", str);
                    }
                }
            }
            f6Var = new f6(arrayList);
        }
        try {
            s0Var.E(f6Var);
        } catch (RemoteException e10) {
            zzigVar.f2908a.zzj().f4060o.d("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }
}

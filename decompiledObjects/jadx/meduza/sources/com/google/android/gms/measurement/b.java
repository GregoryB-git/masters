package com.google.android.gms.measurement;

import android.os.Bundle;
import android.os.SystemClock;
import b.z;
import com.google.android.gms.measurement.AppMeasurement;
import e7.b1;
import e7.e4;
import e7.f4;
import e7.j2;
import e7.k3;
import e7.q4;
import e7.q6;
import e7.r6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m6.j;
import nc.g0;

/* loaded from: classes.dex */
public final class b extends AppMeasurement.a {

    /* renamed from: a, reason: collision with root package name */
    public final j2 f2898a;

    /* renamed from: b, reason: collision with root package name */
    public final k3 f2899b;

    public b(j2 j2Var) {
        j.i(j2Var);
        this.f2898a = j2Var;
        this.f2899b = j2Var.k();
    }

    @Override // e7.j4
    public final void a(String str, String str2, Bundle bundle) {
        this.f2898a.k().a(str, str2, bundle);
    }

    @Override // e7.j4
    public final List<Bundle> b(String str, String str2) {
        k3 k3Var = this.f2899b;
        if (k3Var.zzl().w()) {
            k3Var.zzj().f4060o.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (g0.d()) {
            k3Var.zzj().f4060o.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        ((j2) k3Var.f3407b).zzl().q(atomicReference, 5000L, "get conditional user properties", new e4(k3Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return r6.g0(list);
        }
        k3Var.zzj().f4060o.c("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    @Override // e7.j4
    public final Map<String, Object> c(String str, String str2, boolean z10) {
        b1 b1Var;
        String str3;
        k3 k3Var = this.f2899b;
        if (k3Var.zzl().w()) {
            b1Var = k3Var.zzj().f4060o;
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!g0.d()) {
                AtomicReference atomicReference = new AtomicReference();
                ((j2) k3Var.f3407b).zzl().q(atomicReference, 5000L, "get user properties", new f4(k3Var, atomicReference, str, str2, z10));
                List<q6> list = (List) atomicReference.get();
                if (list == null) {
                    k3Var.zzj().f4060o.c("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
                    return Collections.emptyMap();
                }
                r.b bVar = new r.b(list.size());
                for (q6 q6Var : list) {
                    Object D = q6Var.D();
                    if (D != null) {
                        bVar.put(q6Var.f4599b, D);
                    }
                }
                return bVar;
            }
            b1Var = k3Var.zzj().f4060o;
            str3 = "Cannot get user properties from main thread";
        }
        b1Var.b(str3);
        return Collections.emptyMap();
    }

    @Override // e7.j4
    public final void d(String str, String str2, Bundle bundle) {
        k3 k3Var = this.f2899b;
        ((z) k3Var.zzb()).getClass();
        k3Var.E(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // e7.j4
    public final int zza(String str) {
        j.e(str);
        return 25;
    }

    @Override // e7.j4
    public final void zzb(String str) {
        j2 j2Var = this.f2898a;
        e7.a aVar = j2Var.f4374y;
        if (aVar == null) {
            throw new IllegalStateException("Component not created");
        }
        j2Var.f4371v.getClass();
        aVar.u(str, SystemClock.elapsedRealtime());
    }

    @Override // e7.j4
    public final void zzc(String str) {
        j2 j2Var = this.f2898a;
        e7.a aVar = j2Var.f4374y;
        if (aVar == null) {
            throw new IllegalStateException("Component not created");
        }
        j2Var.f4371v.getClass();
        aVar.x(str, SystemClock.elapsedRealtime());
    }

    @Override // e7.j4
    public final long zzf() {
        return this.f2898a.m().y0();
    }

    @Override // e7.j4
    public final String zzg() {
        return this.f2899b.f4424p.get();
    }

    @Override // e7.j4
    public final String zzh() {
        j2 j2Var = (j2) this.f2899b.f3407b;
        j2.b(j2Var.f4372w);
        q4 q4Var = j2Var.f4372w.f4640d;
        if (q4Var != null) {
            return q4Var.f4590b;
        }
        return null;
    }

    @Override // e7.j4
    public final String zzi() {
        j2 j2Var = (j2) this.f2899b.f3407b;
        j2.b(j2Var.f4372w);
        q4 q4Var = j2Var.f4372w.f4640d;
        if (q4Var != null) {
            return q4Var.f4589a;
        }
        return null;
    }

    @Override // e7.j4
    public final String zzj() {
        return this.f2899b.f4424p.get();
    }

    @Override // e7.j4
    public final void zza(Bundle bundle) {
        k3 k3Var = this.f2899b;
        ((z) k3Var.zzb()).getClass();
        k3Var.w(bundle, System.currentTimeMillis());
    }
}

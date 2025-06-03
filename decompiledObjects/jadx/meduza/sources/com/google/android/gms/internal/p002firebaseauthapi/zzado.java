package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import b8.c0;
import b8.g0;
import b8.k0;
import b8.m0;
import b8.p0;
import b8.w;
import java.util.concurrent.ScheduledExecutorService;
import m6.j;
import p6.a;
import u7.f;

/* loaded from: classes.dex */
public final class zzado {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzzv zzb;
    private final zzafd zzc;

    public zzado(f fVar, ScheduledExecutorService scheduledExecutorService) {
        j.i(fVar);
        fVar.a();
        Context context = fVar.f15084a;
        j.i(context);
        this.zzb = new zzzv(new zzaec(fVar, zzaed.zza()));
        this.zzc = new zzafd(context, scheduledExecutorService);
    }

    private static boolean zza(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.f("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void zza(w wVar, String str, String str2, String str3, zzadm zzadmVar) {
        zzaga zza2;
        j.i(wVar);
        j.f("cachedTokenState should not be empty.", str);
        j.i(zzadmVar);
        if (wVar instanceof g0) {
            c0 c0Var = ((g0) wVar).f2079a;
            String str4 = c0Var.f2054a;
            j.i(str4);
            String str5 = c0Var.f2055b;
            j.i(str5);
            zza2 = zzage.zza(str, str4, str5, str2, str3);
        } else {
            if (!(wVar instanceof k0)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            k0 k0Var = (k0) wVar;
            m0 m0Var = k0Var.f2100b;
            j.i(m0Var);
            j.e(str2);
            String j10 = m0Var.j();
            j.e(j10);
            String str6 = k0Var.f2099a;
            j.e(str6);
            zza2 = zzagg.zza(str, str2, j10, str6, str3);
        }
        this.zzb.zza(zza2, str, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzafy zzafyVar, zzadm zzadmVar) {
        j.i(zzadmVar);
        j.i(zzafyVar.zzb());
        this.zzb.zza(zzafyVar.zzb(), zzafyVar.zzc(), new zzadp(zzadmVar, zza));
    }

    public final void zza(zzagn zzagnVar, zzadm zzadmVar) {
        j.i(zzagnVar);
        j.e(zzagnVar.zzd());
        j.i(zzadmVar);
        this.zzb.zza(zzagnVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzagp zzagpVar, zzadm zzadmVar) {
        j.i(zzagpVar);
        this.zzb.zza(zzagpVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzagu zzaguVar, zzadm zzadmVar) {
        j.i(zzaguVar);
        this.zzb.zza(zzaguVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzaha zzahaVar, zzadm zzadmVar) {
        j.i(zzadmVar);
        j.i(zzahaVar);
        String zzb = zzahaVar.zzb();
        j.e(zzb);
        this.zzb.zza(zzb, zzahaVar.zza(), new zzadp(zzadmVar, zza));
    }

    public final void zza(zzahd zzahdVar, zzadm zzadmVar) {
        j.i(zzahdVar);
        j.e(zzahdVar.zzb());
        j.i(zzadmVar);
        this.zzb.zza(zzahdVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzahf zzahfVar, zzadm zzadmVar) {
        j.i(zzahfVar);
        this.zzb.zza(zzahfVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzahk zzahkVar, zzadm zzadmVar) {
        j.i(zzadmVar);
        j.i(zzahkVar);
        String zzd = zzahkVar.zzd();
        zzadp zzadpVar = new zzadp(zzadmVar, zza);
        if (this.zzc.zzc(zzd)) {
            if (!zzahkVar.zze()) {
                this.zzc.zzb(zzadpVar, zzd);
                return;
            }
            this.zzc.zzb(zzd);
        }
        long zzb = zzahkVar.zzb();
        boolean zzf = zzahkVar.zzf();
        if (zza(zzb, zzf)) {
            zzahkVar.zza(new zzafn(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzadpVar, zzb, zzf);
        this.zzb.zza(zzahkVar, this.zzc.zza(zzadpVar, zzd));
    }

    public final void zza(zzaho zzahoVar, zzadm zzadmVar) {
        j.i(zzahoVar);
        j.i(zzadmVar);
        this.zzb.zzd(zzahoVar.zza(), new zzadp(zzadmVar, zza));
    }

    public final void zza(zzahv zzahvVar, zzadm zzadmVar) {
        j.i(zzadmVar);
        this.zzb.zza(zzahvVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzaic zzaicVar, zzadm zzadmVar) {
        j.i(zzaicVar);
        j.i(zzadmVar);
        this.zzb.zza(zzaicVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzaid zzaidVar, zzadm zzadmVar) {
        j.i(zzaidVar);
        j.i(zzadmVar);
        this.zzb.zza(zzaidVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzzr zzzrVar, zzadm zzadmVar) {
        j.i(zzadmVar);
        j.i(zzzrVar);
        c0 zza2 = zzzrVar.zza();
        j.i(zza2);
        this.zzb.zza(zzaex.zza(zza2), new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, p0 p0Var, zzadm zzadmVar) {
        j.e(str);
        j.i(p0Var);
        j.i(zzadmVar);
        this.zzb.zza(str, p0Var, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, zzadm zzadmVar) {
        j.e(str);
        j.i(zzadmVar);
        this.zzb.zza(str, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, zzaic zzaicVar, zzadm zzadmVar) {
        j.e(str);
        j.i(zzaicVar);
        j.i(zzadmVar);
        this.zzb.zza(str, zzaicVar, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, String str2, zzadm zzadmVar) {
        j.e(str);
        j.i(zzadmVar);
        this.zzb.zza(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, String str6, boolean z12, zzadm zzadmVar) {
        j.f("idToken should not be empty.", str);
        j.i(zzadmVar);
        zzadp zzadpVar = new zzadp(zzadmVar, zza);
        if (this.zzc.zzc(str2)) {
            zzafd zzafdVar = this.zzc;
            if (!z10) {
                zzafdVar.zzb(zzadpVar, str2);
                return;
            }
            zzafdVar.zzb(str2);
        }
        zzaht zza2 = zzaht.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j10, z12)) {
            zza2.zza(new zzafn(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzadpVar, j10, z12);
        this.zzb.zza(zza2, this.zzc.zza(zzadpVar, str2));
    }

    public final void zza(String str, String str2, String str3, zzadm zzadmVar) {
        j.f("cachedTokenState should not be empty.", str);
        j.f("uid should not be empty.", str2);
        j.i(zzadmVar);
        this.zzb.zza(str, str2, str3, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzadm zzadmVar) {
        j.e(str);
        j.e(str2);
        j.i(zzadmVar);
        this.zzb.zza(str, str2, str3, str4, new zzadp(zzadmVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzadm zzadmVar) {
        j.e(str);
        j.e(str2);
        j.e(str3);
        j.i(zzadmVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzadp(zzadmVar, zza));
    }

    public final void zzb(zzagn zzagnVar, zzadm zzadmVar) {
        j.i(zzagnVar);
        j.e(zzagnVar.zzc());
        j.i(zzadmVar);
        this.zzb.zzb(zzagnVar, new zzadp(zzadmVar, zza));
    }

    public final void zzb(String str, zzadm zzadmVar) {
        j.e(str);
        j.i(zzadmVar);
        this.zzb.zzb(str, new zzadp(zzadmVar, zza));
    }

    public final void zzb(String str, String str2, zzadm zzadmVar) {
        j.e(str);
        j.e(str2);
        j.i(zzadmVar);
        this.zzb.zzb(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzadm zzadmVar) {
        j.e(str);
        j.e(str2);
        j.i(zzadmVar);
        this.zzb.zzb(str, str2, str3, str4, new zzadp(zzadmVar, zza));
    }

    public final void zzc(zzagn zzagnVar, zzadm zzadmVar) {
        j.i(zzagnVar);
        this.zzb.zzc(zzagnVar, new zzadp(zzadmVar, zza));
    }

    public final void zzc(String str, zzadm zzadmVar) {
        j.e(str);
        j.i(zzadmVar);
        this.zzb.zzc(str, new zzadp(zzadmVar, zza));
    }

    public final void zzc(String str, String str2, zzadm zzadmVar) {
        j.e(str);
        j.e(str2);
        j.i(zzadmVar);
        this.zzb.zzc(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zzd(String str, zzadm zzadmVar) {
        j.i(zzadmVar);
        this.zzb.zze(str, new zzadp(zzadmVar, zza));
    }

    public final void zzd(String str, String str2, zzadm zzadmVar) {
        j.e(str);
        j.i(zzadmVar);
        this.zzb.zzd(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zze(String str, zzadm zzadmVar) {
        j.e(str);
        j.i(zzadmVar);
        this.zzb.zzf(str, new zzadp(zzadmVar, zza));
    }

    public final void zze(String str, String str2, zzadm zzadmVar) {
        j.e(str);
        this.zzb.zze(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zzf(String str, String str2, zzadm zzadmVar) {
        j.e(str);
        j.e(str2);
        j.i(zzadmVar);
        this.zzb.zzf(str, str2, new zzadp(zzadmVar, zza));
    }

    public final void zza(zzzq zzzqVar, zzadm zzadmVar) {
        j.i(zzzqVar);
        j.i(zzadmVar);
        String str = zzzqVar.zzb().f2088d;
        zzadp zzadpVar = new zzadp(zzadmVar, zza);
        if (this.zzc.zzc(str)) {
            if (!zzzqVar.zzh()) {
                this.zzc.zzb(zzadpVar, str);
                return;
            }
            this.zzc.zzb(str);
        }
        long zza2 = zzzqVar.zza();
        boolean zzi = zzzqVar.zzi();
        zzahr zza3 = zzahr.zza(zzzqVar.zze(), zzzqVar.zzb().f2085a, zzzqVar.zzb().f2088d, zzzqVar.zzd(), zzzqVar.zzg(), zzzqVar.zzf(), zzzqVar.zzc());
        if (zza(zza2, zzi)) {
            zza3.zza(new zzafn(this.zzc.zzb()));
        }
        this.zzc.zza(str, zzadpVar, zza2, zzi);
        this.zzb.zza(zza3, this.zzc.zza(zzadpVar, str));
    }

    public final void zza(String str, w wVar, String str2, zzadm zzadmVar) {
        zzzv zzzvVar;
        zzagc zza2;
        zzadp zzadpVar;
        j.e(str);
        j.i(wVar);
        j.i(zzadmVar);
        if (wVar instanceof g0) {
            c0 c0Var = ((g0) wVar).f2079a;
            zzzvVar = this.zzb;
            String str3 = c0Var.f2054a;
            j.i(str3);
            String str4 = c0Var.f2055b;
            j.i(str4);
            zza2 = zzagd.zza(str, str3, str4, str2);
            zzadpVar = new zzadp(zzadmVar, zza);
        } else {
            if (!(wVar instanceof k0)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            k0 k0Var = (k0) wVar;
            zzzvVar = this.zzb;
            String str5 = k0Var.f2099a;
            j.e(str5);
            String str6 = k0Var.f2101c;
            j.e(str6);
            zza2 = zzagf.zza(str, str5, str2, str6);
            zzadpVar = new zzadp(zzadmVar, zza);
        }
        zzzvVar.zza(zza2, zzadpVar);
    }
}

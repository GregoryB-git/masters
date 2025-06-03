package com.google.android.gms.internal.p002firebaseauthapi;

import b8.c1;
import b8.h;
import b8.p0;
import c8.p;
import com.google.android.gms.common.api.Status;
import m6.j;

/* loaded from: classes.dex */
public final class zzzv {
    private final zzaeu zza;

    public zzzv(zzaeu zzaeuVar) {
        j.i(zzaeuVar);
        this.zza = zzaeuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzafy zzafyVar, zzadp zzadpVar) {
        j.i(zzafyVar);
        j.i(zzadpVar);
        this.zza.zza(zzafyVar, new zzzy(this, zzadpVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagw zzagwVar, String str, String str2, Boolean bool, c1 c1Var, zzadp zzadpVar, zzaet zzaetVar) {
        j.i(zzagwVar);
        j.i(zzaetVar);
        j.i(zzadpVar);
        this.zza.zza(new zzagj(zzagwVar.zzc()), new zzaad(this, zzaetVar, str2, str, bool, c1Var, zzadpVar, zzagwVar));
    }

    public static /* synthetic */ void zza(zzzv zzzvVar, zzadp zzadpVar, zzagw zzagwVar, zzagl zzaglVar, zzahm zzahmVar, zzaet zzaetVar) {
        j.i(zzadpVar);
        j.i(zzagwVar);
        j.i(zzaglVar);
        j.i(zzahmVar);
        j.i(zzaetVar);
        zzzvVar.zza.zza(zzahmVar, new zzaaa(zzzvVar, zzahmVar, zzaglVar, zzadpVar, zzagwVar, zzaetVar));
    }

    public static /* synthetic */ void zza(zzzv zzzvVar, zzadp zzadpVar, zzagw zzagwVar, zzahm zzahmVar, zzaet zzaetVar) {
        j.i(zzadpVar);
        j.i(zzagwVar);
        j.i(zzahmVar);
        j.i(zzaetVar);
        zzzvVar.zza.zza(new zzagj(zzagwVar.zzc()), new zzaab(zzzvVar, zzaetVar, zzadpVar, zzagwVar, zzahmVar));
    }

    public static /* synthetic */ void zza(zzzv zzzvVar, zzadp zzadpVar, zzahn zzahnVar, zzaet zzaetVar) {
        j.i(zzadpVar);
        j.i(zzahnVar);
        j.i(zzaetVar);
        zzzvVar.zza.zza(zzahnVar, new zzaak(zzzvVar, zzadpVar, zzaetVar));
    }

    private final void zza(String str, zzaew<zzagw> zzaewVar) {
        j.i(zzaewVar);
        j.e(str);
        zzagw zzb = zzagw.zzb(str);
        if (zzb.zzg()) {
            zzaewVar.zza((zzaew<zzagw>) zzb);
        } else {
            this.zza.zza(new zzagk(zzb.zzd()), new zzabo(this, zzaewVar));
        }
    }

    private final void zzd(zzagn zzagnVar, zzadp zzadpVar) {
        j.i(zzagnVar);
        j.i(zzadpVar);
        this.zza.zza(zzagnVar, new zzabj(this, zzadpVar));
    }

    public final void zza(h hVar, String str, zzadp zzadpVar) {
        j.i(hVar);
        j.i(zzadpVar);
        if (hVar.f2084e) {
            zza(hVar.f2083d, new zzzz(this, hVar, str, zzadpVar));
        } else {
            zza(new zzafy(hVar, null, str), zzadpVar);
        }
    }

    public final void zza(zzaga zzagaVar, String str, zzadp zzadpVar) {
        j.i(zzagaVar);
        j.i(zzadpVar);
        zza(str, new zzaaw(this, zzagaVar, zzadpVar));
    }

    public final void zza(zzagc zzagcVar, zzadp zzadpVar) {
        j.i(zzagcVar);
        j.i(zzadpVar);
        this.zza.zza(zzagcVar, new zzaay(this, zzadpVar));
    }

    public final void zza(zzagn zzagnVar, zzadp zzadpVar) {
        j.e(zzagnVar.zzd());
        j.i(zzadpVar);
        zzd(zzagnVar, zzadpVar);
    }

    public final void zza(zzagp zzagpVar, zzadp zzadpVar) {
        j.i(zzagpVar);
        j.i(zzadpVar);
        this.zza.zza(zzagpVar, new zzabd(this, zzadpVar));
    }

    public final void zza(zzagu zzaguVar, zzadp zzadpVar) {
        j.i(zzaguVar);
        j.i(zzadpVar);
        this.zza.zza(zzaguVar, new zzaba(this, zzadpVar));
    }

    public final void zza(zzahd zzahdVar, zzadp zzadpVar) {
        j.e(zzahdVar.zzb());
        j.i(zzadpVar);
        this.zza.zza(zzahdVar, new zzaag(this, zzadpVar));
    }

    public final void zza(zzahf zzahfVar, zzadp zzadpVar) {
        this.zza.zza(zzahfVar, new zzabl(this, zzadpVar));
    }

    public final void zza(zzahk zzahkVar, zzadp zzadpVar) {
        j.e(zzahkVar.zzd());
        j.i(zzadpVar);
        this.zza.zza(zzahkVar, new zzaaj(this, zzadpVar));
    }

    public final void zza(zzahp zzahpVar, zzadp zzadpVar) {
        j.i(zzahpVar);
        j.i(zzadpVar);
        this.zza.zza(zzahpVar, new zzaax(this, zzahpVar, zzadpVar));
    }

    public final void zza(zzahr zzahrVar, zzadp zzadpVar) {
        j.i(zzahrVar);
        j.i(zzadpVar);
        this.zza.zza(zzahrVar, new zzabb(this, zzadpVar));
    }

    public final void zza(zzaic zzaicVar, zzadp zzadpVar) {
        j.i(zzaicVar);
        j.i(zzadpVar);
        zzaicVar.zzb(true);
        this.zza.zza(zzaicVar, new zzaau(this, zzadpVar));
    }

    public final void zza(zzaid zzaidVar, zzadp zzadpVar) {
        j.i(zzaidVar);
        j.i(zzadpVar);
        this.zza.zza(zzaidVar, new zzaah(this, zzadpVar));
    }

    public final void zza(zzaih zzaihVar, zzadp zzadpVar) {
        j.i(zzaihVar);
        j.i(zzadpVar);
        this.zza.zza(zzaihVar, new zzaai(this, zzadpVar));
    }

    public final void zza(String str, p0 p0Var, zzadp zzadpVar) {
        j.e(str);
        j.i(p0Var);
        j.i(zzadpVar);
        zza(str, new zzabk(this, p0Var, zzadpVar));
    }

    public final void zza(String str, zzadp zzadpVar) {
        j.e(str);
        j.i(zzadpVar);
        zza(str, new zzabe(this, zzadpVar));
    }

    public final void zza(String str, zzaic zzaicVar, zzadp zzadpVar) {
        j.e(str);
        j.i(zzaicVar);
        j.i(zzadpVar);
        zza(str, new zzaap(this, zzaicVar, zzadpVar));
    }

    public final void zza(String str, zzaih zzaihVar, zzadp zzadpVar) {
        j.e(str);
        j.i(zzaihVar);
        j.i(zzadpVar);
        zza(str, new zzaan(this, zzaihVar, zzadpVar));
    }

    public final void zza(String str, String str2, zzadp zzadpVar) {
        j.e(str);
        j.i(zzadpVar);
        zzahm zzahmVar = new zzahm();
        zzahmVar.zze(str);
        zzahmVar.zzh(str2);
        this.zza.zza(zzahmVar, new zzabp(this, zzadpVar));
    }

    public final void zza(String str, String str2, String str3, zzadp zzadpVar) {
        j.e(str);
        j.e(str2);
        j.i(zzadpVar);
        zza(str, new zzaas(this, str2, str3, zzadpVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzadp zzadpVar) {
        j.e(str);
        j.e(str2);
        j.i(zzadpVar);
        this.zza.zza(new zzahn(str, str2, null, str3, str4, null), new zzzx(this, zzadpVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzadp zzadpVar) {
        j.e(str);
        j.e(str2);
        j.e(str3);
        j.i(zzadpVar);
        zza(str3, new zzaal(this, str, str2, str4, str5, zzadpVar));
    }

    public final void zzb(zzagn zzagnVar, zzadp zzadpVar) {
        j.e(zzagnVar.zzc());
        j.i(zzadpVar);
        this.zza.zza(zzagnVar, new zzaaf(this, zzadpVar));
    }

    public final void zzb(String str, zzadp zzadpVar) {
        j.e(str);
        j.i(zzadpVar);
        this.zza.zza(new zzagk(str), new zzzu(this, zzadpVar));
    }

    public final void zzb(String str, String str2, zzadp zzadpVar) {
        j.e(str);
        j.e(str2);
        j.i(zzadpVar);
        zza(str, new zzabn(this, str2, zzadpVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzadp zzadpVar) {
        j.e(str);
        j.e(str2);
        j.i(zzadpVar);
        this.zza.zza(new zzaif(str, str2, str3, str4), new zzzw(this, zzadpVar));
    }

    public final void zzc(zzagn zzagnVar, zzadp zzadpVar) {
        zzd(zzagnVar, zzadpVar);
    }

    public final void zzc(String str, zzadp zzadpVar) {
        j.e(str);
        j.i(zzadpVar);
        zza(str, new zzabc(this, zzadpVar));
    }

    public final void zzc(String str, String str2, zzadp zzadpVar) {
        j.e(str);
        j.e(str2);
        j.i(zzadpVar);
        zza(str, new zzabm(this, str2, zzadpVar));
    }

    public final void zzd(String str, zzadp zzadpVar) {
        j.i(zzadpVar);
        this.zza.zza(str, new zzabg(this, zzadpVar));
    }

    public final void zzd(String str, String str2, zzadp zzadpVar) {
        j.e(str);
        j.i(zzadpVar);
        this.zza.zza(new zzahd(str, null, str2), new zzaae(this, zzadpVar));
    }

    public final void zze(String str, zzadp zzadpVar) {
        j.i(zzadpVar);
        this.zza.zza(new zzahn(str), new zzabi(this, zzadpVar));
    }

    public final void zze(String str, String str2, zzadp zzadpVar) {
        j.e(str);
        j.i(zzadpVar);
        this.zza.zza(new zzaft(str, str2), new zzaac(this, zzadpVar));
    }

    public final void zzf(String str, zzadp zzadpVar) {
        j.e(str);
        j.i(zzadpVar);
        zza(str, new zzaar(this, zzadpVar));
    }

    public final void zzf(String str, String str2, zzadp zzadpVar) {
        j.e(str);
        j.e(str2);
        j.i(zzadpVar);
        zza(str2, new zzaaq(this, str, zzadpVar));
    }

    public static void zza(zzzv zzzvVar, zzaie zzaieVar, zzadp zzadpVar, zzaet zzaetVar) {
        Status a10;
        if (!zzaieVar.zzo()) {
            zzzvVar.zza(new zzagw(zzaieVar.zzi(), zzaieVar.zze(), Long.valueOf(zzaieVar.zza()), "Bearer"), zzaieVar.zzh(), zzaieVar.zzg(), Boolean.valueOf(zzaieVar.zzn()), zzaieVar.zzb(), zzadpVar, zzaetVar);
            return;
        }
        c1 zzb = zzaieVar.zzb();
        String zzc = zzaieVar.zzc();
        String zzj = zzaieVar.zzj();
        if (zzaieVar.zzm()) {
            a10 = new Status(17012, null, null, null);
        } else {
            a10 = p.a(zzaieVar.zzd());
        }
        zzadpVar.zza(new zzzt(a10, zzb, zzc, zzj));
    }
}

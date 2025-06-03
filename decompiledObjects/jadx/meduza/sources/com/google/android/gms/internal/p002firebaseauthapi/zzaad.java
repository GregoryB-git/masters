package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import b8.c1;
import java.util.List;

/* loaded from: classes.dex */
final class zzaad implements zzaew<zzagm> {
    private final /* synthetic */ zzaet zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ c1 zze;
    private final /* synthetic */ zzadp zzf;
    private final /* synthetic */ zzagw zzg;

    public zzaad(zzzv zzzvVar, zzaet zzaetVar, String str, String str2, Boolean bool, c1 c1Var, zzadp zzadpVar, zzagw zzagwVar) {
        this.zza = zzaetVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = c1Var;
        this.zzf = zzadpVar;
        this.zzg = zzagwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagm zzagmVar) {
        zzahc zzahcVar;
        List<zzagl> zza = zzagmVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        boolean z10 = false;
        zzagl zzaglVar = zza.get(0);
        zzahb zzf = zzaglVar.zzf();
        List<zzahc> zza2 = zzf != null ? zzf.zza() : null;
        if (zza2 != null && !zza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                zzahcVar = zza2.get(0);
            } else {
                for (int i10 = 0; i10 < zza2.size(); i10++) {
                    if (zza2.get(i10).zzf().equals(this.zzb)) {
                        zzahcVar = zza2.get(i10);
                    }
                }
            }
            zzahcVar.zza(this.zzc);
            break;
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else if (zzaglVar.zzb() - zzaglVar.zza() < 1000) {
            z10 = true;
        }
        zzaglVar.zza(z10);
        zzaglVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzaglVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(str);
    }
}

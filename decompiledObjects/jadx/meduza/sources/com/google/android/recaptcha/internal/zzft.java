package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import nc.d0;
import nc.e0;
import rb.h;
import ub.e;
import x6.b;

/* loaded from: classes.dex */
public final class zzft implements zzfo {
    private final d0 zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(d0 d0Var, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = d0Var;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) {
        zzjh zzb = zzjh.zzb();
        int zza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            throw new zzce(5, 2, null);
        }
        int zzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(zzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (zza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        int i10 = zzbk.zza;
        int zzk = zzufVar.zzk();
        if (zzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbk.zza(zzk - 2, zza2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, e eVar) {
        Object b10 = e0.b(new zzfq(zzgdVar, list, this, null), eVar);
        return b10 == vb.a.f16085a ? b10 : h.f13851a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, e eVar) {
        Object b10 = e0.b(new zzfr(exc, zzgdVar, this, null), eVar);
        return b10 == vb.a.f16085a ? b10 : h.f13851a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        b.g0(this.zza, null, new zzfs(new zzgd(this.zzb), this, str, null), 3);
    }
}

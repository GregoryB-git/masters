package com.google.android.recaptcha.internal;

import b.z;
import lc.h;
import nc.e0;
import rb.c;
import ub.e;

/* loaded from: classes.dex */
public final class zzff {
    private final c zza;
    private final c zzb;
    private final c zzc;

    public zzff() {
        int i10 = zzav.zza;
        this.zza = z.n(zzfc.zza);
        this.zzb = z.n(zzfd.zza);
        this.zzc = z.n(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, e eVar) {
        try {
            String zzl = zzscVar.zzl();
            String zzM = zzscVar.zzM();
            zzaq zzf = zzffVar.zzf();
            String str = null;
            if (zzf != null && zzf.zzd(zzM)) {
                zzen zzf2 = zzekVar.zzf(25);
                try {
                    String zza = zzffVar.zzf().zza(zzM);
                    if (zza != null) {
                        zzf2.zza();
                        str = zza;
                    }
                } catch (Exception e10) {
                    zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzR, e10.getMessage()));
                }
                zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
            }
            if (str == null) {
                zzaq zzf3 = zzffVar.zzf();
                if (zzf3 != null) {
                    zzf3.zzb();
                }
                zzen zzf4 = zzekVar.zzf(23);
                try {
                    str = zzffVar.zzg().zzb(zzl);
                    zzf4.zza();
                    zzen zzf5 = zzekVar.zzf(24);
                    try {
                        zzaq zzf6 = zzffVar.zzf();
                        if (zzf6 != null) {
                            zzf6.zzc(zzM, str);
                        }
                        zzf5.zza();
                    } catch (Exception e11) {
                        zzf5.zzb(new zzbd(zzbb.zzk, zzba.zzT, e11.getMessage()));
                    }
                } catch (zzbd e12) {
                    zzf4.zzb(e12);
                    throw e12;
                }
            }
            return h.m0(zzscVar.zzk(), "JAVASCRIPT_TAG", str);
        } catch (Exception e13) {
            if (e13 instanceof zzbd) {
                throw e13;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e13.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, e eVar) {
        return e0.b(new zzfb(this, str, zztoVar, null), eVar);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, e eVar) {
        return zze(this, zzscVar, zzekVar, eVar);
    }
}

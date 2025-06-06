package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import com.google.android.gms.internal.p002firebaseauthapi.zzqf;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import defpackage.f;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzrh {
    private static final zzzn zza;
    private static final zzou<zzqf, zzpm> zzb;
    private static final zzoq<zzpm> zzc;
    private static final zznh<zzqa, zzpn> zzd;
    private static final zznd<zzpn> zze;

    static {
        zzzn zzb2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzb2;
        zzb = zzou.zza(new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzow
            public final zzpq zza(zzcg zzcgVar) {
                zzpm zzb3;
                zzb3 = zzpm.zzb((zzwf) ((zzakg) zzwf.zza().zza("type.googleapis.com/google.crypto.tink.AesCmacKey").zza(((zzsd) ((zzakg) zzsd.zzb().zza(zzrh.zzb(r1)).zza(r1.zzc()).zze())).zzj()).zza(zzrh.zza(((zzqf) zzcgVar).zze())).zze()));
                return zzb3;
            }
        }, zzqf.class, zzpm.class);
        zzc = zzoq.zza(new zzos() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzos
            public final zzcg zza(zzpq zzpqVar) {
                zzqf zzb3;
                zzb3 = zzrh.zzb((zzpm) zzpqVar);
                return zzb3;
            }
        }, zzb2, zzpm.class);
        zzd = zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
            public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                zzpn zza2;
                zza2 = zzpn.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzsa) ((zzakg) zzsa.zzb().zza(zzrh.zzb(r1.zzc())).zza(zzaiw.zza(r1.zze().zza(zzcm.zza(zzcmVar)))).zze())).zzj(), zzwb.zza.SYMMETRIC, zzrh.zza(r1.zzc().zze()), ((zzqa) zzboVar).zza());
                return zza2;
            }
        }, zzqa.class, zzpn.class);
        zze = zznd.zza(new zznf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
            public final zzbo zza(zzpq zzpqVar, zzcm zzcmVar) {
                zzqa zzb3;
                zzb3 = zzrh.zzb((zzpn) zzpqVar, zzcmVar);
                return zzb3;
            }
        }, zzb2, zzpn.class);
    }

    private static zzqf.zza zza(zzxd zzxdVar) {
        int i10 = zzro.zza[zzxdVar.ordinal()];
        if (i10 == 1) {
            return zzqf.zza.zza;
        }
        if (i10 == 2) {
            return zzqf.zza.zzb;
        }
        if (i10 == 3) {
            return zzqf.zza.zzc;
        }
        if (i10 == 4) {
            return zzqf.zza.zzd;
        }
        throw new GeneralSecurityException(j.g("Unable to parse OutputPrefixType: ", zzxdVar.zza()));
    }

    public static void zza() {
        zzom zza2 = zzom.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqa zzb(zzpn zzpnVar, zzcm zzcmVar) {
        if (!zzpnVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzsa zza2 = zzsa.zza(zzpnVar.zzd(), zzajv.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzqa.zzb().zza(zzqf.zzd().zza(zza2.zze().zzb()).zzb(zza2.zzd().zza()).zza(zza(zzpnVar.zzc())).zza()).zza(zzzo.zza(zza2.zze().zzd(), zzcm.zza(zzcmVar))).zza(zzpnVar.zze()).zza();
        } catch (zzakm | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqf zzb(zzpm zzpmVar) {
        if (!zzpmVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException(f.j("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", zzpmVar.zza().zzf()));
        }
        try {
            zzsd zza2 = zzsd.zza(zzpmVar.zza().zze(), zzajv.zza());
            return zzqf.zzd().zza(zza2.zza()).zzb(zza2.zzd().zza()).zza(zza(zzpmVar.zza().zzd())).zza();
        } catch (zzakm e10) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
        }
    }

    private static zzsg zzb(zzqf zzqfVar) {
        return (zzsg) ((zzakg) zzsg.zzb().zza(zzqfVar.zzb()).zze());
    }

    private static zzxd zza(zzqf.zza zzaVar) {
        if (zzqf.zza.zza.equals(zzaVar)) {
            return zzxd.TINK;
        }
        if (zzqf.zza.zzb.equals(zzaVar)) {
            return zzxd.CRUNCHY;
        }
        if (zzqf.zza.zzd.equals(zzaVar)) {
            return zzxd.RAW;
        }
        if (zzqf.zza.zzc.equals(zzaVar)) {
            return zzxd.LEGACY;
        }
        throw new GeneralSecurityException(f.j("Unable to serialize variant: ", String.valueOf(zzaVar)));
    }
}

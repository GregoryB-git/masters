package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import com.google.android.gms.internal.p002firebaseauthapi.zzdk;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import defpackage.f;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgf {
    private static final zzzn zza;
    private static final zzou<zzdk, zzpm> zzb;
    private static final zzoq<zzpm> zzc;
    private static final zznh<zzdf, zzpn> zzd;
    private static final zznd<zzpn> zze;

    static {
        zzzn zzb2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzb2;
        zzb = zzou.zza(new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzow
            public final zzpq zza(zzcg zzcgVar) {
                zzpm zzb3;
                zzb3 = zzpm.zzb((zzwf) ((zzakg) zzwf.zza().zza("type.googleapis.com/google.crypto.tink.AesEaxKey").zza(((zztb) ((zzakg) zztb.zzb().zza(zzgf.zzb(r1)).zza(r1.zzc()).zze())).zzj()).zza(zzgf.zza(((zzdk) zzcgVar).zzf())).zze()));
                return zzb3;
            }
        }, zzdk.class, zzpm.class);
        zzc = zzoq.zza(new zzos() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzos
            public final zzcg zza(zzpq zzpqVar) {
                zzdk zzb3;
                zzb3 = zzgf.zzb((zzpm) zzpqVar);
                return zzb3;
            }
        }, zzb2, zzpm.class);
        zzd = zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
            public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                zzpn zza2;
                zza2 = zzpn.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzsy) ((zzakg) zzsy.zzb().zza(zzgf.zzb(r1.zzc())).zza(zzaiw.zza(r1.zze().zza(zzcm.zza(zzcmVar)))).zze())).zzj(), zzwb.zza.SYMMETRIC, zzgf.zza(r1.zzc().zzf()), ((zzdf) zzboVar).zza());
                return zza2;
            }
        }, zzdf.class, zzpn.class);
        zze = zznd.zza(new zznf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
            public final zzbo zza(zzpq zzpqVar, zzcm zzcmVar) {
                zzdf zzb3;
                zzb3 = zzgf.zzb((zzpn) zzpqVar, zzcmVar);
                return zzb3;
            }
        }, zzb2, zzpn.class);
    }

    private static zzdk.zzb zza(zzxd zzxdVar) {
        int i10 = zzgm.zza[zzxdVar.ordinal()];
        if (i10 == 1) {
            return zzdk.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzdk.zzb.zzb;
        }
        if (i10 == 4) {
            return zzdk.zzb.zzc;
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
    public static zzdf zzb(zzpn zzpnVar, zzcm zzcmVar) {
        if (!zzpnVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzsy zza2 = zzsy.zza(zzpnVar.zzd(), zzajv.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdf.zzb().zza(zzdk.zze().zzb(zza2.zze().zzb()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzpnVar.zzc())).zza()).zza(zzzo.zza(zza2.zze().zzd(), zzcm.zza(zzcmVar))).zza(zzpnVar.zze()).zza();
        } catch (zzakm unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdk zzb(zzpm zzpmVar) {
        if (!zzpmVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException(f.j("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", zzpmVar.zza().zzf()));
        }
        try {
            zztb zza2 = zztb.zza(zzpmVar.zza().zze(), zzajv.zza());
            return zzdk.zze().zzb(zza2.zza()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzpmVar.zza().zzd())).zza();
        } catch (zzakm e10) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
        }
    }

    private static zzte zzb(zzdk zzdkVar) {
        if (zzdkVar.zzd() == 16) {
            return (zzte) ((zzakg) zzte.zzb().zza(zzdkVar.zzb()).zze());
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(zzdkVar.zzd())));
    }

    private static zzxd zza(zzdk.zzb zzbVar) {
        if (zzdk.zzb.zza.equals(zzbVar)) {
            return zzxd.TINK;
        }
        if (zzdk.zzb.zzb.equals(zzbVar)) {
            return zzxd.CRUNCHY;
        }
        if (zzdk.zzb.zzc.equals(zzbVar)) {
            return zzxd.RAW;
        }
        throw new GeneralSecurityException(f.j("Unable to serialize variant: ", String.valueOf(zzbVar)));
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import com.google.android.gms.internal.p002firebaseauthapi.zzep;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import defpackage.f;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzer {
    private static final zzzn zza;
    private static final zzou<zzep, zzpm> zzb;
    private static final zzoq<zzpm> zzc;
    private static final zznh<zzen, zzpn> zzd;
    private static final zznd<zzpn> zze;

    static {
        zzzn zzb2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzb2;
        zzb = zzou.zza(new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzow
            public final zzpq zza(zzcg zzcgVar) {
                zzpm zzb3;
                zzb3 = zzpm.zzb((zzwf) ((zzakg) zzwf.zza().zza("type.googleapis.com/google.crypto.tink.KmsAeadKey").zza(((zzwu) ((zzakg) zzwu.zza().zza(r1.zzc()).zze())).zzj()).zza(zzer.zza(((zzep) zzcgVar).zzb())).zze()));
                return zzb3;
            }
        }, zzep.class, zzpm.class);
        zzc = zzoq.zza(new zzos() { // from class: com.google.android.gms.internal.firebase-auth-api.zzet
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzos
            public final zzcg zza(zzpq zzpqVar) {
                zzep zzb3;
                zzb3 = zzer.zzb((zzpm) zzpqVar);
                return zzb3;
            }
        }, zzb2, zzpm.class);
        zzd = zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzes
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
            public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                zzpn zza2;
                zza2 = zzpn.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzwr) ((zzakg) zzwr.zzb().zza((zzwu) ((zzakg) zzwu.zza().zza(r1.zzb().zzc()).zze())).zze())).zzj(), zzwb.zza.REMOTE, zzer.zza(r1.zzb().zzb()), ((zzen) zzboVar).zza());
                return zza2;
            }
        }, zzen.class, zzpn.class);
        zze = zznd.zza(new zznf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzev
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
            public final zzbo zza(zzpq zzpqVar, zzcm zzcmVar) {
                zzen zzb3;
                zzb3 = zzer.zzb((zzpn) zzpqVar, zzcmVar);
                return zzb3;
            }
        }, zzb2, zzpn.class);
    }

    private static zzep.zza zza(zzxd zzxdVar) {
        int i10 = zzeu.zza[zzxdVar.ordinal()];
        if (i10 == 1) {
            return zzep.zza.zza;
        }
        if (i10 == 2) {
            return zzep.zza.zzb;
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
    public static zzen zzb(zzpn zzpnVar, zzcm zzcmVar) {
        if (!zzpnVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzwr zza2 = zzwr.zza(zzpnVar.zzd(), zzajv.zza());
            if (zza2.zza() == 0) {
                return zzen.zza(zzep.zza(zza2.zzd().zzd(), zza(zzpnVar.zzc())), zzpnVar.zze());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(zza2));
        } catch (zzakm e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzep zzb(zzpm zzpmVar) {
        if (!zzpmVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException(f.j("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", zzpmVar.zza().zzf()));
        }
        try {
            return zzep.zza(zzwu.zza(zzpmVar.zza().zze(), zzajv.zza()).zzd(), zza(zzpmVar.zza().zzd()));
        } catch (zzakm e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
        }
    }

    private static zzxd zza(zzep.zza zzaVar) {
        if (zzep.zza.zza.equals(zzaVar)) {
            return zzxd.TINK;
        }
        if (zzep.zza.zzb.equals(zzaVar)) {
            return zzxd.RAW;
        }
        throw new GeneralSecurityException(f.j("Unable to serialize variant: ", String.valueOf(zzaVar)));
    }
}

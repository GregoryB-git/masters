package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import com.google.android.gms.internal.p002firebaseauthapi.zzfy;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import defpackage.f;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzib {
    private static final zzzn zza;
    private static final zzou<zzfy, zzpm> zzb;
    private static final zzoq<zzpm> zzc;
    private static final zznh<zzfv, zzpn> zzd;
    private static final zznd<zzpn> zze;

    static {
        zzzn zzb2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza = zzb2;
        zzb = zzou.zza(new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzie
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzow
            public final zzpq zza(zzcg zzcgVar) {
                zzpm zzb3;
                zzb3 = zzpm.zzb((zzwf) ((zzakg) zzwf.zza().zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").zza(zzxr.zzc().zzj()).zza(zzib.zza(((zzfy) zzcgVar).zzb())).zze()));
                return zzb3;
            }
        }, zzfy.class, zzpm.class);
        zzc = zzoq.zza(new zzos() { // from class: com.google.android.gms.internal.firebase-auth-api.zzid
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzos
            public final zzcg zza(zzpq zzpqVar) {
                zzfy zzb3;
                zzb3 = zzib.zzb((zzpm) zzpqVar);
                return zzb3;
            }
        }, zzb2, zzpm.class);
        zzd = zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzig
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
            public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                zzpn zza2;
                zza2 = zzpn.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzxo) ((zzakg) zzxo.zzb().zza(zzaiw.zza(r1.zzd().zza(zzcm.zza(zzcmVar)))).zze())).zzj(), zzwb.zza.SYMMETRIC, zzib.zza(r1.zzb().zzb()), ((zzfv) zzboVar).zza());
                return zza2;
            }
        }, zzfv.class, zzpn.class);
        zze = zznd.zza(new zznf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzif
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
            public final zzbo zza(zzpq zzpqVar, zzcm zzcmVar) {
                zzfv zzb3;
                zzb3 = zzib.zzb((zzpn) zzpqVar, zzcmVar);
                return zzb3;
            }
        }, zzb2, zzpn.class);
    }

    private static zzfy.zza zza(zzxd zzxdVar) {
        int i10 = zzii.zza[zzxdVar.ordinal()];
        if (i10 == 1) {
            return zzfy.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzfy.zza.zzb;
        }
        if (i10 == 4) {
            return zzfy.zza.zzc;
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
    public static zzfv zzb(zzpn zzpnVar, zzcm zzcmVar) {
        if (!zzpnVar.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzxo zza2 = zzxo.zza(zzpnVar.zzd(), zzajv.zza());
            if (zza2.zza() == 0) {
                return zzfv.zza(zza(zzpnVar.zzc()), zzzo.zza(zza2.zzd().zzd(), zzcm.zza(zzcmVar)), zzpnVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzakm unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfy zzb(zzpm zzpmVar) {
        if (!zzpmVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException(f.j("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", zzpmVar.zza().zzf()));
        }
        try {
            if (zzxr.zza(zzpmVar.zza().zze(), zzajv.zza()).zza() == 0) {
                return zzfy.zza(zza(zzpmVar.zza().zzd()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzakm e10) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
        }
    }

    private static zzxd zza(zzfy.zza zzaVar) {
        if (zzfy.zza.zza.equals(zzaVar)) {
            return zzxd.TINK;
        }
        if (zzfy.zza.zzb.equals(zzaVar)) {
            return zzxd.CRUNCHY;
        }
        if (zzfy.zza.zzc.equals(zzaVar)) {
            return zzxd.RAW;
        }
        throw new GeneralSecurityException(f.j("Unable to serialize variant: ", String.valueOf(zzaVar)));
    }
}

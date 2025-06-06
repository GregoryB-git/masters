package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import com.google.android.gms.internal.p002firebaseauthapi.zzft;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import defpackage.f;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhw {
    private static final zzzn zza;
    private static final zzou<zzft, zzpm> zzb;
    private static final zzoq<zzpm> zzc;
    private static final zznh<zzfq, zzpn> zzd;
    private static final zznd<zzpn> zze;

    static {
        zzzn zzb2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zza = zzb2;
        zzb = zzou.zza(new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzow
            public final zzpq zza(zzcg zzcgVar) {
                zzpm zzb3;
                zzb3 = zzpm.zzb((zzwf) ((zzakg) zzwf.zza().zza("type.googleapis.com/google.crypto.tink.XAesGcmKey").zza(((zzxi) ((zzakg) zzxi.zzb().zza((zzxl) ((zzakg) zzxl.zzb().zza(r1.zzb()).zze())).zze())).zzj()).zza(zzhw.zza(((zzft) zzcgVar).zzc())).zze()));
                return zzb3;
            }
        }, zzft.class, zzpm.class);
        zzc = zzoq.zza(new zzos() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzos
            public final zzcg zza(zzpq zzpqVar) {
                zzft zzb3;
                zzb3 = zzhw.zzb((zzpm) zzpqVar);
                return zzb3;
            }
        }, zzb2, zzpm.class);
        zzd = zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
            public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                zzpn zza2;
                zza2 = zzpn.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzxf) ((zzakg) zzxf.zzb().zza(zzaiw.zza(r1.zzd().zza(zzcm.zza(zzcmVar)))).zza((zzxl) ((zzakg) zzxl.zzb().zza(r1.zzb().zzb()).zze())).zze())).zzj(), zzwb.zza.SYMMETRIC, zzhw.zza(r1.zzb().zzc()), ((zzfq) zzboVar).zza());
                return zza2;
            }
        }, zzfq.class, zzpn.class);
        zze = zznd.zza(new zznf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzia
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
            public final zzbo zza(zzpq zzpqVar, zzcm zzcmVar) {
                zzfq zzb3;
                zzb3 = zzhw.zzb((zzpn) zzpqVar, zzcmVar);
                return zzb3;
            }
        }, zzb2, zzpn.class);
    }

    private static zzft.zza zza(zzxd zzxdVar) {
        int i10 = zzhz.zza[zzxdVar.ordinal()];
        if (i10 == 1) {
            return zzft.zza.zza;
        }
        if (i10 == 2) {
            return zzft.zza.zzb;
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
    public static zzfq zzb(zzpn zzpnVar, zzcm zzcmVar) {
        if (!zzpnVar.zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzxf zza2 = zzxf.zza(zzpnVar.zzd(), zzajv.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zza2.zze().zzb() == 32) {
                return zzfq.zza(zzft.zza(zza(zzpnVar.zzc()), zza2.zzd().zza()), zzzo.zza(zza2.zze().zzd(), zzcm.zza(zzcmVar)), zzpnVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzakm unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzft zzb(zzpm zzpmVar) {
        if (!zzpmVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException(f.j("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ", zzpmVar.zza().zzf()));
        }
        try {
            zzxi zza2 = zzxi.zza(zzpmVar.zza().zze(), zzajv.zza());
            if (zza2.zza() == 0) {
                return zzft.zza(zza(zzpmVar.zza().zzd()), zza2.zzd().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzakm e10) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e10);
        }
    }

    private static zzxd zza(zzft.zza zzaVar) {
        if (Objects.equals(zzaVar, zzft.zza.zza)) {
            return zzxd.TINK;
        }
        if (Objects.equals(zzaVar, zzft.zza.zzb)) {
            return zzxd.RAW;
        }
        throw new GeneralSecurityException(f.j("Unable to serialize variant: ", String.valueOf(zzaVar)));
    }
}

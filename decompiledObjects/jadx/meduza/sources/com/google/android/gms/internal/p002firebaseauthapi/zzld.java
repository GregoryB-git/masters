package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjq;
import com.google.android.gms.internal.p002firebaseauthapi.zzun;
import com.google.android.gms.internal.p002firebaseauthapi.zzuq;
import com.google.android.gms.internal.p002firebaseauthapi.zzut;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import defpackage.f;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes.dex */
public final class zzld {
    private static final zzzn zza;
    private static final zzzn zzb;
    private static final zzou<zzjq, zzpm> zzc;
    private static final zzoq<zzpm> zzd;
    private static final zznh<zzjs, zzpn> zze;
    private static final zznd<zzpn> zzf;
    private static final zznh<zzjt, zzpn> zzg;
    private static final zznd<zzpn> zzh;
    private static final zzmv<zzxd, zzjq.zze> zzi;
    private static final zzmv<zzvc, zzjq.zzd> zzj;
    private static final zzmv<zzuw, zzjq.zza> zzk;
    private static final zzmv<zzuf, zzjq.zzc> zzl;

    static {
        zzzn zzb2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza = zzb2;
        zzzn zzb3 = zzpy.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzb = zzb3;
        zzc = zzou.zza(new zzow() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzow
            public final zzpq zza(zzcg zzcgVar) {
                zzpm zzb4;
                zzb4 = zzpm.zzb((zzwf) ((zzakg) zzwf.zza().zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zza(((zzuh) ((zzakg) zzuh.zza().zza(zzld.zzb(r1)).zze())).zzj()).zza(zzld.zzi.zza((zzmv<zzxd, zzjq.zze>) ((zzjq) zzcgVar).zzg())).zze()));
                return zzb4;
            }
        }, zzjq.class, zzpm.class);
        zzd = zzoq.zza(new zzos() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlf
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzos
            public final zzcg zza(zzpq zzpqVar) {
                zzjq zzb4;
                zzb4 = zzld.zzb((zzpm) zzpqVar);
                return zzb4;
            }
        }, zzb2, zzpm.class);
        zze = zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzle
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
            public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                zzpn zza2;
                zza2 = zzpn.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzld.zza(r1).zzj(), zzwb.zza.ASYMMETRIC_PUBLIC, zzld.zzi.zza((zzmv<zzxd, zzjq.zze>) r1.zzb().zzg()), ((zzjs) zzboVar).zza());
                return zza2;
            }
        }, zzjs.class, zzpn.class);
        zzf = zznd.zza(new zznf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
            public final zzbo zza(zzpq zzpqVar, zzcm zzcmVar) {
                zzjs zzd2;
                zzd2 = zzld.zzd((zzpn) zzpqVar, zzcmVar);
                return zzd2;
            }
        }, zzb3, zzpn.class);
        zzg = zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlg
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
            public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                return zzld.zza((zzjt) zzboVar, zzcmVar);
            }
        }, zzjt.class, zzpn.class);
        zzh = zznd.zza(new zznf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
            public final zzbo zza(zzpq zzpqVar, zzcm zzcmVar) {
                zzjt zzc2;
                zzc2 = zzld.zzc((zzpn) zzpqVar, zzcmVar);
                return zzc2;
            }
        }, zzb2, zzpn.class);
        zzmu zza2 = zzmv.zza().zza(zzxd.RAW, zzjq.zze.zzc).zza(zzxd.TINK, zzjq.zze.zza);
        zzxd zzxdVar = zzxd.LEGACY;
        zzjq.zze zzeVar = zzjq.zze.zzb;
        zzi = zza2.zza(zzxdVar, zzeVar).zza(zzxd.CRUNCHY, zzeVar).zza();
        zzj = zzmv.zza().zza(zzvc.SHA1, zzjq.zzd.zza).zza(zzvc.SHA224, zzjq.zzd.zzb).zza(zzvc.SHA256, zzjq.zzd.zzc).zza(zzvc.SHA384, zzjq.zzd.zzd).zza(zzvc.SHA512, zzjq.zzd.zze).zza();
        zzk = zzmv.zza().zza(zzuw.NIST_P256, zzjq.zza.zza).zza(zzuw.NIST_P384, zzjq.zza.zzb).zza(zzuw.NIST_P521, zzjq.zza.zzc).zza(zzuw.CURVE25519, zzjq.zza.zzd).zza();
        zzl = zzmv.zza().zza(zzuf.UNCOMPRESSED, zzjq.zzc.zzb).zza(zzuf.COMPRESSED, zzjq.zzc.zza).zza(zzuf.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzjq.zzc.zzc).zza();
    }

    private static int zza(zzjq.zza zzaVar) {
        if (zzjq.zza.zza.equals(zzaVar)) {
            return 33;
        }
        if (zzjq.zza.zzb.equals(zzaVar)) {
            return 49;
        }
        if (zzjq.zza.zzc.equals(zzaVar)) {
            return 67;
        }
        throw new GeneralSecurityException(f.j("Unable to serialize CurveType ", String.valueOf(zzaVar)));
    }

    private static zzjq zza(zzxd zzxdVar, zzuk zzukVar) {
        zzjq.zzb zza2 = zzjq.zzc().zza(zzi.zza((zzmv<zzxd, zzjq.zze>) zzxdVar)).zza(zzk.zza((zzmv<zzuw, zzjq.zza>) zzukVar.zzf().zzd())).zza(zzj.zza((zzmv<zzvc, zzjq.zzd>) zzukVar.zzf().zze())).zza(zzco.zza(((zzwf) ((zzakg) zzwf.zza().zza(zzukVar.zzb().zzd().zzf()).zza(zzxd.RAW).zza(zzukVar.zzb().zzd().zze()).zze())).zzk())).zza(zzzn.zza(zzukVar.zzf().zzf().zzd()));
        if (!zzukVar.zzf().zzd().equals(zzuw.CURVE25519)) {
            zza2.zza(zzl.zza((zzmv<zzuf, zzjq.zzc>) zzukVar.zza()));
        } else if (!zzukVar.zza().equals(zzuf.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zza2.zza();
    }

    public static /* synthetic */ zzpn zza(zzjt zzjtVar, zzcm zzcmVar) {
        zzaiw zza2;
        zzun.zza zza3 = zzun.zzb().zza(0).zza(zza((zzjs) ((zzkv) zzjtVar.zzb())));
        if (zzjtVar.zzc().zzd().equals(zzjq.zza.zzd)) {
            zza2 = zzaiw.zza(zzjtVar.zzf().zza(zzcm.zza(zzcmVar)));
        } else {
            zza2 = zzaiw.zza(zzmo.zza(zzjtVar.zze().zza(zzcm.zza(zzcmVar)), zza(zzjtVar.zzc().zzd())));
        }
        zza3.zza(zza2);
        return zzpn.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((zzun) ((zzakg) zza3.zze())).zzj(), zzwb.zza.ASYMMETRIC_PRIVATE, zzi.zza((zzmv<zzxd, zzjq.zze>) zzjtVar.zzc().zzg()), zzjtVar.zza());
    }

    private static zzuq zza(zzjs zzjsVar) {
        zzuq.zza zza2;
        zzaiw zza3;
        if (zzjsVar.zzb().zzd().equals(zzjq.zza.zzd)) {
            zza2 = zzuq.zzc().zza(0).zza(zzb(zzjsVar.zzb())).zza(zzaiw.zza(zzjsVar.zzd().zzb()));
            zza3 = zzaiw.zza;
        } else {
            int zza4 = zza(zzjsVar.zzb().zzd());
            ECPoint zze2 = zzjsVar.zze();
            if (zze2 == null) {
                throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
            }
            zza2 = zzuq.zzc().zza(0).zza(zzb(zzjsVar.zzb())).zza(zzaiw.zza(zzmo.zza(zze2.getAffineX(), zza4)));
            zza3 = zzaiw.zza(zzmo.zza(zze2.getAffineY(), zza4));
        }
        return (zzuq) ((zzakg) zza2.zzb(zza3).zze());
    }

    public static void zza() {
        zzom zza2 = zzom.zza();
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
        zza2.zza(zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjq zzb(zzpm zzpmVar) {
        if (!zzpmVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException(f.j("Wrong type URL in call to EciesProtoSerialization.parseParameters: ", zzpmVar.zza().zzf()));
        }
        try {
            return zza(zzpmVar.zza().zzd(), zzuh.zza(zzpmVar.zza().zze(), zzajv.zza()).zzc());
        } catch (zzakm e10) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e10);
        }
    }

    private static zzuk zzb(zzjq zzjqVar) {
        zzut.zza zza2 = zzut.zza().zza(zzk.zza((zzmv<zzuw, zzjq.zza>) zzjqVar.zzd())).zza(zzj.zza((zzmv<zzvc, zzjq.zzd>) zzjqVar.zze()));
        if (zzjqVar.zzh() != null && zzjqVar.zzh().zza() > 0) {
            zza2.zza(zzaiw.zza(zzjqVar.zzh().zzb()));
        }
        zzut zzutVar = (zzut) ((zzakg) zza2.zze());
        try {
            zzwf zza3 = zzwf.zza(zzco.zza(zzjqVar.zzb()), zzajv.zza());
            zzue zzueVar = (zzue) ((zzakg) zzue.zza().zza((zzwf) ((zzakg) zzwf.zza().zza(zza3.zzf()).zza(zzxd.TINK).zza(zza3.zze()).zze())).zze());
            zzjq.zzc zzf2 = zzjqVar.zzf();
            if (zzf2 == null) {
                zzf2 = zzjq.zzc.zza;
            }
            return (zzuk) ((zzakg) zzuk.zzc().zza(zzutVar).zza(zzueVar).zza(zzl.zza((zzmv<zzuf, zzjq.zzc>) zzf2)).zze());
        } catch (zzakm e10) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjt zzc(zzpn zzpnVar, zzcm zzcmVar) {
        if (!zzpnVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException(f.j("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ", zzpnVar.zzf()));
        }
        try {
            zzun zza2 = zzun.zza(zzpnVar.zzd(), zzajv.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzuq zzd2 = zza2.zzd();
            if (zzd2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzjq zza3 = zza(zzpnVar.zzc(), zzd2.zzb());
            return zza3.zzd().equals(zzjq.zza.zzd) ? zzjt.zza(zzjs.zza(zza3, zzzn.zza(zzd2.zzf().zzd()), zzpnVar.zze()), zzzo.zza(zza2.zze().zzd(), zzcm.zza(zzcmVar))) : zzjt.zza(zzjs.zza(zza3, new ECPoint(zzmo.zza(zzd2.zzf().zzd()), zzmo.zza(zzd2.zzg().zzd())), zzpnVar.zze()), zzzm.zza(zzmo.zza(zza2.zze().zzd()), zzcm.zza(zzcmVar)));
        } catch (zzakm | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjs zzd(zzpn zzpnVar, zzcm zzcmVar) {
        if (!zzpnVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            throw new IllegalArgumentException(f.j("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ", zzpnVar.zzf()));
        }
        try {
            zzuq zza2 = zzuq.zza(zzpnVar.zzd(), zzajv.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzjq zza3 = zza(zzpnVar.zzc(), zza2.zzb());
            if (!zza3.zzd().equals(zzjq.zza.zzd)) {
                return zzjs.zza(zza3, new ECPoint(zzmo.zza(zza2.zzf().zzd()), zzmo.zza(zza2.zzg().zzd())), zzpnVar.zze());
            }
            if (zza2.zzg().zzb() == 0) {
                return zzjs.zza(zza3, zzzn.zza(zza2.zzf().zzd()), zzpnVar.zze());
            }
            throw new GeneralSecurityException("Y must be empty for X25519 points");
        } catch (zzakm | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }
}

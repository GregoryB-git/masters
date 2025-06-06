package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjq;
import defpackage.f;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* loaded from: classes.dex */
public final class zzyh implements zzbm {
    public static final zzmv<zzyl, zzjq.zza> zza = zzmv.zza().zza(zzyl.NIST_P256, zzjq.zza.zza).zza(zzyl.NIST_P384, zzjq.zza.zzb).zza(zzyl.NIST_P521, zzjq.zza.zzc).zza();
    public static final zzmv<zzyk, zzjq.zzc> zzb = zzmv.zza().zza(zzyk.UNCOMPRESSED, zzjq.zzc.zzb).zza(zzyk.COMPRESSED, zzjq.zzc.zza).zza(zzyk.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzjq.zzc.zzc).zza();

    private zzyh(ECPublicKey eCPublicKey, byte[] bArr, String str, zzyk zzykVar, zzla zzlaVar, byte[] bArr2) {
        zzmt.zza(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        new zzyj(eCPublicKey);
    }

    public static zzbm zza(zzjs zzjsVar) {
        zzyl zza2 = zza.zza((zzmv<zzyl, zzjq.zza>) zzjsVar.zzb().zzd());
        byte[] byteArray = zzjsVar.zze().getAffineX().toByteArray();
        byte[] byteArray2 = zzjsVar.zze().getAffineY().toByteArray();
        ECParameterSpec zza3 = zzyi.zza(zza2);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
        zzmt.zza(eCPoint, zza3.getCurve());
        ECPublicKey eCPublicKey = (ECPublicKey) zzym.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, zza3));
        byte[] bArr = new byte[0];
        if (zzjsVar.zzb().zzh() != null) {
            bArr = zzjsVar.zzb().zzh().zzb();
        }
        return new zzyh(eCPublicKey, bArr, zza(zzjsVar.zzb().zze()), zzb.zza((zzmv<zzyk, zzjq.zzc>) zzjsVar.zzb().zzf()), zzkw.zza(zzjsVar.zzb()), zzjsVar.zzc().zzb());
    }

    public static final String zza(zzjq.zzd zzdVar) {
        if (zzdVar.equals(zzjq.zzd.zza)) {
            return "HmacSha1";
        }
        if (zzdVar.equals(zzjq.zzd.zzb)) {
            return "HmacSha224";
        }
        if (zzdVar.equals(zzjq.zzd.zzc)) {
            return "HmacSha256";
        }
        if (zzdVar.equals(zzjq.zzd.zzd)) {
            return "HmacSha384";
        }
        if (zzdVar.equals(zzjq.zzd.zze)) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException(f.j("hash unsupported for EciesAeadHkdf: ", String.valueOf(zzdVar)));
    }
}

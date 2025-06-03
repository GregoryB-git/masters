package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import defpackage.f;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zzze implements zzrx {
    private static final zzij.zza zza = zzij.zza.zzb;
    private final ThreadLocal<Mac> zzb;
    private final String zzc;
    private final Key zzd;
    private final int zze;

    public zzze(String str, Key key) {
        int i10;
        zzzh zzzhVar = new zzzh(this);
        this.zzb = zzzhVar;
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzc = str;
        this.zzd = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                i10 = 20;
                break;
            case "HMACSHA224":
                i10 = 28;
                break;
            case "HMACSHA256":
                i10 = 32;
                break;
            case "HMACSHA384":
                i10 = 48;
                break;
            case "HMACSHA512":
                i10 = 64;
                break;
            default:
                throw new NoSuchAlgorithmException(f.j("unknown Hmac algorithm: ", str));
        }
        this.zze = i10;
        zzzhVar.get();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrx
    public final byte[] zza(byte[] bArr, int i10) {
        if (i10 > this.zze) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.zzb.get().update(bArr);
        return Arrays.copyOf(this.zzb.get().doFinal(), i10);
    }
}

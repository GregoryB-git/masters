package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzlk {
    private static final byte[] zza = new byte[0];
    private final zzll zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private BigInteger zzf = BigInteger.ZERO;

    private zzlk(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzll zzllVar) {
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzllVar;
    }

    public static zzlk zza(byte[] bArr, zzlr zzlrVar, zzlo zzloVar, zzlp zzlpVar, zzll zzllVar, byte[] bArr2) {
        byte[] zza2 = zzloVar.zza(bArr, zzlrVar);
        byte[] bArr3 = zzlu.zza;
        byte[] zza3 = zzlu.zza(zzloVar.zza(), zzlpVar.zzb(), zzllVar.zzc());
        byte[] bArr4 = zzlu.zzl;
        byte[] bArr5 = zza;
        byte[] zza4 = zzyc.zza(bArr3, zzlpVar.zza(bArr4, bArr5, "psk_id_hash", zza3), zzlpVar.zza(bArr4, bArr2, "info_hash", zza3));
        byte[] zza5 = zzlpVar.zza(zza2, bArr5, Constants.SECRET, zza3);
        byte[] zza6 = zzlpVar.zza(zza5, zza4, io.flutter.plugins.firebase.crashlytics.Constants.KEY, zza3, zzllVar.zza());
        byte[] zza7 = zzlpVar.zza(zza5, zza4, "base_nonce", zza3, zzllVar.zzb());
        zzllVar.zzb();
        BigInteger bigInteger = BigInteger.ONE;
        return new zzlk(bArr, zza6, zza7, bigInteger.shiftLeft(96).subtract(bigInteger), zzllVar);
    }

    private final synchronized byte[] zza() {
        byte[] zza2;
        zza2 = zzyc.zza(this.zze, zzmo.zza(this.zzf, this.zzb.zzb()));
        if (this.zzf.compareTo(this.zzc) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.zzf = this.zzf.add(BigInteger.ONE);
        return zza2;
    }

    public final byte[] zza(byte[] bArr, int i10, byte[] bArr2) {
        return this.zzb.zza(this.zzd, zza(), bArr, i10, bArr2);
    }
}

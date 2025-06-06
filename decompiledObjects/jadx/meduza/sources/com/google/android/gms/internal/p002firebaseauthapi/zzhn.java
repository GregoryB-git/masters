package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzhn {
    private static final zzij.zza zza = zzij.zza.zza;
    private final SecretKey zzb;

    private zzhn(byte[] bArr) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!zza()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zzb = new SecretKeySpec(bArr, "ChaCha20");
    }

    public static zzhn zza(byte[] bArr) {
        return new zzhn(bArr);
    }

    public static boolean zza() {
        return zzgz.zza() != null;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        if (bArr2 == null) {
            throw new NullPointerException("ciphertext is null");
        }
        if (bArr.length != 12) {
            throw new GeneralSecurityException("nonce length must be 12 bytes.");
        }
        if (bArr2.length < i10 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        Cipher zza2 = zzgz.zza();
        zza2.init(2, this.zzb, ivParameterSpec);
        if (bArr3 != null && bArr3.length != 0) {
            zza2.updateAAD(bArr3);
        }
        return zza2.doFinal(bArr2, i10, bArr2.length - i10);
    }
}

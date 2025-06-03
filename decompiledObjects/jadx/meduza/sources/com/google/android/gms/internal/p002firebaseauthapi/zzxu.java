package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzxu implements zzzd {
    private static final zzij.zza zza = zzij.zza.zzb;
    private static final ThreadLocal<Cipher> zzb = new zzxx();
    private final SecretKeySpec zzc;
    private final int zzd;
    private final int zze;

    public zzxu(byte[] bArr, int i10) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzzi.zza(bArr.length);
        this.zzc = new SecretKeySpec(bArr, "AES");
        int blockSize = zzb.get().getBlockSize();
        this.zze = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzd = i10;
    }

    private final void zza(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) {
        Cipher cipher = zzb.get();
        byte[] bArr4 = new byte[this.zze];
        System.arraycopy(bArr3, 0, bArr4, 0, this.zzd);
        cipher.init(z10 ? 1 : 2, this.zzc, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzd
    public final byte[] zza(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.zzd;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.zzd;
        byte[] bArr3 = new byte[length2 - i11];
        zza(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzd
    public final byte[] zzb(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.zzd;
        if (length > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException(j.g("plaintext length can not exceed ", Integer.MAX_VALUE - this.zzd));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] zza2 = zzpp.zza(i10);
        System.arraycopy(zza2, 0, bArr2, 0, this.zzd);
        zza(bArr, 0, bArr.length, bArr2, this.zzd, zza2, true);
        return bArr2;
    }
}

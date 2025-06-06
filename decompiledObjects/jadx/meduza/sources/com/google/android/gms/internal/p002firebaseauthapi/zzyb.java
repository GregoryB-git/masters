package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
public final class zzyb implements zzbe {
    private static final zzij.zza zza = zzij.zza.zzb;
    private final SecretKey zzb;
    private final byte[] zzc;

    private zzyb(byte[] bArr, zzzn zzznVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = zzgl.zzb(bArr);
        this.zzc = zzznVar.zzb();
    }

    public static zzbe zza(zzdm zzdmVar) {
        if (zzdmVar.zzc().zzb() != 12) {
            throw new GeneralSecurityException(j.g("Expected IV Size 12, got ", zzdmVar.zzc().zzb()));
        }
        if (zzdmVar.zzc().zzd() == 16) {
            return new zzyb(zzdmVar.zze().zza(zzbl.zza()), zzdmVar.zzd());
        }
        throw new GeneralSecurityException(j.g("Expected tag Size 16, got ", zzdmVar.zzc().zzd()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.zzc;
        if (length < bArr3.length + 12 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzpy.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec zza2 = zzgl.zza(bArr, this.zzc.length, 12);
        Cipher zza3 = zzgl.zza();
        zza3.init(2, this.zzb, zza2);
        if (bArr2 != null && bArr2.length != 0) {
            zza3.updateAAD(bArr2);
        }
        byte[] bArr4 = this.zzc;
        return zza3.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] zza2 = zzpp.zza(12);
        AlgorithmParameterSpec zza3 = zzgl.zza(zza2);
        Cipher zza4 = zzgl.zza();
        zza4.init(1, this.zzb, zza3);
        if (bArr2 != null && bArr2.length != 0) {
            zza4.updateAAD(bArr2);
        }
        int outputSize = zza4.getOutputSize(bArr.length);
        byte[] bArr3 = this.zzc;
        if (outputSize > (Integer.MAX_VALUE - bArr3.length) - 12) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(zza2, 0, copyOf, this.zzc.length, 12);
        if (zza4.doFinal(bArr, 0, bArr.length, copyOf, this.zzc.length + 12) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzzc implements zzrx {
    private static final zzij.zza zza = zzij.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzzf();
    private final SecretKey zzc;
    private byte[] zzd;
    private byte[] zze;

    public zzzc(byte[] bArr) {
        zzzi.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzc = secretKeySpec;
        Cipher zza2 = zza();
        zza2.init(1, secretKeySpec);
        byte[] zzb2 = zzrn.zzb(zza2.doFinal(new byte[16]));
        this.zzd = zzb2;
        this.zze = zzrn.zzb(zzb2);
    }

    private static Cipher zza() {
        if (zza.zza()) {
            return zzb.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zza(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrx
    public final byte[] zza(byte[] bArr, int i10) {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher zza2 = zza();
        zza2.init(1, this.zzc);
        int length = bArr.length;
        int i11 = length == 0 ? 1 : ((length - 1) / 16) + 1;
        byte[] zza3 = (i11 << 4) == bArr.length ? zzyc.zza(bArr, (i11 - 1) << 4, this.zzd, 0, 16) : zzyc.zza(zzrn.zza(Arrays.copyOfRange(bArr, (i11 - 1) << 4, bArr.length)), this.zze);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i12 = 0; i12 < i11 - 1; i12++) {
            zza(bArr2, bArr, i12 << 4, bArr3);
            if (zza2.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        zza(bArr2, zza3, 0, bArr3);
        if (zza2.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i10 ? bArr2 : Arrays.copyOf(bArr2, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzht implements zzbe {
    private final byte[] zza;
    private final int zzb;
    private final zzrx zzc;

    private zzht(byte[] bArr, zzzn zzznVar, int i10) {
        this.zzc = new zzzc(bArr);
        this.zza = zzznVar.zzb();
        this.zzb = i10;
    }

    public static zzbe zza(zzfq zzfqVar) {
        if (zzfqVar.zzb().zzb() < 8 || zzfqVar.zzb().zzb() > 12) {
            throw new GeneralSecurityException("invalid salt size");
        }
        return new zzht(zzfqVar.zzd().zza(zzbl.zza()), zzfqVar.zzc(), zzfqVar.zzb().zzb());
    }

    private final byte[] zza(byte[] bArr) {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        System.arraycopy(this.zzc.zza(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(this.zzc.zza(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.zza;
        if (length < bArr3.length + this.zzb + 12 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzpy.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length2 = this.zza.length + this.zzb;
        int i10 = length2 + 12;
        return new zzhk(zza(Arrays.copyOfRange(bArr, this.zza.length, length2))).zza(Arrays.copyOfRange(bArr, length2, i10), bArr, i10, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] zza = zzpp.zza(this.zzb + 12);
        byte[] copyOf = Arrays.copyOf(zza, this.zzb);
        int i10 = this.zzb;
        byte[] copyOfRange = Arrays.copyOfRange(zza, i10, i10 + 12);
        byte[] zzb = new zzhk(zza(copyOf)).zzb(copyOfRange, bArr, this.zza.length + this.zzb + copyOfRange.length, bArr2);
        byte[] bArr3 = this.zza;
        System.arraycopy(bArr3, 0, zzb, 0, bArr3.length);
        System.arraycopy(zza, 0, zzb, this.zza.length, zza.length);
        return zzb;
    }
}

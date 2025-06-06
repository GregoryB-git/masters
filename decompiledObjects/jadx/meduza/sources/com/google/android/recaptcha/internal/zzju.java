package com.google.android.recaptcha.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
final class zzju extends zzjv implements Serializable {
    public final byte[] zza;

    public zzju(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(zzji.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final boolean zzc(zzjv zzjvVar) {
        if (this.zza.length != zzjvVar.zze().length) {
            return false;
        }
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i10 >= bArr.length) {
                return z10;
            }
            z10 &= bArr[i10] == zzjvVar.zze()[i10];
            i10++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zze() {
        return this.zza;
    }
}

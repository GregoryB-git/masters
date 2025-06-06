package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzhq extends zzhm {
    public zzhq(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final /* bridge */ /* synthetic */ void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        super.zza(byteBuffer, bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final /* bridge */ /* synthetic */ byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        return super.zza(bArr, byteBuffer);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzhm
    public final int[] zza(int[] iArr, int i10) {
        if (iArr.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
        }
        int[] iArr2 = new int[16];
        zzhh.zza(iArr2, zzhh.zzb(this.zza, iArr));
        iArr2[12] = i10;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}

package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzhm extends zzhl {
    @Override // com.google.android.gms.internal.auth.zzhl
    public final int zza(int i10, byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return 0;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i13 >= i12) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        i11 = i13 + 1;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (b10 < -16) {
                    if (i13 >= i12 - 1) {
                        return zzhn.zza(bArr, i13, i12);
                    }
                    int i14 = i13 + 1;
                    byte b11 = bArr[i13];
                    if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                        i11 = i14 + 1;
                        if (bArr[i14] > -65) {
                        }
                    }
                    return -1;
                }
                if (i13 >= i12 - 2) {
                    return zzhn.zza(bArr, i13, i12);
                }
                int i15 = i13 + 1;
                byte b12 = bArr[i13];
                if (b12 <= -65) {
                    if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                        int i16 = i15 + 1;
                        if (bArr[i15] <= -65) {
                            i13 = i16 + 1;
                            if (bArr[i16] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i11 = i13;
        }
        return 0;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhu {
    private static long zza(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & KeyboardMap.kValueMask;
    }

    private static long zza(byte[] bArr, int i10, int i11) {
        return (zza(bArr, i10) >> i11) & 67108863;
    }

    private static void zza(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long zza = zza(bArr, 0, 0) & 67108863;
        int i10 = 3;
        long zza2 = zza(bArr, 3, 2) & 67108611;
        long zza3 = zza(bArr, 6, 4) & 67092735;
        long zza4 = zza(bArr, 9, 6) & 66076671;
        long zza5 = zza(bArr, 12, 8) & 1048575;
        long j10 = zza2 * 5;
        long j11 = zza3 * 5;
        long j12 = zza4 * 5;
        long j13 = zza5 * 5;
        int i11 = 17;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i12 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (i12 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i12);
            System.arraycopy(bArr2, i12, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i11, (byte) 0);
            }
            long zza6 = j18 + zza(bArr3, 0, 0);
            long zza7 = j14 + zza(bArr3, i10, 2);
            long zza8 = j15 + zza(bArr3, 6, 4);
            long zza9 = j16 + zza(bArr3, 9, 6);
            long zza10 = j17 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
            long j19 = (zza10 * j10) + (zza9 * j11) + (zza8 * j12) + (zza7 * j13) + (zza6 * zza);
            long j20 = (zza10 * j11) + (zza9 * j12) + (zza8 * j13) + (zza7 * zza) + (zza6 * zza2);
            long j21 = (zza10 * j12) + (zza9 * j13) + (zza8 * zza) + (zza7 * zza2) + (zza6 * zza3);
            long j22 = (zza10 * j13) + (zza9 * zza) + (zza8 * zza2) + (zza7 * zza3) + (zza6 * zza4);
            long j23 = zza9 * zza2;
            long j24 = zza10 * zza;
            long j25 = j20 + (j19 >> 26);
            long j26 = j21 + (j25 >> 26);
            long j27 = j22 + (j26 >> 26);
            long j28 = j24 + j23 + (zza8 * zza3) + (zza7 * zza4) + (zza6 * zza5) + (j27 >> 26);
            long j29 = j28 >> 26;
            j17 = j28 & 67108863;
            long j30 = (j29 * 5) + (j19 & 67108863);
            i12 += 16;
            j15 = j26 & 67108863;
            j16 = j27 & 67108863;
            i11 = 17;
            i10 = 3;
            j18 = j30 & 67108863;
            j14 = (j25 & 67108863) + (j30 >> 26);
        }
        long j31 = j15 + (j14 >> 26);
        long j32 = j31 & 67108863;
        long j33 = j16 + (j31 >> 26);
        long j34 = j33 & 67108863;
        long j35 = j17 + (j33 >> 26);
        long j36 = j35 & 67108863;
        long j37 = ((j35 >> 26) * 5) + j18;
        long j38 = j37 >> 26;
        long j39 = j37 & 67108863;
        long j40 = (j14 & 67108863) + j38;
        long j41 = j39 + 5;
        long j42 = j41 & 67108863;
        long j43 = (j41 >> 26) + j40;
        long j44 = j32 + (j43 >> 26);
        long j45 = j34 + (j44 >> 26);
        long j46 = (j36 + (j45 >> 26)) - 67108864;
        long j47 = j46 >> 63;
        long j48 = j39 & j47;
        long j49 = j40 & j47;
        long j50 = j32 & j47;
        long j51 = j34 & j47;
        long j52 = j36 & j47;
        long j53 = ~j47;
        long j54 = j49 | (j43 & 67108863 & j53);
        long j55 = j50 | (j44 & 67108863 & j53);
        long j56 = j51 | (j45 & 67108863 & j53);
        long j57 = (j48 | (j42 & j53) | (j54 << 26)) & KeyboardMap.kValueMask;
        long j58 = ((j54 >> 6) | (j55 << 20)) & KeyboardMap.kValueMask;
        long j59 = ((j55 >> 12) | (j56 << 14)) & KeyboardMap.kValueMask;
        long j60 = ((j56 >> 18) | ((j52 | (j46 & j53)) << 8)) & KeyboardMap.kValueMask;
        long zza11 = j57 + zza(bArr, 16);
        long j61 = zza11 & KeyboardMap.kValueMask;
        long zza12 = j58 + zza(bArr, 20) + (zza11 >> 32);
        long j62 = zza12 & KeyboardMap.kValueMask;
        long zza13 = j59 + zza(bArr, 24) + (zza12 >> 32);
        long j63 = zza13 & KeyboardMap.kValueMask;
        long zza14 = (j60 + zza(bArr, 28) + (zza13 >> 32)) & KeyboardMap.kValueMask;
        byte[] bArr4 = new byte[16];
        zza(bArr4, j61, 0);
        zza(bArr4, j62, 4);
        zza(bArr4, j63, 8);
        zza(bArr4, zza14, 12);
        return bArr4;
    }
}

package e3;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import q3.AbstractC1890f;

/* loaded from: classes.dex */
public abstract class i {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        int i7 = 0;
        long c7 = c(bArr, 0, 0) & 67108863;
        int i8 = 3;
        long c8 = c(bArr, 3, 2) & 67108611;
        long c9 = c(bArr, 6, 4) & 67092735;
        long c10 = c(bArr, 9, 6) & 66076671;
        long c11 = c(bArr, 12, 8) & 1048575;
        long j7 = c8 * 5;
        long j8 = c9 * 5;
        long j9 = c10 * 5;
        long j10 = c11 * 5;
        byte[] bArr3 = new byte[17];
        long j11 = 0;
        int i9 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        while (i9 < bArr2.length) {
            b(bArr3, bArr2, i9);
            long c12 = j15 + c(bArr3, i7, i7);
            long c13 = j11 + c(bArr3, i8, 2);
            long c14 = j12 + c(bArr3, 6, 4);
            long c15 = j13 + c(bArr3, 9, 6);
            long c16 = j14 + (c(bArr3, 12, 8) | (bArr3[16] << 24));
            long j16 = (c12 * c7) + (c13 * j10) + (c14 * j9) + (c15 * j8) + (c16 * j7);
            long j17 = (c12 * c8) + (c13 * c7) + (c14 * j10) + (c15 * j9) + (c16 * j8);
            long j18 = (c12 * c9) + (c13 * c8) + (c14 * c7) + (c15 * j10) + (c16 * j9);
            long j19 = (c12 * c10) + (c13 * c9) + (c14 * c8) + (c15 * c7) + (c16 * j10);
            long j20 = j17 + (j16 >> 26);
            long j21 = j18 + (j20 >> 26);
            long j22 = j19 + (j21 >> 26);
            long j23 = (c12 * c11) + (c13 * c10) + (c14 * c9) + (c15 * c8) + (c16 * c7) + (j22 >> 26);
            long j24 = (j16 & 67108863) + ((j23 >> 26) * 5);
            j11 = (j20 & 67108863) + (j24 >> 26);
            i9 += 16;
            j12 = j21 & 67108863;
            j13 = j22 & 67108863;
            j14 = j23 & 67108863;
            i8 = 3;
            j15 = j24 & 67108863;
            i7 = 0;
        }
        long j25 = j12 + (j11 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j13 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = j14 + (j27 >> 26);
        long j30 = j29 & 67108863;
        long j31 = j15 + ((j29 >> 26) * 5);
        long j32 = j31 & 67108863;
        long j33 = (j11 & 67108863) + (j31 >> 26);
        long j34 = j32 + 5;
        long j35 = j34 & 67108863;
        long j36 = (j34 >> 26) + j33;
        long j37 = j26 + (j36 >> 26);
        long j38 = j28 + (j37 >> 26);
        long j39 = (j30 + (j38 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j32 & j40;
        long j42 = j33 & j40;
        long j43 = j26 & j40;
        long j44 = j28 & j40;
        long j45 = j30 & j40;
        long j46 = ~j40;
        long j47 = (j36 & 67108863 & j46) | j42;
        long j48 = (j37 & 67108863 & j46) | j43;
        long j49 = (j38 & 67108863 & j46) | j44;
        long j50 = (j39 & j46) | j45;
        long j51 = (j41 | (j35 & j46) | (j47 << 26)) & 4294967295L;
        long j52 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j53 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j54 = ((j49 >> 18) | (j50 << 8)) & 4294967295L;
        long d7 = j51 + d(bArr, 16);
        long j55 = d7 & 4294967295L;
        long d8 = j52 + d(bArr, 20) + (d7 >> 32);
        long j56 = d8 & 4294967295L;
        long d9 = j53 + d(bArr, 24) + (d8 >> 32);
        long j57 = d9 & 4294967295L;
        long d10 = (j54 + d(bArr, 28) + (d9 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        e(bArr4, j55, 0);
        e(bArr4, j56, 4);
        e(bArr4, j57, 8);
        e(bArr4, d10, 12);
        return bArr4;
    }

    public static void b(byte[] bArr, byte[] bArr2, int i7) {
        int min = Math.min(16, bArr2.length - i7);
        System.arraycopy(bArr2, i7, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    public static long c(byte[] bArr, int i7, int i8) {
        return (d(bArr, i7) >> i8) & 67108863;
    }

    public static long d(byte[] bArr, int i7) {
        return (((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16)) & 4294967295L;
    }

    public static void e(byte[] bArr, long j7, int i7) {
        int i8 = 0;
        while (i8 < 4) {
            bArr[i7 + i8] = (byte) (255 & j7);
            i8++;
            j7 >>= 8;
        }
    }

    public static void f(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!AbstractC1890f.b(a(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}

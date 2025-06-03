package l1;

/* loaded from: classes.dex */
public abstract class L {
    public static int a(byte[] bArr, int i7, int i8) {
        while (i7 < i8 && bArr[i7] != 71) {
            i7++;
        }
        return i7;
    }

    public static boolean b(byte[] bArr, int i7, int i8, int i9) {
        int i10 = 0;
        for (int i11 = -4; i11 <= 4; i11++) {
            int i12 = (i11 * 188) + i9;
            if (i12 < i7 || i12 >= i8 || bArr[i12] != 71) {
                i10 = 0;
            } else {
                i10++;
                if (i10 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(g0.z zVar, int i7, int i8) {
        zVar.T(i7);
        if (zVar.a() < 5) {
            return -9223372036854775807L;
        }
        int p7 = zVar.p();
        if ((8388608 & p7) != 0 || ((2096896 & p7) >> 8) != i8 || (p7 & 32) == 0 || zVar.G() < 7 || zVar.a() < 7 || (zVar.G() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zVar.l(bArr, 0, 6);
        return d(bArr);
    }

    public static long d(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}

package c5;

import java.util.Map;

/* loaded from: classes.dex */
public class h extends n {
    public static int f(boolean[] zArr, int i7, int[] iArr) {
        int length = iArr.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = i7 + 1;
            zArr[i7] = iArr[i8] != 0;
            i8++;
            i7 = i9;
        }
        return 9;
    }

    public static int g(String str, int i7) {
        int i8 = 0;
        int i9 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i8 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i9;
            i9++;
            if (i9 > i7) {
                i9 = 1;
            }
        }
        return i8 % 47;
    }

    private static void h(int i7, int[] iArr) {
        for (int i8 = 0; i8 < 9; i8++) {
            int i9 = 1;
            if (((1 << (8 - i8)) & i7) == 0) {
                i9 = 0;
            }
            iArr[i8] = i9;
        }
    }

    @Override // c5.n, V4.g
    public Y4.b a(String str, V4.a aVar, int i7, int i8, Map map) {
        if (aVar == V4.a.CODE_93) {
            return super.a(str, aVar, i7, i8, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
    }

    @Override // c5.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int[] iArr = new int[9];
        int length2 = ((str.length() + 4) * 9) + 1;
        h(g.f10161b[47], iArr);
        boolean[] zArr = new boolean[length2];
        int f7 = f(zArr, 0, iArr);
        for (int i7 = 0; i7 < length; i7++) {
            h(g.f10161b["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i7))], iArr);
            f7 += f(zArr, f7, iArr);
        }
        int g7 = g(str, 20);
        int[] iArr2 = g.f10161b;
        h(iArr2[g7], iArr);
        int f8 = f7 + f(zArr, f7, iArr);
        h(iArr2[g(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(g7), 15)], iArr);
        int f9 = f8 + f(zArr, f8, iArr);
        h(iArr2[47], iArr);
        zArr[f9 + f(zArr, f9, iArr)] = true;
        return zArr;
    }
}

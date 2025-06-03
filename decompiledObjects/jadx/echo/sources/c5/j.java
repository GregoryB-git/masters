package c5;

import java.util.Map;

/* loaded from: classes.dex */
public final class j extends q {
    @Override // c5.n, V4.g
    public Y4.b a(String str, V4.a aVar, int i7, int i8, Map map) {
        if (aVar == V4.a.EAN_13) {
            return super.a(str, aVar, i7, i8, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    @Override // c5.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + p.b(str);
            } catch (V4.d e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (V4.d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i7 = i.f10163f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b7 = n.b(zArr, 0, p.f10168a, true);
        for (int i8 = 1; i8 <= 6; i8++) {
            int digit = Character.digit(str.charAt(i8), 10);
            if (((i7 >> (6 - i8)) & 1) == 1) {
                digit += 10;
            }
            b7 += n.b(zArr, b7, p.f10172e[digit], false);
        }
        int b8 = b7 + n.b(zArr, b7, p.f10169b, false);
        for (int i9 = 7; i9 <= 12; i9++) {
            b8 += n.b(zArr, b8, p.f10171d[Character.digit(str.charAt(i9), 10)], true);
        }
        n.b(zArr, b8, p.f10168a, true);
        return zArr;
    }
}

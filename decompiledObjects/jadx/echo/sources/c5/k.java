package c5;

import java.util.Map;

/* loaded from: classes.dex */
public final class k extends q {
    @Override // c5.n, V4.g
    public Y4.b a(String str, V4.a aVar, int i7, int i8, Map map) {
        if (aVar == V4.a.EAN_8) {
            return super.a(str, aVar, i7, i8, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    @Override // c5.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(str);
            } catch (V4.d e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (V4.d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        boolean[] zArr = new boolean[67];
        int b7 = n.b(zArr, 0, p.f10168a, true);
        for (int i7 = 0; i7 <= 3; i7++) {
            b7 += n.b(zArr, b7, p.f10171d[Character.digit(str.charAt(i7), 10)], false);
        }
        int b8 = b7 + n.b(zArr, b7, p.f10169b, false);
        for (int i8 = 4; i8 <= 7; i8++) {
            b8 += n.b(zArr, b8, p.f10171d[Character.digit(str.charAt(i8), 10)], true);
        }
        n.b(zArr, b8, p.f10168a, true);
        return zArr;
    }
}

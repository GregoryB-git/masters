package c5;

import java.util.Map;

/* loaded from: classes.dex */
public final class s extends q {
    @Override // c5.n, V4.g
    public Y4.b a(String str, V4.a aVar, int i7, int i8, Map map) {
        if (aVar == V4.a.UPC_E) {
            return super.a(str, aVar, i7, i8, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
    }

    @Override // c5.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(r.c(str));
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
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i7 = r.f10174g[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int b7 = n.b(zArr, 0, p.f10168a, true);
        for (int i8 = 1; i8 <= 6; i8++) {
            int digit2 = Character.digit(str.charAt(i8), 10);
            if (((i7 >> (6 - i8)) & 1) == 1) {
                digit2 += 10;
            }
            b7 += n.b(zArr, b7, p.f10172e[digit2], false);
        }
        n.b(zArr, b7, p.f10170c, false);
        return zArr;
    }
}

package f5;

import V4.c;
import V4.g;
import Y4.b;
import g5.EnumC1320a;
import h5.f;
import java.util.Map;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1293a implements g {
    public static b b(f fVar, int i7, int i8, int i9) {
        h5.b a7 = fVar.a();
        if (a7 == null) {
            throw new IllegalStateException();
        }
        int e7 = a7.e();
        int d7 = a7.d();
        int i10 = i9 << 1;
        int i11 = e7 + i10;
        int i12 = i10 + d7;
        int max = Math.max(i7, i11);
        int max2 = Math.max(i8, i12);
        int min = Math.min(max / i11, max2 / i12);
        int i13 = (max - (e7 * min)) / 2;
        int i14 = (max2 - (d7 * min)) / 2;
        b bVar = new b(max, max2);
        int i15 = 0;
        while (i15 < d7) {
            int i16 = 0;
            int i17 = i13;
            while (i16 < e7) {
                if (a7.b(i16, i15) == 1) {
                    bVar.n(i17, i14, min, min);
                }
                i16++;
                i17 += min;
            }
            i15++;
            i14 += min;
        }
        return bVar;
    }

    @Override // V4.g
    public b a(String str, V4.a aVar, int i7, int i8, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != V4.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        }
        if (i7 < 0 || i8 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i7 + 'x' + i8);
        }
        EnumC1320a enumC1320a = EnumC1320a.L;
        int i9 = 4;
        if (map != null) {
            c cVar = c.ERROR_CORRECTION;
            if (map.containsKey(cVar)) {
                enumC1320a = EnumC1320a.valueOf(map.get(cVar).toString());
            }
            c cVar2 = c.MARGIN;
            if (map.containsKey(cVar2)) {
                i9 = Integer.parseInt(map.get(cVar2).toString());
            }
        }
        return b(h5.c.n(str, enumC1320a, map), i7, i8, i9);
    }
}

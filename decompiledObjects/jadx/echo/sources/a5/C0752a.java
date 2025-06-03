package a5;

import V4.c;
import V4.g;
import Y4.b;
import b5.e;
import b5.i;
import b5.j;
import b5.k;
import b5.l;
import java.util.Map;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752a implements g {
    public static b b(h5.b bVar, int i7, int i8) {
        b bVar2;
        int e7 = bVar.e();
        int d7 = bVar.d();
        int max = Math.max(i7, e7);
        int max2 = Math.max(i8, d7);
        int min = Math.min(max / e7, max2 / d7);
        int i9 = (max - (e7 * min)) / 2;
        int i10 = (max2 - (d7 * min)) / 2;
        if (i8 < d7 || i7 < e7) {
            bVar2 = new b(e7, d7);
            i9 = 0;
            i10 = 0;
        } else {
            bVar2 = new b(i7, i8);
        }
        bVar2.b();
        int i11 = 0;
        while (i11 < d7) {
            int i12 = i9;
            int i13 = 0;
            while (i13 < e7) {
                if (bVar.b(i13, i11) == 1) {
                    bVar2.n(i12, i10, min, min);
                }
                i13++;
                i12 += min;
            }
            i11++;
            i10 += min;
        }
        return bVar2;
    }

    public static b c(e eVar, k kVar, int i7, int i8) {
        int h7 = kVar.h();
        int g7 = kVar.g();
        h5.b bVar = new h5.b(kVar.j(), kVar.i());
        int i9 = 0;
        for (int i10 = 0; i10 < g7; i10++) {
            if (i10 % kVar.f10001e == 0) {
                int i11 = 0;
                for (int i12 = 0; i12 < kVar.j(); i12++) {
                    bVar.g(i11, i9, i12 % 2 == 0);
                    i11++;
                }
                i9++;
            }
            int i13 = 0;
            for (int i14 = 0; i14 < h7; i14++) {
                if (i14 % kVar.f10000d == 0) {
                    bVar.g(i13, i9, true);
                    i13++;
                }
                bVar.g(i13, i9, eVar.e(i14, i10));
                int i15 = i13 + 1;
                int i16 = kVar.f10000d;
                if (i14 % i16 == i16 - 1) {
                    bVar.g(i15, i9, i10 % 2 == 0);
                    i13 += 2;
                } else {
                    i13 = i15;
                }
            }
            int i17 = i9 + 1;
            int i18 = kVar.f10001e;
            if (i10 % i18 == i18 - 1) {
                int i19 = 0;
                for (int i20 = 0; i20 < kVar.j(); i20++) {
                    bVar.g(i19, i17, true);
                    i19++;
                }
                i9 += 2;
            } else {
                i9 = i17;
            }
        }
        return b(bVar, i7, i8);
    }

    @Override // V4.g
    public b a(String str, V4.a aVar, int i7, int i8, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != V4.a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        }
        if (i7 < 0 || i8 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i7 + 'x' + i8);
        }
        l lVar = l.FORCE_NONE;
        if (map != null) {
            l lVar2 = (l) map.get(c.DATA_MATRIX_SHAPE);
            if (lVar2 != null) {
                lVar = lVar2;
            }
            android.support.v4.media.a.a(map.get(c.MIN_SIZE));
            android.support.v4.media.a.a(map.get(c.MAX_SIZE));
        }
        String b7 = j.b(str, lVar, null, null);
        k l7 = k.l(b7.length(), lVar, null, null, true);
        e eVar = new e(i.c(b7, l7), l7.h(), l7.g());
        eVar.h();
        return c(eVar, l7, i7, i8);
    }
}

package W4;

import V4.g;
import X4.c;
import Y4.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements g {
    public static b b(String str, V4.a aVar, int i7, int i8, Charset charset, int i9, int i10) {
        if (aVar == V4.a.AZTEC) {
            return c(c.d(str.getBytes(charset), i9, i10), i7, i8);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    public static b c(X4.a aVar, int i7, int i8) {
        b a7 = aVar.a();
        if (a7 == null) {
            throw new IllegalStateException();
        }
        int j7 = a7.j();
        int g7 = a7.g();
        int max = Math.max(i7, j7);
        int max2 = Math.max(i8, g7);
        int min = Math.min(max / j7, max2 / g7);
        int i9 = (max - (j7 * min)) / 2;
        int i10 = (max2 - (g7 * min)) / 2;
        b bVar = new b(max, max2);
        int i11 = 0;
        while (i11 < g7) {
            int i12 = 0;
            int i13 = i9;
            while (i12 < j7) {
                if (a7.f(i12, i11)) {
                    bVar.n(i13, i10, min, min);
                }
                i12++;
                i13 += min;
            }
            i11++;
            i10 += min;
        }
        return bVar;
    }

    @Override // V4.g
    public b a(String str, V4.a aVar, int i7, int i8, Map map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i9 = 0;
        if (map != null) {
            V4.c cVar = V4.c.CHARACTER_SET;
            if (map.containsKey(cVar)) {
                charset = Charset.forName(map.get(cVar).toString());
            }
            V4.c cVar2 = V4.c.ERROR_CORRECTION;
            r1 = map.containsKey(cVar2) ? Integer.parseInt(map.get(cVar2).toString()) : 33;
            V4.c cVar3 = V4.c.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                i9 = Integer.parseInt(map.get(cVar3).toString());
            }
        }
        return b(str, aVar, i7, i8, charset, r1, i9);
    }
}

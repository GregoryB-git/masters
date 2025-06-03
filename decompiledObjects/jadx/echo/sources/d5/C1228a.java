package d5;

import V4.c;
import V4.g;
import Y4.b;
import e5.C1276d;
import e5.EnumC1275c;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1228a implements g {
    public static b b(byte[][] bArr, int i7) {
        int i8 = i7 * 2;
        b bVar = new b(bArr[0].length + i8, bArr.length + i8);
        bVar.b();
        int g7 = (bVar.g() - i7) - 1;
        int i9 = 0;
        while (i9 < bArr.length) {
            byte[] bArr2 = bArr[i9];
            for (int i10 = 0; i10 < bArr[0].length; i10++) {
                if (bArr2[i10] == 1) {
                    bVar.l(i10 + i7, g7);
                }
            }
            i9++;
            g7--;
        }
        return bVar;
    }

    public static b c(C1276d c1276d, String str, int i7, int i8, int i9, int i10) {
        boolean z7;
        c1276d.e(str, i7);
        byte[][] b7 = c1276d.f().b(1, 4);
        if ((i9 > i8) != (b7[0].length < b7.length)) {
            b7 = d(b7);
            z7 = true;
        } else {
            z7 = false;
        }
        int length = i8 / b7[0].length;
        int length2 = i9 / b7.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return b(b7, i10);
        }
        byte[][] b8 = c1276d.f().b(length, length << 2);
        if (z7) {
            b8 = d(b8);
        }
        return b(b8, i10);
    }

    public static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i7 = 0; i7 < bArr.length; i7++) {
            int length = (bArr.length - i7) - 1;
            for (int i8 = 0; i8 < bArr[0].length; i8++) {
                bArr2[i8][length] = bArr[i7][i8];
            }
        }
        return bArr2;
    }

    @Override // V4.g
    public b a(String str, V4.a aVar, int i7, int i8, Map map) {
        if (aVar != V4.a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
        }
        C1276d c1276d = new C1276d();
        if (map != null) {
            c cVar = c.PDF417_COMPACT;
            if (map.containsKey(cVar)) {
                c1276d.h(Boolean.valueOf(map.get(cVar).toString()).booleanValue());
            }
            c cVar2 = c.PDF417_COMPACTION;
            if (map.containsKey(cVar2)) {
                c1276d.i(EnumC1275c.valueOf(map.get(cVar2).toString()));
            }
            c cVar3 = c.PDF417_DIMENSIONS;
            if (map.containsKey(cVar3)) {
                android.support.v4.media.a.a(map.get(cVar3));
                throw null;
            }
            c cVar4 = c.MARGIN;
            r9 = map.containsKey(cVar4) ? Integer.parseInt(map.get(cVar4).toString()) : 30;
            c cVar5 = c.ERROR_CORRECTION;
            r0 = map.containsKey(cVar5) ? Integer.parseInt(map.get(cVar5).toString()) : 2;
            c cVar6 = c.CHARACTER_SET;
            if (map.containsKey(cVar6)) {
                c1276d.j(Charset.forName(map.get(cVar6).toString()));
            }
        }
        return c(c1276d, str, r0, i7, i8, r9);
    }
}

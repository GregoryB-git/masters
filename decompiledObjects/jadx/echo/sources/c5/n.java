package c5;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class n implements V4.g {
    public static int b(boolean[] zArr, int i7, int[] iArr, boolean z7) {
        int i8 = 0;
        for (int i9 : iArr) {
            int i10 = 0;
            while (i10 < i9) {
                zArr[i7] = z7;
                i10++;
                i7++;
            }
            i8 += i9;
            z7 = !z7;
        }
        return i8;
    }

    public static Y4.b e(boolean[] zArr, int i7, int i8, int i9) {
        int length = zArr.length;
        int i10 = i9 + length;
        int max = Math.max(i7, i10);
        int max2 = Math.max(1, i8);
        int i11 = max / i10;
        int i12 = (max - (length * i11)) / 2;
        Y4.b bVar = new Y4.b(max, max2);
        int i13 = 0;
        while (i13 < length) {
            if (zArr[i13]) {
                bVar.n(i12, 0, i11, max2);
            }
            i13++;
            i12 += i11;
        }
        return bVar;
    }

    @Override // V4.g
    public Y4.b a(String str, V4.a aVar, int i7, int i8, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i7 < 0 || i8 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i7 + 'x' + i8);
        }
        int d7 = d();
        if (map != null) {
            V4.c cVar = V4.c.MARGIN;
            if (map.containsKey(cVar)) {
                d7 = Integer.parseInt(map.get(cVar).toString());
            }
        }
        return e(c(str), i7, i8, d7);
    }

    public abstract boolean[] c(String str);

    public int d() {
        return 10;
    }
}

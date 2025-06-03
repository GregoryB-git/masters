package c5;

import java.util.Map;

/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f10164a = {1, 1, 1, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10165b = {3, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f10166c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // c5.n, V4.g
    public Y4.b a(String str, V4.a aVar, int i7, int i8, Map map) {
        if (aVar == V4.a.ITF) {
            return super.a(str, aVar, i7, i8, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    @Override // c5.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int b7 = n.b(zArr, 0, f10164a, true);
        for (int i7 = 0; i7 < length; i7 += 2) {
            int digit = Character.digit(str.charAt(i7), 10);
            int digit2 = Character.digit(str.charAt(i7 + 1), 10);
            int[] iArr = new int[10];
            for (int i8 = 0; i8 < 5; i8++) {
                int i9 = i8 * 2;
                int[][] iArr2 = f10166c;
                iArr[i9] = iArr2[digit][i8];
                iArr[i9 + 1] = iArr2[digit2][i8];
            }
            b7 += n.b(zArr, b7, iArr, true);
        }
        n.b(zArr, b7, f10165b, true);
        return zArr;
    }
}

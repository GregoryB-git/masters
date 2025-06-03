package c5;

/* loaded from: classes.dex */
public abstract class p extends m {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f10168a = {1, 1, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10169b = {1, 1, 1, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f10170c = {1, 1, 1, 1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f10171d;

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f10172e;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f10171d = iArr;
        int[][] iArr2 = new int[20][];
        f10172e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i7 = 10; i7 < 20; i7++) {
            int[] iArr3 = f10171d[i7 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i8 = 0; i8 < iArr3.length; i8++) {
                iArr4[i8] = iArr3[(iArr3.length - i8) - 1];
            }
            f10172e[i7] = iArr4;
        }
    }

    public static boolean a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i7 = length - 1;
        return b(charSequence.subSequence(0, i7)) == Character.digit(charSequence.charAt(i7), 10);
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        for (int i8 = length - 1; i8 >= 0; i8 -= 2) {
            int charAt = charSequence.charAt(i8) - '0';
            if (charAt < 0 || charAt > 9) {
                throw V4.d.a();
            }
            i7 += charAt;
        }
        int i9 = i7 * 3;
        for (int i10 = length - 2; i10 >= 0; i10 -= 2) {
            int charAt2 = charSequence.charAt(i10) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw V4.d.a();
            }
            i9 += charAt2;
        }
        return (1000 - i9) % 10;
    }
}

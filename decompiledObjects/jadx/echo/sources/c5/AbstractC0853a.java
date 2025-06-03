package c5;

/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0853a extends m {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f10146a = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10147b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f10148c = {'A', 'B', 'C', 'D'};

    public static boolean a(char[] cArr, char c7) {
        if (cArr != null) {
            for (char c8 : cArr) {
                if (c8 == c7) {
                    return true;
                }
            }
        }
        return false;
    }
}

package k0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class Z0 {
    public static int a(int i7) {
        return b(i7, 0, 0, 0);
    }

    public static int b(int i7, int i8, int i9, int i10) {
        return d(i7, i8, i9, 0, 128, i10);
    }

    public static int c(int i7, int i8, int i9, int i10, int i11) {
        return d(i7, i8, i9, i10, i11, 0);
    }

    public static int d(int i7, int i8, int i9, int i10, int i11, int i12) {
        return i7 | i8 | i9 | i10 | i11 | i12;
    }

    public static int e(int i7) {
        return i7 & 24;
    }

    public static int f(int i7) {
        return i7 & 3584;
    }

    public static int g(int i7) {
        return i7 & 384;
    }

    public static int h(int i7) {
        return i7 & 7;
    }

    public static int i(int i7) {
        return i7 & 64;
    }

    public static int j(int i7) {
        return i7 & 32;
    }

    public static boolean k(int i7, boolean z7) {
        int h7 = h(i7);
        return h7 == 4 || (z7 && h7 == 3);
    }
}

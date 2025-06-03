package b6;

/* renamed from: b6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0808c {
    public static final int a(int i7, int i8, int i9) {
        return c(c(i7, i9) - c(i8, i9), i9);
    }

    public static final int b(int i7, int i8, int i9) {
        if (i9 > 0) {
            return i7 >= i8 ? i8 : i8 - a(i8, i7, i9);
        }
        if (i9 < 0) {
            return i7 <= i8 ? i8 : i8 + a(i7, i8, -i9);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final int c(int i7, int i8) {
        int i9 = i7 % i8;
        return i9 >= 0 ? i9 : i9 + i8;
    }
}

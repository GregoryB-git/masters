package x2;

/* renamed from: x2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2207u {
    public static int a(int i7) {
        int[] iArr = {1, 2, 3};
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = iArr[i8];
            int i10 = i9 - 1;
            if (i9 == 0) {
                throw null;
            }
            if (i10 == i7) {
                return i9;
            }
        }
        return 1;
    }
}

package x2;

/* renamed from: x2.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2186P {
    public static int a(int i7) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i8 = 0; i8 < 6; i8++) {
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

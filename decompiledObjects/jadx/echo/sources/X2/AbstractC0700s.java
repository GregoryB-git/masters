package X2;

/* renamed from: X2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0700s {
    public static int a(int i7, double d7) {
        int max = Math.max(i7, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d7 * highestOneBit))) {
            return highestOneBit;
        }
        int i8 = highestOneBit << 1;
        if (i8 > 0) {
            return i8;
        }
        return 1073741824;
    }

    public static int b(int i7) {
        return (int) (Integer.rotateLeft((int) (i7 * (-862048943)), 15) * 461845907);
    }

    public static int c(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}

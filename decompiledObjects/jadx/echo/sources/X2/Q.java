package X2;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Q {
    public static Object[] a(Object[] objArr, int i7, int i8, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i7, i8, objArr2.getClass());
    }

    public static Object[] b(Object[] objArr, int i7) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i7);
    }

    public static Map c() {
        return C0693k.r();
    }
}

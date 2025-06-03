package X2;

/* loaded from: classes.dex */
public abstract class O {
    public static Object a(Object obj, int i7) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i7);
    }

    public static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    public static Object[] c(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            a(objArr[i8], i8);
        }
        return objArr;
    }

    public static Object[] d(Object[] objArr, int i7) {
        return Q.b(objArr, i7);
    }
}

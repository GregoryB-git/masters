package X2;

/* renamed from: X2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0691i {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static int b(int i7, String str) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i7);
    }

    public static void c(boolean z7) {
        W2.m.p(z7, "no calls to next() since the last call to remove()");
    }
}

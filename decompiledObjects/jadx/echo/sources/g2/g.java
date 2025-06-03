package g2;

/* loaded from: classes.dex */
public abstract class g {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static g a() {
        return new C1315b(a.FATAL_ERROR, -1L);
    }

    public static g d() {
        return new C1315b(a.INVALID_PAYLOAD, -1L);
    }

    public static g e(long j7) {
        return new C1315b(a.OK, j7);
    }

    public static g f() {
        return new C1315b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}

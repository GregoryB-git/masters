package k0;

/* renamed from: k0.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1439u0 extends RuntimeException {

    /* renamed from: o, reason: collision with root package name */
    public final int f16022o;

    public C1439u0(int i7) {
        super(a(i7));
        this.f16022o = i7;
    }

    public static String a(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}

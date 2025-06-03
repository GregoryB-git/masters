package o6;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f18202a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal[] f18203b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i7 = 0; i7 < 4; i7++) {
            threadLocalArr[i7] = new ThreadLocal();
        }
        f18203b = threadLocalArr;
    }

    public static final boolean a() {
        return f18202a;
    }
}

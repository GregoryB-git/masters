package v3;

import java.io.IOException;

/* loaded from: classes.dex */
public class a1 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15237a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15238b;

    public a1(String str, Exception exc, boolean z10, int i10) {
        super(str, exc);
        this.f15237a = z10;
        this.f15238b = i10;
    }

    public static a1 a(String str, RuntimeException runtimeException) {
        return new a1(str, runtimeException, true, 1);
    }

    public static a1 b(String str, Exception exc) {
        return new a1(str, exc, true, 4);
    }

    public static a1 c(String str) {
        return new a1(str, null, false, 1);
    }
}

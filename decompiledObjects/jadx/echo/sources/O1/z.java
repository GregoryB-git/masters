package O1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f3970a = new z();

    /* renamed from: b, reason: collision with root package name */
    public static volatile String f3971b;

    public static final String a() {
        return f3971b;
    }

    public static final boolean b() {
        boolean s7;
        String str = f3971b;
        Boolean bool = null;
        if (str != null) {
            s7 = kotlin.text.r.s(str, "Unity.", false, 2, null);
            bool = Boolean.valueOf(s7);
        }
        return Intrinsics.a(bool, Boolean.TRUE);
    }
}

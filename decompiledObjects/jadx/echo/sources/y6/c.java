package y6;

import u6.F;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final F f21530a = new F("NO_OWNER");

    /* renamed from: b, reason: collision with root package name */
    public static final F f21531b = new F("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z7) {
        return new b(z7);
    }

    public static /* synthetic */ a b(boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        return a(z7);
    }
}

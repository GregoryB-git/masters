package u6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class D {
    public static final C b(Object obj) {
        if (obj == AbstractC2034d.f19975a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (C) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC2034d.f19975a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}

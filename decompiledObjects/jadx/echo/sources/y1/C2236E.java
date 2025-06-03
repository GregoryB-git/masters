package y1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2236E {

    /* renamed from: a, reason: collision with root package name */
    public int f21322a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC2235D f21323b = EnumC2235D.SUCCESS;

    public final int a() {
        return this.f21322a;
    }

    public final EnumC2235D b() {
        return this.f21323b;
    }

    public final void c(int i7) {
        this.f21322a = i7;
    }

    public final void d(EnumC2235D enumC2235D) {
        Intrinsics.checkNotNullParameter(enumC2235D, "<set-?>");
        this.f21323b = enumC2235D;
    }
}

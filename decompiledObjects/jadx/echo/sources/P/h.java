package P;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4112a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Throwable finalException) {
        super(null);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f4112a = finalException;
    }

    public final Throwable a() {
        return this.f4112a;
    }
}

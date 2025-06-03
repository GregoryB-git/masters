package P;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4113a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Throwable readException) {
        super(null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f4113a = readException;
    }

    public final Throwable a() {
        return this.f4113a;
    }
}

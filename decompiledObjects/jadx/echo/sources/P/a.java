package P;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message, Throwable th) {
        super(message, th);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ a(String str, Throwable th, int i7, kotlin.jvm.internal.g gVar) {
        this(str, (i7 & 2) != 0 ? null : th);
    }
}

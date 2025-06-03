package Y1;

import Y1.u;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends O1.F {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, u.e request) {
        super(context, 65536, 65537, 20121101, request.a(), request.m());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // O1.F
    public void e(Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }
}

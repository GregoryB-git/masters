/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package Y1;

import O1.F;
import Y1.u;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class o
extends F {
    public o(Context context, u.e e8) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        Intrinsics.checkNotNullParameter(e8, "request");
        super(context, 65536, 65537, 20121101, e8.a(), e8.m());
    }

    @Override
    public void e(Bundle bundle) {
        Intrinsics.checkNotNullParameter((Object)bundle, "data");
    }
}


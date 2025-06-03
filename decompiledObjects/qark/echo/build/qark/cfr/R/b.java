/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package R;

import O.a;
import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public abstract class b {
    public static final File a(Context context, String string2) {
        Intrinsics.checkNotNullParameter((Object)context, "<this>");
        Intrinsics.checkNotNullParameter(string2, "name");
        return a.a(context, Intrinsics.i(string2, ".preferences_pb"));
    }
}


// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R;

import O.a;
import kotlin.jvm.internal.Intrinsics;
import java.io.File;
import android.content.Context;

public abstract class b
{
    public static final File a(final Context context, final String s) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(s, "name");
        return a.a(context, Intrinsics.i(s, ".preferences_pb"));
    }
}

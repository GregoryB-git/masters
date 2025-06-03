// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O;

import kotlin.jvm.internal.Intrinsics;
import java.io.File;
import android.content.Context;

public abstract class a
{
    public static final File a(final Context context, final String s) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(s, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), Intrinsics.i("datastore/", s));
    }
}

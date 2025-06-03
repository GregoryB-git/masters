/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package O;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public abstract class a {
    public static final File a(Context context, String string2) {
        Intrinsics.checkNotNullParameter((Object)context, "<this>");
        Intrinsics.checkNotNullParameter(string2, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), Intrinsics.i("datastore/", string2));
    }
}


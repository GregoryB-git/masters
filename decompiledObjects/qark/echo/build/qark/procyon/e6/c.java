// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e6;

import kotlin.jvm.internal.Intrinsics;
import java.io.File;

public abstract class c
{
    public static final String b(final File file, final File obj, final String str) {
        final StringBuilder sb = new StringBuilder(file.toString());
        if (obj != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(" -> ");
            sb2.append(obj);
            sb.append(sb2.toString());
        }
        if (str != null) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(": ");
            sb3.append(str);
            sb.append(sb3.toString());
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

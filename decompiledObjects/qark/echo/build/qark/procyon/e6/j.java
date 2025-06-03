// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e6;

import kotlin.jvm.internal.Intrinsics;
import java.io.File;

public class j extends i
{
    public static final e h(final File file, final f f) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(f, "direction");
        return new e(file, f);
    }
    
    public static final e i(final File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return h(file, f.p);
    }
}

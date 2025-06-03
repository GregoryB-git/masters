// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e6;

import kotlin.text.i;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import java.io.File;

public class k extends j
{
    public static boolean j(final File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        final Iterator iterator = j.i(file).iterator();
        boolean b = false;
    Label_0016:
        while (true) {
            b = true;
            while (iterator.hasNext()) {
                final File file2 = iterator.next();
                if ((file2.delete() || !file2.exists()) && b) {
                    continue Label_0016;
                }
                b = false;
            }
            break;
        }
        return b;
    }
    
    public static String k(final File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        final String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return kotlin.text.i.d0(name, '.', "");
    }
}

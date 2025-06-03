// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import java.util.Comparator;
import java.util.List;

public class s extends r
{
    public static void m(final List list, final Comparator c) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(c, "comparator");
        if (list.size() > 1) {
            Collections.sort((List<Object>)list, c);
        }
    }
}

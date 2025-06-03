// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

public class p extends o
{
    public static int l(final Iterable iterable, int size) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            size = ((Collection)iterable).size();
        }
        return size;
    }
}

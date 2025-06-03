// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import kotlin.jvm.internal.Intrinsics;
import java.util.ArrayList;
import kotlin.jvm.internal.g;

public abstract class l
{
    public static Object a(final Object o) {
        return o;
    }
    
    public static final Object c(final Object e, final Object o) {
        if (e == null) {
            return a(o);
        }
        if (e instanceof ArrayList) {
            Intrinsics.c(e, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList)e).add(o);
            return a(e);
        }
        final ArrayList<Object> list = new ArrayList<Object>(4);
        list.add(e);
        list.add(o);
        return a(list);
    }
}

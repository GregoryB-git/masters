/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 */
package u6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public abstract class l {
    public static Object a(Object object) {
        return object;
    }

    public static /* synthetic */ Object b(Object object, int n8, g g8) {
        if ((n8 & 1) != 0) {
            object = null;
        }
        return l.a(object);
    }

    public static final Object c(Object object, Object object2) {
        if (object == null) {
            return l.a(object2);
        }
        if (object instanceof ArrayList) {
            Intrinsics.c(object, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList)object).add(object2);
            return l.a(object);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(object);
        arrayList.add(object2);
        return l.a((Object)arrayList);
    }
}


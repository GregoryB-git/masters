/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArithmeticException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package W5;

import W5.e;
import W5.g;
import W5.m;
import W5.n;
import W5.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l6.c;

public class o
extends n {
    public static /* varargs */ ArrayList d(Object ... arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "elements");
        if (arrobject.length == 0) {
            return new ArrayList();
        }
        return new ArrayList((Collection)new e(arrobject, true));
    }

    public static final Collection e(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        return new e(arrobject, false);
    }

    public static List f() {
        return y.o;
    }

    public static c g(Collection collection) {
        Intrinsics.checkNotNullParameter((Object)collection, "<this>");
        return new c(0, collection.size() - 1);
    }

    public static int h(List list) {
        Intrinsics.checkNotNullParameter((Object)list, "<this>");
        return list.size() - 1;
    }

    public static /* varargs */ List i(Object ... arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "elements");
        if (arrobject.length > 0) {
            return g.b(arrobject);
        }
        return m.f();
    }

    public static final List j(List list) {
        Intrinsics.checkNotNullParameter((Object)list, "<this>");
        int n8 = list.size();
        if (n8 != 0) {
            if (n8 != 1) {
                return list;
            }
            return m.b(list.get(0));
        }
        return m.f();
    }

    public static void k() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}


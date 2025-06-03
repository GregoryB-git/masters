/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.reflect.Array
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 */
package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public abstract class f {
    public static final Object[] a = new Object[0];

    /*
     * Enabled aggressive block sorting
     */
    public static final Object[] a(Collection arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "collection");
        int n8 = arrobject.size();
        if (n8 == 0) {
            return a;
        }
        Iterator iterator = arrobject.iterator();
        if (!iterator.hasNext()) {
            return a;
        }
        arrobject = new Object[n8];
        n8 = 0;
        do {
            Object[] arrobject2;
            int n9 = n8 + 1;
            arrobject[n8] = iterator.next();
            if (n9 >= arrobject.length) {
                int n10;
                if (!iterator.hasNext()) {
                    return arrobject;
                }
                n8 = n10 = n9 * 3 + 1 >>> 1;
                if (n10 <= n9) {
                    n8 = 2147483645;
                    if (n9 >= 2147483645) throw new OutOfMemoryError();
                }
                arrobject2 = Arrays.copyOf((Object[])arrobject, (int)n8);
                Intrinsics.checkNotNullExpressionValue(arrobject2, "copyOf(...)");
            } else {
                arrobject2 = arrobject;
                if (!iterator.hasNext()) {
                    arrobject = Arrays.copyOf((Object[])arrobject, (int)n9);
                    Intrinsics.checkNotNullExpressionValue(arrobject, "copyOf(...)");
                    return arrobject;
                }
            }
            n8 = n9;
            arrobject = arrobject2;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final Object[] b(Collection arrobject, Object[] arrobject2) {
        Intrinsics.checkNotNullParameter(arrobject, "collection");
        arrobject2.getClass();
        int n8 = arrobject.size();
        int n9 = 0;
        if (n8 == 0) {
            arrobject = arrobject2;
            if (arrobject2.length <= 0) return arrobject;
            {
                arrobject2[0] = null;
                return arrobject2;
            }
        } else {
            Iterator iterator = arrobject.iterator();
            if (!iterator.hasNext()) {
                arrobject = arrobject2;
                if (arrobject2.length <= 0) return arrobject;
                {
                    arrobject2[0] = null;
                    return arrobject2;
                }
            } else {
                if (n8 <= arrobject2.length) {
                    arrobject = arrobject2;
                } else {
                    arrobject = Array.newInstance((Class)arrobject2.getClass().getComponentType(), (int)n8);
                    Intrinsics.c(arrobject, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    arrobject = arrobject;
                }
                do {
                    Object[] arrobject3;
                    n8 = n9 + 1;
                    arrobject[n9] = iterator.next();
                    if (n8 >= arrobject.length) {
                        int n10;
                        if (!iterator.hasNext()) {
                            return arrobject;
                        }
                        n9 = n10 = n8 * 3 + 1 >>> 1;
                        if (n10 <= n8) {
                            n9 = 2147483645;
                            if (n8 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        arrobject3 = Arrays.copyOf((Object[])arrobject, (int)n9);
                        Intrinsics.checkNotNullExpressionValue(arrobject3, "copyOf(...)");
                    } else {
                        arrobject3 = arrobject;
                        if (!iterator.hasNext()) {
                            if (arrobject != arrobject2) break;
                            arrobject2[n8] = null;
                            return arrobject2;
                        }
                    }
                    n9 = n8;
                    arrobject = arrobject3;
                } while (true);
                arrobject = Arrays.copyOf((Object[])arrobject, (int)n8);
                Intrinsics.checkNotNullExpressionValue(arrobject, "copyOf(...)");
            }
        }
        return arrobject;
    }
}


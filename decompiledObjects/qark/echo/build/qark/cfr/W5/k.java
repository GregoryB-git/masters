/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.NoSuchElementException
 *  java.util.Set
 */
package W5;

import W5.C;
import W5.I;
import W5.j;
import W5.m;
import W5.o;
import g6.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;

public class k
extends j {
    public static boolean h(Object[] arrobject, Object object) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        if (k.m(arrobject, object) >= 0) {
            return true;
        }
        return false;
    }

    public static Object i(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        if (arrobject.length != 0) {
            return arrobject[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int j(int[] arrn) {
        Intrinsics.checkNotNullParameter(arrn, "<this>");
        return arrn.length - 1;
    }

    public static final int k(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        return arrobject.length - 1;
    }

    public static Object l(Object[] arrobject, int n8) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        if (n8 >= 0 && n8 < arrobject.length) {
            return arrobject[n8];
        }
        return null;
    }

    public static final int m(Object[] arrobject, Object object) {
        int n8;
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        int n9 = 0;
        if (object == null) {
            n9 = arrobject.length;
            for (n8 = 0; n8 < n9; ++n8) {
                if (arrobject[n8] != null) continue;
                return n8;
            }
        } else {
            int n10 = arrobject.length;
            for (n8 = n9; n8 < n10; ++n8) {
                if (!Intrinsics.a(object, arrobject[n8])) continue;
                return n8;
            }
        }
        return -1;
    }

    public static final Appendable n(Object[] arrobject, Appendable appendable, CharSequence charSequence, CharSequence object, CharSequence charSequence2, int n8, CharSequence charSequence3, l l8) {
        int n9;
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        Intrinsics.checkNotNullParameter((Object)appendable, "buffer");
        Intrinsics.checkNotNullParameter((Object)charSequence, "separator");
        Intrinsics.checkNotNullParameter(object, "prefix");
        Intrinsics.checkNotNullParameter((Object)charSequence2, "postfix");
        Intrinsics.checkNotNullParameter((Object)charSequence3, "truncated");
        appendable.append((CharSequence)object);
        int n10 = arrobject.length;
        int n11 = 0;
        int n12 = 0;
        do {
            n9 = n12++;
            if (n11 >= n10) break;
            object = arrobject[n11];
            if (n12 > 1) {
                appendable.append(charSequence);
            }
            if (n8 >= 0) {
                n9 = n12;
                if (n12 > n8) break;
            }
            i.a(appendable, object, l8);
            ++n11;
        } while (true);
        if (n8 >= 0 && n9 > n8) {
            appendable.append(charSequence3);
        }
        appendable.append(charSequence2);
        return appendable;
    }

    public static final String o(Object[] object, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n8, CharSequence charSequence4, l l8) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter((Object)charSequence, "separator");
        Intrinsics.checkNotNullParameter((Object)charSequence2, "prefix");
        Intrinsics.checkNotNullParameter((Object)charSequence3, "postfix");
        Intrinsics.checkNotNullParameter((Object)charSequence4, "truncated");
        object = ((StringBuilder)k.n((Object[])object, (Appendable)new StringBuilder(), charSequence, charSequence2, charSequence3, n8, charSequence4, l8)).toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public static /* synthetic */ String p(Object[] arrobject, CharSequence charSequence, CharSequence charSequence2, CharSequence object, int n8, CharSequence charSequence3, l l8, int n9, Object object2) {
        if ((n9 & 1) != 0) {
            charSequence = ", ";
        }
        object2 = "";
        if ((n9 & 2) != 0) {
            charSequence2 = "";
        }
        if ((n9 & 4) != 0) {
            object = object2;
        }
        if ((n9 & 8) != 0) {
            n8 = -1;
        }
        if ((n9 & 16) != 0) {
            charSequence3 = "...";
        }
        if ((n9 & 32) != 0) {
            l8 = null;
        }
        return k.o(arrobject, charSequence, charSequence2, (CharSequence)object, n8, charSequence3, l8);
    }

    public static char q(char[] arrc) {
        Intrinsics.checkNotNullParameter(arrc, "<this>");
        int n8 = arrc.length;
        if (n8 != 0) {
            if (n8 == 1) {
                return arrc[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object r(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        if (arrobject.length == 1) {
            return arrobject[0];
        }
        return null;
    }

    public static final Collection s(Object[] arrobject, Collection collection) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        Intrinsics.checkNotNullParameter((Object)collection, "destination");
        int n8 = arrobject.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            collection.add(arrobject[i8]);
        }
        return collection;
    }

    public static HashSet t(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        return (HashSet)k.s(arrobject, (Collection)new HashSet(C.a(arrobject.length)));
    }

    public static List u(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        int n8 = arrobject.length;
        if (n8 != 0) {
            if (n8 != 1) {
                return k.v(arrobject);
            }
            return m.b(arrobject[0]);
        }
        return m.f();
    }

    public static final List v(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        return new ArrayList(o.e(arrobject));
    }

    public static final Set w(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        int n8 = arrobject.length;
        if (n8 != 0) {
            if (n8 != 1) {
                return (Set)k.s(arrobject, (Collection)new LinkedHashSet(C.a(arrobject.length)));
            }
            return I.a(arrobject[0]);
        }
        return I.b();
    }
}


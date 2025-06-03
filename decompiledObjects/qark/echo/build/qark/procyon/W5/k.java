// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Collection;
import kotlin.text.i;
import g6.l;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

public class k extends j
{
    public static boolean h(final Object[] array, final Object o) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        return m(array, o) >= 0;
    }
    
    public static Object i(final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        if (array.length != 0) {
            return array[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }
    
    public static int j(final int[] array) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        return array.length - 1;
    }
    
    public static final int k(final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        return array.length - 1;
    }
    
    public static Object l(final Object[] array, final int n) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        if (n >= 0 && n < array.length) {
            return array[n];
        }
        return null;
    }
    
    public static final int m(final Object[] array, final Object o) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        final int n = 0;
        int i = 0;
        if (o == null) {
            while (i < array.length) {
                if (array[i] == null) {
                    return i;
                }
                ++i;
            }
        }
        else {
            for (int length = array.length, j = n; j < length; ++j) {
                if (Intrinsics.a(o, array[j])) {
                    return j;
                }
            }
        }
        return -1;
    }
    
    public static final Appendable n(final Object[] array, final Appendable appendable, final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final l l) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        Intrinsics.checkNotNullParameter(appendable, "buffer");
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        appendable.append(charSequence2);
        final int length = array.length;
        int n2 = 0;
        int n3 = 0;
        int n4;
        while (true) {
            n4 = n3;
            if (n2 >= length) {
                break;
            }
            final Object o = array[n2];
            ++n3;
            if (n3 > 1) {
                appendable.append(charSequence);
            }
            if (n >= 0 && (n4 = n3) > n) {
                break;
            }
            kotlin.text.i.a(appendable, o, l);
            ++n2;
        }
        if (n >= 0 && n4 > n) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }
    
    public static final String o(final Object[] array, final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final l l) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        final String string = ((StringBuilder)n(array, new StringBuilder(), charSequence, charSequence2, charSequence3, n, charSequence4, l)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
    
    public static char q(final char[] array) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        final int length = array.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return array[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
    
    public static Object r(final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        if (array.length == 1) {
            return array[0];
        }
        return null;
    }
    
    public static final Collection s(final Object[] array, final Collection collection) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        Intrinsics.checkNotNullParameter(collection, "destination");
        for (int length = array.length, i = 0; i < length; ++i) {
            collection.add(array[i]);
        }
        return collection;
    }
    
    public static HashSet t(final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        return (HashSet)s(array, new HashSet(C.a(array.length)));
    }
    
    public static List u(final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        final int length = array.length;
        if (length == 0) {
            return m.f();
        }
        if (length != 1) {
            return v(array);
        }
        return m.b(array[0]);
    }
    
    public static final List v(final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        return new ArrayList(o.e(array));
    }
    
    public static final Set w(final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        final int length = array.length;
        if (length == 0) {
            return I.b();
        }
        if (length != 1) {
            return (Set)s(array, new LinkedHashSet(C.a(array.length)));
        }
        return I.a(array[0]);
    }
}

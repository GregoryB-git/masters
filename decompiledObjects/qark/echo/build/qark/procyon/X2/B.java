// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import W2.m;
import java.util.RandomAccess;
import java.util.NoSuchElementException;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import W2.n;

public abstract class B
{
    public static boolean a(final Iterable iterable, final n n) {
        return C.b(iterable.iterator(), n);
    }
    
    public static Collection b(final Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection)iterable;
        }
        return E.i(iterable.iterator());
    }
    
    public static Object c(final Iterable iterable, final Object o) {
        return C.m(iterable.iterator(), o);
    }
    
    public static Object d(final Iterable iterable) {
        if (!(iterable instanceof List)) {
            return C.k(iterable.iterator());
        }
        final List list = (List)iterable;
        if (!list.isEmpty()) {
            return f(list);
        }
        throw new NoSuchElementException();
    }
    
    public static Object e(final Iterable iterable, final Object o) {
        if (iterable instanceof Collection) {
            if (((Collection)iterable).isEmpty()) {
                return o;
            }
            if (iterable instanceof List) {
                return f(E.a(iterable));
            }
        }
        return C.l(iterable.iterator(), o);
    }
    
    public static Object f(final List list) {
        return list.get(list.size() - 1);
    }
    
    public static Object g(final Iterable iterable) {
        return C.n(iterable.iterator());
    }
    
    public static boolean h(final Iterable iterable, final n n) {
        if (iterable instanceof RandomAccess && iterable instanceof List) {
            return i((List)iterable, (n)m.j(n));
        }
        return C.r(iterable.iterator(), n);
    }
    
    public static boolean i(final List list, final n n) {
        boolean b = false;
        int n3;
        int n2 = n3 = 0;
        while (true) {
            Label_0091: {
                if (n2 >= list.size()) {
                    break Label_0091;
                }
                final Object value = list.get(n2);
                int n4 = n3;
                Label_0081: {
                    if (n.apply(value)) {
                        break Label_0081;
                    }
                    Label_0076: {
                        if (n2 <= n3) {
                            break Label_0076;
                        }
                        while (true) {
                            while (true) {
                                try {
                                    list.set(n3, value);
                                    n4 = n3 + 1;
                                    ++n2;
                                    n3 = n4;
                                    break;
                                    j(list, n, n3, n2);
                                    return true;
                                    list.subList(n3, list.size()).clear();
                                    // iftrue(Label_0117:, n2 == n3)
                                    b = true;
                                    Label_0117: {
                                        return b;
                                    }
                                }
                                catch (UnsupportedOperationException ex) {}
                                catch (IllegalArgumentException ex2) {}
                                continue;
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void j(final List list, final n n, final int n2, int i) {
        for (int j = list.size() - 1; j > i; --j) {
            if (n.apply(list.get(j))) {
                list.remove(j);
            }
        }
        for (--i; i >= n2; --i) {
            list.remove(i);
        }
    }
    
    public static Object[] k(final Iterable iterable) {
        return b(iterable).toArray();
    }
}

/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.NoSuchElementException
 *  java.util.RandomAccess
 */
package X2;

import W2.m;
import W2.n;
import X2.C;
import X2.E;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public abstract class B {
    public static boolean a(Iterable iterable, n n8) {
        return C.b(iterable.iterator(), n8);
    }

    public static Collection b(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection)iterable;
        }
        return E.i(iterable.iterator());
    }

    public static Object c(Iterable iterable, Object object) {
        return C.m(iterable.iterator(), object);
    }

    public static Object d(Iterable iterable) {
        if (iterable instanceof List) {
            if (!(iterable = (List)iterable).isEmpty()) {
                return B.f((List)iterable);
            }
            throw new NoSuchElementException();
        }
        return C.k(iterable.iterator());
    }

    public static Object e(Iterable iterable, Object object) {
        if (iterable instanceof Collection) {
            if (((Collection)iterable).isEmpty()) {
                return object;
            }
            if (iterable instanceof List) {
                return B.f(E.a(iterable));
            }
        }
        return C.l(iterable.iterator(), object);
    }

    public static Object f(List list) {
        return list.get(list.size() - 1);
    }

    public static Object g(Iterable iterable) {
        return C.n(iterable.iterator());
    }

    public static boolean h(Iterable iterable, n n8) {
        if (iterable instanceof RandomAccess && iterable instanceof List) {
            return B.i((List)iterable, (n)m.j(n8));
        }
        return C.r(iterable.iterator(), n8);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean i(List list, n n8) {
        int n9;
        boolean bl = false;
        int n10 = n9 = 0;
        do {
            if (n9 >= list.size()) {
                list.subList(n10, list.size()).clear();
                if (n9 == n10) return bl;
                return true;
            }
            Object object = list.get(n9);
            int n11 = n10;
            if (!n8.apply(object)) {
                if (n9 > n10) {
                    list.set(n10, object);
                }
                n11 = n10 + 1;
            }
            ++n9;
            n10 = n11;
        } while (true);
        catch (UnsupportedOperationException unsupportedOperationException) {}
        B.j(list, n8, n10, n9);
        return true;
        catch (IllegalArgumentException illegalArgumentException) {}
        B.j(list, n8, n10, n9);
        return true;
    }

    public static void j(List list, n n8, int n9, int n10) {
        for (int i8 = list.size() - 1; i8 > n10; --i8) {
            if (!n8.apply(list.get(i8))) continue;
            list.remove(i8);
        }
        --n10;
        while (n10 >= n9) {
            list.remove(n10);
            --n10;
        }
    }

    public static Object[] k(Iterable iterable) {
        return B.b(iterable).toArray();
    }
}


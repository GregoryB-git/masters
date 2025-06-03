package X2;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class B {
    public static boolean a(Iterable iterable, W2.n nVar) {
        return C.b(iterable.iterator(), nVar);
    }

    public static Collection b(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : E.i(iterable.iterator());
    }

    public static Object c(Iterable iterable, Object obj) {
        return C.m(iterable.iterator(), obj);
    }

    public static Object d(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return C.k(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return f(list);
    }

    public static Object e(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return f(E.a(iterable));
            }
        }
        return C.l(iterable.iterator(), obj);
    }

    public static Object f(List list) {
        return list.get(list.size() - 1);
    }

    public static Object g(Iterable iterable) {
        return C.n(iterable.iterator());
    }

    public static boolean h(Iterable iterable, W2.n nVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? i((List) iterable, (W2.n) W2.m.j(nVar)) : C.r(iterable.iterator(), nVar);
    }

    public static boolean i(List list, W2.n nVar) {
        int i7 = 0;
        int i8 = 0;
        while (i7 < list.size()) {
            Object obj = list.get(i7);
            if (!nVar.apply(obj)) {
                if (i7 > i8) {
                    try {
                        list.set(i8, obj);
                    } catch (IllegalArgumentException unused) {
                        j(list, nVar, i8, i7);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        j(list, nVar, i8, i7);
                        return true;
                    }
                }
                i8++;
            }
            i7++;
        }
        list.subList(i8, list.size()).clear();
        return i7 != i8;
    }

    public static void j(List list, W2.n nVar, int i7, int i8) {
        for (int size = list.size() - 1; size > i8; size--) {
            if (nVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            list.remove(i9);
        }
    }

    public static Object[] k(Iterable iterable) {
        return b(iterable).toArray();
    }
}

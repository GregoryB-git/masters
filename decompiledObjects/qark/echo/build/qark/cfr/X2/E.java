/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.AbstractList
 *  java.util.AbstractSequentialList
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.RandomAccess
 */
package X2;

import W2.g;
import W2.k;
import W2.m;
import X2.C;
import X2.f0;
import X2.i;
import a3.f;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class E {
    public static List a(Iterable iterable) {
        return (List)iterable;
    }

    public static int b(int n8) {
        i.b(n8, "arraySize");
        return f.m((long)n8 + 5L + (long)(n8 / 10));
    }

    public static boolean c(List list, Object object) {
        if (object == m.j((Object)list)) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        object = (List)object;
        int n8 = list.size();
        if (n8 != object.size()) {
            return false;
        }
        if (list instanceof RandomAccess && object instanceof RandomAccess) {
            for (int i8 = 0; i8 < n8; ++i8) {
                if (k.a(list.get(i8), object.get(i8))) continue;
                return false;
            }
            return true;
        }
        return C.e(list.iterator(), object.iterator());
    }

    public static int d(List list, Object object) {
        if (list instanceof RandomAccess) {
            return E.e(list, object);
        }
        list = list.listIterator();
        while (list.hasNext()) {
            if (!k.a(object, list.next())) continue;
            return list.previousIndex();
        }
        return -1;
    }

    public static int e(List list, Object object) {
        int n8;
        int n9 = list.size();
        int n10 = 0;
        if (object == null) {
            for (n8 = n10; n8 < n9; ++n8) {
                if (list.get(n8) != null) continue;
                return n8;
            }
        } else {
            for (n8 = 0; n8 < n9; ++n8) {
                if (!object.equals(list.get(n8))) continue;
                return n8;
            }
        }
        return -1;
    }

    public static int f(List list, Object object) {
        if (list instanceof RandomAccess) {
            return E.g(list, object);
        }
        list = list.listIterator(list.size());
        while (list.hasPrevious()) {
            if (!k.a(object, list.previous())) continue;
            return list.nextIndex();
        }
        return -1;
    }

    public static int g(List list, Object object) {
        if (object == null) {
            for (int i8 = list.size() - 1; i8 >= 0; --i8) {
                if (list.get(i8) != null) continue;
                return i8;
            }
        } else {
            for (int i9 = list.size() - 1; i9 >= 0; --i9) {
                if (!object.equals(list.get(i9))) continue;
                return i9;
            }
        }
        return -1;
    }

    public static ArrayList h() {
        return new ArrayList();
    }

    public static ArrayList i(Iterator iterator) {
        ArrayList arrayList = E.h();
        C.a((Collection)arrayList, iterator);
        return arrayList;
    }

    public static /* varargs */ ArrayList j(Object ... arrobject) {
        m.j(arrobject);
        ArrayList arrayList = new ArrayList(E.b(arrobject.length));
        Collections.addAll((Collection)arrayList, (Object[])arrobject);
        return arrayList;
    }

    public static List k(List list, g g8) {
        if (list instanceof RandomAccess) {
            return new a(list, g8);
        }
        return new b(list, g8);
    }

    public static class a
    extends AbstractList
    implements RandomAccess,
    Serializable {
        private static final long serialVersionUID = 0L;
        public final List o;
        public final g p;

        public a(List list, g g8) {
            this.o = (List)m.j((Object)list);
            this.p = (g)m.j(g8);
        }

        public Object get(int n8) {
            return this.p.apply(this.o.get(n8));
        }

        public boolean isEmpty() {
            return this.o.isEmpty();
        }

        public Iterator iterator() {
            return this.listIterator();
        }

        public ListIterator listIterator(int n8) {
            return new f0(this.o.listIterator(n8)){

                @Override
                public Object b(Object object) {
                    return a.this.p.apply(object);
                }
            };
        }

        public Object remove(int n8) {
            return this.p.apply(this.o.remove(n8));
        }

        public void removeRange(int n8, int n9) {
            this.o.subList(n8, n9).clear();
        }

        public int size() {
            return this.o.size();
        }

    }

    public static class b
    extends AbstractSequentialList
    implements Serializable {
        private static final long serialVersionUID = 0L;
        public final List o;
        public final g p;

        public b(List list, g g8) {
            this.o = (List)m.j((Object)list);
            this.p = (g)m.j(g8);
        }

        public ListIterator listIterator(int n8) {
            return new f0(this.o.listIterator(n8)){

                @Override
                public Object b(Object object) {
                    return b.this.p.apply(object);
                }
            };
        }

        public void removeRange(int n8, int n9) {
            this.o.subList(n8, n9).clear();
        }

        public int size() {
            return this.o.size();
        }

    }

}


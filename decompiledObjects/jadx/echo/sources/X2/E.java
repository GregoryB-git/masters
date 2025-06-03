package X2;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class E {

    public static class a extends AbstractList implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: o, reason: collision with root package name */
        public final List f7049o;

        /* renamed from: p, reason: collision with root package name */
        public final W2.g f7050p;

        /* renamed from: X2.E$a$a, reason: collision with other inner class name */
        public class C0120a extends f0 {
            public C0120a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // X2.e0
            public Object b(Object obj) {
                return a.this.f7050p.apply(obj);
            }
        }

        public a(List list, W2.g gVar) {
            this.f7049o = (List) W2.m.j(list);
            this.f7050p = (W2.g) W2.m.j(gVar);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i7) {
            return this.f7050p.apply(this.f7049o.get(i7));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f7049o.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i7) {
            return new C0120a(this.f7049o.listIterator(i7));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i7) {
            return this.f7050p.apply(this.f7049o.remove(i7));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i7, int i8) {
            this.f7049o.subList(i7, i8).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7049o.size();
        }
    }

    public static class b extends AbstractSequentialList implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: o, reason: collision with root package name */
        public final List f7052o;

        /* renamed from: p, reason: collision with root package name */
        public final W2.g f7053p;

        public class a extends f0 {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // X2.e0
            public Object b(Object obj) {
                return b.this.f7053p.apply(obj);
            }
        }

        public b(List list, W2.g gVar) {
            this.f7052o = (List) W2.m.j(list);
            this.f7053p = (W2.g) W2.m.j(gVar);
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i7) {
            return new a(this.f7052o.listIterator(i7));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i7, int i8) {
            this.f7052o.subList(i7, i8).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7052o.size();
        }
    }

    public static List a(Iterable iterable) {
        return (List) iterable;
    }

    public static int b(int i7) {
        AbstractC0691i.b(i7, "arraySize");
        return a3.f.m(i7 + 5 + (i7 / 10));
    }

    public static boolean c(List list, Object obj) {
        if (obj == W2.m.j(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C.e(list.iterator(), list2.iterator());
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (!W2.k.a(list.get(i7), list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (W2.k.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int e(List list, Object obj) {
        int size = list.size();
        int i7 = 0;
        if (obj == null) {
            while (i7 < size) {
                if (list.get(i7) == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        while (i7 < size) {
            if (obj.equals(list.get(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static int f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (W2.k.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int g(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList h() {
        return new ArrayList();
    }

    public static ArrayList i(Iterator it) {
        ArrayList h7 = h();
        C.a(h7, it);
        return h7;
    }

    public static ArrayList j(Object... objArr) {
        W2.m.j(objArr);
        ArrayList arrayList = new ArrayList(b(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static List k(List list, W2.g gVar) {
        return list instanceof RandomAccess ? new a(list, gVar) : new b(list, gVar);
    }
}

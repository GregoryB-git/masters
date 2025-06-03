// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import kotlin.text.i;
import g6.l;
import java.util.ListIterator;
import java.util.RandomAccess;
import n6.b;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import l6.c;
import java.util.NoSuchElementException;
import java.util.List;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public class w extends v
{
    public static Comparable A(final Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        final Iterator<Comparable<Comparable>> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        Comparable<Comparable> comparable = iterator.next();
        while (iterator.hasNext()) {
            final Comparable<Comparable> comparable2 = iterator.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }
    
    public static Object B(final Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return C((List<Object>)iterable);
        }
        final Iterator<Object> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        final Object next = iterator.next();
        if (!iterator.hasNext()) {
            return next;
        }
        throw new IllegalArgumentException("Collection has more than one element.");
    }
    
    public static final Object C(final List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        final int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }
    
    public static List D(final List list, final c c) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(c, "indices");
        if (c.isEmpty()) {
            return m.f();
        }
        return m.G(list.subList(c.q(), c.k() + 1));
    }
    
    public static List E(final Iterable iterable, final Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            final List h = H(iterable);
            m.m(h, comparator);
            return h;
        }
        final Collection collection = (Collection)iterable;
        if (collection.size() <= 1) {
            return m.G(iterable);
        }
        final Object[] array = collection.toArray(new Object[0]);
        j.g(array, comparator);
        return g.b(array);
    }
    
    public static final Collection F(final Iterable iterable, final Collection collection) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(collection, "destination");
        final Iterator<Object> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            collection.add(iterator.next());
        }
        return collection;
    }
    
    public static List G(final Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return o.j(H(iterable));
        }
        final List<Object> list = (List<Object>)iterable;
        final int size = list.size();
        if (size == 0) {
            return m.f();
        }
        if (size != 1) {
            return m.I(list);
        }
        Object o;
        if (iterable instanceof List) {
            o = ((List<Object>)iterable).get(0);
        }
        else {
            o = iterable.iterator().next();
        }
        return m.b(o);
    }
    
    public static final List H(final Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m.I((Collection)iterable);
        }
        return (List)F(iterable, new ArrayList());
    }
    
    public static List I(final Collection c) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        return new ArrayList(c);
    }
    
    public static Set J(final Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return K.e((Set)F(iterable, new LinkedHashSet()));
        }
        final List<Object> list = (List<Object>)iterable;
        final int size = list.size();
        if (size == 0) {
            return I.b();
        }
        if (size != 1) {
            return (Set)F(iterable, new LinkedHashSet(C.a(list.size())));
        }
        Object o;
        if (iterable instanceof List) {
            o = ((List<Object>)iterable).get(0);
        }
        else {
            o = iterable.iterator().next();
        }
        return I.a(o);
    }
    
    public static b n(final Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new b() {
            @Override
            public Iterator iterator() {
                return iterable.iterator();
            }
        };
    }
    
    public static boolean o(final Iterable iterable, final Object o) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection)iterable).contains(o);
        }
        return t(iterable, o) >= 0;
    }
    
    public static List p(final Iterable iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i == 0) {
            return m.G(iterable);
        }
        ArrayList<Object> list3;
        if (iterable instanceof Collection) {
            final List<Object> list = (List<Object>)iterable;
            final int initialCapacity = list.size() - i;
            if (initialCapacity <= 0) {
                return m.f();
            }
            if (initialCapacity == 1) {
                return m.b(y(iterable));
            }
            final ArrayList<Object> list2 = list3 = new ArrayList<Object>(initialCapacity);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    while (i < list.size()) {
                        list2.add(((List<Object>)iterable).get(i));
                        ++i;
                    }
                }
                else {
                    final ListIterator<Object> listIterator = ((List<Object>)iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        list2.add(listIterator.next());
                    }
                }
                return list2;
            }
        }
        else {
            list3 = new ArrayList<Object>();
        }
        final Iterator<Object> iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n >= i) {
                list3.add(next);
            }
            else {
                ++n;
            }
        }
        return o.j(list3);
    }
    
    public static Object q(final Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return m.r((List<Object>)iterable);
        }
        final Iterator<Object> iterator = iterable.iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }
    
    public static Object r(final List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }
    
    public static Object s(final List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public static final int t(final Iterable iterable, final Object o) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List<Object>)iterable).indexOf(o);
        }
        final Iterator<Object> iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n < 0) {
                m.k();
            }
            if (Intrinsics.a(o, next)) {
                return n;
            }
            ++n;
        }
        return -1;
    }
    
    public static final Appendable u(final Iterable iterable, final Appendable appendable, final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final l l) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(appendable, "buffer");
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        appendable.append(charSequence2);
        final Iterator<Object> iterator = iterable.iterator();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (!iterator.hasNext()) {
                break;
            }
            final Object next = iterator.next();
            ++n2;
            if (n2 > 1) {
                appendable.append(charSequence);
            }
            if (n >= 0 && (n3 = n2) > n) {
                break;
            }
            i.a(appendable, next, l);
        }
        if (n >= 0 && n3 > n) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }
    
    public static final String w(final Iterable iterable, final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final l l) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        final String string = ((StringBuilder)u(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, n, charSequence4, l)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
    
    public static final Object y(final Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return m.z((List<Object>)iterable);
        }
        final Iterator<Object> iterator = iterable.iterator();
        if (iterator.hasNext()) {
            Object next;
            do {
                next = iterator.next();
            } while (iterator.hasNext());
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }
    
    public static Object z(final List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(m.h(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}

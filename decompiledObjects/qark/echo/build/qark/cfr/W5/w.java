/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.Comparable
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.NoSuchElementException
 *  java.util.RandomAccess
 *  java.util.Set
 */
package W5;

import W5.C;
import W5.I;
import W5.K;
import W5.g;
import W5.j;
import W5.m;
import W5.o;
import W5.v;
import g6.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import l6.c;
import n6.b;

public class w
extends v {
    public static Comparable A(Iterable iterable) {
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        Iterator iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        iterable = (Comparable)iterator.next();
        while (iterator.hasNext()) {
            Comparable comparable = (Comparable)iterator.next();
            if (iterable.compareTo((Object)comparable) <= 0) continue;
            iterable = comparable;
        }
        return iterable;
    }

    public static Object B(Iterable iterable) {
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return w.C((List)iterable);
        }
        if ((iterable = iterable.iterator()).hasNext()) {
            Object object = iterable.next();
            if (!iterable.hasNext()) {
                return object;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object C(List list) {
        Intrinsics.checkNotNullParameter((Object)list, "<this>");
        int n8 = list.size();
        if (n8 != 0) {
            if (n8 == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static List D(List list, c c8) {
        Intrinsics.checkNotNullParameter((Object)list, "<this>");
        Intrinsics.checkNotNullParameter(c8, "indices");
        if (c8.isEmpty()) {
            return m.f();
        }
        return m.G((Iterable)list.subList(c8.q().intValue(), c8.k() + 1));
    }

    public static List E(Iterable arrobject, Comparator comparator) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        Intrinsics.checkNotNullParameter((Object)comparator, "comparator");
        if (arrobject instanceof Collection) {
            Collection collection = (Collection)arrobject;
            if (collection.size() <= 1) {
                return m.G((Iterable)arrobject);
            }
            arrobject = collection.toArray(new Object[0]);
            j.g(arrobject, comparator);
            return g.b(arrobject);
        }
        arrobject = w.H((Iterable)arrobject);
        m.m((List)arrobject, comparator);
        return arrobject;
    }

    public static final Collection F(Iterable iterable, Collection collection) {
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        Intrinsics.checkNotNullParameter((Object)collection, "destination");
        iterable = iterable.iterator();
        while (iterable.hasNext()) {
            collection.add(iterable.next());
        }
        return collection;
    }

    public static List G(Iterable object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            int n8 = collection.size();
            if (n8 != 0) {
                if (n8 != 1) {
                    return m.I(collection);
                }
                object = object instanceof List ? ((List)object).get(0) : object.iterator().next();
                return m.b(object);
            }
            return m.f();
        }
        return o.j(w.H((Iterable)object));
    }

    public static final List H(Iterable iterable) {
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            return m.I((Collection)iterable);
        }
        return (List)w.F(iterable, (Collection)new ArrayList());
    }

    public static List I(Collection collection) {
        Intrinsics.checkNotNullParameter((Object)collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set J(Iterable object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            int n8 = collection.size();
            if (n8 != 0) {
                if (n8 != 1) {
                    return (Set)w.F((Iterable)object, (Collection)new LinkedHashSet(C.a(collection.size())));
                }
                object = object instanceof List ? ((List)object).get(0) : object.iterator().next();
                return I.a(object);
            }
            return I.b();
        }
        return K.e((Set)w.F((Iterable)object, (Collection)new LinkedHashSet()));
    }

    public static b n(final Iterable iterable) {
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        return new b(){

            @Override
            public Iterator iterator() {
                return iterable.iterator();
            }
        };
    }

    public static boolean o(Iterable iterable, Object object) {
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection)iterable).contains(object);
        }
        if (w.t(iterable, object) >= 0) {
            return true;
        }
        return false;
    }

    public static List p(Iterable iterable, int n8) {
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        if (n8 >= 0) {
            Object object;
            int n9;
            Object object2;
            if (n8 == 0) {
                return m.G(iterable);
            }
            if (iterable instanceof Collection) {
                Collection collection = (Collection)iterable;
                n9 = collection.size() - n8;
                if (n9 <= 0) {
                    return m.f();
                }
                if (n9 == 1) {
                    return m.b(w.y(iterable));
                }
                object2 = object = new ArrayList(n9);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        n9 = collection.size();
                        while (n8 < n9) {
                            object.add(((List)iterable).get(n8));
                            ++n8;
                        }
                    } else {
                        iterable = ((List)iterable).listIterator(n8);
                        while (iterable.hasNext()) {
                            object.add(iterable.next());
                        }
                    }
                    return object;
                }
            } else {
                object2 = new ArrayList();
            }
            iterable = iterable.iterator();
            n9 = 0;
            while (iterable.hasNext()) {
                object = iterable.next();
                if (n9 >= n8) {
                    object2.add(object);
                    continue;
                }
                ++n9;
            }
            return o.j((List)object2);
        }
        iterable = new StringBuilder();
        iterable.append("Requested element count ");
        iterable.append(n8);
        iterable.append(" is less than zero.");
        throw new IllegalArgumentException(iterable.toString().toString());
    }

    public static Object q(Iterable iterable) {
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return m.r((List)iterable);
        }
        if ((iterable = iterable.iterator()).hasNext()) {
            return iterable.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object r(List list) {
        Intrinsics.checkNotNullParameter((Object)list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object s(List list) {
        Intrinsics.checkNotNullParameter((Object)list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final int t(Iterable iterable, Object object) {
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return ((List)iterable).indexOf(object);
        }
        iterable = iterable.iterator();
        int n8 = 0;
        while (iterable.hasNext()) {
            Object object2 = iterable.next();
            if (n8 < 0) {
                m.k();
            }
            if (Intrinsics.a(object, object2)) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    public static final Appendable u(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence object, CharSequence charSequence2, int n8, CharSequence charSequence3, l l8) {
        int n9;
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        Intrinsics.checkNotNullParameter((Object)appendable, "buffer");
        Intrinsics.checkNotNullParameter((Object)charSequence, "separator");
        Intrinsics.checkNotNullParameter(object, "prefix");
        Intrinsics.checkNotNullParameter((Object)charSequence2, "postfix");
        Intrinsics.checkNotNullParameter((Object)charSequence3, "truncated");
        appendable.append((CharSequence)object);
        iterable = iterable.iterator();
        int n10 = 0;
        do {
            n9 = n10++;
            if (!iterable.hasNext()) break;
            object = iterable.next();
            if (n10 > 1) {
                appendable.append(charSequence);
            }
            if (n8 >= 0) {
                n9 = n10;
                if (n10 > n8) break;
            }
            i.a(appendable, object, l8);
        } while (true);
        if (n8 >= 0 && n9 > n8) {
            appendable.append(charSequence3);
        }
        appendable.append(charSequence2);
        return appendable;
    }

    public static /* synthetic */ Appendable v(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence object, int n8, CharSequence charSequence3, l l8, int n9, Object object2) {
        if ((n9 & 2) != 0) {
            charSequence = ", ";
        }
        object2 = "";
        if ((n9 & 4) != 0) {
            charSequence2 = "";
        }
        if ((n9 & 8) != 0) {
            object = object2;
        }
        if ((n9 & 16) != 0) {
            n8 = -1;
        }
        if ((n9 & 32) != 0) {
            charSequence3 = "...";
        }
        if ((n9 & 64) != 0) {
            l8 = null;
        }
        return w.u(iterable, appendable, charSequence, charSequence2, (CharSequence)object, n8, charSequence3, l8);
    }

    public static final String w(Iterable object, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n8, CharSequence charSequence4, l l8) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter((Object)charSequence, "separator");
        Intrinsics.checkNotNullParameter((Object)charSequence2, "prefix");
        Intrinsics.checkNotNullParameter((Object)charSequence3, "postfix");
        Intrinsics.checkNotNullParameter((Object)charSequence4, "truncated");
        object = ((StringBuilder)w.u((Iterable)object, (Appendable)new StringBuilder(), charSequence, charSequence2, charSequence3, n8, charSequence4, l8)).toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public static /* synthetic */ String x(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence object, int n8, CharSequence charSequence3, l l8, int n9, Object object2) {
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
        return w.w(iterable, charSequence, charSequence2, (CharSequence)object, n8, charSequence3, l8);
    }

    public static final Object y(Iterable iterable) {
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return m.z((List)iterable);
        }
        if ((iterable = iterable.iterator()).hasNext()) {
            Object object;
            do {
                object = iterable.next();
            } while (iterable.hasNext());
            return object;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object z(List list) {
        Intrinsics.checkNotNullParameter((Object)list, "<this>");
        if (!list.isEmpty()) {
            return list.get(m.h(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

}


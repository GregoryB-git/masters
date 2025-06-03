package sb;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p2.m0;

/* loaded from: classes.dex */
public class q extends p {
    public static final boolean l(Collection collection, Serializable serializable) {
        ec.i.e(collection, "<this>");
        return collection.contains(serializable);
    }

    public static final ArrayList m(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T n(List<? extends T> list) {
        ec.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final void o(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, dc.l lVar) {
        ec.i.e(iterable, "<this>");
        ec.i.e(charSequence, "separator");
        ec.i.e(charSequence2, "prefix");
        ec.i.e(charSequence3, "postfix");
        ec.i.e(charSequence4, "truncated");
        sb2.append(charSequence2);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                sb2.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            } else {
                m0.g(sb2, obj, lVar);
            }
        }
        if (i10 >= 0 && i11 > i10) {
            sb2.append(charSequence4);
        }
        sb2.append(charSequence3);
    }

    public static String p(Iterable iterable, String str, String str2, String str3, dc.l lVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        int i11 = (i10 & 8) != 0 ? -1 : 0;
        CharSequence charSequence = (i10 & 16) != 0 ? "..." : null;
        dc.l lVar2 = (i10 & 32) != 0 ? null : lVar;
        ec.i.e(iterable, "<this>");
        ec.i.e(str4, "separator");
        ec.i.e(str5, "prefix");
        ec.i.e(str6, "postfix");
        ec.i.e(charSequence, "truncated");
        StringBuilder sb2 = new StringBuilder();
        o(iterable, sb2, str4, str5, str6, i11, charSequence, lVar2);
        return sb2.toString();
    }

    public static final List q(List list, int i10) {
        ec.i.e(list, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(a0.j.h("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return s.f14324a;
        }
        if (i10 >= list.size()) {
            return u(list);
        }
        if (i10 == 1) {
            return va.a.f(n(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : va.a.f(arrayList.get(0)) : s.f14324a;
    }

    public static final byte[] r(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static final void s(Iterable iterable, AbstractCollection abstractCollection) {
        ec.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static final int[] t(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static final <T> List<T> u(Iterable<? extends T> iterable) {
        ArrayList arrayList;
        ec.i.e(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        if (z10) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return s.f14324a;
            }
            if (size != 1) {
                return w(collection);
            }
            return va.a.f(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z10) {
            arrayList = w((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            s(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : va.a.f(arrayList.get(0)) : s.f14324a;
    }

    public static final long[] v(Collection<Long> collection) {
        ec.i.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public static final ArrayList w(Collection collection) {
        ec.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> x(Iterable<? extends T> iterable) {
        ec.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            s(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return u.f14326a;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set<T> singleton = Collections.singleton(linkedHashSet.iterator().next());
            ec.i.d(singleton, "singleton(...)");
            return singleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return u.f14326a;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(y.H0(collection.size()));
            s(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set<T> singleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        ec.i.d(singleton2, "singleton(...)");
        return singleton2;
    }
}

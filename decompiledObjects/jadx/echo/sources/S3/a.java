package S3;

import S3.c;
import S3.h;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: o, reason: collision with root package name */
    public final Object[] f5853o;

    /* renamed from: p, reason: collision with root package name */
    public final Object[] f5854p;

    /* renamed from: q, reason: collision with root package name */
    public final Comparator f5855q;

    /* renamed from: S3.a$a, reason: collision with other inner class name */
    public class C0090a implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public int f5856o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f5857p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f5858q;

        public C0090a(int i7, boolean z7) {
            this.f5857p = i7;
            this.f5858q = z7;
            this.f5856o = i7;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object obj = a.this.f5853o[this.f5856o];
            Object[] objArr = a.this.f5854p;
            int i7 = this.f5856o;
            Object obj2 = objArr[i7];
            this.f5856o = this.f5858q ? i7 - 1 : i7 + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f5858q) {
                if (this.f5856o < 0) {
                    return false;
                }
            } else if (this.f5856o >= a.this.f5853o.length) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public a(Comparator comparator) {
        this.f5853o = new Object[0];
        this.f5854p = new Object[0];
        this.f5855q = comparator;
    }

    public static Object[] T(Object[] objArr, int i7, Object obj) {
        Object[] objArr2 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr2, 0, i7);
        objArr2[i7] = obj;
        System.arraycopy(objArr, i7, objArr2, i7 + 1, (r0 - i7) - 1);
        return objArr2;
    }

    public static a U(List list, Map map, c.a.InterfaceC0091a interfaceC0091a, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i7 = 0;
        for (Object obj : list) {
            objArr[i7] = obj;
            objArr2[i7] = map.get(interfaceC0091a.a(obj));
            i7++;
        }
        return new a(comparator, objArr, objArr2);
    }

    public static a X(Map map, Comparator comparator) {
        return U(new ArrayList(map.keySet()), map, c.a.e(), comparator);
    }

    public static Object[] Z(Object[] objArr, int i7) {
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, i7);
        System.arraycopy(objArr, i7 + 1, objArr2, i7, length - i7);
        return objArr2;
    }

    public static Object[] a0(Object[] objArr, int i7, Object obj) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        objArr2[i7] = obj;
        return objArr2;
    }

    @Override // S3.c
    public c D(Object obj) {
        int V6 = V(obj);
        if (V6 == -1) {
            return this;
        }
        return new a(this.f5855q, Z(this.f5853o, V6), Z(this.f5854p, V6));
    }

    @Override // S3.c
    public Iterator P() {
        return Y(this.f5853o.length - 1, true);
    }

    public final int V(Object obj) {
        int i7 = 0;
        for (Object obj2 : this.f5853o) {
            if (this.f5855q.compare(obj, obj2) == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public final int W(Object obj) {
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f5853o;
            if (i7 >= objArr.length || this.f5855q.compare(objArr[i7], obj) >= 0) {
                break;
            }
            i7++;
        }
        return i7;
    }

    public final Iterator Y(int i7, boolean z7) {
        return new C0090a(i7, z7);
    }

    @Override // S3.c
    public boolean a(Object obj) {
        return V(obj) != -1;
    }

    @Override // S3.c
    public Object d(Object obj) {
        int V6 = V(obj);
        if (V6 != -1) {
            return this.f5854p[V6];
        }
        return null;
    }

    @Override // S3.c
    public Comparator f() {
        return this.f5855q;
    }

    @Override // S3.c
    public Object g() {
        Object[] objArr = this.f5853o;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // S3.c
    public Object i() {
        Object[] objArr = this.f5853o;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // S3.c
    public boolean isEmpty() {
        return this.f5853o.length == 0;
    }

    @Override // S3.c, java.lang.Iterable
    public Iterator iterator() {
        return Y(0, false);
    }

    @Override // S3.c
    public Object k(Object obj) {
        int V6 = V(obj);
        if (V6 == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (V6 > 0) {
            return this.f5853o[V6 - 1];
        }
        return null;
    }

    @Override // S3.c
    public void q(h.b bVar) {
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f5853o;
            if (i7 >= objArr.length) {
                return;
            }
            bVar.a(objArr[i7], this.f5854p[i7]);
            i7++;
        }
    }

    @Override // S3.c
    public c s(Object obj, Object obj2) {
        int V6 = V(obj);
        if (V6 != -1) {
            Object[] objArr = this.f5853o;
            if (objArr[V6] == obj && this.f5854p[V6] == obj2) {
                return this;
            }
            return new a(this.f5855q, a0(objArr, V6, obj), a0(this.f5854p, V6, obj2));
        }
        if (this.f5853o.length <= 25) {
            int W6 = W(obj);
            return new a(this.f5855q, T(this.f5853o, W6, obj), T(this.f5854p, W6, obj2));
        }
        HashMap hashMap = new HashMap(this.f5853o.length + 1);
        int i7 = 0;
        while (true) {
            Object[] objArr2 = this.f5853o;
            if (i7 >= objArr2.length) {
                hashMap.put(obj, obj2);
                return k.S(hashMap, this.f5855q);
            }
            hashMap.put(objArr2[i7], this.f5854p[i7]);
            i7++;
        }
    }

    @Override // S3.c
    public int size() {
        return this.f5853o.length;
    }

    public a(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f5853o = objArr;
        this.f5854p = objArr2;
        this.f5855q = comparator;
    }
}

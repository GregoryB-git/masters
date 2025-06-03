package t8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import t8.k;

/* loaded from: classes.dex */
public final class b<K, V> extends c<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final K[] f14646a;

    /* renamed from: b, reason: collision with root package name */
    public final V[] f14647b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparator<K> f14648c;

    public b() {
        v4.d dVar = j9.i.f8682b;
        this.f14646a = (K[]) new Object[0];
        this.f14647b = (V[]) new Object[0];
        this.f14648c = dVar;
    }

    public b(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.f14646a = kArr;
        this.f14647b = vArr;
        this.f14648c = comparator;
    }

    @Override // t8.c
    public final boolean a(K k10) {
        return q(k10) != -1;
    }

    @Override // t8.c
    public final V h(K k10) {
        int q10 = q(k10);
        if (q10 != -1) {
            return this.f14647b[q10];
        }
        return null;
    }

    @Override // t8.c
    public final Comparator<K> i() {
        return this.f14648c;
    }

    @Override // t8.c
    public final boolean isEmpty() {
        return this.f14646a.length == 0;
    }

    @Override // t8.c, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new a(this, 0);
    }

    @Override // t8.c
    public final K k() {
        K[] kArr = this.f14646a;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    @Override // t8.c
    public final K l() {
        K[] kArr = this.f14646a;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t8.c
    public final int m(j9.g gVar) {
        return q(gVar);
    }

    @Override // t8.c
    public final c<K, V> n(K k10, V v10) {
        int q10 = q(k10);
        int i10 = 0;
        if (q10 != -1) {
            K[] kArr = this.f14646a;
            if (kArr[q10] == k10 && this.f14647b[q10] == v10) {
                return this;
            }
            int length = kArr.length;
            Object[] objArr = new Object[length];
            System.arraycopy(kArr, 0, objArr, 0, length);
            objArr[q10] = k10;
            V[] vArr = this.f14647b;
            int length2 = vArr.length;
            Object[] objArr2 = new Object[length2];
            System.arraycopy(vArr, 0, objArr2, 0, length2);
            objArr2[q10] = v10;
            return new b(this.f14648c, objArr, objArr2);
        }
        if (this.f14646a.length <= 25) {
            int i11 = 0;
            while (true) {
                K[] kArr2 = this.f14646a;
                if (i11 >= kArr2.length || this.f14648c.compare(kArr2[i11], k10) >= 0) {
                    break;
                }
                i11++;
            }
            K[] kArr3 = this.f14646a;
            Object[] objArr3 = new Object[kArr3.length + 1];
            System.arraycopy(kArr3, 0, objArr3, 0, i11);
            objArr3[i11] = k10;
            int i12 = i11 + 1;
            System.arraycopy(kArr3, i11, objArr3, i12, (r4 - i11) - 1);
            V[] vArr2 = this.f14647b;
            Object[] objArr4 = new Object[vArr2.length + 1];
            System.arraycopy(vArr2, 0, objArr4, 0, i11);
            objArr4[i11] = v10;
            System.arraycopy(vArr2, i11, objArr4, i12, (r4 - i11) - 1);
            return new b(this.f14648c, objArr3, objArr4);
        }
        HashMap hashMap = new HashMap(this.f14646a.length + 1);
        while (true) {
            K[] kArr4 = this.f14646a;
            if (i10 >= kArr4.length) {
                hashMap.put(k10, v10);
                return k.a.b(new ArrayList(hashMap.keySet()), hashMap, this.f14648c);
            }
            hashMap.put(kArr4[i10], this.f14647b[i10]);
            i10++;
        }
    }

    @Override // t8.c
    public final Iterator<Map.Entry<K, V>> o(K k10) {
        int i10 = 0;
        while (true) {
            K[] kArr = this.f14646a;
            if (i10 >= kArr.length || this.f14648c.compare(kArr[i10], k10) >= 0) {
                break;
            }
            i10++;
        }
        return new a(this, i10);
    }

    @Override // t8.c
    public final c<K, V> p(K k10) {
        int q10 = q(k10);
        if (q10 == -1) {
            return this;
        }
        K[] kArr = this.f14646a;
        int length = kArr.length - 1;
        Object[] objArr = new Object[length];
        System.arraycopy(kArr, 0, objArr, 0, q10);
        int i10 = q10 + 1;
        System.arraycopy(kArr, i10, objArr, q10, length - q10);
        V[] vArr = this.f14647b;
        int length2 = vArr.length - 1;
        Object[] objArr2 = new Object[length2];
        System.arraycopy(vArr, 0, objArr2, 0, q10);
        System.arraycopy(vArr, i10, objArr2, q10, length2 - q10);
        return new b(this.f14648c, objArr, objArr2);
    }

    public final int q(K k10) {
        int i10 = 0;
        for (K k11 : this.f14646a) {
            if (this.f14648c.compare(k10, k11) == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // t8.c
    public final int size() {
        return this.f14646a.length;
    }
}

package V3;

import d4.C1227b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class k implements Iterable, Comparable {

    /* renamed from: r, reason: collision with root package name */
    public static final k f6539r = new k("");

    /* renamed from: o, reason: collision with root package name */
    public final C1227b[] f6540o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6541p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6542q;

    public class a implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public int f6543o;

        public a() {
            this.f6543o = k.this.f6541p;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1227b next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements.");
            }
            C1227b[] c1227bArr = k.this.f6540o;
            int i7 = this.f6543o;
            C1227b c1227b = c1227bArr[i7];
            this.f6543o = i7 + 1;
            return c1227b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6543o < k.this.f6542q;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }

    public k(String str) {
        String[] split = str.split("/", -1);
        int i7 = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                i7++;
            }
        }
        this.f6540o = new C1227b[i7];
        int i8 = 0;
        for (String str3 : split) {
            if (str3.length() > 0) {
                this.f6540o[i8] = C1227b.j(str3);
                i8++;
            }
        }
        this.f6541p = 0;
        this.f6542q = this.f6540o.length;
    }

    public static k Y() {
        return f6539r;
    }

    public static k b0(k kVar, k kVar2) {
        C1227b Z6 = kVar.Z();
        C1227b Z7 = kVar2.Z();
        if (Z6 == null) {
            return kVar2;
        }
        if (Z6.equals(Z7)) {
            return b0(kVar.c0(), kVar2.c0());
        }
        throw new Q3.d("INTERNAL ERROR: " + kVar2 + " is not contained in " + kVar);
    }

    public List S() {
        ArrayList arrayList = new ArrayList(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(((C1227b) it.next()).e());
        }
        return arrayList;
    }

    public k T(k kVar) {
        int size = size() + kVar.size();
        C1227b[] c1227bArr = new C1227b[size];
        System.arraycopy(this.f6540o, this.f6541p, c1227bArr, 0, size());
        System.arraycopy(kVar.f6540o, kVar.f6541p, c1227bArr, size(), kVar.size());
        return new k(c1227bArr, 0, size);
    }

    public k U(C1227b c1227b) {
        int size = size();
        int i7 = size + 1;
        C1227b[] c1227bArr = new C1227b[i7];
        System.arraycopy(this.f6540o, this.f6541p, c1227bArr, 0, size);
        c1227bArr[size] = c1227b;
        return new k(c1227bArr, 0, i7);
    }

    @Override // java.lang.Comparable
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        int i7;
        int i8 = this.f6541p;
        int i9 = kVar.f6541p;
        while (true) {
            i7 = this.f6542q;
            if (i8 >= i7 || i9 >= kVar.f6542q) {
                break;
            }
            int compareTo = this.f6540o[i8].compareTo(kVar.f6540o[i9]);
            if (compareTo != 0) {
                return compareTo;
            }
            i8++;
            i9++;
        }
        if (i8 == i7 && i9 == kVar.f6542q) {
            return 0;
        }
        return i8 == i7 ? -1 : 1;
    }

    public boolean W(k kVar) {
        if (size() > kVar.size()) {
            return false;
        }
        int i7 = this.f6541p;
        int i8 = kVar.f6541p;
        while (i7 < this.f6542q) {
            if (!this.f6540o[i7].equals(kVar.f6540o[i8])) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    public C1227b X() {
        if (isEmpty()) {
            return null;
        }
        return this.f6540o[this.f6542q - 1];
    }

    public C1227b Z() {
        if (isEmpty()) {
            return null;
        }
        return this.f6540o[this.f6541p];
    }

    public k a0() {
        if (isEmpty()) {
            return null;
        }
        return new k(this.f6540o, this.f6541p, this.f6542q - 1);
    }

    public k c0() {
        int i7 = this.f6541p;
        if (!isEmpty()) {
            i7++;
        }
        return new k(this.f6540o, i7, this.f6542q);
    }

    public String d0() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = this.f6541p; i7 < this.f6542q; i7++) {
            if (i7 > this.f6541p) {
                sb.append("/");
            }
            sb.append(this.f6540o[i7].e());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        k kVar = (k) obj;
        if (size() != kVar.size()) {
            return false;
        }
        int i7 = this.f6541p;
        for (int i8 = kVar.f6541p; i7 < this.f6542q && i8 < kVar.f6542q; i8++) {
            if (!this.f6540o[i7].equals(kVar.f6540o[i8])) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public int hashCode() {
        int i7 = 0;
        for (int i8 = this.f6541p; i8 < this.f6542q; i8++) {
            i7 = (i7 * 37) + this.f6540o[i8].hashCode();
        }
        return i7;
    }

    public boolean isEmpty() {
        return this.f6541p >= this.f6542q;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    public int size() {
        return this.f6542q - this.f6541p;
    }

    public String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = this.f6541p; i7 < this.f6542q; i7++) {
            sb.append("/");
            sb.append(this.f6540o[i7].e());
        }
        return sb.toString();
    }

    public k(List list) {
        this.f6540o = new C1227b[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            this.f6540o[i7] = C1227b.j((String) it.next());
            i7++;
        }
        this.f6541p = 0;
        this.f6542q = list.size();
    }

    public k(C1227b... c1227bArr) {
        this.f6540o = (C1227b[]) Arrays.copyOf(c1227bArr, c1227bArr.length);
        this.f6541p = 0;
        this.f6542q = c1227bArr.length;
        for (C1227b c1227b : c1227bArr) {
            Y3.m.g(c1227b != null, "Can't construct a path with a null value!");
        }
    }

    public k(C1227b[] c1227bArr, int i7, int i8) {
        this.f6540o = c1227bArr;
        this.f6541p = i7;
        this.f6542q = i8;
    }
}

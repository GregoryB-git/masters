package s0;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import s0.x;

/* loaded from: classes.dex */
public final class e extends c<Boolean> implements RandomAccess, x0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean[] f13956b;

    /* renamed from: c, reason: collision with root package name */
    public int f13957c;

    static {
        new e(new boolean[0], 0).f13948a = false;
    }

    public e() {
        this(new boolean[10], 0);
    }

    public e(boolean[] zArr, int i10) {
        this.f13956b = zArr;
        this.f13957c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f13957c)) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f13957c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
        boolean[] zArr = this.f13956b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f13956b, i10, zArr2, i10 + 1, this.f13957c - i10);
            this.f13956b = zArr2;
        }
        this.f13956b[i10] = booleanValue;
        this.f13957c++;
        ((AbstractList) this).modCount++;
    }

    @Override // s0.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        Charset charset = x.f14119a;
        collection.getClass();
        if (!(collection instanceof e)) {
            return super.addAll(collection);
        }
        e eVar = (e) collection;
        int i10 = eVar.f13957c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f13957c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f13956b;
        if (i12 > zArr.length) {
            this.f13956b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(eVar.f13956b, 0, this.f13956b, this.f13957c, eVar.f13957c);
        this.f13957c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // s0.x.c
    public final x.c c(int i10) {
        if (i10 >= this.f13957c) {
            return new e(Arrays.copyOf(this.f13956b, i10), this.f13957c);
        }
        throw new IllegalArgumentException();
    }

    @Override // s0.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return super.equals(obj);
        }
        e eVar = (e) obj;
        if (this.f13957c != eVar.f13957c) {
            return false;
        }
        boolean[] zArr = eVar.f13956b;
        for (int i10 = 0; i10 < this.f13957c; i10++) {
            if (this.f13956b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return Boolean.valueOf(this.f13956b[i10]);
    }

    public final void h(boolean z10) {
        a();
        int i10 = this.f13957c;
        boolean[] zArr = this.f13956b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[a0.j.d(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f13956b = zArr2;
        }
        boolean[] zArr3 = this.f13956b;
        int i11 = this.f13957c;
        this.f13957c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // s0.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f13957c; i11++) {
            i10 = (i10 * 31) + x.a(this.f13956b[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f13957c) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f13957c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        i(i10);
        boolean[] zArr = this.f13956b;
        boolean z10 = zArr[i10];
        if (i10 < this.f13957c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f13957c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // s0.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f13957c; i10++) {
            if (obj.equals(Boolean.valueOf(this.f13956b[i10]))) {
                boolean[] zArr = this.f13956b;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f13957c - i10) - 1);
                this.f13957c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f13956b;
        System.arraycopy(zArr, i11, zArr, i10, this.f13957c - i11);
        this.f13957c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        i(i10);
        boolean[] zArr = this.f13956b;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13957c;
    }

    @Override // s0.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(((Boolean) obj).booleanValue());
        return true;
    }
}

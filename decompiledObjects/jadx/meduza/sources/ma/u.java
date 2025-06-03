package ma;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import ma.a0;

/* loaded from: classes.dex */
public final class u extends c<Float> implements RandomAccess, c1 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f11092b;

    /* renamed from: c, reason: collision with root package name */
    public int f11093c;

    static {
        new u(new float[0], 0, false);
    }

    public u() {
        this(new float[10], 0, true);
    }

    public u(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f11092b = fArr;
        this.f11093c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f11093c)) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f11093c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
        float[] fArr = this.f11092b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f11092b, i10, fArr2, i10 + 1, this.f11093c - i10);
            this.f11092b = fArr2;
        }
        this.f11092b[i10] = floatValue;
        this.f11093c++;
        ((AbstractList) this).modCount++;
    }

    @Override // ma.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        Charset charset = a0.f10909a;
        collection.getClass();
        if (!(collection instanceof u)) {
            return super.addAll(collection);
        }
        u uVar = (u) collection;
        int i10 = uVar.f11093c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f11093c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f11092b;
        if (i12 > fArr.length) {
            this.f11092b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(uVar.f11092b, 0, this.f11092b, this.f11093c, uVar.f11093c);
        this.f11093c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // ma.a0.d
    public final a0.d c(int i10) {
        if (i10 >= this.f11093c) {
            return new u(Arrays.copyOf(this.f11092b, i10), this.f11093c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ma.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return super.equals(obj);
        }
        u uVar = (u) obj;
        if (this.f11093c != uVar.f11093c) {
            return false;
        }
        float[] fArr = uVar.f11092b;
        for (int i10 = 0; i10 < this.f11093c; i10++) {
            if (Float.floatToIntBits(this.f11092b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return Float.valueOf(this.f11092b[i10]);
    }

    public final void h(float f) {
        a();
        int i10 = this.f11093c;
        float[] fArr = this.f11092b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[a0.j.d(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f11092b = fArr2;
        }
        float[] fArr3 = this.f11092b;
        int i11 = this.f11093c;
        this.f11093c = i11 + 1;
        fArr3[i11] = f;
    }

    @Override // ma.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f11093c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f11092b[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f11093c) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f11093c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f11093c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f11092b[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // ma.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        i(i10);
        float[] fArr = this.f11092b;
        float f = fArr[i10];
        if (i10 < this.f11093c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f11093c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f11092b;
        System.arraycopy(fArr, i11, fArr, i10, this.f11093c - i11);
        this.f11093c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        i(i10);
        float[] fArr = this.f11092b;
        float f = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11093c;
    }

    @Override // ma.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }
}

package xb;

import defpackage.f;
import ec.i;
import java.io.Serializable;
import java.lang.Enum;
import sb.d;

/* loaded from: classes.dex */
public final class b<T extends Enum<T>> extends d<T> implements a<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final T[] f17237a;

    public b(T[] tArr) {
        i.e(tArr, "entries");
        this.f17237a = tArr;
    }

    @Override // sb.b
    public final int a() {
        return this.f17237a.length;
    }

    @Override // sb.b, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r62 = (Enum) obj;
        i.e(r62, "element");
        T[] tArr = this.f17237a;
        int ordinal = r62.ordinal();
        i.e(tArr, "<this>");
        return (ordinal >= 0 && ordinal < tArr.length ? tArr[ordinal] : null) == r62;
    }

    @Override // sb.d, java.util.List
    public final Object get(int i10) {
        T[] tArr = this.f17237a;
        int length = tArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(f.i("index: ", i10, ", size: ", length));
        }
        return tArr[i10];
    }

    @Override // sb.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r62 = (Enum) obj;
        i.e(r62, "element");
        int ordinal = r62.ordinal();
        T[] tArr = this.f17237a;
        i.e(tArr, "<this>");
        boolean z10 = false;
        if (ordinal >= 0 && ordinal < tArr.length) {
            z10 = true;
        }
        if ((z10 ? tArr[ordinal] : null) == r62) {
            return ordinal;
        }
        return -1;
    }

    @Override // sb.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r22 = (Enum) obj;
        i.e(r22, "element");
        return indexOf(r22);
    }
}

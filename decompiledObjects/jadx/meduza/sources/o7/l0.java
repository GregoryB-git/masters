package o7;

import java.util.Objects;

/* loaded from: classes.dex */
public final class l0<E> extends t<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final l0 f12009e = new l0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f12010c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f12011d;

    public l0(Object[] objArr, int i10) {
        this.f12010c = objArr;
        this.f12011d = i10;
    }

    @Override // java.util.List
    public final E get(int i10) {
        x6.b.v(i10, this.f12011d);
        E e10 = (E) this.f12010c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // o7.t, o7.r
    public final int h(int i10, Object[] objArr) {
        System.arraycopy(this.f12010c, 0, objArr, i10, this.f12011d);
        return i10 + this.f12011d;
    }

    @Override // o7.r
    public final Object[] i() {
        return this.f12010c;
    }

    @Override // o7.r
    public final int k() {
        return this.f12011d;
    }

    @Override // o7.r
    public final int l() {
        return 0;
    }

    @Override // o7.r
    public final boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12011d;
    }
}

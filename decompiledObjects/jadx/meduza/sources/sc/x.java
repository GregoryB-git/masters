package sc;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nc.y0;
import sc.y;

/* loaded from: classes.dex */
public class x<T extends y & Comparable<? super T>> {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14377b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public T[] f14378a;

    public final void a(y0.c cVar) {
        cVar.f((y0.d) this);
        T[] tArr = this.f14378a;
        if (tArr == null) {
            tArr = (T[]) new y[4];
            this.f14378a = tArr;
        } else if (b() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, b() * 2);
            ec.i.d(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((y[]) copyOf);
            this.f14378a = tArr;
        }
        int b10 = b();
        f14377b.set(this, b10 + 1);
        tArr[b10] = cVar;
        cVar.f11576b = b10;
        d(b10);
    }

    public final int b() {
        return f14377b.get(this);
    }

    public final T c(int i10) {
        T[] tArr = this.f14378a;
        ec.i.b(tArr);
        f14377b.set(this, b() - 1);
        if (i10 < b()) {
            e(i10, b());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t = tArr[i10];
                ec.i.b(t);
                T t10 = tArr[i11];
                ec.i.b(t10);
                if (((Comparable) t).compareTo(t10) < 0) {
                    e(i10, i11);
                    d(i11);
                }
            }
            while (true) {
                int i12 = (i10 * 2) + 1;
                if (i12 >= b()) {
                    break;
                }
                T[] tArr2 = this.f14378a;
                ec.i.b(tArr2);
                int i13 = i12 + 1;
                if (i13 < b()) {
                    T t11 = tArr2[i13];
                    ec.i.b(t11);
                    T t12 = tArr2[i12];
                    ec.i.b(t12);
                    if (((Comparable) t11).compareTo(t12) < 0) {
                        i12 = i13;
                    }
                }
                T t13 = tArr2[i10];
                ec.i.b(t13);
                T t14 = tArr2[i12];
                ec.i.b(t14);
                if (((Comparable) t13).compareTo(t14) <= 0) {
                    break;
                }
                e(i10, i12);
                i10 = i12;
            }
        }
        T t15 = tArr[b()];
        ec.i.b(t15);
        t15.f(null);
        t15.setIndex(-1);
        tArr[b()] = null;
        return t15;
    }

    public final void d(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f14378a;
            ec.i.b(tArr);
            int i11 = (i10 - 1) / 2;
            T t = tArr[i11];
            ec.i.b(t);
            T t10 = tArr[i10];
            ec.i.b(t10);
            if (((Comparable) t).compareTo(t10) <= 0) {
                return;
            }
            e(i10, i11);
            i10 = i11;
        }
    }

    public final void e(int i10, int i11) {
        T[] tArr = this.f14378a;
        ec.i.b(tArr);
        T t = tArr[i11];
        ec.i.b(t);
        T t10 = tArr[i10];
        ec.i.b(t10);
        tArr[i10] = t;
        tArr[i11] = t10;
        t.setIndex(i10);
        t10.setIndex(i11);
    }
}

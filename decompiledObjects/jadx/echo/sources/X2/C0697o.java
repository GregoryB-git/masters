package X2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: X2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697o extends P implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: o, reason: collision with root package name */
    public final Comparator[] f7181o;

    public C0697o(Comparator comparator, Comparator comparator2) {
        this.f7181o = new Comparator[]{comparator, comparator2};
    }

    @Override // X2.P, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i7 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f7181o;
            if (i7 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i7].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i7++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0697o) {
            return Arrays.equals(this.f7181o, ((C0697o) obj).f7181o);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7181o);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f7181o) + ")";
    }
}

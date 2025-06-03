package ic;

import java.util.Iterator;

/* loaded from: classes.dex */
public class d implements Iterable<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final int f7954a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7955b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7956c;

    public d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f7954a = i10;
        this.f7955b = va.a.e(i10, i11, i12);
        this.f7956c = i12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f7954a != dVar.f7954a || this.f7955b != dVar.f7955b || this.f7956c != dVar.f7956c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f7954a * 31) + this.f7955b) * 31) + this.f7956c;
    }

    public boolean isEmpty() {
        if (this.f7956c > 0) {
            if (this.f7954a > this.f7955b) {
                return true;
            }
        } else if (this.f7954a < this.f7955b) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new e(this.f7954a, this.f7955b, this.f7956c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f7956c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f7954a);
            sb2.append("..");
            sb2.append(this.f7955b);
            sb2.append(" step ");
            i10 = this.f7956c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f7954a);
            sb2.append(" downTo ");
            sb2.append(this.f7955b);
            sb2.append(" step ");
            i10 = -this.f7956c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}

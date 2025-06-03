package l6;

import W5.B;
import b6.AbstractC0808c;
import kotlin.jvm.internal.g;

/* loaded from: classes.dex */
public class a implements Iterable, h6.a {

    /* renamed from: r, reason: collision with root package name */
    public static final C0233a f17297r = new C0233a(null);

    /* renamed from: o, reason: collision with root package name */
    public final int f17298o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17299p;

    /* renamed from: q, reason: collision with root package name */
    public final int f17300q;

    /* renamed from: l6.a$a, reason: collision with other inner class name */
    public static final class C0233a {
        public C0233a() {
        }

        public /* synthetic */ C0233a(g gVar) {
            this();
        }

        public final a a(int i7, int i8, int i9) {
            return new a(i7, i8, i9);
        }
    }

    public a(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f17298o = i7;
        this.f17299p = AbstractC0808c.b(i7, i8, i9);
        this.f17300q = i9;
    }

    public final int a() {
        return this.f17298o;
    }

    public final int d() {
        return this.f17299p;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f17298o != aVar.f17298o || this.f17299p != aVar.f17299p || this.f17300q != aVar.f17300q) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f17300q;
    }

    @Override // java.lang.Iterable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public B iterator() {
        return new b(this.f17298o, this.f17299p, this.f17300q);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f17298o * 31) + this.f17299p) * 31) + this.f17300q;
    }

    public boolean isEmpty() {
        if (this.f17300q > 0) {
            if (this.f17298o <= this.f17299p) {
                return false;
            }
        } else if (this.f17298o >= this.f17299p) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i7;
        if (this.f17300q > 0) {
            sb = new StringBuilder();
            sb.append(this.f17298o);
            sb.append("..");
            sb.append(this.f17299p);
            sb.append(" step ");
            i7 = this.f17300q;
        } else {
            sb = new StringBuilder();
            sb.append(this.f17298o);
            sb.append(" downTo ");
            sb.append(this.f17299p);
            sb.append(" step ");
            i7 = -this.f17300q;
        }
        sb.append(i7);
        return sb.toString();
    }
}

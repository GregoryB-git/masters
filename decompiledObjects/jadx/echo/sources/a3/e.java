package a3;

import W2.m;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: r, reason: collision with root package name */
    public static final e f8071r = new e(new int[0]);

    /* renamed from: o, reason: collision with root package name */
    public final int[] f8072o;

    /* renamed from: p, reason: collision with root package name */
    public final transient int f8073p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8074q;

    public e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static e a(int[] iArr) {
        return iArr.length == 0 ? f8071r : new e(Arrays.copyOf(iArr, iArr.length));
    }

    public static e f() {
        return f8071r;
    }

    public int b(int i7) {
        m.h(i7, e());
        return this.f8072o[this.f8073p + i7];
    }

    public boolean c() {
        return this.f8074q == this.f8073p;
    }

    public final boolean d() {
        return this.f8073p > 0 || this.f8074q < this.f8072o.length;
    }

    public int e() {
        return this.f8074q - this.f8073p;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (e() != eVar.e()) {
            return false;
        }
        for (int i7 = 0; i7 < e(); i7++) {
            if (b(i7) != eVar.b(i7)) {
                return false;
            }
        }
        return true;
    }

    public int[] g() {
        return Arrays.copyOfRange(this.f8072o, this.f8073p, this.f8074q);
    }

    public e h() {
        return d() ? new e(g()) : this;
    }

    public int hashCode() {
        int i7 = 1;
        for (int i8 = this.f8073p; i8 < this.f8074q; i8++) {
            i7 = (i7 * 31) + f.i(this.f8072o[i8]);
        }
        return i7;
    }

    public Object readResolve() {
        return c() ? f8071r : this;
    }

    public String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(e() * 5);
        sb.append('[');
        sb.append(this.f8072o[this.f8073p]);
        int i7 = this.f8073p;
        while (true) {
            i7++;
            if (i7 >= this.f8074q) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.f8072o[i7]);
        }
    }

    public Object writeReplace() {
        return h();
    }

    public e(int[] iArr, int i7, int i8) {
        this.f8072o = iArr;
        this.f8073p = i7;
        this.f8074q = i8;
    }
}

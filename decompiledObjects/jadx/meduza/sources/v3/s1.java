package v3;

import java.util.Arrays;
import o7.t;

/* loaded from: classes.dex */
public final class s1 implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final s1 f15784b;

    /* renamed from: a, reason: collision with root package name */
    public final o7.t<a> f15785a;

    public static final class a implements g {
        public static final String f = v5.e0.E(0);

        /* renamed from: o, reason: collision with root package name */
        public static final String f15786o = v5.e0.E(1);

        /* renamed from: p, reason: collision with root package name */
        public static final String f15787p = v5.e0.E(3);

        /* renamed from: q, reason: collision with root package name */
        public static final String f15788q = v5.e0.E(4);

        /* renamed from: a, reason: collision with root package name */
        public final int f15789a;

        /* renamed from: b, reason: collision with root package name */
        public final z4.i0 f15790b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f15791c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f15792d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean[] f15793e;

        static {
            new e0.e(9);
        }

        public a(z4.i0 i0Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = i0Var.f17684a;
            this.f15789a = i10;
            boolean z11 = false;
            x6.b.q(i10 == iArr.length && i10 == zArr.length);
            this.f15790b = i0Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f15791c = z11;
            this.f15792d = (int[]) iArr.clone();
            this.f15793e = (boolean[]) zArr.clone();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15791c == aVar.f15791c && this.f15790b.equals(aVar.f15790b) && Arrays.equals(this.f15792d, aVar.f15792d) && Arrays.equals(this.f15793e, aVar.f15793e);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f15793e) + ((Arrays.hashCode(this.f15792d) + (((this.f15790b.hashCode() * 31) + (this.f15791c ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        t.b bVar = o7.t.f12050b;
        f15784b = new s1(o7.l0.f12009e);
        v5.e0.E(0);
    }

    public s1(o7.l0 l0Var) {
        this.f15785a = o7.t.p(l0Var);
    }

    public final boolean a(int i10) {
        boolean z10;
        for (int i11 = 0; i11 < this.f15785a.size(); i11++) {
            a aVar = this.f15785a.get(i11);
            boolean[] zArr = aVar.f15793e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    z10 = false;
                    break;
                }
                if (zArr[i12]) {
                    z10 = true;
                    break;
                }
                i12++;
            }
            if (z10 && aVar.f15790b.f17686c == i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1.class != obj.getClass()) {
            return false;
        }
        return this.f15785a.equals(((s1) obj).f15785a);
    }

    public final int hashCode() {
        return this.f15785a.hashCode();
    }
}

package d0;

import android.util.SparseBooleanArray;
import g0.AbstractC1297a;

/* renamed from: d0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f12664a;

    /* renamed from: d0.p$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f12665a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        public boolean f12666b;

        public b a(int i7) {
            AbstractC1297a.f(!this.f12666b);
            this.f12665a.append(i7, true);
            return this;
        }

        public b b(C1193p c1193p) {
            for (int i7 = 0; i7 < c1193p.c(); i7++) {
                a(c1193p.b(i7));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i7 : iArr) {
                a(i7);
            }
            return this;
        }

        public b d(int i7, boolean z7) {
            return z7 ? a(i7) : this;
        }

        public C1193p e() {
            AbstractC1297a.f(!this.f12666b);
            this.f12666b = true;
            return new C1193p(this.f12665a);
        }
    }

    public C1193p(SparseBooleanArray sparseBooleanArray) {
        this.f12664a = sparseBooleanArray;
    }

    public boolean a(int i7) {
        return this.f12664a.get(i7);
    }

    public int b(int i7) {
        AbstractC1297a.c(i7, 0, c());
        return this.f12664a.keyAt(i7);
    }

    public int c() {
        return this.f12664a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1193p)) {
            return false;
        }
        C1193p c1193p = (C1193p) obj;
        if (g0.M.f14261a >= 24) {
            return this.f12664a.equals(c1193p.f12664a);
        }
        if (c() != c1193p.c()) {
            return false;
        }
        for (int i7 = 0; i7 < c(); i7++) {
            if (b(i7) != c1193p.b(i7)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (g0.M.f14261a >= 24) {
            return this.f12664a.hashCode();
        }
        int c7 = c();
        for (int i7 = 0; i7 < c(); i7++) {
            c7 = (c7 * 31) + b(i7);
        }
        return c7;
    }
}

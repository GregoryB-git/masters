package k0;

import d0.C1194q;
import g0.AbstractC1297a;

/* renamed from: k0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1429p {

    /* renamed from: a, reason: collision with root package name */
    public final String f15863a;

    /* renamed from: b, reason: collision with root package name */
    public final C1194q f15864b;

    /* renamed from: c, reason: collision with root package name */
    public final C1194q f15865c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15866d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15867e;

    public C1429p(String str, C1194q c1194q, C1194q c1194q2, int i7, int i8) {
        AbstractC1297a.a(i7 == 0 || i8 == 0);
        this.f15863a = AbstractC1297a.d(str);
        this.f15864b = (C1194q) AbstractC1297a.e(c1194q);
        this.f15865c = (C1194q) AbstractC1297a.e(c1194q2);
        this.f15866d = i7;
        this.f15867e = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1429p.class != obj.getClass()) {
            return false;
        }
        C1429p c1429p = (C1429p) obj;
        return this.f15866d == c1429p.f15866d && this.f15867e == c1429p.f15867e && this.f15863a.equals(c1429p.f15863a) && this.f15864b.equals(c1429p.f15864b) && this.f15865c.equals(c1429p.f15865c);
    }

    public int hashCode() {
        return ((((((((527 + this.f15866d) * 31) + this.f15867e) * 31) + this.f15863a.hashCode()) * 31) + this.f15864b.hashCode()) * 31) + this.f15865c.hashCode();
    }
}

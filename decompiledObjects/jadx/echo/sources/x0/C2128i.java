package x0;

import X2.AbstractC0703v;
import g0.AbstractC1297a;
import java.util.List;
import k0.C1447y0;

/* renamed from: x0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2128i implements S {

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC0703v f20757o;

    /* renamed from: p, reason: collision with root package name */
    public long f20758p;

    /* renamed from: x0.i$a */
    public static final class a implements S {

        /* renamed from: o, reason: collision with root package name */
        public final S f20759o;

        /* renamed from: p, reason: collision with root package name */
        public final AbstractC0703v f20760p;

        public a(S s7, List list) {
            this.f20759o = s7;
            this.f20760p = AbstractC0703v.U(list);
        }

        public AbstractC0703v a() {
            return this.f20760p;
        }

        @Override // x0.S
        public boolean b() {
            return this.f20759o.b();
        }

        @Override // x0.S
        public long c() {
            return this.f20759o.c();
        }

        @Override // x0.S
        public long f() {
            return this.f20759o.f();
        }

        @Override // x0.S
        public boolean g(C1447y0 c1447y0) {
            return this.f20759o.g(c1447y0);
        }

        @Override // x0.S
        public void h(long j7) {
            this.f20759o.h(j7);
        }
    }

    public C2128i(List list, List list2) {
        AbstractC0703v.a M6 = AbstractC0703v.M();
        AbstractC1297a.a(list.size() == list2.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            M6.a(new a((S) list.get(i7), (List) list2.get(i7)));
        }
        this.f20757o = M6.k();
        this.f20758p = -9223372036854775807L;
    }

    @Override // x0.S
    public boolean b() {
        for (int i7 = 0; i7 < this.f20757o.size(); i7++) {
            if (((a) this.f20757o.get(i7)).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // x0.S
    public long c() {
        long j7 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < this.f20757o.size(); i7++) {
            long c7 = ((a) this.f20757o.get(i7)).c();
            if (c7 != Long.MIN_VALUE) {
                j7 = Math.min(j7, c7);
            }
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    @Override // x0.S
    public long f() {
        long j7 = Long.MAX_VALUE;
        long j8 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < this.f20757o.size(); i7++) {
            a aVar = (a) this.f20757o.get(i7);
            long f7 = aVar.f();
            if ((aVar.a().contains(1) || aVar.a().contains(2) || aVar.a().contains(4)) && f7 != Long.MIN_VALUE) {
                j7 = Math.min(j7, f7);
            }
            if (f7 != Long.MIN_VALUE) {
                j8 = Math.min(j8, f7);
            }
        }
        if (j7 != Long.MAX_VALUE) {
            this.f20758p = j7;
            return j7;
        }
        if (j8 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j9 = this.f20758p;
        return j9 != -9223372036854775807L ? j9 : j8;
    }

    @Override // x0.S
    public boolean g(C1447y0 c1447y0) {
        boolean z7;
        boolean z8 = false;
        do {
            long c7 = c();
            if (c7 == Long.MIN_VALUE) {
                break;
            }
            z7 = false;
            for (int i7 = 0; i7 < this.f20757o.size(); i7++) {
                long c8 = ((a) this.f20757o.get(i7)).c();
                boolean z9 = c8 != Long.MIN_VALUE && c8 <= c1447y0.f16072a;
                if (c8 == c7 || z9) {
                    z7 |= ((a) this.f20757o.get(i7)).g(c1447y0);
                }
            }
            z8 |= z7;
        } while (z7);
        return z8;
    }

    @Override // x0.S
    public void h(long j7) {
        for (int i7 = 0; i7 < this.f20757o.size(); i7++) {
            ((a) this.f20757o.get(i7)).h(j7);
        }
    }
}

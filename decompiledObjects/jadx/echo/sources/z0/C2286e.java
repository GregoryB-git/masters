package z0;

import X2.AbstractC0703v;
import X2.P;
import c1.C0816e;
import g0.AbstractC1297a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2286e implements InterfaceC2282a {

    /* renamed from: b, reason: collision with root package name */
    public static final P f21598b = P.d().f(new W2.g() { // from class: z0.c
        @Override // W2.g
        public final Object apply(Object obj) {
            Long h7;
            h7 = C2286e.h((C0816e) obj);
            return h7;
        }
    }).a(P.d().g().f(new W2.g() { // from class: z0.d
        @Override // W2.g
        public final Object apply(Object obj) {
            Long i7;
            i7 = C2286e.i((C0816e) obj);
            return i7;
        }
    }));

    /* renamed from: a, reason: collision with root package name */
    public final List f21599a = new ArrayList();

    public static /* synthetic */ Long h(C0816e c0816e) {
        return Long.valueOf(c0816e.f10020b);
    }

    public static /* synthetic */ Long i(C0816e c0816e) {
        return Long.valueOf(c0816e.f10021c);
    }

    @Override // z0.InterfaceC2282a
    public AbstractC0703v a(long j7) {
        if (!this.f21599a.isEmpty()) {
            if (j7 >= ((C0816e) this.f21599a.get(0)).f10020b) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < this.f21599a.size(); i7++) {
                    C0816e c0816e = (C0816e) this.f21599a.get(i7);
                    if (j7 >= c0816e.f10020b && j7 < c0816e.f10022d) {
                        arrayList.add(c0816e);
                    }
                    if (j7 < c0816e.f10020b) {
                        break;
                    }
                }
                AbstractC0703v g02 = AbstractC0703v.g0(f21598b, arrayList);
                AbstractC0703v.a M6 = AbstractC0703v.M();
                for (int i8 = 0; i8 < g02.size(); i8++) {
                    M6.j(((C0816e) g02.get(i8)).f10019a);
                }
                return M6.k();
            }
        }
        return AbstractC0703v.Y();
    }

    @Override // z0.InterfaceC2282a
    public long b(long j7) {
        int i7 = 0;
        long j8 = -9223372036854775807L;
        while (true) {
            if (i7 >= this.f21599a.size()) {
                break;
            }
            long j9 = ((C0816e) this.f21599a.get(i7)).f10020b;
            long j10 = ((C0816e) this.f21599a.get(i7)).f10022d;
            if (j7 < j9) {
                j8 = j8 == -9223372036854775807L ? j9 : Math.min(j8, j9);
            } else {
                if (j7 < j10) {
                    j8 = j8 == -9223372036854775807L ? j10 : Math.min(j8, j10);
                }
                i7++;
            }
        }
        if (j8 != -9223372036854775807L) {
            return j8;
        }
        return Long.MIN_VALUE;
    }

    @Override // z0.InterfaceC2282a
    public boolean c(C0816e c0816e, long j7) {
        AbstractC1297a.a(c0816e.f10020b != -9223372036854775807L);
        AbstractC1297a.a(c0816e.f10021c != -9223372036854775807L);
        boolean z7 = c0816e.f10020b <= j7 && j7 < c0816e.f10022d;
        for (int size = this.f21599a.size() - 1; size >= 0; size--) {
            if (c0816e.f10020b >= ((C0816e) this.f21599a.get(size)).f10020b) {
                this.f21599a.add(size + 1, c0816e);
                return z7;
            }
        }
        this.f21599a.add(0, c0816e);
        return z7;
    }

    @Override // z0.InterfaceC2282a
    public void clear() {
        this.f21599a.clear();
    }

    @Override // z0.InterfaceC2282a
    public long d(long j7) {
        if (this.f21599a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j7 < ((C0816e) this.f21599a.get(0)).f10020b) {
            return -9223372036854775807L;
        }
        long j8 = ((C0816e) this.f21599a.get(0)).f10020b;
        for (int i7 = 0; i7 < this.f21599a.size(); i7++) {
            long j9 = ((C0816e) this.f21599a.get(i7)).f10020b;
            long j10 = ((C0816e) this.f21599a.get(i7)).f10022d;
            if (j10 > j7) {
                if (j9 > j7) {
                    break;
                }
                j8 = Math.max(j8, j9);
            } else {
                j8 = Math.max(j8, j10);
            }
        }
        return j8;
    }

    @Override // z0.InterfaceC2282a
    public void e(long j7) {
        int i7 = 0;
        while (i7 < this.f21599a.size()) {
            long j8 = ((C0816e) this.f21599a.get(i7)).f10020b;
            if (j7 > j8 && j7 > ((C0816e) this.f21599a.get(i7)).f10022d) {
                this.f21599a.remove(i7);
                i7--;
            } else if (j7 < j8) {
                return;
            }
            i7++;
        }
    }
}

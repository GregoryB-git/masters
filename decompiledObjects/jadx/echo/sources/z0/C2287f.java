package z0;

import X2.AbstractC0703v;
import X2.B;
import c1.C0816e;
import java.util.ArrayList;

/* renamed from: z0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2287f implements InterfaceC2282a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21600a = new ArrayList();

    @Override // z0.InterfaceC2282a
    public AbstractC0703v a(long j7) {
        int f7 = f(j7);
        if (f7 == 0) {
            return AbstractC0703v.Y();
        }
        C0816e c0816e = (C0816e) this.f21600a.get(f7 - 1);
        long j8 = c0816e.f10022d;
        return (j8 == -9223372036854775807L || j7 < j8) ? c0816e.f10019a : AbstractC0703v.Y();
    }

    @Override // z0.InterfaceC2282a
    public long b(long j7) {
        if (this.f21600a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j7 < ((C0816e) this.f21600a.get(0)).f10020b) {
            return ((C0816e) this.f21600a.get(0)).f10020b;
        }
        for (int i7 = 1; i7 < this.f21600a.size(); i7++) {
            C0816e c0816e = (C0816e) this.f21600a.get(i7);
            if (j7 < c0816e.f10020b) {
                long j8 = ((C0816e) this.f21600a.get(i7 - 1)).f10022d;
                return (j8 == -9223372036854775807L || j8 <= j7 || j8 >= c0816e.f10020b) ? c0816e.f10020b : j8;
            }
        }
        long j9 = ((C0816e) B.d(this.f21600a)).f10022d;
        if (j9 == -9223372036854775807L || j7 >= j9) {
            return Long.MIN_VALUE;
        }
        return j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // z0.InterfaceC2282a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(c1.C0816e r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f10020b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            g0.AbstractC1297a.a(r0)
            long r5 = r10.f10020b
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.f10022d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r4
            goto L26
        L25:
            r0 = r1
        L26:
            java.util.ArrayList r2 = r9.f21600a
            int r2 = r2.size()
            int r2 = r2 - r4
        L2d:
            if (r2 < 0) goto L58
            long r5 = r10.f10020b
            java.util.ArrayList r3 = r9.f21600a
            java.lang.Object r3 = r3.get(r2)
            c1.e r3 = (c1.C0816e) r3
            long r7 = r3.f10020b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            java.util.ArrayList r11 = r9.f21600a
            int r2 = r2 + r4
            r11.add(r2, r10)
            return r0
        L46:
            java.util.ArrayList r3 = r9.f21600a
            java.lang.Object r3 = r3.get(r2)
            c1.e r3 = (c1.C0816e) r3
            long r5 = r3.f10020b
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L55
            r0 = r1
        L55:
            int r2 = r2 + (-1)
            goto L2d
        L58:
            java.util.ArrayList r11 = r9.f21600a
            r11.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C2287f.c(c1.e, long):boolean");
    }

    @Override // z0.InterfaceC2282a
    public void clear() {
        this.f21600a.clear();
    }

    @Override // z0.InterfaceC2282a
    public long d(long j7) {
        if (this.f21600a.isEmpty() || j7 < ((C0816e) this.f21600a.get(0)).f10020b) {
            return -9223372036854775807L;
        }
        for (int i7 = 1; i7 < this.f21600a.size(); i7++) {
            long j8 = ((C0816e) this.f21600a.get(i7)).f10020b;
            if (j7 == j8) {
                return j8;
            }
            if (j7 < j8) {
                C0816e c0816e = (C0816e) this.f21600a.get(i7 - 1);
                long j9 = c0816e.f10022d;
                return (j9 == -9223372036854775807L || j9 > j7) ? c0816e.f10020b : j9;
            }
        }
        C0816e c0816e2 = (C0816e) B.d(this.f21600a);
        long j10 = c0816e2.f10022d;
        return (j10 == -9223372036854775807L || j7 < j10) ? c0816e2.f10020b : j10;
    }

    @Override // z0.InterfaceC2282a
    public void e(long j7) {
        int f7 = f(j7);
        if (f7 > 0) {
            this.f21600a.subList(0, f7).clear();
        }
    }

    public final int f(long j7) {
        for (int i7 = 0; i7 < this.f21600a.size(); i7++) {
            if (j7 < ((C0816e) this.f21600a.get(i7)).f10020b) {
                return i7;
            }
        }
        return this.f21600a.size();
    }
}

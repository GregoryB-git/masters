package c1;

import g0.InterfaceC1303g;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i {
    public static int a(k kVar, long j7) {
        if (j7 == -9223372036854775807L) {
            return 0;
        }
        int c7 = kVar.c(j7);
        if (c7 == -1) {
            c7 = kVar.j();
        }
        return (c7 <= 0 || kVar.e(c7 + (-1)) != j7) ? c7 : c7 - 1;
    }

    public static void b(k kVar, int i7, InterfaceC1303g interfaceC1303g) {
        long e7 = kVar.e(i7);
        List h7 = kVar.h(e7);
        if (h7.isEmpty()) {
            return;
        }
        if (i7 == kVar.j() - 1) {
            throw new IllegalStateException();
        }
        long e8 = kVar.e(i7 + 1) - kVar.e(i7);
        if (e8 > 0) {
            interfaceC1303g.accept(new C0816e(h7, e7, e8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[LOOP:0: B:11:0x003d->B:13:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(c1.k r11, c1.t.b r12, g0.InterfaceC1303g r13) {
        /*
            long r0 = r12.f10048a
            int r0 = a(r11, r0)
            long r1 = r12.f10048a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L3b
            int r1 = r11.j()
            if (r0 >= r1) goto L3b
            long r3 = r12.f10048a
            java.util.List r6 = r11.h(r3)
            long r3 = r11.e(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L3b
            long r7 = r12.f10048a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3b
            c1.e r1 = new c1.e
            long r9 = r3 - r7
            r5 = r1
            r5.<init>(r6, r7, r9)
            r13.accept(r1)
            r1 = 1
            goto L3c
        L3b:
            r1 = r2
        L3c:
            r3 = r0
        L3d:
            int r4 = r11.j()
            if (r3 >= r4) goto L49
            b(r11, r3, r13)
            int r3 = r3 + 1
            goto L3d
        L49:
            boolean r3 = r12.f10049b
            if (r3 == 0) goto L76
            if (r1 == 0) goto L51
            int r0 = r0 + (-1)
        L51:
            if (r2 >= r0) goto L59
            b(r11, r2, r13)
            int r2 = r2 + 1
            goto L51
        L59:
            if (r1 == 0) goto L76
            c1.e r1 = new c1.e
            long r2 = r12.f10048a
            java.util.List r4 = r11.h(r2)
            long r5 = r11.e(r0)
            long r2 = r12.f10048a
            long r11 = r11.e(r0)
            long r7 = r2 - r11
            r3 = r1
            r3.<init>(r4, r5, r7)
            r13.accept(r1)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.i.c(c1.k, c1.t$b, g0.g):void");
    }
}

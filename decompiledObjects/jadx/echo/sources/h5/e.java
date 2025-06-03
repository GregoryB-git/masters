package h5;

import V4.h;
import g5.EnumC1320a;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[][] f14594a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b, reason: collision with root package name */
    public static final int[][] f14595b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f14596c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f14597d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static void a(Y4.a aVar, EnumC1320a enumC1320a, g5.c cVar, int i7, b bVar) {
        c(bVar);
        d(cVar, bVar);
        l(enumC1320a, i7, bVar);
        s(cVar, bVar);
        f(aVar, i7, bVar);
    }

    public static int b(int i7, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int n7 = n(i8);
        int i9 = i7 << (n7 - 1);
        while (n(i9) >= n7) {
            i9 ^= i8 << (n(i9) - n7);
        }
        return i9;
    }

    public static void c(b bVar) {
        bVar.a((byte) -1);
    }

    public static void d(g5.c cVar, b bVar) {
        j(bVar);
        e(bVar);
        r(cVar, bVar);
        k(bVar);
    }

    public static void e(b bVar) {
        if (bVar.b(8, bVar.d() - 8) == 0) {
            throw new h();
        }
        bVar.f(8, bVar.d() - 8, 1);
    }

    public static void f(Y4.a aVar, int i7, b bVar) {
        boolean z7;
        int e7 = bVar.e() - 1;
        int d7 = bVar.d() - 1;
        int i8 = 0;
        int i9 = -1;
        while (e7 > 0) {
            if (e7 == 6) {
                e7--;
            }
            while (d7 >= 0 && d7 < bVar.d()) {
                for (int i10 = 0; i10 < 2; i10++) {
                    int i11 = e7 - i10;
                    if (o(bVar.b(i11, d7))) {
                        if (i8 < aVar.l()) {
                            z7 = aVar.j(i8);
                            i8++;
                        } else {
                            z7 = false;
                        }
                        if (i7 != -1 && d.f(i7, i11, d7)) {
                            z7 = !z7;
                        }
                        bVar.g(i11, d7, z7);
                    }
                }
                d7 += i9;
            }
            i9 = -i9;
            d7 += i9;
            e7 -= 2;
        }
        if (i8 == aVar.l()) {
            return;
        }
        throw new h("Not all bits consumed: " + i8 + '/' + aVar.l());
    }

    public static void g(int i7, int i8, b bVar) {
        for (int i9 = 0; i9 < 8; i9++) {
            int i10 = i7 + i9;
            if (!o(bVar.b(i10, i8))) {
                throw new h();
            }
            bVar.f(i10, i8, 0);
        }
    }

    public static void h(int i7, int i8, b bVar) {
        for (int i9 = 0; i9 < 5; i9++) {
            int[] iArr = f14595b[i9];
            for (int i10 = 0; i10 < 5; i10++) {
                bVar.f(i7 + i10, i8 + i9, iArr[i10]);
            }
        }
    }

    public static void i(int i7, int i8, b bVar) {
        for (int i9 = 0; i9 < 7; i9++) {
            int[] iArr = f14594a[i9];
            for (int i10 = 0; i10 < 7; i10++) {
                bVar.f(i7 + i10, i8 + i9, iArr[i10]);
            }
        }
    }

    public static void j(b bVar) {
        int length = f14594a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m(bVar.d() - 8, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    public static void k(b bVar) {
        int i7 = 8;
        while (i7 < bVar.e() - 8) {
            int i8 = i7 + 1;
            int i9 = i8 % 2;
            if (o(bVar.b(i7, 6))) {
                bVar.f(i7, 6, i9);
            }
            if (o(bVar.b(6, i7))) {
                bVar.f(6, i7, i9);
            }
            i7 = i8;
        }
    }

    public static void l(EnumC1320a enumC1320a, int i7, b bVar) {
        Y4.a aVar = new Y4.a();
        p(enumC1320a, i7, aVar);
        for (int i8 = 0; i8 < aVar.l(); i8++) {
            boolean j7 = aVar.j((aVar.l() - 1) - i8);
            int[] iArr = f14597d[i8];
            bVar.g(iArr[0], iArr[1], j7);
            if (i8 < 8) {
                bVar.g((bVar.e() - i8) - 1, 8, j7);
            } else {
                bVar.g(8, (bVar.d() - 7) + (i8 - 8), j7);
            }
        }
    }

    public static void m(int i7, int i8, b bVar) {
        for (int i9 = 0; i9 < 7; i9++) {
            int i10 = i8 + i9;
            if (!o(bVar.b(i7, i10))) {
                throw new h();
            }
            bVar.f(i7, i10, 0);
        }
    }

    public static int n(int i7) {
        return 32 - Integer.numberOfLeadingZeros(i7);
    }

    public static boolean o(int i7) {
        return i7 == -1;
    }

    public static void p(EnumC1320a enumC1320a, int i7, Y4.a aVar) {
        if (!f.b(i7)) {
            throw new h("Invalid mask pattern");
        }
        int c7 = (enumC1320a.c() << 3) | i7;
        aVar.d(c7, 5);
        aVar.d(b(c7, 1335), 10);
        Y4.a aVar2 = new Y4.a();
        aVar2.d(21522, 15);
        aVar.s(aVar2);
        if (aVar.l() == 15) {
            return;
        }
        throw new h("should not happen but we got: " + aVar.l());
    }

    public static void q(g5.c cVar, Y4.a aVar) {
        aVar.d(cVar.f(), 6);
        aVar.d(b(cVar.f(), 7973), 12);
        if (aVar.l() == 18) {
            return;
        }
        throw new h("should not happen but we got: " + aVar.l());
    }

    public static void r(g5.c cVar, b bVar) {
        if (cVar.f() < 2) {
            return;
        }
        int[] iArr = f14596c[cVar.f() - 1];
        for (int i7 : iArr) {
            if (i7 >= 0) {
                for (int i8 : iArr) {
                    if (i8 >= 0 && o(bVar.b(i8, i7))) {
                        h(i8 - 2, i7 - 2, bVar);
                    }
                }
            }
        }
    }

    public static void s(g5.c cVar, b bVar) {
        if (cVar.f() < 7) {
            return;
        }
        Y4.a aVar = new Y4.a();
        q(cVar, aVar);
        int i7 = 17;
        for (int i8 = 0; i8 < 6; i8++) {
            for (int i9 = 0; i9 < 3; i9++) {
                boolean j7 = aVar.j(i7);
                i7--;
                bVar.g(i8, (bVar.d() - 11) + i9, j7);
                bVar.g((bVar.d() - 11) + i9, i8, j7);
            }
        }
    }
}

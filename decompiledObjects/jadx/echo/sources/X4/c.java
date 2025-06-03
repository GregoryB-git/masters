package X4;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7264a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static int[] a(Y4.a aVar, int i7, int i8) {
        int[] iArr = new int[i8];
        int l7 = aVar.l() / i7;
        for (int i9 = 0; i9 < l7; i9++) {
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                i10 |= aVar.j((i9 * i7) + i11) ? 1 << ((i7 - i11) - 1) : 0;
            }
            iArr[i9] = i10;
        }
        return iArr;
    }

    public static void b(Y4.b bVar, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9 += 2) {
            int i10 = i7 - i9;
            int i11 = i10;
            while (true) {
                int i12 = i7 + i9;
                if (i11 <= i12) {
                    bVar.l(i11, i10);
                    bVar.l(i11, i12);
                    bVar.l(i10, i11);
                    bVar.l(i12, i11);
                    i11++;
                }
            }
        }
        int i13 = i7 - i8;
        bVar.l(i13, i13);
        int i14 = i13 + 1;
        bVar.l(i14, i13);
        bVar.l(i13, i14);
        int i15 = i7 + i8;
        bVar.l(i15, i13);
        bVar.l(i15, i14);
        bVar.l(i15, i15 - 1);
    }

    public static void c(Y4.b bVar, boolean z7, int i7, Y4.a aVar) {
        int i8 = i7 / 2;
        int i9 = 0;
        if (z7) {
            while (i9 < 7) {
                int i10 = (i8 - 3) + i9;
                if (aVar.j(i9)) {
                    bVar.l(i10, i8 - 5);
                }
                if (aVar.j(i9 + 7)) {
                    bVar.l(i8 + 5, i10);
                }
                if (aVar.j(20 - i9)) {
                    bVar.l(i10, i8 + 5);
                }
                if (aVar.j(27 - i9)) {
                    bVar.l(i8 - 5, i10);
                }
                i9++;
            }
            return;
        }
        while (i9 < 10) {
            int i11 = (i8 - 5) + i9 + (i9 / 5);
            if (aVar.j(i9)) {
                bVar.l(i11, i8 - 7);
            }
            if (aVar.j(i9 + 10)) {
                bVar.l(i8 + 7, i11);
            }
            if (aVar.j(29 - i9)) {
                bVar.l(i11, i8 + 7);
            }
            if (aVar.j(39 - i9)) {
                bVar.l(i8 - 7, i11);
            }
            i9++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a d(byte[] bArr, int i7, int i8) {
        Y4.a aVar;
        int i9;
        boolean z7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 2;
        Y4.a a7 = new d(bArr).a();
        int l7 = ((a7.l() * i7) / 100) + 11;
        int l8 = a7.l() + l7;
        int i16 = 0;
        int i17 = 1;
        if (i8 == 0) {
            Y4.a aVar2 = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 <= r6) {
                boolean z8 = i18 <= 3 ? i17 : i16;
                int i20 = z8 != 0 ? i18 + 1 : i18;
                int i21 = i(i20, z8);
                if (l8 <= i21) {
                    if (aVar2 == null || i19 != f7264a[i20]) {
                        int i22 = f7264a[i20];
                        i19 = i22;
                        aVar2 = h(a7, i22);
                    }
                    int i23 = i21 - (i21 % i19);
                    if ((z8 == 0 || aVar2.l() <= (i19 << 6)) && aVar2.l() + l7 <= i23) {
                        aVar = aVar2;
                        i9 = i19;
                        z7 = z8;
                        i10 = i20;
                        i11 = i21;
                    }
                }
                int i24 = i15;
                int i25 = i17;
                i18 += i25;
                i17 = i25;
                i15 = i24;
                r6 = 32;
                i16 = 0;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z7 = i8 < 0;
        i10 = Math.abs(i8);
        if (i10 > (z7 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i8)));
        }
        i11 = i(i10, z7);
        i9 = f7264a[i10];
        int i26 = i11 - (i11 % i9);
        aVar = h(a7, i9);
        if (aVar.l() + l7 > i26) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z7 && aVar.l() > (i9 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        Y4.a e7 = e(aVar, i11, i9);
        int l9 = aVar.l() / i9;
        Y4.a f7 = f(z7, i10, l9);
        int i27 = (z7 ? 11 : 14) + (i10 << 2);
        int[] iArr = new int[i27];
        if (z7) {
            for (int i28 = i16; i28 < i27; i28 += i17) {
                iArr[i28] = i28;
            }
            i12 = i27;
        } else {
            int i29 = i27 / 2;
            i12 = i27 + 1 + (((i29 - 1) / 15) * i15);
            int i30 = i12 / 2;
            for (int i31 = i16; i31 < i29; i31 += i17) {
                iArr[(i29 - i31) - 1] = (i30 - r15) - 1;
                iArr[i29 + i31] = (i31 / 15) + i31 + i30 + i17;
            }
        }
        Y4.b bVar = new Y4.b(i12);
        int i32 = i16;
        int i33 = i32;
        while (i32 < i10) {
            int i34 = ((i10 - i32) << i15) + (z7 ? 9 : 12);
            while (i16 < i34) {
                int i35 = i16 << 1;
                int i36 = 0;
                while (i36 < i15) {
                    if (e7.j(i33 + i35 + i36)) {
                        int i37 = i32 << 1;
                        bVar.l(iArr[i37 + i36], iArr[i37 + i16]);
                    }
                    if (e7.j((i34 << 1) + i33 + i35 + i36)) {
                        int i38 = i32 << 1;
                        i13 = l9;
                        bVar.l(iArr[i38 + i16], iArr[((i27 - 1) - i38) - i36]);
                    } else {
                        i13 = l9;
                    }
                    if (e7.j((i34 << 2) + i33 + i35 + i36)) {
                        int i39 = (i27 - 1) - (i32 << 1);
                        bVar.l(iArr[i39 - i36], iArr[i39 - i16]);
                    }
                    if (e7.j((i34 * 6) + i33 + i35 + i36)) {
                        i14 = 1;
                        int i40 = i32 << 1;
                        bVar.l(iArr[((i27 - 1) - i40) - i16], iArr[i40 + i36]);
                    } else {
                        i14 = 1;
                    }
                    i36 += i14;
                    l9 = i13;
                    i17 = i14;
                    i15 = 2;
                }
                i16 += i17;
                i15 = 2;
            }
            i33 += i34 << 3;
            i32 += i17;
            l9 = l9;
            i15 = 2;
            i16 = 0;
        }
        int i41 = l9;
        c(bVar, z7, i12, f7);
        if (z7) {
            b(bVar, i12 / 2, 5);
        } else {
            int i42 = i12 / 2;
            b(bVar, i42, 7);
            int i43 = 0;
            int i44 = 0;
            while (i43 < (i27 / 2) - 1) {
                for (int i45 = i42 & 1; i45 < i12; i45 += 2) {
                    int i46 = i42 - i44;
                    bVar.l(i46, i45);
                    int i47 = i42 + i44;
                    bVar.l(i47, i45);
                    bVar.l(i45, i46);
                    bVar.l(i45, i47);
                }
                i43 += 15;
                i44 += 16;
            }
        }
        a aVar3 = new a();
        aVar3.c(z7);
        aVar3.f(i12);
        aVar3.d(i10);
        aVar3.b(i41);
        aVar3.e(bVar);
        return aVar3;
    }

    public static Y4.a e(Y4.a aVar, int i7, int i8) {
        int l7 = aVar.l() / i8;
        Z4.c cVar = new Z4.c(g(i8));
        int i9 = i7 / i8;
        int[] a7 = a(aVar, i8, i9);
        cVar.b(a7, i9 - l7);
        Y4.a aVar2 = new Y4.a();
        aVar2.d(0, i7 % i8);
        for (int i10 : a7) {
            aVar2.d(i10, i8);
        }
        return aVar2;
    }

    public static Y4.a f(boolean z7, int i7, int i8) {
        int i9;
        Y4.a aVar = new Y4.a();
        int i10 = i7 - 1;
        if (z7) {
            aVar.d(i10, 2);
            aVar.d(i8 - 1, 6);
            i9 = 28;
        } else {
            aVar.d(i10, 5);
            aVar.d(i8 - 1, 11);
            i9 = 40;
        }
        return e(aVar, i9, 4);
    }

    public static Z4.a g(int i7) {
        if (i7 == 4) {
            return Z4.a.f7863k;
        }
        if (i7 == 6) {
            return Z4.a.f7862j;
        }
        if (i7 == 8) {
            return Z4.a.f7866n;
        }
        if (i7 == 10) {
            return Z4.a.f7861i;
        }
        if (i7 == 12) {
            return Z4.a.f7860h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i7)));
    }

    public static Y4.a h(Y4.a aVar, int i7) {
        Y4.a aVar2 = new Y4.a();
        int l7 = aVar.l();
        int i8 = (1 << i7) - 2;
        int i9 = 0;
        while (i9 < l7) {
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = i9 + i11;
                if (i12 >= l7 || aVar.j(i12)) {
                    i10 |= 1 << ((i7 - 1) - i11);
                }
            }
            int i13 = i10 & i8;
            if (i13 != i8) {
                if (i13 == 0) {
                    i13 = i10 | 1;
                } else {
                    aVar2.d(i10, i7);
                    i9 += i7;
                }
            }
            aVar2.d(i13, i7);
            i9--;
            i9 += i7;
        }
        return aVar2;
    }

    public static int i(int i7, boolean z7) {
        return ((z7 ? 88 : 112) + (i7 << 4)) * i7;
    }
}

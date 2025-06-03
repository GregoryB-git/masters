package x3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16909a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16910b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16911c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16912d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16913e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16914g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16915h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f16916i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f16917j;

    /* renamed from: k, reason: collision with root package name */
    public int f16918k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f16919l;

    /* renamed from: m, reason: collision with root package name */
    public int f16920m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f16921n;

    /* renamed from: o, reason: collision with root package name */
    public int f16922o;

    /* renamed from: p, reason: collision with root package name */
    public int f16923p;

    /* renamed from: q, reason: collision with root package name */
    public int f16924q;

    /* renamed from: r, reason: collision with root package name */
    public int f16925r;

    /* renamed from: s, reason: collision with root package name */
    public int f16926s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public int f16927u;

    /* renamed from: v, reason: collision with root package name */
    public int f16928v;

    public b0(int i10, int i11, float f, float f10, int i12) {
        this.f16909a = i10;
        this.f16910b = i11;
        this.f16911c = f;
        this.f16912d = f10;
        this.f16913e = i10 / i12;
        this.f = i10 / 400;
        int i13 = i10 / 65;
        this.f16914g = i13;
        int i14 = i13 * 2;
        this.f16915h = i14;
        this.f16916i = new short[i14];
        this.f16917j = new short[i14 * i11];
        this.f16919l = new short[i14 * i11];
        this.f16921n = new short[i14 * i11];
    }

    public static void d(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        int i12 = this.f16915h / i11;
        int i13 = this.f16910b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f16916i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] b(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f16910b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int c(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f16910b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f16927u = i14 / i16;
        this.f16928v = i17 / i15;
        return i16;
    }

    public final void e() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f16920m;
        float f = this.f16911c;
        float f10 = this.f16912d;
        float f11 = f / f10;
        float f12 = this.f16913e * f10;
        double d10 = f11;
        int i18 = 1;
        int i19 = 0;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i20 = this.f16918k;
            if (i20 >= this.f16915h) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f16925r;
                    if (i22 > 0) {
                        int min = Math.min(this.f16915h, i22);
                        short[] sArr = this.f16917j;
                        short[] b10 = b(this.f16919l, this.f16920m, min);
                        this.f16919l = b10;
                        int i23 = this.f16910b;
                        System.arraycopy(sArr, i21 * i23, b10, this.f16920m * i23, i23 * min);
                        this.f16920m += min;
                        this.f16925r -= min;
                        i21 += min;
                    } else {
                        short[] sArr2 = this.f16917j;
                        int i24 = this.f16909a;
                        int i25 = i24 > 4000 ? i24 / 4000 : i18;
                        if (this.f16910b == i18 && i25 == i18) {
                            i10 = c(sArr2, i21, this.f, this.f16914g);
                        } else {
                            a(sArr2, i21, i25);
                            int c10 = c(this.f16916i, i19, this.f / i25, this.f16914g / i25);
                            if (i25 != i18) {
                                int i26 = c10 * i25;
                                int i27 = i25 * 4;
                                int i28 = i26 - i27;
                                int i29 = i26 + i27;
                                int i30 = this.f;
                                if (i28 < i30) {
                                    i28 = i30;
                                }
                                int i31 = this.f16914g;
                                if (i29 > i31) {
                                    i29 = i31;
                                }
                                if (this.f16910b == i18) {
                                    i10 = c(sArr2, i21, i28, i29);
                                } else {
                                    a(sArr2, i21, i18);
                                    i10 = c(this.f16916i, i19, i28, i29);
                                }
                            } else {
                                i10 = c10;
                            }
                        }
                        int i32 = this.f16927u;
                        int i33 = ((i32 == 0 || this.f16926s == 0 || this.f16928v > i32 * 3 || i32 * 2 <= this.t * 3) ? i19 : i18) != 0 ? this.f16926s : i10;
                        this.t = i32;
                        this.f16926s = i10;
                        short[] sArr3 = this.f16917j;
                        if (d10 > 1.0d) {
                            if (f11 >= 2.0f) {
                                i12 = (int) (i33 / (f11 - 1.0f));
                            } else {
                                this.f16925r = (int) (((2.0f - f11) * i33) / (f11 - 1.0f));
                                i12 = i33;
                            }
                            short[] b11 = b(this.f16919l, this.f16920m, i12);
                            this.f16919l = b11;
                            d(i12, this.f16910b, b11, this.f16920m, sArr3, i21, sArr3, i21 + i33);
                            this.f16920m += i12;
                            i21 = i33 + i12 + i21;
                        } else {
                            int i34 = i33;
                            if (f11 < 0.5f) {
                                i11 = (int) ((i34 * f11) / (1.0f - f11));
                            } else {
                                this.f16925r = (int) ((((2.0f * f11) - 1.0f) * i34) / (1.0f - f11));
                                i11 = i34;
                            }
                            int i35 = i34 + i11;
                            short[] b12 = b(this.f16919l, this.f16920m, i35);
                            this.f16919l = b12;
                            int i36 = this.f16910b;
                            System.arraycopy(sArr3, i21 * i36, b12, this.f16920m * i36, i36 * i34);
                            d(i11, this.f16910b, this.f16919l, this.f16920m + i34, sArr3, i21 + i34, sArr3, i21);
                            this.f16920m += i35;
                            i21 += i11;
                        }
                    }
                    if (this.f16915h + i21 > i20) {
                        break;
                    }
                    i18 = 1;
                    i19 = 0;
                }
                int i37 = this.f16918k - i21;
                short[] sArr4 = this.f16917j;
                int i38 = this.f16910b;
                System.arraycopy(sArr4, i21 * i38, sArr4, 0, i38 * i37);
                this.f16918k = i37;
            }
        } else {
            short[] sArr5 = this.f16917j;
            int i39 = this.f16918k;
            short[] b13 = b(this.f16919l, i17, i39);
            this.f16919l = b13;
            int i40 = this.f16910b;
            System.arraycopy(sArr5, 0 * i40, b13, this.f16920m * i40, i40 * i39);
            this.f16920m += i39;
            this.f16918k = 0;
        }
        if (f12 == 1.0f || this.f16920m == i17) {
            return;
        }
        int i41 = this.f16909a;
        int i42 = (int) (i41 / f12);
        while (true) {
            if (i42 <= 16384 && i41 <= 16384) {
                break;
            }
            i42 /= 2;
            i41 /= 2;
        }
        int i43 = this.f16920m - i17;
        short[] b14 = b(this.f16921n, this.f16922o, i43);
        this.f16921n = b14;
        short[] sArr6 = this.f16919l;
        int i44 = this.f16910b;
        System.arraycopy(sArr6, i17 * i44, b14, this.f16922o * i44, i44 * i43);
        this.f16920m = i17;
        this.f16922o += i43;
        int i45 = 0;
        while (true) {
            i13 = this.f16922o;
            i14 = i13 - 1;
            if (i45 >= i14) {
                break;
            }
            while (true) {
                i15 = this.f16923p + 1;
                int i46 = i15 * i42;
                i16 = this.f16924q;
                if (i46 <= i16 * i41) {
                    break;
                }
                this.f16919l = b(this.f16919l, this.f16920m, 1);
                int i47 = 0;
                while (true) {
                    int i48 = this.f16910b;
                    if (i47 < i48) {
                        short[] sArr7 = this.f16919l;
                        int i49 = (this.f16920m * i48) + i47;
                        short[] sArr8 = this.f16921n;
                        int i50 = (i45 * i48) + i47;
                        short s10 = sArr8[i50];
                        short s11 = sArr8[i50 + i48];
                        int i51 = this.f16924q * i41;
                        int i52 = this.f16923p;
                        int i53 = i52 * i42;
                        int i54 = (i52 + 1) * i42;
                        int i55 = i54 - i51;
                        int i56 = i54 - i53;
                        sArr7[i49] = (short) ((((i56 - i55) * s11) + (s10 * i55)) / i56);
                        i47++;
                    }
                }
                this.f16924q++;
                this.f16920m++;
            }
            this.f16923p = i15;
            if (i15 == i41) {
                this.f16923p = 0;
                x6.b.H(i16 == i42);
                this.f16924q = 0;
            }
            i45++;
        }
        if (i14 == 0) {
            return;
        }
        short[] sArr9 = this.f16921n;
        int i57 = this.f16910b;
        System.arraycopy(sArr9, i14 * i57, sArr9, 0, (i13 - i14) * i57);
        this.f16922o -= i14;
    }
}

package H1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2202a = new i();

    public static final void a(a x7, a b7) {
        if (T1.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x7, "x");
            Intrinsics.checkNotNullParameter(b7, "b");
            int b8 = x7.b(0);
            int b9 = x7.b(1);
            int b10 = x7.b(2);
            float[] a7 = x7.a();
            float[] a8 = b7.a();
            if (b8 <= 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                if (b9 > 0) {
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        if (b10 > 0) {
                            int i11 = 0;
                            while (true) {
                                int i12 = i11 + 1;
                                int i13 = (i7 * b9 * b10) + (i9 * b10) + i11;
                                a7[i13] = a7[i13] + a8[i11];
                                if (i12 >= b10) {
                                    break;
                                } else {
                                    i11 = i12;
                                }
                            }
                        }
                        if (i10 >= b9) {
                            break;
                        } else {
                            i9 = i10;
                        }
                    }
                }
                if (i8 >= b8) {
                    return;
                } else {
                    i7 = i8;
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, i.class);
        }
    }

    public static final a b(a[] tensors) {
        int i7;
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(tensors, "tensors");
            int i8 = 0;
            int b7 = tensors[0].b(0);
            int length = tensors.length - 1;
            if (length >= 0) {
                int i9 = 0;
                i7 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    i7 += tensors[i9].b(1);
                    if (i10 > length) {
                        break;
                    }
                    i9 = i10;
                }
            } else {
                i7 = 0;
            }
            a aVar = new a(new int[]{b7, i7});
            float[] a7 = aVar.a();
            if (b7 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    int i13 = i11 * i7;
                    int length2 = tensors.length - 1;
                    if (length2 >= 0) {
                        int i14 = i8;
                        while (true) {
                            int i15 = i14 + 1;
                            float[] a8 = tensors[i14].a();
                            int b8 = tensors[i14].b(1);
                            System.arraycopy(a8, i11 * b8, a7, i13, b8);
                            i13 += b8;
                            if (i15 > length2) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i12 >= b7) {
                        break;
                    }
                    i11 = i12;
                    i8 = 0;
                }
            }
            return aVar;
        } catch (Throwable th) {
            T1.a.b(th, i.class);
            return null;
        }
    }

    public static final a c(a x7, a w7) {
        Class<i> cls;
        a aVar;
        Class<i> cls2 = i.class;
        if (T1.a.d(cls2)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x7, "x");
            Intrinsics.checkNotNullParameter(w7, "w");
            int i7 = 0;
            int b7 = x7.b(0);
            int b8 = x7.b(1);
            int b9 = x7.b(2);
            int b10 = w7.b(0);
            int i8 = (b8 - b10) + 1;
            int b11 = w7.b(2);
            a aVar2 = new a(new int[]{b7, i8, b11});
            float[] a7 = x7.a();
            float[] a8 = aVar2.a();
            float[] a9 = w7.a();
            if (b7 <= 0) {
                return aVar2;
            }
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                if (b11 > 0) {
                    int i11 = i7;
                    while (true) {
                        int i12 = i11 + 1;
                        if (i8 > 0) {
                            int i13 = 0;
                            while (true) {
                                int i14 = i13 + 1;
                                float f7 = 0.0f;
                                if (b10 > 0) {
                                    int i15 = 0;
                                    while (true) {
                                        cls = cls2;
                                        int i16 = i15 + 1;
                                        if (b9 > 0) {
                                            int i17 = 0;
                                            while (true) {
                                                aVar = aVar2;
                                                int i18 = i17 + 1;
                                                try {
                                                    f7 += a7[(b8 * b9 * i9) + ((i15 + i13) * b9) + i17] * a9[(((i15 * b9) + i17) * b11) + i11];
                                                    if (i18 >= b9) {
                                                        break;
                                                    }
                                                    i17 = i18;
                                                    aVar2 = aVar;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    T1.a.b(th, cls);
                                                    return null;
                                                }
                                            }
                                        } else {
                                            aVar = aVar2;
                                        }
                                        if (i16 >= b10) {
                                            break;
                                        }
                                        i15 = i16;
                                        cls2 = cls;
                                        aVar2 = aVar;
                                    }
                                } else {
                                    cls = cls2;
                                    aVar = aVar2;
                                }
                                a8[(i8 * b11 * i9) + (i13 * b11) + i11] = f7;
                                if (i14 >= i8) {
                                    break;
                                }
                                i13 = i14;
                                cls2 = cls;
                                aVar2 = aVar;
                            }
                        } else {
                            cls = cls2;
                            aVar = aVar2;
                        }
                        if (i12 >= b11) {
                            break;
                        }
                        i11 = i12;
                        cls2 = cls;
                        aVar2 = aVar;
                    }
                } else {
                    cls = cls2;
                    aVar = aVar2;
                }
                if (i10 >= b7) {
                    return aVar;
                }
                i9 = i10;
                cls2 = cls;
                aVar2 = aVar;
                i7 = 0;
            }
        } catch (Throwable th2) {
            th = th2;
            cls = cls2;
        }
    }

    public static final a d(a x7, a w7, a b7) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x7, "x");
            Intrinsics.checkNotNullParameter(w7, "w");
            Intrinsics.checkNotNullParameter(b7, "b");
            int b8 = x7.b(0);
            int b9 = b7.b(0);
            a h7 = h(x7, w7);
            float[] a7 = b7.a();
            float[] a8 = h7.a();
            if (b8 > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (b9 > 0) {
                        int i9 = 0;
                        while (true) {
                            int i10 = i9 + 1;
                            int i11 = (i7 * b9) + i9;
                            a8[i11] = a8[i11] + a7[i9];
                            if (i10 >= b9) {
                                break;
                            }
                            i9 = i10;
                        }
                    }
                    if (i8 >= b8) {
                        break;
                    }
                    i7 = i8;
                }
            }
            return h7;
        } catch (Throwable th) {
            T1.a.b(th, i.class);
            return null;
        }
    }

    public static final a e(String[] texts, int i7, a w7) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(w7, "w");
            int length = texts.length;
            int b7 = w7.b(1);
            a aVar = new a(new int[]{length, i7, b7});
            float[] a7 = aVar.a();
            float[] a8 = w7.a();
            if (length > 0) {
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    int[] d7 = j.f2203a.d(texts[i8], i7);
                    if (i7 > 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            System.arraycopy(a8, d7[i10] * b7, a7, (b7 * i7 * i8) + (i10 * b7), b7);
                            if (i11 >= i7) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    if (i9 >= length) {
                        break;
                    }
                    i8 = i9;
                }
            }
            return aVar;
        } catch (Throwable th) {
            T1.a.b(th, i.class);
            return null;
        }
    }

    public static final void f(a x7, int i7) {
        if (T1.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x7, "x");
            if (i7 >= x7.c()) {
                return;
            }
            int c7 = x7.c();
            int i8 = 1;
            if (i7 < c7) {
                int i9 = i7;
                while (true) {
                    int i10 = i9 + 1;
                    i8 *= x7.b(i9);
                    if (i10 >= c7) {
                        break;
                    } else {
                        i9 = i10;
                    }
                }
            }
            int[] iArr = new int[i7 + 1];
            if (i7 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    iArr[i11] = x7.b(i11);
                    if (i12 >= i7) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
            iArr[i7] = i8;
            x7.d(iArr);
        } catch (Throwable th) {
            T1.a.b(th, i.class);
        }
    }

    public static final a g(a x7, int i7) {
        int i8;
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x7, "x");
            int i9 = 0;
            int b7 = x7.b(0);
            int b8 = x7.b(1);
            int b9 = x7.b(2);
            int i10 = (b8 - i7) + 1;
            a aVar = new a(new int[]{b7, i10, b9});
            float[] a7 = x7.a();
            float[] a8 = aVar.a();
            if (b7 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    if (b9 > 0) {
                        int i13 = i9;
                        while (true) {
                            int i14 = i13 + 1;
                            if (i10 > 0) {
                                int i15 = i9;
                                while (true) {
                                    int i16 = i15 + 1;
                                    int i17 = i15 * b9;
                                    int i18 = (i11 * i10 * b9) + i17 + i13;
                                    int i19 = (i11 * b8 * b9) + i17 + i13;
                                    a8[i18] = Float.MIN_VALUE;
                                    if (i7 > 0) {
                                        int i20 = 0;
                                        while (true) {
                                            int i21 = i20 + 1;
                                            i8 = b8;
                                            a8[i18] = Math.max(a8[i18], a7[i19 + (i20 * b9)]);
                                            if (i21 >= i7) {
                                                break;
                                            }
                                            i20 = i21;
                                            b8 = i8;
                                        }
                                    } else {
                                        i8 = b8;
                                    }
                                    if (i16 >= i10) {
                                        break;
                                    }
                                    i15 = i16;
                                    b8 = i8;
                                }
                            } else {
                                i8 = b8;
                            }
                            if (i14 >= b9) {
                                break;
                            }
                            i13 = i14;
                            b8 = i8;
                            i9 = 0;
                        }
                    } else {
                        i8 = b8;
                    }
                    if (i12 >= b7) {
                        break;
                    }
                    i11 = i12;
                    b8 = i8;
                    i9 = 0;
                }
            }
            return aVar;
        } catch (Throwable th) {
            T1.a.b(th, i.class);
            return null;
        }
    }

    public static final a h(a x7, a w7) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x7, "x");
            Intrinsics.checkNotNullParameter(w7, "w");
            int i7 = 0;
            int b7 = x7.b(0);
            int b8 = w7.b(0);
            int b9 = w7.b(1);
            a aVar = new a(new int[]{b7, b9});
            float[] a7 = x7.a();
            float[] a8 = w7.a();
            float[] a9 = aVar.a();
            if (b7 > 0) {
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    if (b9 > 0) {
                        int i10 = i7;
                        while (true) {
                            int i11 = i10 + 1;
                            int i12 = (i8 * b9) + i10;
                            a9[i12] = 0.0f;
                            if (b8 > 0) {
                                int i13 = i7;
                                while (true) {
                                    int i14 = i13 + 1;
                                    a9[i12] = a9[i12] + (a7[(i8 * b8) + i13] * a8[(i13 * b9) + i10]);
                                    if (i14 >= b8) {
                                        break;
                                    }
                                    i13 = i14;
                                }
                            }
                            if (i11 >= b9) {
                                break;
                            }
                            i10 = i11;
                            i7 = 0;
                        }
                    }
                    if (i9 >= b7) {
                        break;
                    }
                    i8 = i9;
                    i7 = 0;
                }
            }
            return aVar;
        } catch (Throwable th) {
            T1.a.b(th, i.class);
            return null;
        }
    }

    public static final void i(a x7) {
        if (T1.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x7, "x");
            float[] a7 = x7.a();
            int length = a7.length - 1;
            if (length < 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                if (a7[i7] < 0.0f) {
                    a7[i7] = 0.0f;
                }
                if (i8 > length) {
                    return;
                } else {
                    i7 = i8;
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, i.class);
        }
    }

    public static final void j(a x7) {
        if (T1.a.d(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x7, "x");
            int i7 = 0;
            int b7 = x7.b(0);
            int b8 = x7.b(1);
            float[] a7 = x7.a();
            if (b7 <= 0) {
                return;
            }
            while (true) {
                int i8 = i7 + 1;
                int i9 = i7 * b8;
                int i10 = i9 + b8;
                float f7 = Float.MIN_VALUE;
                if (i9 < i10) {
                    int i11 = i9;
                    while (true) {
                        int i12 = i11 + 1;
                        float f8 = a7[i11];
                        if (f8 > f7) {
                            f7 = f8;
                        }
                        if (i12 >= i10) {
                            break;
                        } else {
                            i11 = i12;
                        }
                    }
                }
                float f9 = 0.0f;
                if (i9 < i10) {
                    int i13 = i9;
                    while (true) {
                        int i14 = i13 + 1;
                        float exp = (float) Math.exp(a7[i13] - f7);
                        a7[i13] = exp;
                        f9 += exp;
                        if (i14 >= i10) {
                            break;
                        } else {
                            i13 = i14;
                        }
                    }
                }
                if (i9 < i10) {
                    while (true) {
                        int i15 = i9 + 1;
                        a7[i9] = a7[i9] / f9;
                        if (i15 >= i10) {
                            break;
                        } else {
                            i9 = i15;
                        }
                    }
                }
                if (i8 >= b7) {
                    return;
                } else {
                    i7 = i8;
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, i.class);
        }
    }

    public static final a k(a x7) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x7, "x");
            int b7 = x7.b(0);
            int b8 = x7.b(1);
            a aVar = new a(new int[]{b8, b7});
            float[] a7 = x7.a();
            float[] a8 = aVar.a();
            if (b7 > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (b8 > 0) {
                        int i9 = 0;
                        while (true) {
                            int i10 = i9 + 1;
                            a8[(i9 * b7) + i7] = a7[(i7 * b8) + i9];
                            if (i10 >= b8) {
                                break;
                            }
                            i9 = i10;
                        }
                    }
                    if (i8 >= b7) {
                        break;
                    }
                    i7 = i8;
                }
            }
            return aVar;
        } catch (Throwable th) {
            T1.a.b(th, i.class);
            return null;
        }
    }

    public static final a l(a x7) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x7, "x");
            int b7 = x7.b(0);
            int b8 = x7.b(1);
            int b9 = x7.b(2);
            a aVar = new a(new int[]{b9, b8, b7});
            float[] a7 = x7.a();
            float[] a8 = aVar.a();
            if (b7 > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (b8 > 0) {
                        int i9 = 0;
                        while (true) {
                            int i10 = i9 + 1;
                            if (b9 > 0) {
                                int i11 = 0;
                                while (true) {
                                    int i12 = i11 + 1;
                                    a8[(i11 * b7 * b8) + (i9 * b7) + i7] = a7[(i7 * b8 * b9) + (i9 * b9) + i11];
                                    if (i12 >= b9) {
                                        break;
                                    }
                                    i11 = i12;
                                }
                            }
                            if (i10 >= b8) {
                                break;
                            }
                            i9 = i10;
                        }
                    }
                    if (i8 >= b7) {
                        break;
                    }
                    i7 = i8;
                }
            }
            return aVar;
        } catch (Throwable th) {
            T1.a.b(th, i.class);
            return null;
        }
    }
}

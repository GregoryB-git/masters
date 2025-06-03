package ma;

import ma.a0;
import ma.o;
import ma.w;

/* loaded from: classes.dex */
public final class f {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f10948a;

        /* renamed from: b, reason: collision with root package name */
        public long f10949b;

        /* renamed from: c, reason: collision with root package name */
        public Object f10950c;

        /* renamed from: d, reason: collision with root package name */
        public final o f10951d;

        public a(o oVar) {
            oVar.getClass();
            this.f10951d = oVar;
        }
    }

    public static int A(byte[] bArr, int i10, a aVar) {
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f10948a;
        if (i11 < 0) {
            throw b0.f();
        }
        if (i11 == 0) {
            aVar.f10950c = "";
            return G;
        }
        aVar.f10950c = new String(bArr, G, i11, a0.f10909a);
        return G + i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0018, code lost:
    
        r8.add("");
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0031 -> B:6:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int B(int r4, byte[] r5, int r6, int r7, ma.a0.d<?> r8, ma.f.a r9) {
        /*
            int r6 = G(r5, r6, r9)
            int r0 = r9.f10948a
            if (r0 < 0) goto L3f
            java.lang.String r1 = ""
            if (r0 != 0) goto Ld
            goto L2d
        Ld:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = ma.a0.f10909a
            r2.<init>(r5, r6, r0, r3)
        L14:
            r8.add(r2)
            int r6 = r6 + r0
        L18:
            if (r6 >= r7) goto L3e
            int r0 = G(r5, r6, r9)
            int r2 = r9.f10948a
            if (r4 == r2) goto L23
            goto L3e
        L23:
            int r6 = G(r5, r0, r9)
            int r0 = r9.f10948a
            if (r0 < 0) goto L39
            if (r0 != 0) goto L31
        L2d:
            r8.add(r1)
            goto L18
        L31:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = ma.a0.f10909a
            r2.<init>(r5, r6, r0, r3)
            goto L14
        L39:
            ma.b0 r4 = ma.b0.f()
            throw r4
        L3e:
            return r6
        L3f:
            ma.b0 r4 = ma.b0.f()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.f.B(int, byte[], int, int, ma.a0$d, ma.f$a):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:5:0x000c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int C(int r5, byte[] r6, int r7, int r8, ma.a0.d<?> r9, ma.f.a r10) {
        /*
            int r7 = G(r6, r7, r10)
            int r0 = r10.f10948a
            if (r0 < 0) goto L5a
            java.lang.String r1 = ""
            if (r0 != 0) goto Le
        Lc:
            r2 = r7
            goto L36
        Le:
            int r2 = r7 + r0
            boolean r3 = ma.u1.e(r6, r7, r2)
            if (r3 == 0) goto L55
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = ma.a0.f10909a
            r3.<init>(r6, r7, r0, r4)
        L1d:
            r9.add(r3)
        L20:
            if (r2 >= r8) goto L54
            int r7 = G(r6, r2, r10)
            int r0 = r10.f10948a
            if (r5 == r0) goto L2b
            goto L54
        L2b:
            int r7 = G(r6, r7, r10)
            int r0 = r10.f10948a
            if (r0 < 0) goto L4f
            if (r0 != 0) goto L3a
            goto Lc
        L36:
            r9.add(r1)
            goto L20
        L3a:
            int r2 = r7 + r0
            boolean r3 = ma.u1.e(r6, r7, r2)
            if (r3 == 0) goto L4a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = ma.a0.f10909a
            r3.<init>(r6, r7, r0, r4)
            goto L1d
        L4a:
            ma.b0 r5 = ma.b0.c()
            throw r5
        L4f:
            ma.b0 r5 = ma.b0.f()
            throw r5
        L54:
            return r2
        L55:
            ma.b0 r5 = ma.b0.c()
            throw r5
        L5a:
            ma.b0 r5 = ma.b0.f()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.f.C(int, byte[], int, int, ma.a0$d, ma.f$a):int");
    }

    public static int D(byte[] bArr, int i10, a aVar) {
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f10948a;
        if (i11 < 0) {
            throw b0.f();
        }
        if (i11 == 0) {
            aVar.f10950c = "";
            return G;
        }
        aVar.f10950c = u1.f11095a.a(bArr, G, i11);
        return G + i11;
    }

    public static int E(int i10, byte[] bArr, int i11, int i12, q1 q1Var, a aVar) {
        if ((i10 >>> 3) == 0) {
            throw b0.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int I = I(bArr, i11, aVar);
            q1Var.c(i10, Long.valueOf(aVar.f10949b));
            return I;
        }
        if (i13 == 1) {
            q1Var.c(i10, Long.valueOf(i(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int G = G(bArr, i11, aVar);
            int i14 = aVar.f10948a;
            if (i14 < 0) {
                throw b0.f();
            }
            if (i14 > bArr.length - G) {
                throw b0.h();
            }
            q1Var.c(i10, i14 == 0 ? h.f10961b : h.m(bArr, G, i14));
            return G + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw b0.b();
            }
            q1Var.c(i10, Integer.valueOf(g(bArr, i11)));
            return i11 + 4;
        }
        q1 q1Var2 = new q1();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int G2 = G(bArr, i11, aVar);
            int i17 = aVar.f10948a;
            i16 = i17;
            if (i17 == i15) {
                i11 = G2;
                break;
            }
            int E = E(i16, bArr, G2, i12, q1Var2, aVar);
            i16 = i17;
            i11 = E;
        }
        if (i11 > i12 || i16 != i15) {
            throw b0.g();
        }
        q1Var.c(i10, q1Var2);
        return i11;
    }

    public static int F(int i10, byte[] bArr, int i11, a aVar) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                aVar.f10948a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            aVar.f10948a = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        aVar.f10948a = i14 | i13;
        return i15;
    }

    public static int G(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return F(b10, bArr, i11, aVar);
        }
        aVar.f10948a = b10;
        return i11;
    }

    public static int H(int i10, byte[] bArr, int i11, int i12, a0.d<?> dVar, a aVar) {
        z zVar = (z) dVar;
        int G = G(bArr, i11, aVar);
        while (true) {
            zVar.h(aVar.f10948a);
            if (G >= i12) {
                break;
            }
            int G2 = G(bArr, G, aVar);
            if (i10 != aVar.f10948a) {
                break;
            }
            G = G(bArr, G2, aVar);
        }
        return G;
    }

    public static int I(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            aVar.f10949b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        aVar.f10949b = j11;
        return i12;
    }

    public static int J(int i10, byte[] bArr, int i11, int i12, a0.d<?> dVar, a aVar) {
        j0 j0Var = (j0) dVar;
        int I = I(bArr, i11, aVar);
        while (true) {
            j0Var.h(aVar.f10949b);
            if (I >= i12) {
                break;
            }
            int G = G(bArr, I, aVar);
            if (i10 != aVar.f10948a) {
                break;
            }
            I = I(bArr, G, aVar);
        }
        return I;
    }

    public static int K(Object obj, i1 i1Var, byte[] bArr, int i10, int i11, int i12, a aVar) {
        int G = ((v0) i1Var).G(obj, bArr, i10, i11, i12, aVar);
        aVar.f10950c = obj;
        return G;
    }

    public static int L(Object obj, i1 i1Var, byte[] bArr, int i10, int i11, a aVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = F(i13, bArr, i12, aVar);
            i13 = aVar.f10948a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw b0.h();
        }
        int i15 = i13 + i14;
        i1Var.j(obj, bArr, i14, i15, aVar);
        aVar.f10950c = obj;
        return i15;
    }

    public static int M(int i10, byte[] bArr, int i11, int i12, a aVar) {
        if ((i10 >>> 3) == 0) {
            throw b0.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return I(bArr, i11, aVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return G(bArr, i11, aVar) + aVar.f10948a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw b0.b();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = G(bArr, i11, aVar);
            i15 = aVar.f10948a;
            if (i15 == i14) {
                break;
            }
            i11 = M(i15, bArr, i11, i12, aVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw b0.g();
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r9.f10949b == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0010, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000c, code lost:
    
        if (r9.f10949b != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        r8.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r6 >= r7) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        r0 = G(r5, r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4 == r9.f10948a) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r6 = I(r5, r0, r9);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0026 -> B:3:0x000f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(int r4, byte[] r5, int r6, int r7, ma.a0.d<?> r8, ma.f.a r9) {
        /*
            ma.g r8 = (ma.g) r8
            int r6 = I(r5, r6, r9)
            long r0 = r9.f10949b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf
            goto L28
        Lf:
            r0 = 0
        L10:
            r8.h(r0)
            if (r6 >= r7) goto L2a
            int r0 = G(r5, r6, r9)
            int r1 = r9.f10948a
            if (r4 == r1) goto L1e
            goto L2a
        L1e:
            int r6 = I(r5, r0, r9)
            long r0 = r9.f10949b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf
        L28:
            r0 = 1
            goto L10
        L2a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.f.a(int, byte[], int, int, ma.a0$d, ma.f$a):int");
    }

    public static int b(byte[] bArr, int i10, a aVar) {
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f10948a;
        if (i11 < 0) {
            throw b0.f();
        }
        if (i11 > bArr.length - G) {
            throw b0.h();
        }
        if (i11 == 0) {
            aVar.f10950c = h.f10961b;
            return G;
        }
        aVar.f10950c = h.m(bArr, G, i11);
        return G + i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r2 == r7.f10948a) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r4 = G(r3, r0, r7);
        r0 = r7.f10948a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r0 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r0 > (r3.length - r4)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r0 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r6.add(ma.h.f10961b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        throw ma.b0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        throw ma.b0.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0017, code lost:
    
        r6.add(ma.h.f10961b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r0 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        r6.add(ma.h.m(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4 >= r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r0 = G(r3, r4, r7);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002e -> B:6:0x000f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r2, byte[] r3, int r4, int r5, ma.a0.d<?> r6, ma.f.a r7) {
        /*
            int r4 = G(r3, r4, r7)
            int r0 = r7.f10948a
            if (r0 < 0) goto L46
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L41
            if (r0 != 0) goto Lf
            goto L30
        Lf:
            ma.h$h r1 = ma.h.m(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L17:
            if (r4 >= r5) goto L40
            int r0 = G(r3, r4, r7)
            int r1 = r7.f10948a
            if (r2 == r1) goto L22
            goto L40
        L22:
            int r4 = G(r3, r0, r7)
            int r0 = r7.f10948a
            if (r0 < 0) goto L3b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L36
            if (r0 != 0) goto Lf
        L30:
            ma.h$h r0 = ma.h.f10961b
            r6.add(r0)
            goto L17
        L36:
            ma.b0 r2 = ma.b0.h()
            throw r2
        L3b:
            ma.b0 r2 = ma.b0.f()
            throw r2
        L40:
            return r4
        L41:
            ma.b0 r2 = ma.b0.h()
            throw r2
        L46:
            ma.b0 r2 = ma.b0.f()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.f.c(int, byte[], int, int, ma.a0$d, ma.f$a):int");
    }

    public static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(i(bArr, i10));
    }

    public static int e(int i10, byte[] bArr, int i11, int i12, a0.d<?> dVar, a aVar) {
        m mVar = (m) dVar;
        mVar.h(Double.longBitsToDouble(i(bArr, i11)));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int G = G(bArr, i13, aVar);
            if (i10 != aVar.f10948a) {
                break;
            }
            mVar.h(Double.longBitsToDouble(i(bArr, G)));
            i13 = G + 8;
        }
        return i13;
    }

    public static int f(int i10, byte[] bArr, int i11, int i12, Object obj, s0 s0Var, a aVar) {
        if (aVar.f10951d.f11060a.get(new o.a(s0Var, i10 >>> 3)) == null) {
            return E(i10, bArr, i11, i12, v0.r(obj), aVar);
        }
        w.c cVar = (w.c) obj;
        s<w.d> sVar = cVar.extensions;
        if (sVar.f11074b) {
            cVar.extensions = sVar.clone();
        }
        throw null;
    }

    public static int g(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, a0.d<?> dVar, a aVar) {
        z zVar = (z) dVar;
        zVar.h(g(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int G = G(bArr, i13, aVar);
            if (i10 != aVar.f10948a) {
                break;
            }
            zVar.h(g(bArr, G));
            i13 = G + 4;
        }
        return i13;
    }

    public static long i(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int j(int i10, byte[] bArr, int i11, int i12, a0.d<?> dVar, a aVar) {
        j0 j0Var = (j0) dVar;
        j0Var.h(i(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int G = G(bArr, i13, aVar);
            if (i10 != aVar.f10948a) {
                break;
            }
            j0Var.h(i(bArr, G));
            i13 = G + 8;
        }
        return i13;
    }

    public static float k(byte[] bArr, int i10) {
        return Float.intBitsToFloat(g(bArr, i10));
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, a0.d<?> dVar, a aVar) {
        u uVar = (u) dVar;
        uVar.h(Float.intBitsToFloat(g(bArr, i11)));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int G = G(bArr, i13, aVar);
            if (i10 != aVar.f10948a) {
                break;
            }
            uVar.h(Float.intBitsToFloat(g(bArr, G)));
            i13 = G + 4;
        }
        return i13;
    }

    public static int m(i1 i1Var, int i10, byte[] bArr, int i11, int i12, a0.d<?> dVar, a aVar) {
        int i13 = (i10 & (-8)) | 4;
        Object f = i1Var.f();
        int K = K(f, i1Var, bArr, i11, i12, i13, aVar);
        i1Var.b(f);
        aVar.f10950c = f;
        while (true) {
            dVar.add(aVar.f10950c);
            if (K >= i12) {
                break;
            }
            int G = G(bArr, K, aVar);
            if (i10 != aVar.f10948a) {
                break;
            }
            Object f10 = i1Var.f();
            int K2 = K(f10, i1Var, bArr, G, i12, i13, aVar);
            i1Var.b(f10);
            aVar.f10950c = f10;
            K = K2;
        }
        return K;
    }

    public static int n(i1 i1Var, byte[] bArr, int i10, int i11, a aVar) {
        Object f = i1Var.f();
        int L = L(f, i1Var, bArr, i10, i11, aVar);
        i1Var.b(f);
        aVar.f10950c = f;
        return L;
    }

    public static int o(i1<?> i1Var, int i10, byte[] bArr, int i11, int i12, a0.d<?> dVar, a aVar) {
        int n2 = n(i1Var, bArr, i11, i12, aVar);
        while (true) {
            dVar.add(aVar.f10950c);
            if (n2 >= i12) {
                break;
            }
            int G = G(bArr, n2, aVar);
            if (i10 != aVar.f10948a) {
                break;
            }
            n2 = n(i1Var, bArr, G, i12, aVar);
        }
        return n2;
    }

    public static int p(byte[] bArr, int i10, a0.d<?> dVar, a aVar) {
        g gVar = (g) dVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f10948a + G;
        while (G < i11) {
            G = I(bArr, G, aVar);
            gVar.h(aVar.f10949b != 0);
        }
        if (G == i11) {
            return G;
        }
        throw b0.h();
    }

    public static int q(byte[] bArr, int i10, a0.d<?> dVar, a aVar) {
        m mVar = (m) dVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f10948a + G;
        while (G < i11) {
            mVar.h(Double.longBitsToDouble(i(bArr, G)));
            G += 8;
        }
        if (G == i11) {
            return G;
        }
        throw b0.h();
    }

    public static int r(byte[] bArr, int i10, a0.d<?> dVar, a aVar) {
        z zVar = (z) dVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f10948a + G;
        while (G < i11) {
            zVar.h(g(bArr, G));
            G += 4;
        }
        if (G == i11) {
            return G;
        }
        throw b0.h();
    }

    public static int s(byte[] bArr, int i10, a0.d<?> dVar, a aVar) {
        j0 j0Var = (j0) dVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f10948a + G;
        while (G < i11) {
            j0Var.h(i(bArr, G));
            G += 8;
        }
        if (G == i11) {
            return G;
        }
        throw b0.h();
    }

    public static int t(byte[] bArr, int i10, a0.d<?> dVar, a aVar) {
        u uVar = (u) dVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f10948a + G;
        while (G < i11) {
            uVar.h(Float.intBitsToFloat(g(bArr, G)));
            G += 4;
        }
        if (G == i11) {
            return G;
        }
        throw b0.h();
    }

    public static int u(byte[] bArr, int i10, a0.d<?> dVar, a aVar) {
        z zVar = (z) dVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f10948a + G;
        while (G < i11) {
            G = G(bArr, G, aVar);
            zVar.h(i.b(aVar.f10948a));
        }
        if (G == i11) {
            return G;
        }
        throw b0.h();
    }

    public static int v(byte[] bArr, int i10, a0.d<?> dVar, a aVar) {
        j0 j0Var = (j0) dVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f10948a + G;
        while (G < i11) {
            G = I(bArr, G, aVar);
            j0Var.h(i.c(aVar.f10949b));
        }
        if (G == i11) {
            return G;
        }
        throw b0.h();
    }

    public static int w(byte[] bArr, int i10, a0.d<?> dVar, a aVar) {
        z zVar = (z) dVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f10948a + G;
        while (G < i11) {
            G = G(bArr, G, aVar);
            zVar.h(aVar.f10948a);
        }
        if (G == i11) {
            return G;
        }
        throw b0.h();
    }

    public static int x(byte[] bArr, int i10, a0.d<?> dVar, a aVar) {
        j0 j0Var = (j0) dVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f10948a + G;
        while (G < i11) {
            G = I(bArr, G, aVar);
            j0Var.h(aVar.f10949b);
        }
        if (G == i11) {
            return G;
        }
        throw b0.h();
    }

    public static int y(int i10, byte[] bArr, int i11, int i12, a0.d<?> dVar, a aVar) {
        z zVar = (z) dVar;
        int G = G(bArr, i11, aVar);
        while (true) {
            zVar.h(i.b(aVar.f10948a));
            if (G >= i12) {
                break;
            }
            int G2 = G(bArr, G, aVar);
            if (i10 != aVar.f10948a) {
                break;
            }
            G = G(bArr, G2, aVar);
        }
        return G;
    }

    public static int z(int i10, byte[] bArr, int i11, int i12, a0.d<?> dVar, a aVar) {
        j0 j0Var = (j0) dVar;
        int I = I(bArr, i11, aVar);
        while (true) {
            j0Var.h(i.c(aVar.f10949b));
            if (I >= i12) {
                break;
            }
            int G = G(bArr, I, aVar);
            if (i10 != aVar.f10948a) {
                break;
            }
            I = I(bArr, G, aVar);
        }
        return I;
    }
}

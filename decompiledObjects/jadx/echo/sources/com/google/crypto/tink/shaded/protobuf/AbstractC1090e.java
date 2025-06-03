package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC1110z;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1090e {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f11329a;

        /* renamed from: b, reason: collision with root package name */
        public long f11330b;

        /* renamed from: c, reason: collision with root package name */
        public Object f11331c;

        /* renamed from: d, reason: collision with root package name */
        public final C1101p f11332d;

        public a(C1101p c1101p) {
            c1101p.getClass();
            this.f11332d = c1101p;
        }
    }

    public static int A(int i7, byte[] bArr, int i8, int i9, AbstractC1110z.d dVar, a aVar) {
        F f7 = (F) dVar;
        int K6 = K(bArr, i8, aVar);
        while (true) {
            f7.d(AbstractC1094i.c(aVar.f11330b));
            if (K6 >= i9) {
                break;
            }
            int H6 = H(bArr, K6, aVar);
            if (i7 != aVar.f11329a) {
                break;
            }
            K6 = K(bArr, H6, aVar);
        }
        return K6;
    }

    public static int B(byte[] bArr, int i7, a aVar) {
        int H6 = H(bArr, i7, aVar);
        int i8 = aVar.f11329a;
        if (i8 < 0) {
            throw A.g();
        }
        if (i8 == 0) {
            aVar.f11331c = "";
            return H6;
        }
        aVar.f11331c = new String(bArr, H6, i8, AbstractC1110z.f11553b);
        return H6 + i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002e -> B:5:0x000c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int C(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.AbstractC1110z.d r8, com.google.crypto.tink.shaded.protobuf.AbstractC1090e.a r9) {
        /*
            int r6 = H(r5, r6, r9)
            int r0 = r9.f11329a
            if (r0 < 0) goto L3f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.AbstractC1110z.f11553b
            r2.<init>(r5, r6, r0, r3)
        L17:
            r8.add(r2)
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L3e
            int r0 = H(r5, r6, r9)
            int r2 = r9.f11329a
            if (r4 == r2) goto L26
            goto L3e
        L26:
            int r6 = H(r5, r0, r9)
            int r0 = r9.f11329a
            if (r0 < 0) goto L39
            if (r0 != 0) goto L31
            goto Lc
        L31:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.AbstractC1110z.f11553b
            r2.<init>(r5, r6, r0, r3)
            goto L17
        L39:
            com.google.crypto.tink.shaded.protobuf.A r4 = com.google.crypto.tink.shaded.protobuf.A.g()
            throw r4
        L3e:
            return r6
        L3f:
            com.google.crypto.tink.shaded.protobuf.A r4 = com.google.crypto.tink.shaded.protobuf.A.g()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.AbstractC1090e.C(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:5:0x000c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int D(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.AbstractC1110z.d r9, com.google.crypto.tink.shaded.protobuf.AbstractC1090e.a r10) {
        /*
            int r7 = H(r6, r7, r10)
            int r0 = r10.f11329a
            if (r0 < 0) goto L59
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.p0.n(r6, r7, r2)
            if (r3 == 0) goto L54
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.AbstractC1110z.f11553b
            r3.<init>(r6, r7, r0, r4)
        L1f:
            r9.add(r3)
            r7 = r2
        L23:
            if (r7 >= r8) goto L53
            int r0 = H(r6, r7, r10)
            int r2 = r10.f11329a
            if (r5 == r2) goto L2e
            goto L53
        L2e:
            int r7 = H(r6, r0, r10)
            int r0 = r10.f11329a
            if (r0 < 0) goto L4e
            if (r0 != 0) goto L39
            goto Lc
        L39:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.p0.n(r6, r7, r2)
            if (r3 == 0) goto L49
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.AbstractC1110z.f11553b
            r3.<init>(r6, r7, r0, r4)
            goto L1f
        L49:
            com.google.crypto.tink.shaded.protobuf.A r5 = com.google.crypto.tink.shaded.protobuf.A.d()
            throw r5
        L4e:
            com.google.crypto.tink.shaded.protobuf.A r5 = com.google.crypto.tink.shaded.protobuf.A.g()
            throw r5
        L53:
            return r7
        L54:
            com.google.crypto.tink.shaded.protobuf.A r5 = com.google.crypto.tink.shaded.protobuf.A.d()
            throw r5
        L59:
            com.google.crypto.tink.shaded.protobuf.A r5 = com.google.crypto.tink.shaded.protobuf.A.g()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.AbstractC1090e.D(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    public static int E(byte[] bArr, int i7, a aVar) {
        int H6 = H(bArr, i7, aVar);
        int i8 = aVar.f11329a;
        if (i8 < 0) {
            throw A.g();
        }
        if (i8 == 0) {
            aVar.f11331c = "";
            return H6;
        }
        aVar.f11331c = p0.e(bArr, H6, i8);
        return H6 + i8;
    }

    public static int F(int i7, byte[] bArr, int i8, int i9, l0 l0Var, a aVar) {
        if (q0.a(i7) == 0) {
            throw A.c();
        }
        int b7 = q0.b(i7);
        if (b7 == 0) {
            int K6 = K(bArr, i8, aVar);
            l0Var.n(i7, Long.valueOf(aVar.f11330b));
            return K6;
        }
        if (b7 == 1) {
            l0Var.n(i7, Long.valueOf(i(bArr, i8)));
            return i8 + 8;
        }
        if (b7 == 2) {
            int H6 = H(bArr, i8, aVar);
            int i10 = aVar.f11329a;
            if (i10 < 0) {
                throw A.g();
            }
            if (i10 > bArr.length - H6) {
                throw A.m();
            }
            l0Var.n(i7, i10 == 0 ? AbstractC1093h.f11337p : AbstractC1093h.k(bArr, H6, i10));
            return H6 + i10;
        }
        if (b7 != 3) {
            if (b7 != 5) {
                throw A.c();
            }
            l0Var.n(i7, Integer.valueOf(g(bArr, i8)));
            return i8 + 4;
        }
        l0 k7 = l0.k();
        int i11 = (i7 & (-8)) | 4;
        int i12 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int H7 = H(bArr, i8, aVar);
            int i13 = aVar.f11329a;
            i12 = i13;
            if (i13 == i11) {
                i8 = H7;
                break;
            }
            int F6 = F(i12, bArr, H7, i9, k7, aVar);
            i12 = i13;
            i8 = F6;
        }
        if (i8 > i9 || i12 != i11) {
            throw A.h();
        }
        l0Var.n(i7, k7);
        return i8;
    }

    public static int G(int i7, byte[] bArr, int i8, a aVar) {
        int i9;
        int i10 = i7 & 127;
        int i11 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            i9 = b7 << 7;
        } else {
            int i12 = i10 | ((b7 & Byte.MAX_VALUE) << 7);
            int i13 = i8 + 2;
            byte b8 = bArr[i11];
            if (b8 >= 0) {
                aVar.f11329a = i12 | (b8 << 14);
                return i13;
            }
            i10 = i12 | ((b8 & Byte.MAX_VALUE) << 14);
            i11 = i8 + 3;
            byte b9 = bArr[i13];
            if (b9 >= 0) {
                i9 = b9 << 21;
            } else {
                int i14 = i10 | ((b9 & Byte.MAX_VALUE) << 21);
                int i15 = i8 + 4;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    aVar.f11329a = i14 | (b10 << 28);
                    return i15;
                }
                int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i17 = i15 + 1;
                    if (bArr[i15] >= 0) {
                        aVar.f11329a = i16;
                        return i17;
                    }
                    i15 = i17;
                }
            }
        }
        aVar.f11329a = i10 | i9;
        return i11;
    }

    public static int H(byte[] bArr, int i7, a aVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return G(b7, bArr, i8, aVar);
        }
        aVar.f11329a = b7;
        return i8;
    }

    public static int I(int i7, byte[] bArr, int i8, int i9, AbstractC1110z.d dVar, a aVar) {
        AbstractC1109y abstractC1109y = (AbstractC1109y) dVar;
        int H6 = H(bArr, i8, aVar);
        while (true) {
            abstractC1109y.z(aVar.f11329a);
            if (H6 >= i9) {
                break;
            }
            int H7 = H(bArr, H6, aVar);
            if (i7 != aVar.f11329a) {
                break;
            }
            H6 = H(bArr, H7, aVar);
        }
        return H6;
    }

    public static int J(long j7, byte[] bArr, int i7, a aVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        long j8 = (j7 & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i9 = 7;
        while (b7 < 0) {
            int i10 = i8 + 1;
            byte b8 = bArr[i8];
            i9 += 7;
            j8 |= (b8 & Byte.MAX_VALUE) << i9;
            i8 = i10;
            b7 = b8;
        }
        aVar.f11330b = j8;
        return i8;
    }

    public static int K(byte[] bArr, int i7, a aVar) {
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        if (j7 < 0) {
            return J(j7, bArr, i8, aVar);
        }
        aVar.f11330b = j7;
        return i8;
    }

    public static int L(int i7, byte[] bArr, int i8, int i9, AbstractC1110z.d dVar, a aVar) {
        F f7 = (F) dVar;
        int K6 = K(bArr, i8, aVar);
        while (true) {
            f7.d(aVar.f11330b);
            if (K6 >= i9) {
                break;
            }
            int H6 = H(bArr, K6, aVar);
            if (i7 != aVar.f11329a) {
                break;
            }
            K6 = K(bArr, H6, aVar);
        }
        return K6;
    }

    public static int M(Object obj, e0 e0Var, byte[] bArr, int i7, int i8, int i9, a aVar) {
        int f02 = ((S) e0Var).f0(obj, bArr, i7, i8, i9, aVar);
        aVar.f11331c = obj;
        return f02;
    }

    public static int N(Object obj, e0 e0Var, byte[] bArr, int i7, int i8, a aVar) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = G(i10, bArr, i9, aVar);
            i10 = aVar.f11329a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw A.m();
        }
        int i12 = i10 + i11;
        e0Var.h(obj, bArr, i11, i12, aVar);
        aVar.f11331c = obj;
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r12.f11330b == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0013, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000e, code lost:
    
        if (r12.f11330b != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        r11.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r9 >= r10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r0 = H(r8, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r7 == r12.f11329a) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r9 = K(r8, r0, r12);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0029 -> B:3:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(int r7, byte[] r8, int r9, int r10, com.google.crypto.tink.shaded.protobuf.AbstractC1110z.d r11, com.google.crypto.tink.shaded.protobuf.AbstractC1090e.a r12) {
        /*
            com.google.crypto.tink.shaded.protobuf.f r11 = (com.google.crypto.tink.shaded.protobuf.AbstractC1091f) r11
            int r9 = K(r8, r9, r12)
            long r0 = r12.f11330b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto L12
        L10:
            r0 = r4
            goto L13
        L12:
            r0 = r1
        L13:
            r11.d(r0)
            if (r9 >= r10) goto L2c
            int r0 = H(r8, r9, r12)
            int r5 = r12.f11329a
            if (r7 == r5) goto L21
            goto L2c
        L21:
            int r9 = K(r8, r0, r12)
            long r5 = r12.f11330b
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            goto L10
        L2c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.AbstractC1090e.a(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    public static int b(byte[] bArr, int i7, a aVar) {
        int H6 = H(bArr, i7, aVar);
        int i8 = aVar.f11329a;
        if (i8 < 0) {
            throw A.g();
        }
        if (i8 > bArr.length - H6) {
            throw A.m();
        }
        if (i8 == 0) {
            aVar.f11331c = AbstractC1093h.f11337p;
            return H6;
        }
        aVar.f11331c = AbstractC1093h.k(bArr, H6, i8);
        return H6 + i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r2 == r7.f11329a) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r4 = H(r3, r0, r7);
        r0 = r7.f11329a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r0 < 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r0 > (r3.length - r4)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r0 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0014, code lost:
    
        r6.add(com.google.crypto.tink.shaded.protobuf.AbstractC1093h.k(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.A.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.A.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x001c, code lost:
    
        r6.add(com.google.crypto.tink.shaded.protobuf.AbstractC1093h.k(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r0 == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        r6.add(com.google.crypto.tink.shaded.protobuf.AbstractC1093h.f11337p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r4 >= r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r0 = H(r3, r4, r7);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0033 -> B:6:0x000e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.AbstractC1110z.d r6, com.google.crypto.tink.shaded.protobuf.AbstractC1090e.a r7) {
        /*
            int r4 = H(r3, r4, r7)
            int r0 = r7.f11329a
            if (r0 < 0) goto L46
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L41
            if (r0 != 0) goto L14
        Le:
            com.google.crypto.tink.shaded.protobuf.h r0 = com.google.crypto.tink.shaded.protobuf.AbstractC1093h.f11337p
            r6.add(r0)
            goto L1c
        L14:
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.AbstractC1093h.k(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L40
            int r0 = H(r3, r4, r7)
            int r1 = r7.f11329a
            if (r2 == r1) goto L27
            goto L40
        L27:
            int r4 = H(r3, r0, r7)
            int r0 = r7.f11329a
            if (r0 < 0) goto L3b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L36
            if (r0 != 0) goto L14
            goto Le
        L36:
            com.google.crypto.tink.shaded.protobuf.A r2 = com.google.crypto.tink.shaded.protobuf.A.m()
            throw r2
        L3b:
            com.google.crypto.tink.shaded.protobuf.A r2 = com.google.crypto.tink.shaded.protobuf.A.g()
            throw r2
        L40:
            return r4
        L41:
            com.google.crypto.tink.shaded.protobuf.A r2 = com.google.crypto.tink.shaded.protobuf.A.m()
            throw r2
        L46:
            com.google.crypto.tink.shaded.protobuf.A r2 = com.google.crypto.tink.shaded.protobuf.A.g()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.AbstractC1090e.c(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.z$d, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    public static double d(byte[] bArr, int i7) {
        return Double.longBitsToDouble(i(bArr, i7));
    }

    public static int e(int i7, byte[] bArr, int i8, int i9, AbstractC1110z.d dVar, a aVar) {
        AbstractC1098m abstractC1098m = (AbstractC1098m) dVar;
        abstractC1098m.d(d(bArr, i8));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int H6 = H(bArr, i10, aVar);
            if (i7 != aVar.f11329a) {
                break;
            }
            abstractC1098m.d(d(bArr, H6));
            i10 = H6 + 8;
        }
        return i10;
    }

    public static int f(int i7, byte[] bArr, int i8, int i9, Object obj, O o7, k0 k0Var, a aVar) {
        aVar.f11332d.a(o7, i7 >>> 3);
        return F(i7, bArr, i8, i9, S.v(obj), aVar);
    }

    public static int g(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static int h(int i7, byte[] bArr, int i8, int i9, AbstractC1110z.d dVar, a aVar) {
        AbstractC1109y abstractC1109y = (AbstractC1109y) dVar;
        abstractC1109y.z(g(bArr, i8));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int H6 = H(bArr, i10, aVar);
            if (i7 != aVar.f11329a) {
                break;
            }
            abstractC1109y.z(g(bArr, H6));
            i10 = H6 + 4;
        }
        return i10;
    }

    public static long i(byte[] bArr, int i7) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public static int j(int i7, byte[] bArr, int i8, int i9, AbstractC1110z.d dVar, a aVar) {
        F f7 = (F) dVar;
        f7.d(i(bArr, i8));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int H6 = H(bArr, i10, aVar);
            if (i7 != aVar.f11329a) {
                break;
            }
            f7.d(i(bArr, H6));
            i10 = H6 + 8;
        }
        return i10;
    }

    public static float k(byte[] bArr, int i7) {
        return Float.intBitsToFloat(g(bArr, i7));
    }

    public static int l(int i7, byte[] bArr, int i8, int i9, AbstractC1110z.d dVar, a aVar) {
        AbstractC1106v abstractC1106v = (AbstractC1106v) dVar;
        abstractC1106v.d(k(bArr, i8));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int H6 = H(bArr, i10, aVar);
            if (i7 != aVar.f11329a) {
                break;
            }
            abstractC1106v.d(k(bArr, H6));
            i10 = H6 + 4;
        }
        return i10;
    }

    public static int m(e0 e0Var, byte[] bArr, int i7, int i8, int i9, a aVar) {
        Object f7 = e0Var.f();
        int M6 = M(f7, e0Var, bArr, i7, i8, i9, aVar);
        e0Var.b(f7);
        aVar.f11331c = f7;
        return M6;
    }

    public static int n(e0 e0Var, int i7, byte[] bArr, int i8, int i9, AbstractC1110z.d dVar, a aVar) {
        int i10 = (i7 & (-8)) | 4;
        int m7 = m(e0Var, bArr, i8, i9, i10, aVar);
        while (true) {
            dVar.add(aVar.f11331c);
            if (m7 >= i9) {
                break;
            }
            int H6 = H(bArr, m7, aVar);
            if (i7 != aVar.f11329a) {
                break;
            }
            m7 = m(e0Var, bArr, H6, i9, i10, aVar);
        }
        return m7;
    }

    public static int o(e0 e0Var, byte[] bArr, int i7, int i8, a aVar) {
        Object f7 = e0Var.f();
        int N6 = N(f7, e0Var, bArr, i7, i8, aVar);
        e0Var.b(f7);
        aVar.f11331c = f7;
        return N6;
    }

    public static int p(e0 e0Var, int i7, byte[] bArr, int i8, int i9, AbstractC1110z.d dVar, a aVar) {
        int o7 = o(e0Var, bArr, i8, i9, aVar);
        while (true) {
            dVar.add(aVar.f11331c);
            if (o7 >= i9) {
                break;
            }
            int H6 = H(bArr, o7, aVar);
            if (i7 != aVar.f11329a) {
                break;
            }
            o7 = o(e0Var, bArr, H6, i9, aVar);
        }
        return o7;
    }

    public static int q(byte[] bArr, int i7, AbstractC1110z.d dVar, a aVar) {
        AbstractC1091f abstractC1091f = (AbstractC1091f) dVar;
        int H6 = H(bArr, i7, aVar);
        int i8 = aVar.f11329a + H6;
        while (H6 < i8) {
            H6 = K(bArr, H6, aVar);
            abstractC1091f.d(aVar.f11330b != 0);
        }
        if (H6 == i8) {
            return H6;
        }
        throw A.m();
    }

    public static int r(byte[] bArr, int i7, AbstractC1110z.d dVar, a aVar) {
        AbstractC1098m abstractC1098m = (AbstractC1098m) dVar;
        int H6 = H(bArr, i7, aVar);
        int i8 = aVar.f11329a + H6;
        while (H6 < i8) {
            abstractC1098m.d(d(bArr, H6));
            H6 += 8;
        }
        if (H6 == i8) {
            return H6;
        }
        throw A.m();
    }

    public static int s(byte[] bArr, int i7, AbstractC1110z.d dVar, a aVar) {
        AbstractC1109y abstractC1109y = (AbstractC1109y) dVar;
        int H6 = H(bArr, i7, aVar);
        int i8 = aVar.f11329a + H6;
        while (H6 < i8) {
            abstractC1109y.z(g(bArr, H6));
            H6 += 4;
        }
        if (H6 == i8) {
            return H6;
        }
        throw A.m();
    }

    public static int t(byte[] bArr, int i7, AbstractC1110z.d dVar, a aVar) {
        F f7 = (F) dVar;
        int H6 = H(bArr, i7, aVar);
        int i8 = aVar.f11329a + H6;
        while (H6 < i8) {
            f7.d(i(bArr, H6));
            H6 += 8;
        }
        if (H6 == i8) {
            return H6;
        }
        throw A.m();
    }

    public static int u(byte[] bArr, int i7, AbstractC1110z.d dVar, a aVar) {
        AbstractC1106v abstractC1106v = (AbstractC1106v) dVar;
        int H6 = H(bArr, i7, aVar);
        int i8 = aVar.f11329a + H6;
        while (H6 < i8) {
            abstractC1106v.d(k(bArr, H6));
            H6 += 4;
        }
        if (H6 == i8) {
            return H6;
        }
        throw A.m();
    }

    public static int v(byte[] bArr, int i7, AbstractC1110z.d dVar, a aVar) {
        AbstractC1109y abstractC1109y = (AbstractC1109y) dVar;
        int H6 = H(bArr, i7, aVar);
        int i8 = aVar.f11329a + H6;
        while (H6 < i8) {
            H6 = H(bArr, H6, aVar);
            abstractC1109y.z(AbstractC1094i.b(aVar.f11329a));
        }
        if (H6 == i8) {
            return H6;
        }
        throw A.m();
    }

    public static int w(byte[] bArr, int i7, AbstractC1110z.d dVar, a aVar) {
        F f7 = (F) dVar;
        int H6 = H(bArr, i7, aVar);
        int i8 = aVar.f11329a + H6;
        while (H6 < i8) {
            H6 = K(bArr, H6, aVar);
            f7.d(AbstractC1094i.c(aVar.f11330b));
        }
        if (H6 == i8) {
            return H6;
        }
        throw A.m();
    }

    public static int x(byte[] bArr, int i7, AbstractC1110z.d dVar, a aVar) {
        AbstractC1109y abstractC1109y = (AbstractC1109y) dVar;
        int H6 = H(bArr, i7, aVar);
        int i8 = aVar.f11329a + H6;
        while (H6 < i8) {
            H6 = H(bArr, H6, aVar);
            abstractC1109y.z(aVar.f11329a);
        }
        if (H6 == i8) {
            return H6;
        }
        throw A.m();
    }

    public static int y(byte[] bArr, int i7, AbstractC1110z.d dVar, a aVar) {
        F f7 = (F) dVar;
        int H6 = H(bArr, i7, aVar);
        int i8 = aVar.f11329a + H6;
        while (H6 < i8) {
            H6 = K(bArr, H6, aVar);
            f7.d(aVar.f11330b);
        }
        if (H6 == i8) {
            return H6;
        }
        throw A.m();
    }

    public static int z(int i7, byte[] bArr, int i8, int i9, AbstractC1110z.d dVar, a aVar) {
        AbstractC1109y abstractC1109y = (AbstractC1109y) dVar;
        int H6 = H(bArr, i8, aVar);
        while (true) {
            abstractC1109y.z(AbstractC1094i.b(aVar.f11329a));
            if (H6 >= i9) {
                break;
            }
            int H7 = H(bArr, H6, aVar);
            if (i7 != aVar.f11329a) {
                break;
            }
            H6 = H(bArr, H7, aVar);
        }
        return H6;
    }
}

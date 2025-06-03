package l4;

import c4.x;
import c4.y;
import java.util.ArrayList;
import java.util.Arrays;
import l4.h;
import o7.t;
import v3.a1;
import v3.i0;
import v5.m;
import v5.u;

/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: n, reason: collision with root package name */
    public a f9610n;

    /* renamed from: o, reason: collision with root package name */
    public int f9611o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9612p;

    /* renamed from: q, reason: collision with root package name */
    public y.c f9613q;

    /* renamed from: r, reason: collision with root package name */
    public y.a f9614r;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final y.c f9615a;

        /* renamed from: b, reason: collision with root package name */
        public final y.a f9616b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f9617c;

        /* renamed from: d, reason: collision with root package name */
        public final y.b[] f9618d;

        /* renamed from: e, reason: collision with root package name */
        public final int f9619e;

        public a(y.c cVar, y.a aVar, byte[] bArr, y.b[] bVarArr, int i10) {
            this.f9615a = cVar;
            this.f9616b = aVar;
            this.f9617c = bArr;
            this.f9618d = bVarArr;
            this.f9619e = i10;
        }
    }

    @Override // l4.h
    public final void a(long j10) {
        this.f9601g = j10;
        this.f9612p = j10 != 0;
        y.c cVar = this.f9613q;
        this.f9611o = cVar != null ? cVar.f2341e : 0;
    }

    @Override // l4.h
    public final long b(u uVar) {
        byte b10 = uVar.f15974a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        a aVar = this.f9610n;
        x6.b.K(aVar);
        int i10 = !aVar.f9618d[(b10 >> 1) & (255 >>> (8 - aVar.f9619e))].f2336a ? aVar.f9615a.f2341e : aVar.f9615a.f;
        long j10 = this.f9612p ? (this.f9611o + i10) / 4 : 0;
        byte[] bArr = uVar.f15974a;
        int length = bArr.length;
        int i11 = uVar.f15976c + 4;
        if (length < i11) {
            byte[] copyOf = Arrays.copyOf(bArr, i11);
            uVar.E(copyOf, copyOf.length);
        } else {
            uVar.F(i11);
        }
        byte[] bArr2 = uVar.f15974a;
        int i12 = uVar.f15976c;
        bArr2[i12 - 4] = (byte) (j10 & 255);
        bArr2[i12 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f9612p = true;
        this.f9611o = i10;
        return j10;
    }

    @Override // l4.h
    public final boolean c(u uVar, long j10, h.a aVar) {
        a aVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        byte[] bArr;
        byte[] bArr2;
        int i14;
        int i15 = 0;
        if (this.f9610n != null) {
            aVar.f9608a.getClass();
            return false;
        }
        y.c cVar = this.f9613q;
        if (cVar == null) {
            y.c(1, uVar, false);
            uVar.m();
            int v10 = uVar.v();
            int m10 = uVar.m();
            int i16 = uVar.i();
            if (i16 <= 0) {
                i16 = -1;
            }
            int i17 = i16;
            int i18 = uVar.i();
            if (i18 <= 0) {
                i18 = -1;
            }
            int i19 = i18;
            uVar.i();
            int v11 = uVar.v();
            int pow = (int) Math.pow(2.0d, v11 & 15);
            int pow2 = (int) Math.pow(2.0d, (v11 & 240) >> 4);
            uVar.v();
            this.f9613q = new y.c(v10, m10, i17, i19, pow, pow2, Arrays.copyOf(uVar.f15974a, uVar.f15976c));
        } else {
            y.a aVar3 = this.f9614r;
            if (aVar3 == null) {
                this.f9614r = y.b(uVar, true, true);
            } else {
                int i20 = uVar.f15976c;
                byte[] bArr3 = new byte[i20];
                System.arraycopy(uVar.f15974a, 0, bArr3, 0, i20);
                int i21 = cVar.f2337a;
                int i22 = 5;
                y.c(5, uVar, false);
                int v12 = uVar.v() + 1;
                x xVar = new x(uVar.f15974a);
                xVar.e(uVar.f15975b * 8);
                while (true) {
                    int i23 = 16;
                    if (i15 >= v12) {
                        byte[] bArr4 = bArr3;
                        int i24 = 6;
                        int c10 = xVar.c(6) + 1;
                        for (int i25 = 0; i25 < c10; i25++) {
                            if (xVar.c(16) != 0) {
                                throw a1.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i26 = 1;
                        int c11 = xVar.c(6) + 1;
                        int i27 = 0;
                        while (true) {
                            int i28 = 3;
                            if (i27 < c11) {
                                int c12 = xVar.c(i23);
                                if (c12 == 0) {
                                    i12 = c11;
                                    int i29 = 8;
                                    xVar.e(8);
                                    xVar.e(16);
                                    xVar.e(16);
                                    xVar.e(6);
                                    xVar.e(8);
                                    int c13 = xVar.c(4) + 1;
                                    int i30 = 0;
                                    while (i30 < c13) {
                                        xVar.e(i29);
                                        i30++;
                                        i29 = 8;
                                    }
                                } else {
                                    if (c12 != i26) {
                                        throw a1.a("floor type greater than 1 not decodable: " + c12, null);
                                    }
                                    int c14 = xVar.c(5);
                                    int[] iArr = new int[c14];
                                    int i31 = -1;
                                    for (int i32 = 0; i32 < c14; i32++) {
                                        int c15 = xVar.c(4);
                                        iArr[i32] = c15;
                                        if (c15 > i31) {
                                            i31 = c15;
                                        }
                                    }
                                    int i33 = i31 + 1;
                                    int[] iArr2 = new int[i33];
                                    int i34 = 0;
                                    while (i34 < i33) {
                                        iArr2[i34] = xVar.c(i28) + 1;
                                        int c16 = xVar.c(2);
                                        int i35 = 8;
                                        if (c16 > 0) {
                                            xVar.e(8);
                                        }
                                        int i36 = c11;
                                        int i37 = 0;
                                        for (int i38 = 1; i37 < (i38 << c16); i38 = 1) {
                                            xVar.e(i35);
                                            i37++;
                                            i35 = 8;
                                        }
                                        i34++;
                                        i28 = 3;
                                        c11 = i36;
                                    }
                                    i12 = c11;
                                    xVar.e(2);
                                    int c17 = xVar.c(4);
                                    int i39 = 0;
                                    int i40 = 0;
                                    for (int i41 = 0; i41 < c14; i41++) {
                                        i39 += iArr2[iArr[i41]];
                                        while (i40 < i39) {
                                            xVar.e(c17);
                                            i40++;
                                        }
                                    }
                                }
                                i27++;
                                i24 = 6;
                                i23 = 16;
                                i26 = 1;
                                c11 = i12;
                            } else {
                                int i42 = 1;
                                int c18 = xVar.c(i24) + 1;
                                int i43 = 0;
                                while (i43 < c18) {
                                    if (xVar.c(16) > 2) {
                                        throw a1.a("residueType greater than 2 is not decodable", null);
                                    }
                                    xVar.e(24);
                                    xVar.e(24);
                                    xVar.e(24);
                                    int c19 = xVar.c(i24) + i42;
                                    int i44 = 8;
                                    xVar.e(8);
                                    int[] iArr3 = new int[c19];
                                    for (int i45 = 0; i45 < c19; i45++) {
                                        iArr3[i45] = ((xVar.b() ? xVar.c(5) : 0) * 8) + xVar.c(3);
                                    }
                                    int i46 = 0;
                                    while (i46 < c19) {
                                        int i47 = 0;
                                        while (i47 < i44) {
                                            if ((iArr3[i46] & (1 << i47)) != 0) {
                                                xVar.e(i44);
                                            }
                                            i47++;
                                            i44 = 8;
                                        }
                                        i46++;
                                        i44 = 8;
                                    }
                                    i43++;
                                    i24 = 6;
                                    i42 = 1;
                                }
                                int c20 = xVar.c(i24) + 1;
                                for (int i48 = 0; i48 < c20; i48++) {
                                    int c21 = xVar.c(16);
                                    if (c21 != 0) {
                                        m.c("VorbisUtil", "mapping type other than 0 not supported: " + c21);
                                    } else {
                                        if (xVar.b()) {
                                            i10 = 1;
                                            i11 = xVar.c(4) + 1;
                                        } else {
                                            i10 = 1;
                                            i11 = 1;
                                        }
                                        if (xVar.b()) {
                                            int c22 = xVar.c(8) + i10;
                                            for (int i49 = 0; i49 < c22; i49++) {
                                                int i50 = i21 - 1;
                                                int i51 = 0;
                                                for (int i52 = i50; i52 > 0; i52 >>>= 1) {
                                                    i51++;
                                                }
                                                xVar.e(i51);
                                                int i53 = 0;
                                                while (i50 > 0) {
                                                    i53++;
                                                    i50 >>>= 1;
                                                }
                                                xVar.e(i53);
                                            }
                                        }
                                        if (xVar.c(2) != 0) {
                                            throw a1.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i11 > 1) {
                                            for (int i54 = 0; i54 < i21; i54++) {
                                                xVar.e(4);
                                            }
                                        }
                                        for (int i55 = 0; i55 < i11; i55++) {
                                            xVar.e(8);
                                            xVar.e(8);
                                            xVar.e(8);
                                        }
                                    }
                                }
                                int c23 = xVar.c(6) + 1;
                                y.b[] bVarArr = new y.b[c23];
                                for (int i56 = 0; i56 < c23; i56++) {
                                    boolean b10 = xVar.b();
                                    xVar.c(16);
                                    xVar.c(16);
                                    xVar.c(8);
                                    bVarArr[i56] = new y.b(b10);
                                }
                                if (!xVar.b()) {
                                    throw a1.a("framing bit after modes not set as expected", null);
                                }
                                int i57 = 0;
                                for (int i58 = c23 - 1; i58 > 0; i58 >>>= 1) {
                                    i57++;
                                }
                                aVar2 = new a(cVar, aVar3, bArr4, bVarArr, i57);
                            }
                        }
                    } else {
                        if (xVar.c(24) != 5653314) {
                            StringBuilder l10 = defpackage.f.l("expected code book to start with [0x56, 0x43, 0x42] at ");
                            l10.append((xVar.f2332b * 8) + xVar.f2333c);
                            throw a1.a(l10.toString(), null);
                        }
                        int c24 = xVar.c(16);
                        int c25 = xVar.c(24);
                        long[] jArr = new long[c25];
                        if (xVar.b()) {
                            byte[] bArr5 = bArr3;
                            i13 = v12;
                            int c26 = xVar.c(i22) + 1;
                            int i59 = 0;
                            while (i59 < c25) {
                                int i60 = 0;
                                for (int i61 = c25 - i59; i61 > 0; i61 >>>= 1) {
                                    i60++;
                                }
                                int c27 = xVar.c(i60);
                                int i62 = 0;
                                while (i62 < c27 && i59 < c25) {
                                    jArr[i59] = c26;
                                    i59++;
                                    i62++;
                                    bArr5 = bArr5;
                                }
                                c26++;
                                bArr5 = bArr5;
                            }
                            bArr = bArr5;
                        } else {
                            boolean b11 = xVar.b();
                            int i63 = 0;
                            while (i63 < c25) {
                                if (b11) {
                                    if (xVar.b()) {
                                        bArr2 = bArr3;
                                        i14 = v12;
                                        jArr[i63] = xVar.c(i22) + 1;
                                    } else {
                                        bArr2 = bArr3;
                                        i14 = v12;
                                        jArr[i63] = 0;
                                    }
                                    i22 = 5;
                                } else {
                                    bArr2 = bArr3;
                                    i14 = v12;
                                    jArr[i63] = xVar.c(i22) + 1;
                                }
                                i63++;
                                v12 = i14;
                                bArr3 = bArr2;
                            }
                            i13 = v12;
                            bArr = bArr3;
                        }
                        int c28 = xVar.c(4);
                        if (c28 > 2) {
                            throw a1.a("lookup type greater than 2 not decodable: " + c28, null);
                        }
                        if (c28 == 1 || c28 == 2) {
                            xVar.e(32);
                            xVar.e(32);
                            int c29 = xVar.c(4) + 1;
                            xVar.e(1);
                            xVar.e((int) (c29 * (c28 == 1 ? c24 != 0 ? (long) Math.floor(Math.pow(c25, 1.0d / c24)) : 0L : c25 * c24)));
                        }
                        i15++;
                        i22 = 5;
                        v12 = i13;
                        bArr3 = bArr;
                    }
                }
            }
        }
        aVar2 = null;
        this.f9610n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        y.c cVar2 = aVar2.f9615a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2.f2342g);
        arrayList.add(aVar2.f9617c);
        p4.a a10 = y.a(t.q(aVar2.f9616b.f2335a));
        i0.a aVar4 = new i0.a();
        aVar4.f15472k = "audio/vorbis";
        aVar4.f = cVar2.f2340d;
        aVar4.f15468g = cVar2.f2339c;
        aVar4.f15484x = cVar2.f2337a;
        aVar4.f15485y = cVar2.f2338b;
        aVar4.f15474m = arrayList;
        aVar4.f15470i = a10;
        aVar.f9608a = new i0(aVar4);
        return true;
    }

    @Override // l4.h
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f9610n = null;
            this.f9613q = null;
            this.f9614r = null;
        }
        this.f9611o = 0;
        this.f9612p = false;
    }
}

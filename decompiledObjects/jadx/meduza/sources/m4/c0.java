package m4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c4.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.d0;
import v3.a1;

/* loaded from: classes.dex */
public final class c0 implements c4.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f9907a;

    /* renamed from: b, reason: collision with root package name */
    public final List<v5.c0> f9908b;

    /* renamed from: c, reason: collision with root package name */
    public final v5.u f9909c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f9910d;

    /* renamed from: e, reason: collision with root package name */
    public final d0.c f9911e;
    public final SparseArray<d0> f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f9912g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f9913h;

    /* renamed from: i, reason: collision with root package name */
    public final b0 f9914i;

    /* renamed from: j, reason: collision with root package name */
    public a0 f9915j;

    /* renamed from: k, reason: collision with root package name */
    public c4.j f9916k;

    /* renamed from: l, reason: collision with root package name */
    public int f9917l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9918m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9919n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9920o;

    /* renamed from: p, reason: collision with root package name */
    public d0 f9921p;

    /* renamed from: q, reason: collision with root package name */
    public int f9922q;

    /* renamed from: r, reason: collision with root package name */
    public int f9923r;

    public class a implements x {

        /* renamed from: a, reason: collision with root package name */
        public final v5.t f9924a = new v5.t(new byte[4], 4);

        public a() {
        }

        @Override // m4.x
        public final void a(v5.u uVar) {
            if (uVar.v() == 0 && (uVar.v() & 128) != 0) {
                uVar.H(6);
                int i10 = (uVar.f15976c - uVar.f15975b) / 4;
                for (int i11 = 0; i11 < i10; i11++) {
                    v5.t tVar = this.f9924a;
                    uVar.d(tVar.f15968a, 0, 4);
                    tVar.k(0);
                    int g10 = this.f9924a.g(16);
                    this.f9924a.m(3);
                    if (g10 == 0) {
                        this.f9924a.m(13);
                    } else {
                        int g11 = this.f9924a.g(13);
                        if (c0.this.f.get(g11) == null) {
                            c0 c0Var = c0.this;
                            c0Var.f.put(g11, new y(c0Var.new b(g11)));
                            c0.this.f9917l++;
                        }
                    }
                }
                c0 c0Var2 = c0.this;
                if (c0Var2.f9907a != 2) {
                    c0Var2.f.remove(0);
                }
            }
        }

        @Override // m4.x
        public final void c(v5.c0 c0Var, c4.j jVar, d0.d dVar) {
        }
    }

    public class b implements x {

        /* renamed from: a, reason: collision with root package name */
        public final v5.t f9926a = new v5.t(new byte[5], 5);

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray<d0> f9927b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        public final SparseIntArray f9928c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        public final int f9929d;

        public b(int i10) {
            this.f9929d = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0156, code lost:
        
            if (r24.v() == r13) goto L48;
         */
        @Override // m4.x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(v5.u r24) {
            /*
                Method dump skipped, instructions count: 693
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m4.c0.b.a(v5.u):void");
        }

        @Override // m4.x
        public final void c(v5.c0 c0Var, c4.j jVar, d0.d dVar) {
        }
    }

    public c0(int i10, v5.c0 c0Var, g gVar) {
        this.f9911e = gVar;
        this.f9907a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f9908b = Collections.singletonList(c0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f9908b = arrayList;
            arrayList.add(c0Var);
        }
        this.f9909c = new v5.u(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f9912g = sparseBooleanArray;
        this.f9913h = new SparseBooleanArray();
        SparseArray<d0> sparseArray = new SparseArray<>();
        this.f = sparseArray;
        this.f9910d = new SparseIntArray();
        this.f9914i = new b0();
        this.f9916k = c4.j.f2288i;
        this.f9923r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f.put(sparseArray2.keyAt(i11), (d0) sparseArray2.valueAt(i11));
        }
        this.f.put(0, new y(new a()));
        this.f9921p = null;
    }

    @Override // c4.h
    public final void b(c4.j jVar) {
        this.f9916k = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    @Override // c4.h
    public final int d(c4.i iVar, c4.s sVar) {
        ?? r14;
        int i10;
        c4.j jVar;
        c4.t bVar;
        ?? r82;
        long length = iVar.getLength();
        ?? r52 = 1;
        if (this.f9918m) {
            long j10 = -9223372036854775807L;
            if (((length == -1 || this.f9907a == 2) ? false : true) != false) {
                b0 b0Var = this.f9914i;
                if (!b0Var.f9899d) {
                    int i11 = this.f9923r;
                    if (i11 <= 0) {
                        b0Var.a(iVar);
                        return 0;
                    }
                    if (b0Var.f) {
                        if (b0Var.f9902h != -9223372036854775807L) {
                            if (b0Var.f9900e) {
                                long j11 = b0Var.f9901g;
                                if (j11 != -9223372036854775807L) {
                                    long b10 = b0Var.f9897b.b(b0Var.f9902h) - b0Var.f9897b.b(j11);
                                    b0Var.f9903i = b10;
                                    if (b10 < 0) {
                                        StringBuilder l10 = defpackage.f.l("Invalid duration: ");
                                        l10.append(b0Var.f9903i);
                                        l10.append(". Using TIME_UNSET instead.");
                                        v5.m.f("TsDurationReader", l10.toString());
                                        b0Var.f9903i = -9223372036854775807L;
                                    }
                                }
                            } else {
                                int min = (int) Math.min(b0Var.f9896a, iVar.getLength());
                                long j12 = 0;
                                if (iVar.getPosition() == j12) {
                                    b0Var.f9898c.D(min);
                                    iVar.i();
                                    iVar.m(b0Var.f9898c.f15974a, 0, min);
                                    v5.u uVar = b0Var.f9898c;
                                    int i12 = uVar.f15975b;
                                    int i13 = uVar.f15976c;
                                    while (true) {
                                        if (i12 >= i13) {
                                            break;
                                        }
                                        if (uVar.f15974a[i12] == 71) {
                                            long A = b.a0.A(i12, i11, uVar);
                                            if (A != -9223372036854775807L) {
                                                j10 = A;
                                                break;
                                            }
                                        }
                                        i12++;
                                    }
                                    b0Var.f9901g = j10;
                                    b0Var.f9900e = true;
                                    return 0;
                                }
                                sVar.f2313a = j12;
                            }
                        }
                        b0Var.a(iVar);
                        return 0;
                    }
                    long length2 = iVar.getLength();
                    int min2 = (int) Math.min(b0Var.f9896a, length2);
                    long j13 = length2 - min2;
                    if (iVar.getPosition() == j13) {
                        b0Var.f9898c.D(min2);
                        iVar.i();
                        iVar.m(b0Var.f9898c.f15974a, 0, min2);
                        v5.u uVar2 = b0Var.f9898c;
                        int i14 = uVar2.f15975b;
                        int i15 = uVar2.f15976c;
                        int i16 = i15 - 188;
                        while (true) {
                            if (i16 < i14) {
                                break;
                            }
                            byte[] bArr = uVar2.f15974a;
                            int i17 = -4;
                            int i18 = 0;
                            while (true) {
                                if (i17 > 4) {
                                    r82 = false;
                                    break;
                                }
                                int i19 = (i17 * 188) + i16;
                                if (i19 < i14 || i19 >= i15 || bArr[i19] != 71) {
                                    i18 = 0;
                                } else {
                                    i18++;
                                    if (i18 == 5) {
                                        r82 = true;
                                        break;
                                    }
                                }
                                i17++;
                            }
                            if (r82 != false) {
                                long A2 = b.a0.A(i16, i11, uVar2);
                                if (A2 != -9223372036854775807L) {
                                    j10 = A2;
                                    break;
                                }
                            }
                            i16--;
                        }
                        b0Var.f9902h = j10;
                        b0Var.f = true;
                        return 0;
                    }
                    sVar.f2313a = j13;
                    return 1;
                }
            }
            if (!this.f9919n) {
                this.f9919n = true;
                b0 b0Var2 = this.f9914i;
                long j14 = b0Var2.f9903i;
                if (j14 != -9223372036854775807L) {
                    a0 a0Var = new a0(b0Var2.f9897b, j14, length, this.f9923r, 112800);
                    this.f9915j = a0Var;
                    jVar = this.f9916k;
                    bVar = a0Var.f2241a;
                } else {
                    jVar = this.f9916k;
                    bVar = new t.b(j14);
                }
                jVar.t(bVar);
            }
            if (this.f9920o) {
                this.f9920o = false;
                f(0L, 0L);
                if (iVar.getPosition() != 0) {
                    sVar.f2313a = 0L;
                    return 1;
                }
            }
            r52 = 1;
            r52 = 1;
            a0 a0Var2 = this.f9915j;
            if (a0Var2 != null) {
                if ((a0Var2.f2243c != null) != false) {
                    return a0Var2.a(iVar, sVar);
                }
            }
        }
        v5.u uVar3 = this.f9909c;
        byte[] bArr2 = uVar3.f15974a;
        int i20 = uVar3.f15975b;
        if (9400 - i20 < 188) {
            int i21 = uVar3.f15976c - i20;
            if (i21 > 0) {
                System.arraycopy(bArr2, i20, bArr2, 0, i21);
            }
            this.f9909c.E(bArr2, i21);
        }
        while (true) {
            v5.u uVar4 = this.f9909c;
            int i22 = uVar4.f15976c;
            if (i22 - uVar4.f15975b >= 188) {
                r14 = r52;
                break;
            }
            int read = iVar.read(bArr2, i22, 9400 - i22);
            if (read == -1) {
                r14 = false;
                break;
            }
            this.f9909c.F(i22 + read);
        }
        if (r14 != true) {
            return -1;
        }
        v5.u uVar5 = this.f9909c;
        int i23 = uVar5.f15975b;
        int i24 = uVar5.f15976c;
        byte[] bArr3 = uVar5.f15974a;
        int i25 = i23;
        while (i25 < i24 && bArr3[i25] != 71) {
            i25++;
        }
        this.f9909c.G(i25);
        int i26 = i25 + 188;
        if (i26 > i24) {
            int i27 = (i25 - i23) + this.f9922q;
            this.f9922q = i27;
            i10 = 2;
            if (this.f9907a == 2 && i27 > 376) {
                throw a1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i10 = 2;
            this.f9922q = 0;
        }
        v5.u uVar6 = this.f9909c;
        int i28 = uVar6.f15976c;
        if (i26 > i28) {
            return 0;
        }
        int f = uVar6.f();
        if ((8388608 & f) == 0) {
            int i29 = ((4194304 & f) != 0 ? r52 : 0) | 0;
            int i30 = (2096896 & f) >> 8;
            ?? r62 = (f & 32) != 0 ? r52 : false;
            d0 d0Var = ((f & 16) != 0 ? r52 : false) == true ? this.f.get(i30) : null;
            if (d0Var != null) {
                if (this.f9907a != i10) {
                    int i31 = f & 15;
                    int i32 = this.f9910d.get(i30, i31 - 1);
                    this.f9910d.put(i30, i31);
                    if (i32 != i31) {
                        if (i31 != ((i32 + r52) & 15)) {
                            d0Var.b();
                        }
                    }
                }
                if (r62 != false) {
                    int v10 = this.f9909c.v();
                    i29 |= (this.f9909c.v() & 64) != 0 ? i10 : 0;
                    this.f9909c.H(v10 - r52);
                }
                boolean z10 = this.f9918m;
                if (((this.f9907a == i10 || z10 || !this.f9913h.get(i30, false)) ? r52 : false) != false) {
                    this.f9909c.F(i26);
                    d0Var.a(i29, this.f9909c);
                    this.f9909c.F(i28);
                }
                if (this.f9907a != i10 && !z10 && this.f9918m && length != -1) {
                    this.f9920o = r52;
                }
            }
        }
        this.f9909c.G(i26);
        return 0;
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        a0 a0Var;
        long j12;
        x6.b.H(this.f9907a != 2);
        int size = this.f9908b.size();
        for (int i10 = 0; i10 < size; i10++) {
            v5.c0 c0Var = this.f9908b.get(i10);
            synchronized (c0Var) {
                j12 = c0Var.f15874b;
            }
            boolean z10 = j12 == -9223372036854775807L;
            if (!z10) {
                long c10 = c0Var.c();
                z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
            }
            if (z10) {
                c0Var.d(j11);
            }
        }
        if (j11 != 0 && (a0Var = this.f9915j) != null) {
            a0Var.c(j11);
        }
        this.f9909c.D(0);
        this.f9910d.clear();
        for (int i11 = 0; i11 < this.f.size(); i11++) {
            this.f.valueAt(i11).b();
        }
        this.f9922q = 0;
    }

    @Override // c4.h
    public final boolean i(c4.i iVar) {
        boolean z10;
        byte[] bArr = this.f9909c.f15974a;
        c4.e eVar = (c4.e) iVar;
        eVar.c(bArr, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (bArr[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                eVar.j(i10);
                return true;
            }
        }
        return false;
    }

    @Override // c4.h
    public final void release() {
    }
}

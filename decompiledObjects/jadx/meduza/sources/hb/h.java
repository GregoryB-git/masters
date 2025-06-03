package hb;

import eb.e1;
import eb.h0;
import eb.s0;
import eb.t0;
import eb.y;
import gb.a;
import gb.d;
import gb.l3;
import gb.o1;
import gb.p3;
import gb.r3;
import gb.t;
import gb.v0;
import gb.v2;
import gb.y0;
import hb.p;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class h extends gb.a {

    /* renamed from: p, reason: collision with root package name */
    public static final xc.f f7264p = new xc.f();

    /* renamed from: h, reason: collision with root package name */
    public final t0<?, ?> f7265h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7266i;

    /* renamed from: j, reason: collision with root package name */
    public final l3 f7267j;

    /* renamed from: k, reason: collision with root package name */
    public String f7268k;

    /* renamed from: l, reason: collision with root package name */
    public final b f7269l;

    /* renamed from: m, reason: collision with root package name */
    public final a f7270m;

    /* renamed from: n, reason: collision with root package name */
    public final eb.a f7271n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7272o;

    public class a {
        public a() {
        }

        public final void a(s0 s0Var, byte[] bArr) {
            pb.b.c();
            try {
                String str = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + h.this.f7265h.f5217b;
                if (bArr != null) {
                    h.this.f7272o = true;
                    str = str + "?" + p7.a.f13018a.c(bArr);
                }
                synchronized (h.this.f7269l.f7275x) {
                    b.m(h.this.f7269l, s0Var, str);
                }
                pb.b.f13110a.getClass();
            } catch (Throwable th) {
                try {
                    pb.b.f13110a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public class b extends y0 implements p.a {
        public boolean A;
        public boolean B;
        public boolean C;
        public int D;
        public int E;
        public final hb.b F;
        public final p G;
        public final i H;
        public boolean I;
        public final pb.c J;
        public p.b K;
        public int L;

        /* renamed from: w, reason: collision with root package name */
        public final int f7274w;

        /* renamed from: x, reason: collision with root package name */
        public final Object f7275x;

        /* renamed from: y, reason: collision with root package name */
        public ArrayList f7276y;

        /* renamed from: z, reason: collision with root package name */
        public xc.f f7277z;

        public b(int i10, l3 l3Var, Object obj, hb.b bVar, p pVar, i iVar, int i11) {
            super(i10, l3Var, h.this.f6164a);
            this.f7277z = new xc.f();
            this.A = false;
            this.B = false;
            this.C = false;
            this.I = true;
            this.L = -1;
            x6.b.y(obj, "lock");
            this.f7275x = obj;
            this.F = bVar;
            this.G = pVar;
            this.H = iVar;
            this.D = i11;
            this.E = i11;
            this.f7274w = i11;
            pb.b.f13110a.getClass();
            this.J = pb.a.f13108a;
        }

        public static void m(b bVar, s0 s0Var, String str) {
            boolean z10;
            h hVar = h.this;
            String str2 = hVar.f7268k;
            String str3 = hVar.f7266i;
            boolean z11 = hVar.f7272o;
            boolean z12 = bVar.H.B == null;
            jb.d dVar = d.f7226a;
            x6.b.y(s0Var, "headers");
            x6.b.y(str, "defaultPath");
            x6.b.y(str2, "authority");
            s0Var.a(v0.f6835i);
            s0Var.a(v0.f6836j);
            s0.b bVar2 = v0.f6837k;
            s0Var.a(bVar2);
            ArrayList arrayList = new ArrayList(s0Var.f5209b + 7);
            arrayList.add(z12 ? d.f7227b : d.f7226a);
            arrayList.add(z11 ? d.f7229d : d.f7228c);
            arrayList.add(new jb.d(jb.d.f8742h, str2));
            arrayList.add(new jb.d(jb.d.f, str));
            arrayList.add(new jb.d(bVar2.f5212a, str3));
            arrayList.add(d.f7230e);
            arrayList.add(d.f);
            Logger logger = p3.f6652a;
            Charset charset = h0.f5116a;
            int i10 = s0Var.f5209b * 2;
            byte[][] bArr = new byte[i10][];
            Object[] objArr = s0Var.f5208a;
            if (objArr instanceof byte[][]) {
                System.arraycopy(objArr, 0, bArr, 0, i10);
            } else {
                for (int i11 = 0; i11 < s0Var.f5209b; i11++) {
                    int i12 = i11 * 2;
                    bArr[i12] = s0Var.e(i11);
                    bArr[i12 + 1] = s0Var.g(i11);
                }
            }
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14 += 2) {
                byte[] bArr2 = bArr[i14];
                byte[] bArr3 = bArr[i14 + 1];
                if (p3.a(bArr2, p3.f6653b)) {
                    bArr[i13] = bArr2;
                    bArr[i13 + 1] = h0.f5117b.c(bArr3).getBytes(n7.d.f11282a);
                } else {
                    for (byte b10 : bArr3) {
                        if (b10 < 32 || b10 > 126) {
                            z10 = false;
                            break;
                        }
                    }
                    z10 = true;
                    if (z10) {
                        bArr[i13] = bArr2;
                        bArr[i13 + 1] = bArr3;
                    } else {
                        String str4 = new String(bArr2, n7.d.f11282a);
                        Logger logger2 = p3.f6652a;
                        StringBuilder m10 = defpackage.f.m("Metadata key=", str4, ", value=");
                        m10.append(Arrays.toString(bArr3));
                        m10.append(" contains invalid ASCII characters");
                        logger2.warning(m10.toString());
                    }
                }
                i13 += 2;
            }
            if (i13 != i10) {
                bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i13);
            }
            for (int i15 = 0; i15 < bArr.length; i15 += 2) {
                xc.i o10 = xc.i.o(bArr[i15]);
                byte[] bArr4 = o10.f17260a;
                if (bArr4.length != 0 && bArr4[0] != 58) {
                    arrayList.add(new jb.d(o10, xc.i.o(bArr[i15 + 1])));
                }
            }
            bVar.f7276y = arrayList;
            i iVar = bVar.H;
            h hVar2 = h.this;
            e1 e1Var = iVar.f7297v;
            if (e1Var != null) {
                hVar2.f7269l.j(e1Var, t.a.MISCARRIED, true, new s0());
                return;
            }
            if (iVar.f7290n.size() < iVar.D) {
                iVar.v(hVar2);
                return;
            }
            iVar.E.add(hVar2);
            if (!iVar.f7301z) {
                iVar.f7301z = true;
                o1 o1Var = iVar.G;
                if (o1Var != null) {
                    o1Var.b();
                }
            }
            if (hVar2.f6166c) {
                iVar.P.c(hVar2, true);
            }
        }

        public static void n(b bVar, xc.f fVar, boolean z10, boolean z11) {
            if (bVar.C) {
                return;
            }
            if (!bVar.I) {
                x6.b.I(bVar.L != -1, "streamId should be set");
                bVar.G.a(z10, bVar.K, fVar, z11);
            } else {
                bVar.f7277z.g0(fVar, (int) fVar.f17252b);
                bVar.A |= z10;
                bVar.B |= z11;
            }
        }

        @Override // gb.i2.a
        public final void c(boolean z10) {
            i iVar;
            int i10;
            jb.a aVar;
            t.a aVar2 = t.a.PROCESSED;
            if (this.f6181o) {
                iVar = this.H;
                i10 = this.L;
                aVar = null;
            } else {
                iVar = this.H;
                i10 = this.L;
                aVar = jb.a.CANCEL;
            }
            iVar.l(i10, null, aVar2, false, aVar, null);
            x6.b.I(this.f6182p, "status should have been reported on deframer closed");
            this.f6179m = true;
            if (this.f6183q && z10) {
                i(new s0(), e1.f5077m.g("Encountered end-of-stream mid-frame"), true);
            }
            a.b.RunnableC0098a runnableC0098a = this.f6180n;
            if (runnableC0098a != null) {
                runnableC0098a.run();
                this.f6180n = null;
            }
        }

        @Override // gb.i2.a
        public final void d(int i10) {
            int i11 = this.E - i10;
            this.E = i11;
            float f = i11;
            int i12 = this.f7274w;
            if (f <= i12 * 0.5f) {
                int i13 = i12 - i11;
                this.D += i13;
                this.E = i11 + i13;
                this.F.d(this.L, i13);
            }
        }

        @Override // gb.i2.a
        public final void e(Throwable th) {
            o(new s0(), e1.d(th), true);
        }

        @Override // gb.g.d
        public final void f(Runnable runnable) {
            synchronized (this.f7275x) {
                runnable.run();
            }
        }

        public final void o(s0 s0Var, e1 e1Var, boolean z10) {
            if (this.C) {
                return;
            }
            this.C = true;
            if (!this.I) {
                this.H.l(this.L, e1Var, t.a.PROCESSED, z10, jb.a.CANCEL, s0Var);
                return;
            }
            i iVar = this.H;
            h hVar = h.this;
            iVar.E.remove(hVar);
            iVar.q(hVar);
            this.f7276y = null;
            this.f7277z.f();
            this.I = false;
            if (s0Var == null) {
                s0Var = new s0();
            }
            i(s0Var, e1Var, true);
        }

        public final void p(int i10, xc.f fVar, boolean z10) {
            e1 g10;
            s0 s0Var;
            long j10 = fVar.f17252b;
            int i11 = this.D - (((int) j10) + i10);
            this.D = i11;
            this.E -= i10;
            if (i11 < 0) {
                this.F.R(this.L, jb.a.FLOW_CONTROL_ERROR);
                this.H.l(this.L, e1.f5077m.g("Received data size exceeded our receiving window size"), t.a.PROCESSED, false, null, null);
                return;
            }
            l lVar = new l(fVar);
            e1 e1Var = this.f6904r;
            boolean z11 = false;
            if (e1Var != null) {
                StringBuilder l10 = defpackage.f.l("DATA-----------------------------\n");
                Charset charset = this.t;
                v2.b bVar = v2.f6853a;
                x6.b.y(charset, "charset");
                int i12 = (int) fVar.f17252b;
                byte[] bArr = new byte[i12];
                lVar.U(bArr, 0, i12);
                l10.append(new String(bArr, charset));
                this.f6904r = e1Var.a(l10.toString());
                lVar.close();
                if (this.f6904r.f5082b.length() <= 1000 && !z10) {
                    return;
                }
                g10 = this.f6904r;
                s0Var = this.f6905s;
            } else if (this.f6906u) {
                int i13 = (int) j10;
                try {
                    if (this.f6182p) {
                        gb.a.f6163g.log(Level.INFO, "Received data on closed stream");
                        lVar.close();
                    } else {
                        try {
                            this.f6216a.C(lVar);
                        } catch (Throwable th) {
                            try {
                                e(th);
                            } catch (Throwable th2) {
                                th = th2;
                                if (z11) {
                                    lVar.close();
                                }
                                throw th;
                            }
                        }
                    }
                    if (z10) {
                        this.f6904r = e1.f5077m.g(i13 > 0 ? "Received unexpected EOS on non-empty DATA frame from server" : "Received unexpected EOS on empty DATA frame from server");
                        s0 s0Var2 = new s0();
                        this.f6905s = s0Var2;
                        i(s0Var2, this.f6904r, false);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    z11 = true;
                }
            } else {
                g10 = e1.f5077m.g("headers not received before payload");
                s0Var = new s0();
            }
            o(s0Var, g10, false);
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void q(java.util.ArrayList r7, boolean r8) {
            /*
                Method dump skipped, instructions count: 390
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hb.h.b.q(java.util.ArrayList, boolean):void");
        }
    }

    public h(t0<?, ?> t0Var, s0 s0Var, hb.b bVar, i iVar, p pVar, Object obj, int i10, int i11, String str, String str2, l3 l3Var, r3 r3Var, eb.c cVar, boolean z10) {
        super(new y(), l3Var, r3Var, s0Var, cVar, z10 && t0Var.f5222h);
        this.f7270m = new a();
        this.f7272o = false;
        this.f7267j = l3Var;
        this.f7265h = t0Var;
        this.f7268k = str;
        this.f7266i = str2;
        this.f7271n = iVar.f7296u;
        String str3 = t0Var.f5217b;
        this.f7269l = new b(i10, l3Var, obj, bVar, pVar, iVar, i11);
    }

    @Override // gb.s
    public final void k(String str) {
        x6.b.y(str, "authority");
        this.f7268k = str;
    }

    @Override // gb.a, gb.d
    public final d.a q() {
        return this.f7269l;
    }

    @Override // gb.a
    public final a r() {
        return this.f7270m;
    }

    @Override // gb.a
    /* renamed from: s */
    public final b q() {
        return this.f7269l;
    }
}

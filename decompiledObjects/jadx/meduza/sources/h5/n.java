package h5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h5.j;
import o7.l0;
import v3.d0;
import v3.i0;
import v5.e0;
import v5.p;

/* loaded from: classes.dex */
public final class n extends v3.f implements Handler.Callback {
    public boolean A;
    public int B;
    public i0 C;
    public h D;
    public k E;
    public l F;
    public l G;
    public int H;
    public long I;
    public long J;
    public long K;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f7141u;

    /* renamed from: v, reason: collision with root package name */
    public final m f7142v;

    /* renamed from: w, reason: collision with root package name */
    public final j f7143w;

    /* renamed from: x, reason: collision with root package name */
    public final l3.l f7144x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7145y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7146z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d0.b bVar, Looper looper) {
        super(3);
        Handler handler;
        j.a aVar = j.f7137a;
        this.f7142v = bVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = e0.f15881a;
            handler = new Handler(looper, this);
        }
        this.f7141u = handler;
        this.f7143w = aVar;
        this.f7144x = new l3.l(1);
        this.I = -9223372036854775807L;
        this.J = -9223372036854775807L;
        this.K = -9223372036854775807L;
    }

    @Override // v3.f
    public final void B() {
        this.C = null;
        this.I = -9223372036854775807L;
        J();
        this.J = -9223372036854775807L;
        this.K = -9223372036854775807L;
        O();
        h hVar = this.D;
        hVar.getClass();
        hVar.release();
        this.D = null;
        this.B = 0;
    }

    @Override // v3.f
    public final void D(long j10, boolean z10) {
        this.K = j10;
        J();
        this.f7145y = false;
        this.f7146z = false;
        this.I = -9223372036854775807L;
        if (this.B == 0) {
            O();
            h hVar = this.D;
            hVar.getClass();
            hVar.flush();
            return;
        }
        O();
        h hVar2 = this.D;
        hVar2.getClass();
        hVar2.release();
        this.D = null;
        this.B = 0;
        N();
    }

    @Override // v3.f
    public final void H(i0[] i0VarArr, long j10, long j11) {
        this.J = j11;
        this.C = i0VarArr[0];
        if (this.D != null) {
            this.B = 1;
        } else {
            N();
        }
    }

    public final void J() {
        l0 l0Var = l0.f12009e;
        L(this.K);
        c cVar = new c(l0Var);
        Handler handler = this.f7141u;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
        } else {
            this.f7142v.r(cVar.f7127a);
            this.f7142v.j(cVar);
        }
    }

    public final long K() {
        if (this.H == -1) {
            return Long.MAX_VALUE;
        }
        this.F.getClass();
        if (this.H >= this.F.i()) {
            return Long.MAX_VALUE;
        }
        return this.F.g(this.H);
    }

    public final long L(long j10) {
        x6.b.H(j10 != -9223372036854775807L);
        x6.b.H(this.J != -9223372036854775807L);
        return j10 - this.J;
    }

    public final void M(i iVar) {
        StringBuilder l10 = defpackage.f.l("Subtitle decoding failed. streamFormat=");
        l10.append(this.C);
        v5.m.d("TextRenderer", l10.toString(), iVar);
        J();
        O();
        h hVar = this.D;
        hVar.getClass();
        hVar.release();
        this.D = null;
        this.B = 0;
        N();
    }

    public final void N() {
        h aVar;
        this.A = true;
        j jVar = this.f7143w;
        i0 i0Var = this.C;
        i0Var.getClass();
        ((j.a) jVar).getClass();
        String str = i0Var.t;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "application/dvbsubs":
                    aVar = new j5.a(i0Var.f15458v);
                    break;
                case "application/pgs":
                    aVar = new k5.a();
                    break;
                case "application/x-mp4-vtt":
                    aVar = new q5.a();
                    break;
                case "text/vtt":
                    aVar = new q5.g();
                    break;
                case "application/x-quicktime-tx3g":
                    aVar = new p5.a(i0Var.f15458v);
                    break;
                case "text/x-ssa":
                    aVar = new m5.a(i0Var.f15458v);
                    break;
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    aVar = new i5.a(str, i0Var.L);
                    break;
                case "text/x-exoplayer-cues":
                    aVar = new d();
                    break;
                case "application/cea-708":
                    aVar = new i5.b(i0Var.L, i0Var.f15458v);
                    break;
                case "application/x-subrip":
                    aVar = new n5.a();
                    break;
                case "application/ttml+xml":
                    aVar = new o5.c();
                    break;
            }
            this.D = aVar;
            return;
        }
        throw new IllegalArgumentException(defpackage.g.d("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final void O() {
        this.E = null;
        this.H = -1;
        l lVar = this.F;
        if (lVar != null) {
            lVar.o();
            this.F = null;
        }
        l lVar2 = this.G;
        if (lVar2 != null) {
            lVar2.o();
            this.G = null;
        }
    }

    @Override // v3.k1
    public final int a(i0 i0Var) {
        ((j.a) this.f7143w).getClass();
        String str = i0Var.t;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return a0.j.b(i0Var.O == 0 ? 4 : 2, 0, 0);
        }
        return p.l(i0Var.t) ? a0.j.b(1, 0, 0) : a0.j.b(0, 0, 0);
    }

    @Override // v3.j1
    public final boolean b() {
        return true;
    }

    @Override // v3.j1
    public final boolean d() {
        return this.f7146z;
    }

    @Override // v3.j1, v3.k1
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        c cVar = (c) message.obj;
        this.f7142v.r(cVar.f7127a);
        this.f7142v.j(cVar);
        return true;
    }

    @Override // v3.j1
    public final void p(long j10, long j11) {
        boolean z10;
        long j12;
        this.K = j10;
        if (this.f15339s) {
            long j13 = this.I;
            if (j13 != -9223372036854775807L && j10 >= j13) {
                O();
                this.f7146z = true;
            }
        }
        if (this.f7146z) {
            return;
        }
        if (this.G == null) {
            h hVar = this.D;
            hVar.getClass();
            hVar.a(j10);
            try {
                h hVar2 = this.D;
                hVar2.getClass();
                this.G = hVar2.b();
            } catch (i e10) {
                M(e10);
                return;
            }
        }
        if (this.f != 2) {
            return;
        }
        if (this.F != null) {
            long K = K();
            z10 = false;
            while (K <= j10) {
                this.H++;
                K = K();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        l lVar = this.G;
        if (lVar != null) {
            if (lVar.m(4)) {
                if (!z10 && K() == Long.MAX_VALUE) {
                    if (this.B == 2) {
                        O();
                        h hVar3 = this.D;
                        hVar3.getClass();
                        hVar3.release();
                        this.D = null;
                        this.B = 0;
                        N();
                    } else {
                        O();
                        this.f7146z = true;
                    }
                }
            } else if (lVar.f17537b <= j10) {
                l lVar2 = this.F;
                if (lVar2 != null) {
                    lVar2.o();
                }
                this.H = lVar.f(j10);
                this.F = lVar;
                this.G = null;
                z10 = true;
            }
        }
        if (z10) {
            this.F.getClass();
            int f = this.F.f(j10);
            if (f == 0 || this.F.i() == 0) {
                j12 = this.F.f17537b;
            } else if (f == -1) {
                j12 = this.F.g(r12.i() - 1);
            } else {
                j12 = this.F.g(f - 1);
            }
            L(j12);
            c cVar = new c(this.F.h(j10));
            Handler handler = this.f7141u;
            if (handler != null) {
                handler.obtainMessage(0, cVar).sendToTarget();
            } else {
                this.f7142v.r(cVar.f7127a);
                this.f7142v.j(cVar);
            }
        }
        if (this.B == 2) {
            return;
        }
        while (!this.f7145y) {
            try {
                k kVar = this.E;
                if (kVar == null) {
                    h hVar4 = this.D;
                    hVar4.getClass();
                    kVar = hVar4.c();
                    if (kVar == null) {
                        return;
                    } else {
                        this.E = kVar;
                    }
                }
                if (this.B == 1) {
                    kVar.f17508a = 4;
                    h hVar5 = this.D;
                    hVar5.getClass();
                    hVar5.d(kVar);
                    this.E = null;
                    this.B = 2;
                    return;
                }
                int I = I(this.f7144x, kVar, 0);
                if (I == -4) {
                    if (kVar.m(4)) {
                        this.f7145y = true;
                        this.A = false;
                    } else {
                        i0 i0Var = (i0) this.f7144x.f9560b;
                        if (i0Var == null) {
                            return;
                        }
                        kVar.f7138q = i0Var.f15460x;
                        kVar.r();
                        this.A &= !kVar.m(1);
                    }
                    if (!this.A) {
                        h hVar6 = this.D;
                        hVar6.getClass();
                        hVar6.d(kVar);
                        this.E = null;
                    }
                } else if (I == -3) {
                    return;
                }
            } catch (i e11) {
                M(e11);
                return;
            }
        }
    }
}

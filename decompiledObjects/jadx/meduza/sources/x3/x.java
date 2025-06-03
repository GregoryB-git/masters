package x3;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import o7.l0;
import o7.t;
import v3.d0;
import v3.e1;
import v3.i0;
import v3.j1;
import v3.l1;
import v5.e0;
import x3.l;
import x3.m;

/* loaded from: classes.dex */
public final class x extends o4.m implements v5.o {
    public final Context K0;
    public final l.a L0;
    public final m M0;
    public int N0;
    public boolean O0;
    public i0 P0;
    public i0 Q0;
    public long R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public j1.a V0;

    public static final class a {
        public static void a(m mVar, Object obj) {
            mVar.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    public final class b implements m.c {
        public b() {
        }

        public final void a(Exception exc) {
            v5.m.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            l.a aVar = x.this.L0;
            Handler handler = aVar.f16986a;
            if (handler != null) {
                handler.post(new g.q(5, aVar, exc));
            }
        }
    }

    public x(Context context, o4.h hVar, Handler handler, d0.b bVar, s sVar) {
        super(1, hVar, 44100.0f);
        this.K0 = context.getApplicationContext();
        this.M0 = sVar;
        this.L0 = new l.a(handler, bVar);
        sVar.f17060r = new b();
    }

    public static o7.t B0(o4.n nVar, i0 i0Var, boolean z10, m mVar) {
        String str = i0Var.t;
        if (str == null) {
            t.b bVar = o7.t.f12050b;
            return l0.f12009e;
        }
        if (mVar.a(i0Var)) {
            List<o4.l> e10 = o4.p.e("audio/raw", false, false);
            o4.l lVar = e10.isEmpty() ? null : e10.get(0);
            if (lVar != null) {
                return o7.t.t(lVar);
            }
        }
        List<o4.l> a10 = nVar.a(str, z10, false);
        String b10 = o4.p.b(i0Var);
        if (b10 == null) {
            return o7.t.p(a10);
        }
        List<o4.l> a11 = nVar.a(b10, z10, false);
        t.b bVar2 = o7.t.f12050b;
        t.a aVar = new t.a();
        aVar.d(a10);
        aVar.d(a11);
        return aVar.e();
    }

    public final int A0(i0 i0Var, o4.l lVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(lVar.f11804a) || (i10 = e0.f15881a) >= 24 || (i10 == 23 && e0.H(this.K0))) {
            return i0Var.f15457u;
        }
        return -1;
    }

    @Override // o4.m, v3.f
    public final void B() {
        this.U0 = true;
        this.P0 = null;
        try {
            this.M0.flush();
            try {
                super.B();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.B();
                throw th;
            } finally {
            }
        }
    }

    @Override // v3.f
    public final void C(boolean z10, boolean z11) {
        z3.e eVar = new z3.e();
        this.F0 = eVar;
        l.a aVar = this.L0;
        Handler handler = aVar.f16986a;
        if (handler != null) {
            handler.post(new w.g(9, aVar, eVar));
        }
        l1 l1Var = this.f15332c;
        l1Var.getClass();
        if (l1Var.f15515a) {
            this.M0.q();
        } else {
            this.M0.m();
        }
        m mVar = this.M0;
        w3.a0 a0Var = this.f15334e;
        a0Var.getClass();
        mVar.p(a0Var);
    }

    public final void C0() {
        long l10 = this.M0.l(d());
        if (l10 != Long.MIN_VALUE) {
            if (!this.T0) {
                l10 = Math.max(this.R0, l10);
            }
            this.R0 = l10;
            this.T0 = false;
        }
    }

    @Override // o4.m, v3.f
    public final void D(long j10, boolean z10) {
        super.D(j10, z10);
        this.M0.flush();
        this.R0 = j10;
        this.S0 = true;
        this.T0 = true;
    }

    @Override // v3.f
    public final void E() {
        try {
            try {
                M();
                o0();
                a4.e eVar = this.I;
                if (eVar != null) {
                    eVar.f(null);
                }
                this.I = null;
            } catch (Throwable th) {
                a4.e eVar2 = this.I;
                if (eVar2 != null) {
                    eVar2.f(null);
                }
                this.I = null;
                throw th;
            }
        } finally {
            if (this.U0) {
                this.U0 = false;
                this.M0.reset();
            }
        }
    }

    @Override // v3.f
    public final void F() {
        this.M0.b();
    }

    @Override // v3.f
    public final void G() {
        C0();
        this.M0.pause();
    }

    @Override // o4.m
    public final z3.i K(o4.l lVar, i0 i0Var, i0 i0Var2) {
        z3.i b10 = lVar.b(i0Var, i0Var2);
        int i10 = b10.f17542e;
        if (A0(i0Var2, lVar) > this.N0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new z3.i(lVar.f11804a, i0Var, i0Var2, i11 != 0 ? 0 : b10.f17541d, i11);
    }

    @Override // o4.m
    public final float U(float f, i0[] i0VarArr) {
        int i10 = -1;
        for (i0 i0Var : i0VarArr) {
            int i11 = i0Var.H;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f * i10;
    }

    @Override // o4.m
    public final ArrayList V(o4.n nVar, i0 i0Var, boolean z10) {
        o7.t B0 = B0(nVar, i0Var, z10, this.M0);
        Pattern pattern = o4.p.f11853a;
        ArrayList arrayList = new ArrayList(B0);
        Collections.sort(arrayList, new o4.o(new defpackage.e(i0Var, 6), 0));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    @Override // o4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o4.j.a X(o4.l r14, v3.i0 r15, android.media.MediaCrypto r16, float r17) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.x.X(o4.l, v3.i0, android.media.MediaCrypto, float):o4.j$a");
    }

    @Override // o4.m, v3.j1
    public final boolean b() {
        return this.M0.h() || super.b();
    }

    @Override // v5.o
    public final void c(e1 e1Var) {
        this.M0.c(e1Var);
    }

    @Override // o4.m
    public final void c0(Exception exc) {
        v5.m.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        l.a aVar = this.L0;
        Handler handler = aVar.f16986a;
        if (handler != null) {
            handler.post(new x0.f(8, aVar, exc));
        }
    }

    @Override // o4.m, v3.j1
    public final boolean d() {
        return this.B0 && this.M0.d();
    }

    @Override // o4.m
    public final void d0(final String str, final long j10, final long j11) {
        final l.a aVar = this.L0;
        Handler handler = aVar.f16986a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: x3.i
                @Override // java.lang.Runnable
                public final void run() {
                    l.a aVar2 = l.a.this;
                    String str2 = str;
                    long j12 = j10;
                    long j13 = j11;
                    l lVar = aVar2.f16987b;
                    int i10 = e0.f15881a;
                    lVar.C(j12, j13, str2);
                }
            });
        }
    }

    @Override // o4.m
    public final void e0(String str) {
        l.a aVar = this.L0;
        Handler handler = aVar.f16986a;
        if (handler != null) {
            handler.post(new w.g(8, aVar, str));
        }
    }

    @Override // v5.o
    public final e1 f() {
        return this.M0.f();
    }

    @Override // o4.m
    public final z3.i f0(l3.l lVar) {
        i0 i0Var = (i0) lVar.f9560b;
        i0Var.getClass();
        this.P0 = i0Var;
        z3.i f02 = super.f0(lVar);
        l.a aVar = this.L0;
        i0 i0Var2 = this.P0;
        Handler handler = aVar.f16986a;
        if (handler != null) {
            handler.post(new x0.g(aVar, i0Var2, f02, 4));
        }
        return f02;
    }

    @Override // o4.m
    public final void g0(i0 i0Var, MediaFormat mediaFormat) {
        int i10;
        i0 i0Var2 = this.Q0;
        int[] iArr = null;
        if (i0Var2 != null) {
            i0Var = i0Var2;
        } else if (this.O != null) {
            int v10 = "audio/raw".equals(i0Var.t) ? i0Var.I : (e0.f15881a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? e0.v(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            i0.a aVar = new i0.a();
            aVar.f15472k = "audio/raw";
            aVar.f15486z = v10;
            aVar.A = i0Var.J;
            aVar.B = i0Var.K;
            aVar.f15484x = mediaFormat.getInteger("channel-count");
            aVar.f15485y = mediaFormat.getInteger("sample-rate");
            i0 i0Var3 = new i0(aVar);
            if (this.O0 && i0Var3.G == 6 && (i10 = i0Var.G) < 6) {
                int[] iArr2 = new int[i10];
                for (int i11 = 0; i11 < i0Var.G; i11++) {
                    iArr2[i11] = i11;
                }
                iArr = iArr2;
            }
            i0Var = i0Var3;
        }
        try {
            this.M0.e(i0Var, iArr);
        } catch (m.a e10) {
            throw z(5001, e10.f16988a, e10, false);
        }
    }

    @Override // v3.j1, v3.k1
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // o4.m
    public final void h0(long j10) {
        this.M0.r();
    }

    @Override // o4.m
    public final void j0() {
        this.M0.n();
    }

    @Override // o4.m
    public final void k0(z3.g gVar) {
        if (!this.S0 || gVar.n()) {
            return;
        }
        if (Math.abs(gVar.f17534e - this.R0) > 500000) {
            this.R0 = gVar.f17534e;
        }
        this.S0 = false;
    }

    @Override // v5.o
    public final long l() {
        if (this.f == 2) {
            C0();
        }
        return this.R0;
    }

    @Override // o4.m
    public final boolean m0(long j10, long j11, o4.j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, i0 i0Var) {
        byteBuffer.getClass();
        if (this.Q0 != null && (i11 & 2) != 0) {
            jVar.getClass();
            jVar.j(i10, false);
            return true;
        }
        if (z10) {
            if (jVar != null) {
                jVar.j(i10, false);
            }
            this.F0.f += i12;
            this.M0.n();
            return true;
        }
        try {
            if (!this.M0.k(j12, byteBuffer, i12)) {
                return false;
            }
            if (jVar != null) {
                jVar.j(i10, false);
            }
            this.F0.f17524e += i12;
            return true;
        } catch (m.b e10) {
            throw z(5001, this.P0, e10, e10.f16990b);
        } catch (m.e e11) {
            throw z(5002, i0Var, e11, e11.f16992b);
        }
    }

    @Override // o4.m
    public final void p0() {
        try {
            this.M0.g();
        } catch (m.e e10) {
            throw z(5002, e10.f16993c, e10, e10.f16992b);
        }
    }

    @Override // v3.f, v3.g1.b
    public final void q(int i10, Object obj) {
        if (i10 == 2) {
            this.M0.o(((Float) obj).floatValue());
        }
        if (i10 == 3) {
            this.M0.s((d) obj);
            return;
        }
        if (i10 == 6) {
            this.M0.j((p) obj);
            return;
        }
        switch (i10) {
            case 9:
                this.M0.t(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.M0.i(((Integer) obj).intValue());
                break;
            case 11:
                this.V0 = (j1.a) obj;
                break;
            case 12:
                if (e0.f15881a >= 23) {
                    a.a(this.M0, obj);
                    break;
                }
                break;
        }
    }

    @Override // o4.m
    public final boolean v0(i0 i0Var) {
        return this.M0.a(i0Var);
    }

    @Override // v3.f, v3.j1
    public final v5.o w() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : r4.get(0)) != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int w0(o4.n r13, v3.i0 r14) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.x.w0(o4.n, v3.i0):int");
    }
}

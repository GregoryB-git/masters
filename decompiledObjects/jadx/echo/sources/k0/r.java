package k0;

import com.android.installreferrer.api.InstallReferrerClient;
import d0.AbstractC1170I;
import g0.AbstractC1297a;
import java.util.HashMap;
import java.util.Iterator;
import k0.InterfaceC1445x0;
import l0.y1;
import x0.InterfaceC2142x;

/* loaded from: classes.dex */
public class r implements InterfaceC1445x0 {

    /* renamed from: a, reason: collision with root package name */
    public final B0.h f15896a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15897b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15898c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15899d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15900e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15901f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15902g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15903h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15904i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f15905j;

    /* renamed from: k, reason: collision with root package name */
    public long f15906k;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public B0.h f15907a;

        /* renamed from: b, reason: collision with root package name */
        public int f15908b = 50000;

        /* renamed from: c, reason: collision with root package name */
        public int f15909c = 50000;

        /* renamed from: d, reason: collision with root package name */
        public int f15910d = 2500;

        /* renamed from: e, reason: collision with root package name */
        public int f15911e = 5000;

        /* renamed from: f, reason: collision with root package name */
        public int f15912f = -1;

        /* renamed from: g, reason: collision with root package name */
        public boolean f15913g = false;

        /* renamed from: h, reason: collision with root package name */
        public int f15914h = 0;

        /* renamed from: i, reason: collision with root package name */
        public boolean f15915i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f15916j;

        public r a() {
            AbstractC1297a.f(!this.f15916j);
            this.f15916j = true;
            if (this.f15907a == null) {
                this.f15907a = new B0.h(true, 65536);
            }
            return new r(this.f15907a, this.f15908b, this.f15909c, this.f15910d, this.f15911e, this.f15912f, this.f15913g, this.f15914h, this.f15915i);
        }

        public b b(int i7, boolean z7) {
            AbstractC1297a.f(!this.f15916j);
            r.k(i7, 0, "backBufferDurationMs", "0");
            this.f15914h = i7;
            this.f15915i = z7;
            return this;
        }

        public b c(int i7, int i8, int i9, int i10) {
            AbstractC1297a.f(!this.f15916j);
            r.k(i9, 0, "bufferForPlaybackMs", "0");
            r.k(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
            r.k(i7, i9, "minBufferMs", "bufferForPlaybackMs");
            r.k(i7, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            r.k(i8, i7, "maxBufferMs", "minBufferMs");
            this.f15908b = i7;
            this.f15909c = i8;
            this.f15910d = i9;
            this.f15911e = i10;
            return this;
        }

        public b d(boolean z7) {
            AbstractC1297a.f(!this.f15916j);
            this.f15913g = z7;
            return this;
        }

        public b e(int i7) {
            AbstractC1297a.f(!this.f15916j);
            this.f15912f = i7;
            return this;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f15917a;

        /* renamed from: b, reason: collision with root package name */
        public int f15918b;

        public c() {
        }
    }

    public r() {
        this(new B0.h(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public static void k(int i7, int i8, String str, String str2) {
        AbstractC1297a.b(i7 >= i8, str + " cannot be less than " + str2);
    }

    public static int n(int i7) {
        switch (i7) {
            case -2:
                return 0;
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
            default:
                throw new IllegalArgumentException();
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // k0.InterfaceC1445x0
    public void a(y1 y1Var) {
        long id = Thread.currentThread().getId();
        long j7 = this.f15906k;
        AbstractC1297a.g(j7 == -1 || j7 == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f15906k = id;
        if (!this.f15905j.containsKey(y1Var)) {
            this.f15905j.put(y1Var, new c());
        }
        p(y1Var);
    }

    @Override // k0.InterfaceC1445x0
    public void b(y1 y1Var, AbstractC1170I abstractC1170I, InterfaceC2142x.b bVar, Y0[] y0Arr, x0.Z z7, A0.y[] yVarArr) {
        c cVar = (c) AbstractC1297a.e((c) this.f15905j.get(y1Var));
        int i7 = this.f15901f;
        if (i7 == -1) {
            i7 = l(y0Arr, yVarArr);
        }
        cVar.f15918b = i7;
        q();
    }

    @Override // k0.InterfaceC1445x0
    public boolean c(InterfaceC1445x0.a aVar) {
        c cVar = (c) AbstractC1297a.e((c) this.f15905j.get(aVar.f16062a));
        boolean z7 = true;
        boolean z8 = this.f15896a.f() >= m();
        long j7 = this.f15897b;
        float f7 = aVar.f16067f;
        if (f7 > 1.0f) {
            j7 = Math.min(g0.M.c0(j7, f7), this.f15898c);
        }
        long max = Math.max(j7, 500000L);
        long j8 = aVar.f16066e;
        if (j8 < max) {
            if (!this.f15902g && z8) {
                z7 = false;
            }
            cVar.f15917a = z7;
            if (!z7 && j8 < 500000) {
                g0.o.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j8 >= this.f15898c || z8) {
            cVar.f15917a = false;
        }
        return cVar.f15917a;
    }

    @Override // k0.InterfaceC1445x0
    public void d(y1 y1Var) {
        o(y1Var);
        if (this.f15905j.isEmpty()) {
            this.f15906k = -1L;
        }
    }

    @Override // k0.InterfaceC1445x0
    public boolean e(InterfaceC1445x0.a aVar) {
        long h02 = g0.M.h0(aVar.f16066e, aVar.f16067f);
        long j7 = aVar.f16069h ? this.f15900e : this.f15899d;
        long j8 = aVar.f16070i;
        if (j8 != -9223372036854775807L) {
            j7 = Math.min(j8 / 2, j7);
        }
        return j7 <= 0 || h02 >= j7 || (!this.f15902g && this.f15896a.f() >= m());
    }

    @Override // k0.InterfaceC1445x0
    public boolean f(y1 y1Var) {
        return this.f15904i;
    }

    @Override // k0.InterfaceC1445x0
    public void g(y1 y1Var) {
        o(y1Var);
    }

    @Override // k0.InterfaceC1445x0
    public long h(y1 y1Var) {
        return this.f15903h;
    }

    @Override // k0.InterfaceC1445x0
    public B0.b i() {
        return this.f15896a;
    }

    public int l(Y0[] y0Arr, A0.y[] yVarArr) {
        int i7 = 0;
        for (int i8 = 0; i8 < y0Arr.length; i8++) {
            if (yVarArr[i8] != null) {
                i7 += n(y0Arr[i8].l());
            }
        }
        return Math.max(13107200, i7);
    }

    public int m() {
        Iterator it = this.f15905j.values().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((c) it.next()).f15918b;
        }
        return i7;
    }

    public final void o(y1 y1Var) {
        if (this.f15905j.remove(y1Var) != null) {
            q();
        }
    }

    public final void p(y1 y1Var) {
        c cVar = (c) AbstractC1297a.e((c) this.f15905j.get(y1Var));
        int i7 = this.f15901f;
        if (i7 == -1) {
            i7 = 13107200;
        }
        cVar.f15918b = i7;
        cVar.f15917a = false;
    }

    public final void q() {
        if (this.f15905j.isEmpty()) {
            this.f15896a.g();
        } else {
            this.f15896a.h(m());
        }
    }

    public r(B0.h hVar, int i7, int i8, int i9, int i10, int i11, boolean z7, int i12, boolean z8) {
        k(i9, 0, "bufferForPlaybackMs", "0");
        k(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(i7, i9, "minBufferMs", "bufferForPlaybackMs");
        k(i7, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(i8, i7, "maxBufferMs", "minBufferMs");
        k(i12, 0, "backBufferDurationMs", "0");
        this.f15896a = hVar;
        this.f15897b = g0.M.J0(i7);
        this.f15898c = g0.M.J0(i8);
        this.f15899d = g0.M.J0(i9);
        this.f15900e = g0.M.J0(i10);
        this.f15901f = i11;
        this.f15902g = z7;
        this.f15903h = g0.M.J0(i12);
        this.f15904i = z8;
        this.f15905j = new HashMap();
        this.f15906k = -1L;
    }
}

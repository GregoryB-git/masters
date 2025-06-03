package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import c4.v;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.util.TreeMap;
import l3.l;
import t5.h;
import v3.a1;
import v3.i0;
import v5.e0;
import v5.u;
import z4.a0;
import z4.b0;

/* loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final t5.b f2631a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2632b;
    public d5.c f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2636o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2637p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2638q;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap<Long, Long> f2635e = new TreeMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2634d = e0.l(this);

    /* renamed from: c, reason: collision with root package name */
    public final r4.b f2633c = new r4.b();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f2639a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2640b;

        public a(long j10, long j11) {
            this.f2639a = j10;
            this.f2640b = j11;
        }
    }

    public interface b {
    }

    public final class c implements v {

        /* renamed from: a, reason: collision with root package name */
        public final b0 f2641a;

        /* renamed from: b, reason: collision with root package name */
        public final l f2642b = new l(1);

        /* renamed from: c, reason: collision with root package name */
        public final p4.d f2643c = new p4.d();

        /* renamed from: d, reason: collision with root package name */
        public long f2644d = -9223372036854775807L;

        public c(t5.b bVar) {
            this.f2641a = new b0(bVar, null, null);
        }

        @Override // c4.v
        public final void a(int i10, u uVar) {
            b0 b0Var = this.f2641a;
            b0Var.getClass();
            b0Var.a(i10, uVar);
        }

        @Override // c4.v
        public final void b(int i10, u uVar) {
            a(i10, uVar);
        }

        @Override // c4.v
        public final void c(long j10, int i10, int i11, int i12, v.a aVar) {
            long f;
            p4.d dVar;
            long j11;
            this.f2641a.c(j10, i10, i11, i12, aVar);
            while (true) {
                boolean z10 = false;
                if (!this.f2641a.q(false)) {
                    break;
                }
                this.f2643c.o();
                if (this.f2641a.u(this.f2642b, this.f2643c, 0, false) == -4) {
                    this.f2643c.r();
                    dVar = this.f2643c;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    long j12 = dVar.f17534e;
                    p4.a a10 = d.this.f2633c.a(dVar);
                    if (a10 != null) {
                        r4.a aVar2 = (r4.a) a10.f12996a[0];
                        String str = aVar2.f13606a;
                        String str2 = aVar2.f13607b;
                        if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                            z10 = true;
                        }
                        if (z10) {
                            try {
                                j11 = e0.L(e0.n(aVar2.f13610e));
                            } catch (a1 unused) {
                                j11 = -9223372036854775807L;
                            }
                            if (j11 != -9223372036854775807L) {
                                a aVar3 = new a(j12, j11);
                                Handler handler = d.this.f2634d;
                                handler.sendMessage(handler.obtainMessage(1, aVar3));
                            }
                        }
                    }
                }
            }
            b0 b0Var = this.f2641a;
            a0 a0Var = b0Var.f17571a;
            synchronized (b0Var) {
                int i13 = b0Var.f17588s;
                f = i13 == 0 ? -1L : b0Var.f(i13);
            }
            a0Var.b(f);
        }

        @Override // c4.v
        public final void d(i0 i0Var) {
            this.f2641a.d(i0Var);
        }

        @Override // c4.v
        public final int e(h hVar, int i10, boolean z10) {
            return f(hVar, i10, z10);
        }

        public final int f(h hVar, int i10, boolean z10) {
            b0 b0Var = this.f2641a;
            b0Var.getClass();
            return b0Var.w(hVar, i10, z10);
        }
    }

    public d(d5.c cVar, DashMediaSource.c cVar2, t5.b bVar) {
        this.f = cVar;
        this.f2632b = cVar2;
        this.f2631a = bVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f2638q) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        long j10 = aVar.f2639a;
        long j11 = aVar.f2640b;
        Long l10 = this.f2635e.get(Long.valueOf(j11));
        if (l10 == null || l10.longValue() > j10) {
            this.f2635e.put(Long.valueOf(j11), Long.valueOf(j10));
        }
        return true;
    }
}

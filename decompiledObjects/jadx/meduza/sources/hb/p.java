package hb;

import hb.h;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final c f7336a;

    /* renamed from: b, reason: collision with root package name */
    public final jb.c f7337b;

    /* renamed from: c, reason: collision with root package name */
    public int f7338c;

    /* renamed from: d, reason: collision with root package name */
    public final b f7339d;

    public interface a {
        void b(int i10);
    }

    public final class b {

        /* renamed from: b, reason: collision with root package name */
        public final int f7341b;

        /* renamed from: c, reason: collision with root package name */
        public int f7342c;

        /* renamed from: d, reason: collision with root package name */
        public int f7343d;

        /* renamed from: e, reason: collision with root package name */
        public final a f7344e;

        /* renamed from: a, reason: collision with root package name */
        public final xc.f f7340a = new xc.f();
        public boolean f = false;

        public b(int i10, int i11, h.b bVar) {
            this.f7341b = i10;
            this.f7342c = i11;
            this.f7344e = bVar;
        }

        public final int a(int i10) {
            if (i10 <= 0 || Integer.MAX_VALUE - i10 >= this.f7342c) {
                int i11 = this.f7342c + i10;
                this.f7342c = i11;
                return i11;
            }
            StringBuilder l10 = defpackage.f.l("Window size overflow for stream: ");
            l10.append(this.f7341b);
            throw new IllegalArgumentException(l10.toString());
        }

        public final int b() {
            return Math.min(this.f7342c, p.this.f7339d.f7342c);
        }

        public final void c(int i10, xc.f fVar, boolean z10) {
            do {
                int min = Math.min(i10, p.this.f7337b.t0());
                int i11 = -min;
                p.this.f7339d.a(i11);
                a(i11);
                try {
                    p.this.f7337b.u(fVar.f17252b == ((long) min) && z10, this.f7341b, fVar, min);
                    this.f7344e.b(min);
                    i10 -= min;
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } while (i10 > 0);
        }
    }

    public interface c {
        b[] b();
    }

    public p(c cVar, hb.b bVar) {
        x6.b.y(cVar, "transport");
        this.f7336a = cVar;
        this.f7337b = bVar;
        this.f7338c = 65535;
        this.f7339d = new b(0, 65535, null);
    }

    public final void a(boolean z10, b bVar, xc.f fVar, boolean z11) {
        x6.b.y(fVar, "source");
        int b10 = bVar.b();
        boolean z12 = bVar.f7340a.f17252b > 0;
        int i10 = (int) fVar.f17252b;
        if (z12 || b10 < i10) {
            if (!z12 && b10 > 0) {
                bVar.c(b10, fVar, false);
            }
            bVar.f7340a.g0(fVar, (int) fVar.f17252b);
            bVar.f = z10 | bVar.f;
        } else {
            bVar.c(i10, fVar, z10);
        }
        if (z11) {
            try {
                this.f7337b.flush();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final boolean b(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(defpackage.f.h("Invalid initial window size: ", i10));
        }
        int i11 = i10 - this.f7338c;
        this.f7338c = i10;
        for (b bVar : this.f7336a.b()) {
            bVar.a(i11);
        }
        return i11 > 0;
    }

    public final void c(b bVar, int i10) {
        if (bVar == null) {
            this.f7339d.a(i10);
            d();
            return;
        }
        bVar.a(i10);
        int b10 = bVar.b();
        int min = Math.min(b10, bVar.b());
        int i11 = 0;
        int i12 = 0;
        while (true) {
            xc.f fVar = bVar.f7340a;
            long j10 = fVar.f17252b;
            if (!(j10 > 0) || min <= 0) {
                break;
            }
            if (min >= j10) {
                int i13 = (int) j10;
                i11 += i13;
                bVar.c(i13, fVar, bVar.f);
            } else {
                i11 += min;
                bVar.c(min, fVar, false);
            }
            i12++;
            min = Math.min(b10 - i11, bVar.b());
        }
        if (i12 > 0) {
            try {
                this.f7337b.flush();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d() {
        b[] b10 = this.f7336a.b();
        Collections.shuffle(Arrays.asList(b10));
        int i10 = this.f7339d.f7342c;
        int length = b10.length;
        while (true) {
            if (length <= 0 || i10 <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(i10 / length);
            int i11 = 0;
            for (int i12 = 0; i12 < length && i10 > 0; i12++) {
                b bVar = b10[i12];
                int min = Math.min(i10, Math.min(Math.max(0, Math.min(bVar.f7342c, (int) bVar.f7340a.f17252b)) - bVar.f7343d, ceil));
                if (min > 0) {
                    bVar.f7343d += min;
                    i10 -= min;
                }
                if (Math.max(0, Math.min(bVar.f7342c, (int) bVar.f7340a.f17252b)) - bVar.f7343d > 0) {
                    b10[i11] = bVar;
                    i11++;
                }
            }
            length = i11;
        }
        int i13 = 0;
        for (b bVar2 : this.f7336a.b()) {
            int i14 = bVar2.f7343d;
            int min2 = Math.min(i14, bVar2.b());
            int i15 = 0;
            while (true) {
                xc.f fVar = bVar2.f7340a;
                long j10 = fVar.f17252b;
                if ((j10 > 0) && min2 > 0) {
                    if (min2 >= j10) {
                        int i16 = (int) j10;
                        i15 += i16;
                        bVar2.c(i16, fVar, bVar2.f);
                    } else {
                        i15 += min2;
                        bVar2.c(min2, fVar, false);
                    }
                    i13++;
                    min2 = Math.min(i14 - i15, bVar2.b());
                }
            }
            bVar2.f7343d = 0;
        }
        if (i13 > 0) {
            try {
                this.f7337b.flush();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}

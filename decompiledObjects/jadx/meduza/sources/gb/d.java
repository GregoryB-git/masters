package gb;

import gb.a;
import gb.g;
import gb.i2;
import gb.n3;
import hb.h;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class d implements m3 {

    public static abstract class a implements g.d, i2.a {

        /* renamed from: a, reason: collision with root package name */
        public a0 f6216a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f6217b = new Object();

        /* renamed from: c, reason: collision with root package name */
        public final r3 f6218c;

        /* renamed from: d, reason: collision with root package name */
        public final i2 f6219d;

        /* renamed from: e, reason: collision with root package name */
        public int f6220e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f6221g;

        public a(int i10, l3 l3Var, r3 r3Var) {
            x6.b.y(r3Var, "transportTracer");
            this.f6218c = r3Var;
            i2 i2Var = new i2(this, i10, l3Var, r3Var);
            this.f6219d = i2Var;
            this.f6216a = i2Var;
        }

        @Override // gb.i2.a
        public final void a(n3.a aVar) {
            ((a.b) this).f6176j.a(aVar);
        }

        public final void b(int i10) {
            boolean z10;
            boolean z11;
            synchronized (this.f6217b) {
                x6.b.I(this.f, "onStreamAllocated was not called, but it seems the stream is active");
                int i11 = this.f6220e;
                z10 = false;
                boolean z12 = i11 < 32768;
                int i12 = i11 - i10;
                this.f6220e = i12;
                z11 = !z12 && (i12 < 32768);
            }
            if (z11) {
                synchronized (this.f6217b) {
                    synchronized (this.f6217b) {
                        if (this.f && this.f6220e < 32768 && !this.f6221g) {
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    ((a.b) this).f6176j.c();
                }
            }
        }
    }

    @Override // gb.m3
    public final void a(eb.l lVar) {
        t0 t0Var = ((gb.a) this).f6165b;
        x6.b.y(lVar, "compressor");
        t0Var.a(lVar);
    }

    @Override // gb.m3
    public final void d(InputStream inputStream) {
        x6.b.y(inputStream, Constants.MESSAGE);
        try {
            if (!((gb.a) this).f6165b.isClosed()) {
                ((gb.a) this).f6165b.b(inputStream);
            }
        } finally {
            v0.b(inputStream);
        }
    }

    @Override // gb.m3
    public final void e() {
        a q10 = q();
        i2 i2Var = q10.f6219d;
        i2Var.f6505a = q10;
        q10.f6216a = i2Var;
    }

    @Override // gb.m3
    public final void f(int i10) {
        a q10 = q();
        q10.getClass();
        pb.b.b();
        ((h.b) q10).f(new c(q10, i10));
    }

    @Override // gb.m3
    public final void flush() {
        gb.a aVar = (gb.a) this;
        if (aVar.f6165b.isClosed()) {
            return;
        }
        aVar.f6165b.flush();
    }

    public abstract a q();
}

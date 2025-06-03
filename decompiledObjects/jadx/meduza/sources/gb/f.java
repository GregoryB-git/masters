package gb;

import gb.n3;
import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final k3 f6329a;

    /* renamed from: b, reason: collision with root package name */
    public final gb.g f6330b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f6331c;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6332a;

        public a(int i10) {
            this.f6332a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (f.this.f6331c.isClosed()) {
                return;
            }
            try {
                f.this.f6331c.f(this.f6332a);
            } catch (Throwable th) {
                f.this.f6330b.e(th);
                f.this.f6331c.close();
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u2 f6334a;

        public b(hb.l lVar) {
            this.f6334a = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                f.this.f6331c.C(this.f6334a);
            } catch (Throwable th) {
                f.this.f6330b.e(th);
                f.this.f6331c.close();
            }
        }
    }

    public class c implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u2 f6336a;

        public c(hb.l lVar) {
            this.f6336a = lVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f6336a.close();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.this.f6331c.H();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.this.f6331c.close();
        }
    }

    /* renamed from: gb.f$f, reason: collision with other inner class name */
    public class C0100f extends g implements Closeable {

        /* renamed from: d, reason: collision with root package name */
        public final Closeable f6339d;

        public C0100f(f fVar, b bVar, c cVar) {
            super(bVar);
            this.f6339d = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f6339d.close();
        }
    }

    public class g implements n3.a {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f6340a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6341b = false;

        public g(Runnable runnable) {
            this.f6340a = runnable;
        }

        @Override // gb.n3.a
        public final InputStream next() {
            if (!this.f6341b) {
                this.f6340a.run();
                this.f6341b = true;
            }
            return (InputStream) f.this.f6330b.f6381c.poll();
        }
    }

    public f(y0 y0Var, y0 y0Var2, i2 i2Var) {
        k3 k3Var = new k3(y0Var);
        this.f6329a = k3Var;
        gb.g gVar = new gb.g(k3Var, y0Var2);
        this.f6330b = gVar;
        i2Var.f6505a = gVar;
        this.f6331c = i2Var;
    }

    @Override // gb.a0
    public final void C(u2 u2Var) {
        hb.l lVar = (hb.l) u2Var;
        this.f6329a.a(new C0100f(this, new b(lVar), new c(lVar)));
    }

    @Override // gb.a0
    public final void H() {
        this.f6329a.a(new g(new d()));
    }

    @Override // gb.a0
    public final void I(eb.r rVar) {
        this.f6331c.I(rVar);
    }

    @Override // gb.a0
    public final void close() {
        this.f6331c.A = true;
        this.f6329a.a(new g(new e()));
    }

    @Override // gb.a0
    public final void f(int i10) {
        this.f6329a.a(new g(new a(i10)));
    }

    @Override // gb.a0
    public final void g(int i10) {
        this.f6331c.f6506b = i10;
    }
}
